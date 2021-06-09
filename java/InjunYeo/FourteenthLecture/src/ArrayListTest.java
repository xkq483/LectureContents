import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        /*
        용도 :   일종의 배열(클래스 배열)
                배열은 사이즈를 지정하고 사용해야하지만
                ArrayList는 아무때나 막넣어도됨.
                (Heap을 이용한 동적할당을 수행함)

         사용법: ArrayList<내부에 저장할 데이터타입> 변수명 = new ArrayList<내부에 저장할 데이터타입>();
         일반배열과의 차이점은
         배열은 연속적으로 배치되지만 ArrayList는 불연속이다.
         데이터와 다음주소 참조값을 저장해서 연결
         */
        ArrayList<String>lists = new ArrayList<String>();

        lists.add("빵");
        lists.add("버터");
        lists.add("우유");
        lists.add("쥬스");
        lists.add("계란");
        lists.add("베이컨");
        lists.add("파스타");
        lists.add("피자");
        lists.add("햄버거");

        for(String list :lists){
            System.out.println("현재항목은 : "+list);
        }

    }
    /*
    불변적인 상황 : 배열
    가변적인 상황 : ArrayList
     */

}
