//따로 클론코딩위주로 복습했습니다.
import java.util.ArrayList;
import java.util.Scanner;

class Market {
    private ArrayList<String> userBuyList;
    private ArrayList<Integer> userBuyListStock;

    private String[] marketSellList = {"선풍기", "키보드", "마우스", "모니터"};
    private int[] marketSellListPrice = {380000, 80000, 70000, 400000};

    private int myMoney = 1000000;

    private Boolean continueShopping;
    Scanner scan;

    final int DEFAULT_IDX = 1;

    public Market () {
        userBuyList = new ArrayList<String>();
        userBuyListStock = new ArrayList<Integer>();

        continueShopping = false;

        scan = new Scanner(System.in);
    }

    public void doShopping () {
        do {
            showMarketSellList();
            selectBuyItem();
            doPayment();
            moneyCheck();
            checkContinueShopping();

        } while (continueShopping);
    }

    private void checkContinueShopping () {
        Boolean isOK = false;

        do {
            scan.nextLine();
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
    int sum = 0;

    private void doPayment () {
        int eachsum = 0;
        for (int i = 0; i < userBuyList.size(); i++) {
            for (int j = 0; j < marketSellList.length; j++) {
                if (userBuyList.get(i).equals(marketSellList[j])) {
                    eachsum = marketSellListPrice[j]*userBuyListStock.get(i);
                    sum += eachsum;
                    System.out.printf("%d. %s : %d\n",i+1,userBuyList.get(i),eachsum);
                    eachsum = 0;
                }
            }
        }
        System.out.println("총 합계 : " + sum);
    }

    private void moneyCheck() {
        int check = myMoney-sum;
            if (sum > myMoney) {
                System.out.printf("잔액 부족 결제 불가 : %d \n", check);
                userBuyListStock.clear();//      clear 기능을 사용해봤다. 잔액부족이 뜨는 순간 정보가 구매정보가 전부 초기화 되서
                userBuyList.clear();//           구매 정보를 저장하려면 물품 취소 메서드를 따로 만드는게 효율적인것같다.
                myMoney = 1000000;
            } else if (sum < myMoney) {
                System.out.printf("===구 매 완 료=== \n  잔액 : %d\n", check);
                myMoney = check;

            }
    }

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

            selectBuyItemStock(marketSellList[itemNum - DEFAULT_IDX]);

            System.out.println(userBuyList);
            System.out.println(userBuyListStock);
        } while (continueBuying);
    }

    private void createNonDuplicateBuyList (String target, int amount) {

        int idx = userBuyList.indexOf(target);

        if (idx == -1) {    // 중복 없음
            userBuyList.add(target);
            userBuyListStock.add(amount);
        } else {
            userBuyListStock.set(idx, userBuyListStock.get(idx) + amount);
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

public class Prob51 {
    public static void main(String[] args) {
        Market m = new Market();

        m.doShopping();
    }
}