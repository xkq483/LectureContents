import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Shop {
    final String[] FOR_SALE = {"apple", "banana", "melon", "sugar", "salt", "oil"}; // 판매리스트
    int money = 13000; // 구매자 보유자금
    Scanner scan;
    public ArrayList<String> buy_list;

    public Shop() {
        buy_list = new ArrayList<String>();
    }
    public void order() {
//        boolean buy_more = true;
//        while (buy_more) {
            System.out.print("무엇을 구매하시겠습니까?: ");
            scan = new Scanner(System.in);
            String what_to_buy = scan.nextLine();
            buy_list.add(what_to_buy);

//            System.out.println("추가로 구매하시겠습니까? yes/no");
//            String yes_or_no = scan.nextLine();
//            if (yes_or_no == "yes") {
//                buy_more = true;
//            } else if (yes_or_no == "no") {
//                // buy_more = false; // 이 code도 안 되고
//                // break;             // break; 해도 계속 무한루프..
//            }
//        }
    }
    public void calculation(){
        if(buy_list.contains("apple")){
            money -= 1500;
        }
        if(buy_list.contains("banana")){
            money -= 3500;
        }
        if(buy_list.contains("melon")){
            money -= 5000;
        }
        if(buy_list.contains("sugar")){
            money -= 2000;
        }
        if(buy_list.contains("salt")){
            money -= 1500;
        }
        if(buy_list.contains("oil")){
            money -= 3500;
        }

    }

    @Override
    public String toString() {return "가게 판매리스트 = " + Arrays.toString(FOR_SALE);}
    public int getMoney() {
        System.out.print("남은 돈: ");
        return money;
    }
}
public class _99th_Quiz51 {
    public static void main(String[] args) {
//        ArrayList를 활용하여 상점을 프로그래밍.
//                '구매', '판매', '목록보기', '소지금', '물건의 구매가' 등을 지정해서
//                적정 버튼을 누르면 처리되도록 할 것.
//                초기에 구매리스트에는 아무것도 없다.
//                초기에는 상점 주인이 파는 판매리스트만 존재.
//                물건을 구매하면 구매한 물품이 구매리스트에 보인다.
//                '목록 보기'는 단순히 현재 소지한 물건 리스트만 보여준다.

        // 판매리스트 작성 / OK
        // 판매리스트마다 가격 갖는 method
        // 초기 구매자 보유금 setting / OK
        // 구매리스트 - ArrayList
        // 구매 - Switch Case
        // 목록보기 - for + .get() 사용
        Shop shopping = new Shop();
        System.out.println(shopping);
        shopping.order();
        shopping.calculation();
        System.out.println(shopping.getMoney());
    }
}