import java.util.ArrayList;
class Array_DuplicateCnt{

    public ArrayList<Integer> intLists;
    public ArrayList<Integer> duplicateLists;

    final int DATA_LENGTH = 10;
    final int RANGE = 3;
    final int START = 10;

    final int FIRST_VALUE = 10;
    final int SECOND_VALUE = 11;
    final int THIRD_VALUE = 12;

    final int FIRST_IDX = FIRST_VALUE - START;
    final int SECOND_IDX = SECOND_VALUE - START;
    final int THIRD_IDX = THIRD_VALUE - START;

    public Array_DuplicateCnt(){ //생성자
        // 10~12의 숫자를 중복 허용된 상태로 10개 배치시킬 배열
        intLists = new ArrayList<Integer>();
        //각각의 숫자가 몇 개씩 중복되었는지 체킹에 활용할 배열
        duplicateLists = new ArrayList<Integer>();

        // intLists에 10개의 값 setting
        for(int i = 0; i < DATA_LENGTH; i++){
            intLists.add((int)(Math.random() * RANGE + START));
        }

        // 10, 11, 12는 총 3개로 랜덤하게 10개 생성
        // 10은 index[0] / 11은 index[1] / 12는 index[2] 로 취급하겠다는 전략.
        for(int i = 0; i < RANGE; i++){
            duplicateLists.add(0);
        }
    }
    public void cntDupicate(){
        //for-each 사용
        for(int num : intLists){
            if(num == FIRST_VALUE){ // 값이 10일 때
                //[0, 0, 0]  | 그 다음 10이 나왔을 때는 [1, 0 ,0]
                duplicateLists.add(FIRST_IDX, duplicateLists.get(FIRST_IDX) + 1);
                //[1, 0, 0, 0] | [2, 0, 0, 0]
                duplicateLists.remove(1);
                // [1, 0, 0] | [2, 0, 0,]

                //아래의 개념을 위의 if문에 적용해서 생각해보자.
                //ArrayList.add(x)는 x를 배열 가장 마지막에 추가
                // ex) 0, 1, 4, 8
                // ArrayList.add(77) >> 0, 1, 4, 8, 77
                // -----------------------------------------------
                // ArrayList.add(n, x)는 x를 index[n]에 위치하도록 함.
                // 기존에 있던 정보들은 뒤로 한 칸씩 밀림
                // ex) 0, 1, 4, 8
                // ArrayList.add(2, 77) >> ex) 0, 1, 77, 4, 8
            } else if (num == SECOND_VALUE){ // 값이 11일 때
                duplicateLists.add(SECOND_IDX, duplicateLists.get(SECOND_IDX) + 1);
                duplicateLists.remove(2);
            } else if (num == THIRD_VALUE){ // 값이 12일 때
                duplicateLists.add(THIRD_IDX, duplicateLists.get(THIRD_IDX) + 1);
                duplicateLists.remove(3);
            }
        }
    }

    @Override
    public String toString() {
        return "Array_DuplicateCnt{" +
                "intLists=" + intLists +
                ", duplicateLists=" + duplicateLists +
                '}';
    }
}
public class _2nd_Quiz49TeacherSolution {
    public static void main(String[] args) {

        Array_DuplicateCnt dc = new Array_DuplicateCnt();
        System.out.println(dc);
        dc.cntDupicate();
        System.out.println(dc);
    }
}
