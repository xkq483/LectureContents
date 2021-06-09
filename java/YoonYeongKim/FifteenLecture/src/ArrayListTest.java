import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "strawberry", "grape", "watermelon"};

        // asList()를 통해 배열등을 ArrayList로 변형할 수 있음.
        // 배열 ArrayList에 변수fruits를 넣음. 배열을 리스트화.
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        for (int i = 0; i < 4 ; i++) {
            System.out.printf("get(%d) = +%s\n", i, fruitsList.get(i));
        }

        System.out.println("복제 이후!");

        // 복제인지 객체인지 확인 하는 구간
        // 어레이레스트에서 클론은 복제가 가능하다 객체를 복제할수있다.
        // 값이 아닌 객체 전체를 복제함

        // fruitsList의 내용을 clone 변수에 복제함
        // ArrayList에 구현되어 있는 clone은 객체를 복제할 수 있게 서포트한다.
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        for (int i = 0 ; i < 4 ; i++) {


            // ArrayList에 있는 내용을 가져올때 get(index)를 사용한다.
            // 여기서 index는 | 데이터1 |--->| 데이터2 |--->| 데이터8 |--->
                    // index     0            1             2
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }


        // 원본
        fruitsList.remove("grape");
        System.out.println("fruitsList의 grape 삭제 이후 clone 다시 보기");

        for (int i = 0; i < 4 ; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        System.out.println("fruitsList는 지워졌을까 ?");

        for (int i = 0 ; i < 3; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        // 완전 통채로 밀림
        // clear = 배열의 인덱스를 밀어버린다. = 0 = null상태가 된다. (객체는 살아있음 내부의 값만 0)
        fruitsList.clear();

        System.out.println("after clear :" + fruitsList);

        // 검색 - index0f
        // 위에서 clear로 다 밀었으니 복제본인 클론인덱스를 출력한다.
        System.out.println("포도 어디있니 ? "+ clone.indexOf("grape")); // 출력결과 = 2 (인덱스 2번(세번째))
        System.out.println("딸기는 ? " + clone.indexOf("strawberry")); // 출력결과 =

        System.out.println("키위 어디있니 ? " + clone.indexOf("키위")); // 출력결과 = -1 (오류 : 존재하지 않는 배열의 인자 입력 시)


        // 당첨자 명단 ~~(당첨자 명단에는 공모자가 포함됨)
        // 공모자 명단 ~~
        // 시상식 참석자 명단 ~~

        // for (참석자 명단 ~~) {
        //    if (indexOf("당첨자 명단") == -1 { // 당첨자 명단이 -1이면
        //        continue;
        //    } else {
        //        cnt++
        //    }
        // }
        // 위와 같은 형태로 시상식에 참석하면 수상자 숫자를 집계할 수 있다.

        // contains 또한 IndexOf와 유사하게 사용이 가능하다.
        System.out.println("포도 어디있니 ? " + clone.contains("grape"));
        System.out.println("딸기는 ? " + clone.contains("strawberry"));
        System.out.println("키위 어디있니 ? " + clone.contains("키위"));

        // contains()는 참 혹은 거짓으로 결과가 나오는 것을 확인할 수 있다.

    }
}
