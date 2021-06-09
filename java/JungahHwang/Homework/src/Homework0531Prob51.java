// 51. ArrayList를 활용하여 상점을 만들기 >> 결제부분 완성하기

import java.util.ArrayList;
import java.util.Scanner;

class Market {
    private ArrayList<String> userBuyList;
    private ArrayList<Integer> userBuyListStock;

    private String[] marketSellList = {"선풍기", "키보드", "마우스", "모니터"};
    private int[] marketSellListPrice = {380000, 80000, 70000, 400000};

    private int myMoney;
    private int price;

    private Boolean continueShopping;
    Scanner scan;

    final int DEFAULT_IDX = 1;

    public Market () {
        userBuyList = new ArrayList<String>();
        userBuyListStock = new ArrayList<Integer>();

        continueShopping = false;

        myMoney = 5000000;
        price = 0;

        scan = new Scanner(System.in);
    }


    public void doShopping () {
        do {
            showMarketSellList();
            selectBuyItem();
        } while (continueShopping);
    }

    private void checkContinueShopping () {
        Boolean isOK = false;

        do {scan.nextLine();
            System.out.print("쇼핑을 계속하시겠습니까 ? Y/N");

            String res = scan.nextLine();

            if (res.equals("Y")) {
                isOK = false;
                continueShopping = true;
            } else if (res.equals("N")) {
                isOK = false;
                continueShopping = false;
            } else {
                isOK = true;
                continue;
            }
        } while (isOK);
    }
// 숙제 --------------------------------------------------------------------------------------------------------------------------------------
    private void doPayment () {

        for(int i = 0; i < userBuyList.size(); i++){

            if(userBuyList.get(i).equals("선풍기")){
                price += userBuyListStock.get(i) * marketSellListPrice[0];
            }else if(userBuyList.get(i).equals("키보드")){
                price += userBuyListStock.get(i) * marketSellListPrice[1];
            }else if(userBuyList.get(i).equals("마우스")){
                price += userBuyListStock.get(i) * marketSellListPrice[2];
            }else if(userBuyList.get(i).equals("모니터")){
                price += userBuyListStock.get(i) * marketSellListPrice[3];
            }
        }
        System.out.printf("총 결제 금액은 %s원 입니다.\n", price);
        payment();

    }
    private void payment(){
        scan.nextLine();
        System.out.print("결제하시겠습니까? Y/N");
        String inputStr = scan.nextLine();
        if(inputStr.equals("Y")){
            myWallet();
        }else if(inputStr.equals("N")){
            System.out.print("장바구니에 물건을 추가합니다(0) / ");
            System.out.print("장바구니를 초기화 합니다(1)");
            int inputNum = scan.nextInt();
            if(inputNum == 0){
                price = 0;
                selectBuyItem();
            }else if(inputNum == 1){
                userBuyList.clear();
                userBuyListStock.clear();
                checkContinueShopping();
            }
        }
    }

    private void myWallet () {
        if (myMoney >= price) {
            System.out.printf("구매를 완료하였습니다. 잔액은 %s원 입니다.\n", myMoney - price);
        } else if (myMoney < price) {
            System.out.printf("잔액이 %s원 부족합니다! 잔액을 충전하시겠습니까? Y/N", -(myMoney - price));

            String inputStr = scan.nextLine();

            if (inputStr.equals("Y")) {
                System.out.print("얼마를 충전하시겠습니까?");
                int inputMoney = scan.nextInt();
                myMoney += inputMoney;
                System.out.printf("%s원을 충전하여 잔액이 %s원이 되었습니다.\n", inputMoney, myMoney);
                payment();
            } else if (inputStr.equals("N")) {
                System.out.println("결제를 종료합니다.");
                userBuyList.clear();
                userBuyListStock.clear();
                checkContinueShopping();
            }
        }
    }
// -----------------------------------------------------------------------------------------------------------------------------------------1

    private void selectBuyItemStock (String selectItem) {
        Boolean isntErrorAmount = true;
        int amount;

        do {
            System.out.print("구매할 수량을 선택하세요: ");

            amount = scan.nextInt();

            if (amount <= 0) {
                System.out.println("잘못된 수량이니 다시 입력해주세요!");
                continue;
            }

            isntErrorAmount = false;
        } while (isntErrorAmount);

        createNonDuplicateBuyList(selectItem, amount);
    }

    // 어떤 물건을 구할지 결정하는 매서드
    private void selectBuyItem () {
        Boolean continueBuying = true;

        do {
            System.out.print("구매할 물건의 번호를 누르세요(결제진행: 0): ");

            int itemNum = scan.nextInt();

            if (itemNum > 4) {
                System.out.println("잘못된 물품을 선택하셨습니다!");
                continue;
            } else if (itemNum < 0) {
                System.out.println("잘못된 물품을 선택하셨습니다!");
                continue;
            } else if (itemNum == 0) {
                continueBuying = false;
                continue;
            }

            // 물품을 모두 선택하고 몇 개 구할지 결정하는 매서드
            selectBuyItemStock(marketSellList[itemNum - DEFAULT_IDX]);

            System.out.println(userBuyList);
            System.out.println(userBuyListStock);
        } while (continueBuying);
        doPayment();
    }

    private void createNonDuplicateBuyList (String target, int amount) {

        int idx = userBuyList.indexOf(target);

        if (idx == -1) {
            userBuyList.add(target);
            userBuyListStock.add(amount);
        } else { userBuyListStock.set(idx, userBuyListStock.get(idx) + amount);
        }
    }

    private void showMarketSellList () {
        int length = marketSellList.length;

        System.out.println("우리 마켓에서 판매하는 물품을 리스팅 합니다!");

        for (int i = 0; i < length; i++) {
            System.out.printf("%d. %s: %d\n", i + 1, marketSellList[i], marketSellListPrice[i]);
        }
    }
}

public class Homework0531Prob51 {
    public static void main(String[] args) {
        Market m = new Market();

        m.doShopping();
    }
}
