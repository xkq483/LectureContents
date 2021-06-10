import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Market{
    Scanner scan;
    final int DEFAULT_INDEX = 1; // 배열은 [0]부터 아이템 list 보여줄 때 보통 1부터
    private ArrayList<String> userBuyList; //구매 한 것들 ArrayList로
    private ArrayList<Integer> userBuyListStock; // 구매한 것들의 개수를 ArrayList로

    private String[] marketSellList = {"fan", "keyboard", "mouse", "monitor"};
    private int[] marketSellListPrice = {15000, 30000, 25000, 200000};
    private int myMoney; // 초기자금
    private int totalprice;

    private boolean continueShopping;

    public Market(){
        scan = new Scanner(System.in);
        userBuyList = new ArrayList<String>();
        userBuyListStock = new ArrayList<Integer>();
        input_money();
        // 초기 자금 setting. doshpping()에 넣으면 계산 끝내고 쇼핑 더 할 때
        // 남은 돈으로 shopping을 하는게 아니라 또 setting을 하게 됨.
    }
    public void doShopping(){ //main에서 arbiter로 사용
        continueShopping = true;
        do {
            showMarketSellList(); // 물건 보여줌
            selectBuyItem();      // 구매할 물건 선택
            doPayment();        // 계산
            checkContinueShopping(); // 더 shopping 할 것인가
        } while(continueShopping);
    }

    public void input_money(){
        System.out.print("how much do you have in your wallet: ");
        myMoney = scan.nextInt();
    }

    public void showMarketSellList(){
        System.out.println("*** Product List *** ");
        for(int i = 0; i < marketSellList.length; i++){
            System.out.printf("%d. %s %d원\n",i+1, marketSellList[i], marketSellListPrice[i]);
        }
    }
    public void selectBuyItem() { // 어떤 물품을 구매할 것인지에 대한 method.
        boolean continueBuying = true;

        do { // 판매 리스트의 번호 외의 번호를 눌렀을 때 대처
            System.out.print("Select the number of a product ( press '0' for payment): ");
            int itemNum = scan.nextInt();
            if (itemNum == 0) {
                continueBuying = false;
                continue;
            } else if (itemNum > 4) {
                System.out.println("your pressed wrong number");
                continue;
            } else if (itemNum < 0) {
                System.out.println("your pressed wrong number");
                continue;
            }
            // 실제 물건의 구매 수량을 결정하기 전에 해당 물품을 구매하는 것이므로 ArrayList 설정 필요.
            // + 중복 감지 후 대처가 가능한 method 필요.
            // userBuyList.add(marketSellList[itemNum - DEFAULT_INDEX]); // 중복대처불가
            // System.out.println(userBuyList); // 중복대처불가
            // creatNonDupicateBuyList(marketSellList[itemNum - DEFAULT_INDEX]);
            //   >> 구매하는 수량을 결정하고 중복확인을 하기 위해서 이 method를
            //   >> selectedBuyItemStock 내부로 가져간다.
            selectBuyItemStock(marketSellList[itemNum - DEFAULT_INDEX]);
            // 물품을 모두 선택하고 몇 개 구할지 결정하는 매서드
            // selectBuyItem()에서 같이 처리하려고 했으나 do-while 안에 continue를 사용하면
            // 다시 최상단으로 올라가기 때문에 따로 method를 만든다.

        } while (continueBuying);
    }
    public void selectBuyItemStock(String selectedItem){
        Boolean isntErrorAmount = true;
        int how_many;
        do{
            System.out.print("select the amount of the product you want to buy:");
            how_many = scan.nextInt();
            if(how_many <= 0){
                System.out.println("you should buy more than 0");
                continue;
            }
            isntErrorAmount = false;
        } while (isntErrorAmount);
        creatNonDupicateBuyList(selectedItem, how_many);
    }
    public void creatNonDupicateBuyList(String product, int amount){
            // 실제 중복이 됐으면 idx 값이 나오고
            // 중복이 없으면 -1
            int idx = userBuyList.indexOf(product);
            if (idx == -1){ // 중복 없으면 userBuyList와 userBuyListStock에 add.
                userBuyList.add(product);
                userBuyListStock.add(amount);
            } else {
                userBuyListStock.set(idx, userBuyListStock.get(idx) + amount);
                // 중복이 있으면 userBuyList는 수정할 필요 없고, userBuyListStock만 수정 필요.
            }
        }

    public void doPayment(){ //
        totalprice = 0;
        // userBuyList의 순서와 marketSellList / marketSellListPrice의 순서가 다르기 때문에
        // 매칭시켜주기위한 for문 필요.
        for(int i = 0; i < userBuyList.size(); i++ ){
            if(userBuyList.get(i).equals(marketSellList[0])){
                totalprice += userBuyListStock.get(i) * marketSellListPrice[0];
                System.out.printf("price for %d %s: %d\n", userBuyListStock.get(i), marketSellList[0],
                        userBuyListStock.get(i) * marketSellListPrice[0]);
            } else if (userBuyList.get(i).equals(marketSellList[1])){
                totalprice += userBuyListStock.get(i) * marketSellListPrice[1];
                System.out.printf("price for %d %s: %d\n", userBuyListStock.get(i), marketSellList[1],
                        userBuyListStock.get(i) * marketSellListPrice[1]);
            } else if (userBuyList.get(i).equals(marketSellList[2])){
                totalprice += userBuyListStock.get(i) * marketSellListPrice[2];
                System.out.printf("price for %d %s: %d\n", userBuyListStock.get(i), marketSellList[2],
                        userBuyListStock.get(i) * marketSellListPrice[2]);
            } else if (userBuyList.get(i).equals(marketSellList[3])){
                totalprice += userBuyListStock.get(i) * marketSellListPrice[3];
                System.out.printf("price for %d %s: %d\n", userBuyListStock.get(i), marketSellList[3],
                        userBuyListStock.get(i) * marketSellListPrice[3]);
            }
        }
        System.out.println("total price:" + totalprice);
        myMoney -= totalprice;
        System.out.println("left money in your wallet: " + myMoney);
        clear_bucket(); // 장바구니 비워주는 method
    }

    public void checkContinueShopping(){
        //계산 후 shopping을 계속할지 결정
        boolean finish_shopping = true;
        do{
            System.out.println("continue shopping?(Y/N)");
            scan.nextLine();
            String answer = scan.nextLine();
            if(answer.equals("Y")){
                finish_shopping = false;
                continueShopping = true;
            } else if(answer.equals("N")) {
                finish_shopping = false;
                continueShopping = false;
            } else {
                System.out.println("wrong answer");
                continue;
            }
        } while(finish_shopping);
    }
    public void clear_bucket(){ // 장바구니 비우는 method
        userBuyList.clear();
        userBuyListStock.clear();
    }
}
public class _1st_Quiz51TeacherSolution {
    public static void main(String[] args) {
        Market m = new Market();
        m.doShopping(); //arbiter
    }
}
