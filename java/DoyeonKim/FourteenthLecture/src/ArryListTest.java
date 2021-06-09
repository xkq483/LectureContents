import java.util.ArrayList; //arrylist 패키지를 불러온다

public class ArryListTest {
    public static void main(String[] args) {
        //용도: 일종의 배열임 장점은 유동적이다
        //      배열의 사이즈를 지정하고 사용해야 하지만
        //      이 녀석은 넣고 싶은대로 아무때나 막 넣어도 된다.
        //       (참고로 이 녀석도 Heap을 이용한 동적할당을 수행함)
        // 몇개를 쓸지 모른다면 arrylist


        //일반 배열의 차이점은?
        //배열은 메모리가 연속적으로 배치, 이건 불연속 배치
        // 어떻게 ?
        // | 데이터1 | 다음링크 | ---> | 데이터2 | 다음링크 | ---> | 데이터3 | 다음링크 | ---> ....
        // 배열은 ?
        // | 데이터1 | 데이터2 | 데이터3 | 데이터4 | 데이터5 | 데이터6 | 데이터7 | ...
        ArrayList<String> lists = new ArrayList<String>();

        lists.add("빵");
        lists.add("버터");
        lists.add("우유");
        lists.add("계란");
        lists.add("파스타");
        lists.add("비프샐러드");
        lists.add("샐러드");

        for (String list : lists) {
            System.out.println("현재 항목은 = " + list);

        }
    }
}
