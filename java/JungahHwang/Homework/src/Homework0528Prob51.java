// ArrayList를 활용하여 상점만들기
// 구매, 판매, 목록보기, 소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!

import java.util.ArrayList;
import java.util.Scanner;

class Shop {
    String[] shop;
    Integer[] price;
    ArrayList<String> buyList;
    int myMoney;

    int inputNum;
    Scanner scan;

    public Shop() {
        shop = new String[]{"공책", "연필", "지우개", "볼펜", "필통", "가방"};
        price = new Integer[]{2000, 1000, 1000, 2000, 3000, 5000};
        buyList = new ArrayList<>();
        myMoney = 10000;

    }

    public void menu() {
        System.out.println("----------------------------- 메뉴판 -----------------------------");
        for (int i = 0; i < shop.length; i++) {
            System.out.printf("%d.%s  ", (i + 1), shop[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------");

    }

    public void buy() {
        scan = new Scanner(System.in);
        System.out.println("무엇을 구매하시겠습니까? 번호를 입력하세요.");
        inputNum = scan.nextInt();
        System.out.printf("%d번 %s(은)는 %s원 입니다. \n", inputNum, shop[inputNum - 1], price[inputNum - 1]);
        buyList.add(shop[inputNum - 1]);
        balbance();
        price();
    }


    public void price(){
        System.out.printf("따라서 당신의 잔액은 %s원 입니다.\n",(myMoney - price[inputNum - 1]));
        myMoney = myMoney - price[inputNum - 1];
        System.out.println();
    }


    public void goStop() {
        Boolean isTrue = true;
        while (isTrue) {
            System.out.println("물건을 더 구매하시겠습니까? Y:0/N:1");
            int num = scan.nextInt();
            if (num == 0) {
                menu();
                buy();
            } else if (num == 1) {
                toString();
                isTrue = false;
            } else {
                System.out.println("잘못입력하셨습니다.");
                System.out.println();
            }
        }
    }

    public void balbance(){
        if (myMoney < price[inputNum - 1]){
            System.out.printf("당신의 잔액은 %s원으로 잔액이 부족합니다.\n", myMoney);
            goStop();
        }
        System.out.println();
    }

    public void printBuy(){
        System.out.println("당신이 구매한 물건은 " + buyList + "입니다.");

    }


}


public class Homework0528Prob51 {
    public static void main(String[] args) {
        Shop s = new Shop();
        s.menu();
        s.buy();
        s.goStop();
        s.printBuy();


    }
}
