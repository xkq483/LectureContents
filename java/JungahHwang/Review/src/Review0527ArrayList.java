import java.util.ArrayList;
import java.util.Scanner;

class Shop {
    ArrayList<String> lists;
    Scanner scan;

    public Shop () {
        lists = new ArrayList<String>();
        scan = new Scanner(System.in); }

    public void order () {
        System.out.print("필요한 물품을 말씀하세요: ");
        lists.add(scan.nextLine());
        // lists.add 는 입력
    }

    public void cancelOrder () {
        System.out.print("취소할 물품을 말씀하세요: ");
        lists.remove(scan.nextLine());
        // lists.remove 는 지우기
    }

    // toString 으로 자동 완성 가능 : 객체 정보 출력에 사용
    @Override
    public String toString() {
        return "Shop{" +
                "lists=" + lists +
                '}'; }
}


public class Review0527ArrayList {
    public static void main(String[] args) {

// ArrayList --------------------------------------------------------------------------

        ArrayList<String> lists = new ArrayList<String>();
        // ArrayList : 배열의 일종으로 일반 배열은 사이즈를 지정하고 사용해야 하지만
        //             arraylist는 넣고싶은 정보를 아무때나 넣을 수 있음
        //             (Heap을 이용한 동적할당을 수행)

        // 사용법 : ArrayList<내부에 저장할 데이터 타입> 변수명 = new ArrayList<내부에 저장할 데이터 타입>();

        // 일반 배열과의 차이점??
        // 배열은 메모리가 연속적으로 배치 / ArrayList는 불연속 배치
        // 배열은 new를 하고 크기를 지정해줘야 함 -> 하지만 빠름
        // ArrayList는 크기 지정을 하지 않고 자유롭게 입력 -> 하지만 느림
        // ex) Array : 선착순 10명! 등 크기가 정해져 있을 떄
        //     ArrayList : 사이트에 회원가입 하는 사람의 수를 알지 못할 때

        lists.add("빵");
        lists.add("버터");
        lists.add("우유");
        lists.add("계란");
        lists.add("쥬스");
        lists.add("베이컨");
        lists.add("파스타");
        lists.add("비프샐러드");
        lists.add("피자");
// ----------------------------------------------------------------------------------------------

        Shop s = new Shop();

        for(int i = 0; i < 3; i++) {
            s.order(); }

        s.cancelOrder();

        // 아래와 같이 객체를 전달하면 toString이 호출됨
        System.out.println(s);

    }
}
// ArrayList는 Queue(큐) 혹은 Stack 역할을 할 수 있는데 기본이 Queue(큐) 역할
// 정보가 입력한 순서대로 배치















