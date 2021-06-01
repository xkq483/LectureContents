import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Market {
    Scanner sc;
    private ArrayList<String> myBasket;
    private ArrayList<Integer> basketStock;
    private String[] merchList;
    private int[] merchPrice;
    private int myMoney;
    private int spentMoney;
    private int selectMerch;
    private int selectNum;
    private int removeMerch;
    private int removeNum;
    boolean isNotEnoughMoney;
    boolean leaveMarket;

    public Market() {
        merchList = new String[]{"사탕", "젤리", "과자", "아이스크림", "껌"};
        merchPrice = new int[]{200, 150, 300, 250, 100};
        myBasket = new ArrayList<>();
        basketStock = new ArrayList<>();
        myMoney = 3000;
        spentMoney = 0;
    }
    public void operation() {
        do {
            showMerchList();
            selectMerch();

            if(selectMerch == 0) {
                doPayment();
                break;
            }
            do {
                selectHowMany();
                if(selectNum == 0) {
                    System.out.println("선택이 취소되었습니다.");
                    continue; //continue를 하면 메소드의 시작, 맨 위의 do부터 다시 시작한다!
                }
            } while (isNotEnoughMoney);
            printResult();
            calcMoney();

        }while (true);

        System.out.println("\t구매 종료");
    }
    private void showMerchList() {
        System.out.println("구매할 항목 번호를 입력하세요.");
        for(int i=0; i<merchList.length; i++) {
            System.out.printf("[(%d) %s %d]\t", i+1, merchList[i], merchPrice[i]);
        }
        System.out.println();
    }

    private void selectMerch() {
        sc = new Scanner(System.in);
        boolean isWrongNum = true;
        leaveMarket = true;

        while (isWrongNum) {
        System.out.print("번호 입력(구매 하기/0) : ");
            selectMerch = sc.nextInt();
        if(selectMerch>merchList.length || selectMerch<0) {
            System.out.println("물품의 번호를 입력해주세요.");
        } else isWrongNum = false;
        }
    }

    private boolean selectHowMany() {
        sc = new Scanner(System.in);
        isNotEnoughMoney = true;
        boolean isWrongNum = true;
        do {
            System.out.print("구매할 개수를 선택하세요(선택 취소/0) : ");
            selectNum = sc.nextInt();
            if(myMoney < merchPrice[selectMerch-1]*selectNum) {
                System.out.println("돈이 부족합니다.");
                continue;
            }
            isWrongNum = false;
        } while (isWrongNum);
        isNotEnoughMoney = false;
        if(selectNum > 0) {
            checkDupli(merchList[selectMerch - 1], selectNum);
        }
        return isNotEnoughMoney;
    }

    private void checkDupli(String target, int amount) {
        int idx = myBasket.indexOf(target);

        if(myBasket.contains(target)) {
            myBasket.set(idx, target);
            basketStock.set(idx, basketStock.get(idx)+amount);
        } else {
            myBasket.add(merchList[selectMerch-1]);
            basketStock.add(selectNum);
        }
    }

    private void calcMoney() {
        spentMoney = spentMoney + merchPrice[selectMerch-1]*selectNum;
        myMoney = myMoney - merchPrice[selectMerch-1]*selectNum;
        System.out.println("잔여 금액은 " + myMoney + "입니다.");
    }
    private void printResult() {
        System.out.print("현재 장바구니 목록 : ");
        for(int i=0; i<myBasket.toArray().length; i++) {
            System.out.printf("[%s %d개]\t", myBasket.get(i), basketStock.get(i));
        }
    }
    private void removeBasket() {
        sc = new Scanner(System.in);
        boolean isNotDone = true;
        while(isNotDone) {
            System.out.println("결제 전에 취소할 상품이 있다면 번호를 입력하세요(나가기/0) : ");

            for (int i = 0; i < myBasket.toArray().length; i++) {
                System.out.printf("[(%d) %s %d개]", i + 1, myBasket.get(i), basketStock.get(i));
            }
            System.out.println();
            removeMerch = sc.nextInt();
            if(removeMerch == 0) {
                isNotDone = false;
                break;
            }
            System.out.print("해당 상품의 취소할 갯수를 입력하세요 : ");
            removeNum = sc.nextInt();
            basketStock.set(myBasket.indexOf(myBasket.get(removeMerch - 1)), basketStock.get(removeMerch - 1) - removeNum);
        }


    }
    private void doPayment() {
        removeBasket();
        System.out.println("장바구니에 담은 상품을 결제합니다.");
        for(int i=0; i<myBasket.toArray().length; i++) {
            System.out.printf("물품명 : %s, 개수 : %d, 금액 : %d\n", myBasket.get(i), basketStock.get(i), merchPrice[i]*basketStock.get(i));
        }
        System.out.printf("구매 금액의 총 합계 : %d, 거스름돈 : %d", spentMoney, myMoney);

    }

}

public class Prob52 {
    public static void main(String[] args) {
        Market mk = new Market();
        mk.operation();


    }

}