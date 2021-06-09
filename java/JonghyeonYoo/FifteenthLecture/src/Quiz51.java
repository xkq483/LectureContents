import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//ArrayList를 활용하여 상점을 만들어보자!

// 구매목록, 판매목록
// 현재 소지금 입력
// 물건 가격 및 품번 입력
// 품번 입력받아 구매가능하게 만들기
// 초기에는 상점 주인이 파는 구매 리스트만 존재한다.
// 물건을 구매하면 구매한 물품이 판매 리스트에 보인다.
// 목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.
class Shop {
    ArrayList<String> buylist;
    ArrayList<String> sellist;
    String[] shop;
    Integer [] price;
    int curMoney;   //현재 소지금
    int buying; // 구매하기
    Scanner scan;

    public Shop() {
        shop = new String[]{"물", "콜라", "햄버거", "과자"};
        price = new Integer[]{1000, 1500, 3000, 2000};
        scan = new Scanner(System.in);
       buylist = new ArrayList<String>();
       sellist = new ArrayList<String>();
    }

    public void modelNumPrice(){ //물건의 품번 & 가격
        System.out.println(" ==========판매 목록==========");
        ArrayList<Integer> mdPrice = new ArrayList<Integer>(Arrays.asList(price));
        ArrayList<String> shopping = new ArrayList<>(Arrays.asList(shop));
        for (int i = 0; i < 4; i++) {
            System.out.printf("(%d)번 %s의 가격 = %d원\n", i+1, shopping.get(i), mdPrice.get(i));
       }
       System.out.println("======================================================");
   }
public void myMoney() { // 소지금
    System.out.print("현재 소지금이 얼마인가요 ? : ");
    curMoney = scan.nextInt();
    System.out.println("======================================================");
    }
    public void buy() { // 물건 구매하기
        System.out.print("물건을 구매하세요.(품번입력) : ");
        buying = scan.nextInt();
                switch (buying) {
                    default:
                        System.out.println("물건이 없습니다");
                        break;
                    case 1:
                        System.out.println("물을 구매 하였습니다.");
                        break;
                    case 2:
                        System.out.println("콜라를 구매 하였습니다.");
                        break;
                    case 3:
                        System.out.println("햄버거를 구매 하였습니다. ");
                        break;
                    case 4:
                        System.out.println("과자를 구매 하였습니다.");
                        break;

                }

                System.out.printf("%d번 %s의 가격은 %d원 입니다.\n", buying, shop[buying-1], price[buying-1]);
                System.out.println("======================================================");
            }

    public void usedCurMoney() {
        System.out.print("물건 구매후 남은 금액 입니다\n");
        System.out.printf("현재 잔액은 = %d원 입니다.\n", (curMoney - price[buying-1] ) );
    }
    public void purchase() {

    }
}

public class Quiz51 {
    public static void main(String[] args) {
Shop s = new Shop();

s.modelNumPrice();
s.myMoney();
s.buy();
s.usedCurMoney();;
    }
}
