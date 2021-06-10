import java.util.ArrayList;
import java.util.Arrays;

// ArrayList Method 활용법 ---------------------------------------------------------------------------
class ArrayListTest {
    int[] arr;

    public ArrayListTest () {
        arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = (int)(Math.random() * 6 + 1); } }

    public int[] clone () {
        int[] testArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            testArr[i] = arr[i]; }

        return testArr; }

    public void changeArr () {
        arr[1] = 10000000; }

    public void vectorAdd (int[] vec) {
        for (int i = 0; i < vec.length; i++) {
            arr[i] += vec[i]; } }

    @Override
    public String toString() {
        return "Test{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
// ArrayList clone ----------------------------------------------------------------------------------------
public class Review0528ArrayList {
    public static void main(String[] args) {
        String[] fruits = {"apple", "strawberry", "grape", "watermelon"};

        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));
        // asList()를 통해 배열등을 ArrayList로 변형할 수 있음

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i)); }

        System.out.println("---------------------- 복제 ----------------------");
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        // fruitsList의 내용을 clone 변수에 복제함
        // ArrayList에 구현되어 있는 clone은 객체를 복제할 수 있게 서포트한다.

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
            // ArrayList에 있는 내용을 가져올때 .get(index)를 사용합니다.
            // 여기서 index는 | 데이터1 | ---> | 데이터2 | ---> | 데이터8 | --->
            //                   0               1              2
        }

        fruitsList.remove("grape");
        System.out.println("-------- fruitsList의 grape 삭제 이후 clone 다시 보기 --------");


        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i)); }
        // clone은 원본 객체의 복제품이고 grape는 원본에서 삭제하였으므로 결과가 그대로 나옴

        System.out.println("fruitsList는 지워졌을까 ?");
        // fruitsList는 원복이므로 삭제되어서 결과가 나옴

        for (int i = 0; i < 3; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        fruitsList.clear();
        // .clear()를 사용하면 전체 삭제

        System.out.println("after clear: " + fruitsList);
        // 결과 == after clear: []

        // .indexOf() : 검색 기능 인덱스 번호가 출력된다
        System.out.println("포도 어딧니 ? " + clone.indexOf("grape"));
        System.out.println("딸기는 ? " + clone.indexOf("strawberry"));
        // 존재하지 않는 것은 -1 이 나옴(이 -1은 숫자이므로 활용가능)
        System.out.println("드립을 치고 싶은데 ? " + clone.indexOf("드립"));

        // 당첨자 명단 ~~~~
        // 공모자 명단 ~~~~
        // 시상식 참석자 명단 ~~~
        // for (참석자 명단 ~~~) {
        //     if (indexOf("당첨자 명단") == -1) {
        //         continue;
        //     } else {
        //         cnt++
        //     }
        // }
        // 위와 같은 형태로 시상식에 참석하면 수상자 숫자를 집계할 수 있다.

        // .contains() : IndexOf와 유사한 검색기능 이지만 참/거짓 (true/false)로 출력
        System.out.println("포도 어딧니 ? " + clone.contains("grape"));
        System.out.println("딸기는 ? " + clone.contains("strawberry"));
        System.out.println("드립을 치고 싶은데 ? " + clone.contains("드립"));


// ArrayList Method 활용법 ------------------------------------------------------------------------

        ArrayListTest t = new ArrayListTest();

        System.out.println(t);
        // Test{arr=[3, 6, 1]} 출력됨
        System.out.println("--------------절취선--------------");

        int[] cloneArr = t.clone();

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        System.out.println("--------------절취선--------------");

        t.changeArr();
        // arr[1] = 10000000로 바꿈

        System.out.println(t);
        // 원본은 값이 바뀌어서
        // Test{arr=[3, 10000000, 1]} 출력됨

        System.out.println("--------------절취선--------------");

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]);
        }
        // 하지만 클론은 바뀌지 않고 원래의 결과 그대로 출력

        System.out.println("--------------절취선--------------");
        cloneArr[1] = 77777777;
        // 클론의 값을 변경하고 싶으면 직접 바꿔줘야 함

        for (int i = 0; i < cloneArr.length; i++) {
            System.out.printf("cloneArr[%d] = %d\n", i, cloneArr[i]); }
        // 클론의 값이 바뀌어서
        // 3, 77777777, 1 이 출력됨

        t.vectorAdd(cloneArr);
        // vecArr에 cloneArr를 대입하여 계산

        System.out.println(t);
        // arr + cloneArr 의 값이 출력됨
        // Test{arr=[6, 87777777, 2]



    }
}











