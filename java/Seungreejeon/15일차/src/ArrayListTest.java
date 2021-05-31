import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;




public class ArrayListTest {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Strawberry", "Grape", "WaterMelon"};
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));
        // asList()를 통해 배열등을 ArrayList로 변형할 수 있음
        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        System.out.println("복제 이후 ");

        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }
        System.out.println("제거 이후 ");
        fruitsList.remove("Grape");

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }
        // 배열을 통째로 비움
        fruitsList.clear();
        System.out.printf("after get : %s\n", fruitsList);

        // 검색 - indexOf
        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }
        System.out.println("포도 " + clone.indexOf("Grape"));
        System.out.println("딸기 " + clone.indexOf("Strawberry"));
        //존재하지 않는 것은 -1이 나옴(오류)
        System.out.println("드립을 치고 싶은데 " + clone.indexOf("드립"));

        //당첨자 명단 ~~~~
        // 공모자 명단 ~~~~
        // 시상식 참석자 명단~~~~
        //for each 문 (참석자 명단~~) {
        // if(indexOf(당첨자 명단) == -1{
        //   continue;
        // } else {
        //       cnt++
        // }
        //위와 같은 형태로 시상식에 참석하면 수상자 숫자를 집계할 수 있다.

        //contains 또한 IndexOf와 유사하게 사용이 가능하다 true or false 값을 반환
        System.out.println("포도 " + clone.contains("Grape"));
        System.out.println("딸기 " + clone.contains("Strawberry"));
        //존재하지 않는 것은 -1이 나옴(오류)
        System.out.println("드립을 치고 싶은데 " + clone.contains("드립"));

        //contains()는 참 혹은 것짓으로 결과가 나온다.
    }
}
