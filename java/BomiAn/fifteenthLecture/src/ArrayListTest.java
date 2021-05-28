import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "strawberry", "grape", "watermelon"};
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        for  (int i = 0; i < 4; i++) {
            System.out.printf("get (%d) = %s\n", i, fruitsList.get(i));
        }

        System.out.println("복제 이후");

        ArrayList<String> clone = (ArrayList<String>)fruitsList.clone();
        for (int i = 0; i < 4; i++){
            System.out.printf("get (%d) = %s\n", i, clone.get(i));

        }

        System.out.println("fruitsList에서 값을 하나 삭제하면 clone은 어떻게 되나?");

        fruitsList.remove("grape");

        for (int i = 0; i < 4; i++){
            System.out.printf("get (%d) = %s\n", i, clone.get(i));

        }
        for  (int i = 0; i < 3; i++) {
            System.out.printf("get (%d) = %s\n", i, fruitsList.get(i));
        }

        //clear

        fruitsList.clear();;
        System.out.println("after clear : " + fruitsList);

        //검색 -indexOf

        System.out.println("포도 어디갔니? " + clone.indexOf("grape"));
        System.out.println("딸기는 ? " + clone.indexOf("strawberry"));
        System.out.println("드립치고 싶대 ? " + clone.indexOf("그런거 없음. "));


        // 딩첨자 명단~~~
        // 공모자 명단~~~~
        // 시상식 참가자 명단

        // for (참삭지 명단) {
        //  if (indexOf("당첨자 명단") == -1) {
        //       continue;
        //       } else {
        //          cnt++;
        //       }
        //  }
        // 위와 같은 형태 시상식에 참석하면 수상자 숫자를 집계할 수 있다.


        //contains 또한 IndexOf롸 유사하게 사용이 가능하다.

        System.out.println("포도 어디갔니? " + clone.contains("grape"));
        System.out.println("딸기는 ? " + clone.contains("strawberry"));
        System.out.println("드립치고 싶대 ? " + clone.contains("그런거 없음. "));

        // contains()는 참 혹은 거짓으로 결과가 나오는 것을 확인할 수 있다.





    }
}
