import java.util.ArrayList;
import java.util.Arrays;

public class a_AraayListTest {
    public static void main(String[] args) {
        String[] fruits = {"apple", "strawberry", "grape", " watermelon"};
        // asList()를 통해 배열등을 ArrayList로 변형할 수 있음
        ArrayList<String> fruitsList = new ArrayList<>(Arrays.asList(fruits));

        for(int i = 0; i <4; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        System.out.println("복제 이후!");

        // 위의 fruitsList의 내용을 clone 변수에 복제함. 즉 원본내용을 복사하므로, 바뀐내용이 생기더라도 원본내용만을 갖고오게됨.
        // ArrayList에 구현되어 있는 clone은 객체를 복제할 수 있게 서포트한다.
        // 앞의 clone은 변수명 . 뒤의 .clone은 메소드(변수명).
        ArrayList<String> clone = (ArrayList<String>) fruitsList.clone();
        for (int i = 0; i < 4; i++) {
            // ArrayList에 있는 내용을 가져올 때 get(index)를 사용합니다.
            // 여기서 index는  | 데이터1 | ---> | 데이터2 | ---> | 데이터8| --->
            //                    0               1               2
            // 결론은 get은 화살표를 따라가서 i의 정보를 뿌린다
            System.out.printf("get(%d) = %s\n", i, clone.get(i));
        }

        fruitsList.remove("grape");
        System.out.println("fruitsList의 grape 삭제 이후 clone 다시보기");
        for(int i= 0; i < 4; i++) {
            System.out.printf("get(%d) = %s\n", i, clone.get(i));

        }
        System.out.println("fruitsList는 지워졌을까?");
        for(int i = 0; i<3; i++) {
            System.out.printf("get(%d) = %s\n", i, fruitsList.get(i));
        }

        System.out.println("여기서부터는 clear");

        // 완전 통째로 밀림. 객체는 살아있음. 내부의값만 지워짐.
        fruitsList.clear();
        System.out.println("after clear: " + fruitsList);

        // 검색 - indexOf
        // clone은 사본(위에서 clear로 밀어버려서 clone을 가져옴)
        // 결과값을 보면 인덱스 위치를 보여줌. 즉, clone[2], clone[1]
        System.out.println("포도 어딨니?" + clone.indexOf("grape"));
        System.out.println("딸기는?" + clone.indexOf("straberry"));
        // 존재하지 않는 것은 -1(오류)이 나옴
        System.out.println("aa?" + clone.indexOf("ㅁㅁ"));

        // 당첨자 명단 ~~~
        // 공모자 명단 ~~~
        // 시상식 참석자 명단 ~~~
        // for (참석자 명단 ~~~){ - for each문
        //     if(indexOf("당첨자 명단") == -1) {
        //        continue;
        //        else { ~~~
        //        cnt++
        // 위와 같은 형태로 시상식에 참서갛면 수상자 숫자를 집계할 수 있다.

        //contains 또한 IndexOf와 유사하게 사용이 가능하다.
        // contains()는 참 혹은 거짓으로 결과가 나오는 것을 확인할 수 있다.
        System.out.println("포도 어딨니?" + clone.contains("grape"));
        System.out.println("딸기는?" + clone.contains("straberry"));
        System.out.println("aa?" + clone.contains("ㅁㅁ"));
    }
}

// clone메소드는 객체(원본)의 복사를 지원함
// 객체면 바뀐것이 나오지만,
// 사본이면 바뀌든 말든 원본이 나오게됨.
// 예제에서 cloneArr가 사본임.