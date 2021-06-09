
/*

Q. 물건이 일렬로 있을때랑 아무곳에나 있을때 중 물건이 찾기 쉬운 경우는?
A. 일렬로 있을 때 찾기가 빠르다.(배열)

배열은 메모리가 연속적으로 배치된다.
     / 그러나 반드시 인덱스 값을 지정해줘야한다.
ArrayList는 인덱스 값 지정이 안보이면서, 유연성이 극대화되었다.
     / 그러나 메모리가 불연속적 = 속도가 느려짐

       EX_) 회원 가입 중, 배열 인덱스에 10을 설정했을때 10명만 회원가입가능
            그러나 회원이 몇명 들어올 줄 모름 = 이럴때 쓰기엔 ArrayList 이 좋다.
            하지만, 선착순 10명만 받을 때라면,
            ArrayList 사용하면 좋지않음.
         -내가 사용할 배열의 갯수가 명확하다 = 배열
         -내가 몇개를 사용하게 될지 모른다 = ArrayList
 */

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
    }
}
