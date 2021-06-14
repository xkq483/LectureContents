import java.util.ArrayList;

//ArrayList에 중복을 허용하여 랜덤 숫자를 10개 만든다.
//랜덤 숫자의 범위는 10 ~ 12 다.
//여기서 각각의 숫자들이 몇 개씩 중복 되었는지 카운트해보자!
class ArrayListCount {
    ArrayList<Integer> intLists;
    ArrayList<Integer> duplicateLists;

    final int RAND_RANGE = 3;
    final int RAND_START_OFFSET = 10;
    final int DATA_LENGTH = 10;

    final int FIRST_VALUE = 10;
    final int SECOND_VALUE = 11;
    final int THIRD_VALUE = 12;

    final int FIRST_IDX = FIRST_VALUE - RAND_START_OFFSET;
    final int SECOND_IDX = SECOND_VALUE - RAND_START_OFFSET;
    final int THIRD_IDX = THIRD_VALUE - RAND_START_OFFSET;

    //생성자  - 초기화
    public ArrayListCount () {
        intLists = new ArrayList<Integer>();
        //10 ~ 12의 숫자가 중복 허용된 상태로 10개 배치됨
        duplicateLists = new ArrayList<Integer>();
        // 각각의 숫자가 몇개씩 중복되는지 체킹에 활용됨.

        for (int i = 0; i < DATA_LENGTH; i++) {
        //10개 만들라했으니 10개 만듬
            intLists.add((int)(Math.random() * RAND_RANGE + RAND_START_OFFSET));
            //intLists.add(10);
        }

        //10, 11, 12는 총 3개로 랜덤 범위만큼 생성
        //10은 인덱스 0번
        //11은 인덱스 1번
        //12는 인덱스 2번

        for (int i = 0; i < RAND_RANGE; i++) {
            duplicateLists.add(0);
        }
    }

    public void cntDuplicate () {
        for (int num : intLists) {
            // forEach문  intLists에서 int num으로 값을 넣는다.
            if (num == FIRST_VALUE) { //빼온 값이 10일때

                // ArrayList.add(x): x를 현재 리스트에서 가장 마지막에 추가함
                // ArrayList.add(idx, x) : x를 idx 인덱스 위치에 저장하고 기존에 있던정보를 뒤로 한칸씩 밀어버림
                duplicateLists.add(FIRST_IDX,
                        duplicateLists.get(FIRST_IDX) + 1);
                duplicateLists.remove(1);
            } else if (num == SECOND_VALUE) { //빼온 값이 11일때
                duplicateLists.add(SECOND_IDX,
                        duplicateLists.get(SECOND_IDX) + 1);
                duplicateLists.remove(2);
            } else if (num == THIRD_VALUE) { // 빼온 값이 12일때때
               duplicateLists.add(THIRD_IDX,
                        duplicateLists.get(THIRD_IDX) + 1);
                duplicateLists.remove(3);
            }
        }
    }

    @Override
    public String toString() {
        return "ArrayListCount{" +
                "intLists=" + intLists +
                ", duplicateLists=" + duplicateLists +
                '}';
    }
}

public class ArrayListAllowDuplicate {
    public static void main(String[] args) {
        ArrayListCount alc = new ArrayListCount();

        System.out.println(alc);

        alc.cntDuplicate();

        System.out.println(alc);
    }
}