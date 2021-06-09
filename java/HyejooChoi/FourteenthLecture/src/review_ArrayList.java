import java.util.ArrayList;

public class review_ArrayList {
    public static void main(String[] args) {

        // Collection : 여러개의 객체를 하나의 객체에 담아 처리할 때 공통적으로 사용되는 여러 메소드들을 선언해 놓고 꺼내 쓸 수 있게 수집해놓은곳

        // --- list 인터페이스 ---
        // ArrayList : 확장 가능한 배열, 메소드를 통해서 객체를 넣고 뺴고 조회한다
        // 어떤 상황에 쓸까? : 담을 데이터의 크기가 가늠이 안될 때 사용 (회원가입자들, 몇개가 작성될지 모르는 게시판 같은곳? )

        // ArrayList<내부에저장할데이터타입> 변수명 = new ArrayList<내부에저장할데이터타입>();
        ArrayList<String> lists = new ArrayList<String>();
        // 왜 String 부분이 비활성화 된걸까?
        // --> JDK7 부터는 생성자를 호출하는 부분에 타입 안적고 <> 로만 사용해도 된다고 한다


        // ArrayList에 데이터를 담는 메소드 : add(), addAll()
        // index와 함께 데이터를 넘겨주어서 지정한 위치에 데이터를 담을 수도 있다
        // add() : 하나의 데이터를 담을 때 사용, 배열의 가장 끝에 담긴다
        lists.add("빵");
        lists.add("버터");
        lists.add("우유");
        lists.add("계란");
        lists.add("쥬스");
        lists.add("베이컨");
        lists.add("파스타");
        lists.add("비프샐러드");
        lists.add("피자");


       // 배열을 위한 for 루프 : Collection 인터페이스를 구현한 모든 클래스에서 사용할 수 있음
        // for ( 데이터타입 임시변수명 : 반복할객체 )
        for (String list : lists) {
            System.out.println("현재 항목은 = " + list);
        }

    }
}