import java.util.ArrayList;
public class _3rd_ArrayList {
    public static void main(String[] args) {
        //용도: 일종의 배열
        // 배열은 사이즈를 지정하고 사용해야 함
        // BUT ArrayList는 넣고 싶은대로 아무때나 막 넣어도 됨.
        // (ArrayList도 Heap을 이용한 동적할당을 수행)

        //how to use:
        // ArrayList<내부에 저장할 data type> 변수명 = new ArrayList<내부에 저장할 data type>();

        // 일반 배열과의 차이점
        // 배열은 메모리가 연속적으로 배치.
        // ArrayList는 "불연속 배치"
        // ArrayList
        // | 데이터 | 다음링크 | ---> | 데이터2 | 다음링크 | ---> |데이터3 | 다음링크 | ---> ...
        // 속도느림 // but 유언성 극대화
        // 몇 개가 들어올지 모른다? >> arraylist
        // 배열
        // | 데이터1 | 데이터2 | 데이터3 | 데이터4 | 데이터5 | 데이터6 | .....
        // 속도빠름 / but index값이 정해져있음(개수가 정해져있음)

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

        for(String list : lists){
            System.out.println("현재 항목은: "+ list);
        }
    }
}
