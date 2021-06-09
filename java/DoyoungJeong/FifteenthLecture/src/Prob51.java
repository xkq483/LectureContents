import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Shop {
    Scanner sc;
    ArrayList<String> buyList;
    ArrayList<String> merchList;
    ArrayList<Integer> merchListNum;
    ArrayList<Integer> priceNums;
    private String merch[];
    private Integer merchNum[];
    private Integer merchPrice[];
    private int money;
    private int soldMerch; //판매된 상품을 담는 배열
    boolean typeYorN;
    boolean leaveShopping; //상점 나가기

    public Shop() {
        merch = new String[]{"빨간 포션 50", "파란 포션 50", "숏소드 150", "롱소드 200", "나무 방패 180", "해독제 70", "포탈 스크롤 100"};
        merchNum = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        merchPrice = new Integer[]{50, 50, 150, 200, 180, 70, 100};

        buyList = new ArrayList<String>();
        merchList = new ArrayList<String>(Arrays.asList(merch));
        merchListNum = new ArrayList<Integer>(Arrays.asList(merchNum));
        priceNums = new ArrayList<Integer>(Arrays.asList(merchPrice));
        money = 500; //돈이 다 떨어지면 못사게 만들기.

    }

    public void operation() {
        do {
            printMerchList();
            buy();
            if(money >= priceNums.get(soldMerch-1)) {
                sold();
            }
            calcMoney();
            if(money >= 0) {
                leaveShop();
            }
        }while (isOver());
    }

    private void printMerchList() {
        System.out.print("구매 가능한 아이템 목록 : ");
        for(int i=0; i<merchList.toArray().length; i++) {
            System.out.printf("[(%d) %s] ", i+1, merchList.get(i));
        }
        System.out.println();
    }

    private void buy() {
        sc = new Scanner(System.in);
        System.out.print("구매할 아이템을 선택하세요 : ");
        soldMerch = sc.nextInt();
    }
    private void sold() {
            buyList.add(merchList.get(soldMerch - 1));
            System.out.println("판매된 아이템 목록 : " + buyList);
    }

    private void calcMoney() {
        money = money-(priceNums.get(soldMerch-1));
        if(money<=0) {
            System.out.println("돈이 부족합니다!");
        } else if (money>0){
            System.out.println("현재 금액은 : " + money);
            merchList.remove(soldMerch-1);
            priceNums.remove(soldMerch-1);
        }
    }

    private void leaveShop() {
        sc = new Scanner(System.in);
        typeYorN = true;
        leaveShopping = true;
        while(typeYorN) { // while()안이 true일 때 반복한다. 며칠 안쓰니까 바로 헷갈린다..
            System.out.print("구매를 계속 하시겠습니까? (Y/N) ");
            String yOrN = sc.nextLine();
            if (yOrN.equals("Y")) {
                typeYorN = false;
            } else if (yOrN.equals("N")) {
                System.out.println("상점을 나갑니다.");
                typeYorN = false;
                leaveShopping = false;
            } else {
                System.out.println("(Y/N) 입력");
                typeYorN = true;
            }
        }
    }

    private boolean isOver() {
        if(money<=0 || leaveShopping == false) {
            return false;
        } else return true;
    }

}
public class Prob51 {
    public static void main(String[] args) {
        Shop sh = new Shop();
        sh.operation();

        //어떻게 만들것인가.
        //일단 Arraylist가 세개있어야한다. 구매, 판매, 목록보기
        //구매목록에 가격과 물품 번호를 연결해서 계산과 구매를 쉽게해야한다.

    }
}
