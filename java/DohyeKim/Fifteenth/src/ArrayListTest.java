import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args) {
        String[] sellList = {"햄스터마우스", "무당벌레유에스비", "폰케이스", "오리수저받침"};
        // asList()를 통해 배열등을 ArrayList로 변형할 수 있음
        ArrayList<String> sellLists = new ArrayList<>(Arrays.asList(sellList));

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, sellLists.get(i));
        }

        System.out.println("복제 이후!");

        // fruitsList의 내용을 clone 변수에 복제함
        // ArrayList에 구현되어 있는 clone은 객체를 복제할 수 있게 서포트한다.
        ArrayList<String> clone = (ArrayList<String>) sellLists.clone();
        for (int i = 0; i < 4; i++) {
            // ArrayList에 있는 내용을 가져올때 get(index)를 사용합니다.
            // 여기서 index는 | 데이터1 | ---> | 데이터2 | ---> | 데이터8 | --->
            //                   0               1               2
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        sellLists.remove("햄스터마우스");
        System.out.println("sellList의 햄스터마우스 삭제 이후 clone 다시 보기");

        for (int i = 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        System.out.println("sellList는 지워졌을까 ?");

        for (int i = 0; i < 3; i++) {
            System.out.printf("get(%d) = %s\n", i, sellLists.get(i));
        }

        // 완전 통채로 밀림
        sellLists.clear();

        System.out.println("after clear: " + sellLists);

        // 검색 - indexOf
        System.out.println("폰케이스 어딧니 ? " + clone.indexOf("폰케이스"));
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

        // contains 또한 IndexOf와 유사하게 사용이 가능하다.
        System.out.println("폰케이스 어딧니 ? " + clone.contains("폰케이스"));
        // contains()는 참 혹은 거짓으로 결과가 나오는 것을 확인할 수 있다.
    }
}