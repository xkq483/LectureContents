import java.util.ArrayList;
import java.util.Arrays;

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


    public ArrayListCount() {
        intLists = new ArrayList<Integer>();
        duplicateLists = new ArrayList<Integer>();
        for (int i = 0; i < DATA_LENGTH; i++) {
            intLists.add((int) (Math.random() * RAND_RANGE + RAND_START_OFFSET));
        }

        for (int i = 0; i < RAND_RANGE; i++) {
            duplicateLists.add(0);
        }
    }

    public void cntDuplicate() {
        for (int num : intLists) {
            if (num == FIRST_VALUE) {
                duplicateLists.add(FIRST_IDX,
                        duplicateLists.get(FIRST_IDX) + 1);
            } else if (num == SECOND_VALUE) {
                duplicateLists.add(SECOND_IDX,
                        duplicateLists.get(SECOND_IDX) + 1);
                duplicateLists.remove(2);
            } else if (num == THIRD_VALUE) {
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


    public static class Review15_1 {
        public static void main(String[] args) {
            String[] fruits = {"사과", "포도", "딸기", "수박"};
            ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));
            for (int i = 0; i < 4; i++) {
                System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
            }

            System.out.println("복제 이후는?");


            ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
            for (int i = 0; i < 4; i++) {
                System.out.printf("get(%d) = %s\n", i, clone.get(i));
            }

            System.out.println("fruitsList는 지워졌을까?");

            for (int i = 0; i < 4; i++) {
                System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
            }

            fruitsList.clear();//완전 밀어버림

            System.out.println("after clear: " + fruitsList);

            // 검색 - indexOf
            System.out.println("포도는 어디? " + clone.indexOf("포도"));
            System.out.println("딸기는? " + clone.indexOf("딸기"));
            // 존재하지 않는 것은 -1 이 나옴(오류)
            System.out.println("관련없는 항목이면?" + clone.indexOf("아무거나"));

            // 검색 - contains
            System.out.println("포도는 어디? " + clone.contains("포도"));
            System.out.println("딸기는? " + clone.contains("딸기"));
            // 존재하지 않는 것은 false이 나옴
            System.out.println("관련없는 항목이면?" + clone.contains("아무거나"));


            System.out.println("49. ArrayList 문제");
            ////49. ArrayList 문제
            //ArrayList에 중복을 허용하여 랜덤 숫자를 10개 만든다.
            //랜덤 숫자의 범위는 10 ~ 12 다.
            //여기서 각각의 숫자들이 몇 개씩 중복 되었는지 카운트해보자!

            ArrayListCount alc = new ArrayListCount();

            System.out.println(alc);

            alc.cntDuplicate();

            System.out.println(alc);


        }
    }
}
