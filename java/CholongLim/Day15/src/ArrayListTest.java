import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "strawberry", "grape", "watermelon"};
        // 원래 ArrayList의 기본형식은 ?
        // ArrayList<String> 이름 = new ArrayList<String>();
        // ArrayList<Integer> 이름 = new ArrayList<Integer>();
        // asList()를 통해 배열등을 ArrayList로 변형할 수 있음

        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        System.out.println("복제 이후!");

        // fruitsList의 내용을 clone 변수에 복제함
        // ArrayList에 구현되어 있는 clone은 객체를 복제할 수 있게 서포트한다.
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        for (int i = 0; i < 4; i++) {
            // ArrayList에 있는 내용을 가져올때 get(index)를 사용합니다.
            // 여기서 index는 | 데이터1 | ---> | 데이터2 | ---> | 데이터8 | --->
            //                   0               1               2
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        fruitsList.remove("grape"); //원본에 대한 값 변화
        System.out.println("fruitsList의 grape 삭제 이후 clone 다시 보기");

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        System.out.println("fruitsList는 지워졌을까 ?");

        for (int i = 0; i < 3; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        System.out.println("그렇다면 새로운 과일 추가해보기");
        fruitsList.add("cherry");

        System.out.println("fruitsList에 cherry 추가 이후 clone 다시 보기");
        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        System.out.println("fruitsList는 새 과일이 생겼을까 ?");
        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        // 완전 통채로 밀림
        fruitsList.clear();

        System.out.println("after clear: " + fruitsList);

        // 검색 - indexOf
        // 검색 후, [2]인덱스에 포도가 있기 때문에 2가 출력된다.
        System.out.println("포도 어딧니 ? " + clone.indexOf("grape"));
        // 검색 후, [1]인덱스에 딸기가 있기 때문에 1이 출력된다.
        System.out.println("딸기는 ? " + clone.indexOf("strawberry"));
        // 존재하지 않는 것은 -1 이 나옴(오류)
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
        // indexOf에서 -1은 존재하지 않는 것을 뜻한다.
        // 참석자 명단에서 검색했을떄 어떠한 사람이 당첨자 명단에 존재하지 않는다면
        // 계속 참석자 명단에 있는 이름을 가져와서 체크할 것이고,
        // 당첨자 명단에 참석자 이름이 존재한다면, 그 수를 cnt++ 카운트할 것이다.

        // 위와 같은 형태로 시상식에 참석하면 수상자 숫자를 집계할 수 있다.



        // contains 또한 IndexOf와 유사하게 사용이 가능하다.
        // contains()는 참 혹은 거짓으로 결과가 나오는 것을 확인할 수 있다.
        System.out.println("포도 어딧니 ? " + clone.contains("grape"));
        System.out.println("딸기는 ? " + clone.contains("strawberry"));
        System.out.println("드립을 치고 싶은데 ? " + clone.contains("드립"));

    }
}
