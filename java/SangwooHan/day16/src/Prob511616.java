// ArrayList를 활용하여 상점을 만들어보자!
// 구매, 판매, 목록보기
// 소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!
// 초기에 판매리스트에는 아무것도 없다.
// 초기에는 상점 주인이 파는 구매 리스트만 존재한다.
// 물건을 구매하면 구매한 물품이 판매 리스트에 보인다.
// 목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.

// 1. 상점 목록과 상점 가격은 배열로 처리한다.
// 2. 사용자의 구매 목록은 ArrayList로 처리한다.
// 3. 소지금을 설정한다.

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Market {
    private ArrayList<String> userBuyList;//
    private ArrayList<Integer> userBuyListStock;
    private ArrayList<Integer> MarketPrices;
    private ArrayList<String> CheckingProduct;
    private ArrayList<Integer> mydon;
    String[] name;

    private String[] marketSellList = {"선풍기", "키보드", "마우스", "모니터"};
    private Integer[] marketSellListPrice = {380000, 80000, 70000, 400000};
    private int PricePay;
    private int mymoney;

    private Boolean continueShopping;
    Scanner scan;

    final int DEFAULT_IDX = 1;

    public Market () {
        userBuyList = new ArrayList<String>();
        userBuyListStock = new ArrayList<Integer>();
        MarketPrices = new ArrayList<Integer>(Arrays.asList(marketSellListPrice));
        CheckingProduct = new ArrayList<String>(Arrays.asList(marketSellList));
        mydon = new ArrayList<Integer>();
        mymoney =5000000;
        continueShopping = false;

        scan = new Scanner(System.in);
    }

    public void doShopping () {
        do {
            // 1. 마켓에서 판매하는 물품을 보여줌
            showMarketSellList();
            // 2. 구매할 물건을 선택하세요.
            //    어떻게 선택하지 ?
            //    키보드 입력이나 뭔가가 필요한거 같네 ?
            //    가만 보니 초기에 Scanner를 안만들었구나 추가!
            selectBuyItem();
            // 3. 구매리스트가 작성되었다면 비용 산정 진행
            doPayment();
            CalcMoney();
            // 4. 계속 구매할 것인지 여부 판단
            checkContinueShopping();
        } while (continueShopping);
    }

    private void checkContinueShopping () {
        Boolean isOK = false;

        do {
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

    private void doPayment () {
        System.out.println("안녕하세요 결제 진행을 하겠습니다.");
        System.out.println("결제하실제품들과 그개수들은 다음과같습니다.");
        System.out.println(userBuyList);
        System.out.println(userBuyListStock);

        for(int i =0; i<userBuyListStock.toArray().length;i++){
            System.out.println(userBuyList.get(i)+"의총가격은="+MarketPrices.get(i)*userBuyListStock.get(i));
          PricePay  += userBuyListStock.get(i)*MarketPrices.get(i);

        }
            System.out.println("내실금액은="+PricePay);
    }
    private void CalcMoney(){

        System.out.println("현재 내돈 "+mymoney);
        System.out.println("======결제진행=========");
        mymoney = mymoney-PricePay;
        System.out.println("띠띵~ 결제완료 XX마켓결제.."+PricePay+"원 이체됨");
        System.out.println("현재내돈"+mymoney);

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
                //1.continue가 do안에서 실행됐을떄는 do부터 시작하는거같다.
                //

            }


            selectBuyItemStock(marketSellList[itemNum - DEFAULT_IDX]);// 내가 입력한 인자값을selectBuyItemStock에 넘겨준다.
            //
            System.out.println(userBuyList);
            System.out.println(userBuyListStock);
        } while (continueBuying);

        }

                                                    //여기서 매개변수는 내가 고른 상품과 내가고른상품의개수를 받아오는것이다.
    private void createNonDuplicateBuyList (String target, int amount) {
        // 실제 중복이 되었다면 인덱스 값이 나올 것이고
        // 중복이 없으면 -1이 나오게 될 것이다.
        int idx = userBuyList.indexOf(target);// 인덱스오브를 활용한 반복체크. 정수이거나, -1로 판단.

        if (idx == -1) {    // 중복 이 없을경우,,  userBuyListStock에다가,  방금들어온 새로운 타겟(내가추가한물품)을 추가하고 개수까지 받아서 추가하겠다.
            userBuyList.add(target);
            userBuyListStock.add(amount);
        } else {            // idx가 중복된 요소를 알려줌
            // set(idx, 데이터)는 특정 인덱스의 값을 update(갱신)함
            // add(idx, 데이터) + remove(idx + 1)과 동일한 역할을 함
            userBuyListStock.set(idx, userBuyListStock.get(idx) + amount);
            // 키보드가 들어왔을때  userBuyListStock안에있는 키보드 위치에 있는 기존 개수와 지금들어온 amount 개수를 합쳐서 set(갱신)시켜주겠다.
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

public class Prob511616 {
    public static void main(String[] args) {
        Market m = new Market();

        m.doShopping();
    }
}