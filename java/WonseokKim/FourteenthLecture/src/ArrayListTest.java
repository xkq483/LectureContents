import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // 용도: 일종의 배열임
        //      배열의 사이즈를 지정하고 사용해야 하지만
        //      이 녀석은 넣고 싶은대로 아무때나 막 넣어도 된다.
        //      (참고로 이 녀석도 Heap을 이용한 동적할당을 수행함)

        // 사용법: ArrayList<내부에저장할데이터타입> 변수명 = new ArrayList<내부에저장할데이터타입>();

        // 일반 배열과의 차이점은 ?
        // 배열은 메모리가 연속적으로 배치된다.
        // 이 녀석은 불연속 배치다.
        // 어떻게 ?
        // | 데이터1 | 다음링크 | ---> | 데이터2 | 다음링크 | ---> | 데이터3 | 다음링크 | ---> ....
        // 배열은 ?
        // | 데이터1 | 데이터2 | 데이터3 | 데이터4 | 데이터5 | 데이터6 | 데이터7 | ...
        ArrayList<String> lists = new ArrayList<String>();

        lists.add("빵");
        lists.add("버터");
        lists.add("우유");
        lists.add("계란");
        lists.add("쥬스");
        lists.add("베이컨");
        lists.add("파스타");
        lists.add("비프샐러드");
        lists.add("피자");

        for (String list : lists) {
            System.out.println("현재 항목은 = " + list);
        }

        lists.remove("빵");
        lists.remove("비프샐러드");

        for (String list : lists) {
            System.out.println("바뀐 항목은 = " + list);


            // 내가 몇 개를 쓸지 알고 있는 상황: 배열
            // 몇 개가 들어올지 모르겠네 ? ArrayList
            // ex) 회원 가입 몇명 ???
        }
    }
}