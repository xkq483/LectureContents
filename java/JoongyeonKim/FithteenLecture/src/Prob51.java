//ArrayList를 활용하여 상점을 만들어보자!
//구매, 판매, 목록보기
//소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!
//초기에 판매리스트에는 아무것도 없다.
//초기에는 상점 주인이 파는 구매 리스트만 존재한다.
//물건을 구매하면 구매한 물품이 판매 리스트에 보인다.
//목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 1. 파는 상품 목록 (표시)
// 2. 메뉴 숫자를 눌러서 구매
// 3. 물건 구매시 판매리스트가 보임
// 4. 현재 소지한 물건리스트 표시
// 5. 구매가 판매가 지정하기
// 6. 상인 메소드, 손님 메소드, 물건 메소드, 상점 메소드 만들기

class Store {
    ArrayList<String> buyList;
    ArrayList<String> sellList;
    Scanner scan;

    String[] sellMenu = {"피자","치킨","콜라","호빵"};


    public Store(){
        scan = new Scanner(System.in);
        buyList = new ArrayList<>();
        sellList = new ArrayList<>(Arrays.asList(sellMenu));

    }

    public void showMenu(){
        sellmenu = new Item[5];
        menu[0] = Item("피자", 1000, 10);
        menu[1] = Item("치킨", 2000, 10);
        menu[2] = Item("콜라", 800, 20);
        menu[3] = Item("호빵", 500, 10);

    }

}

public class Prob51 {
    public static void main(String[] args) {

    }
}
