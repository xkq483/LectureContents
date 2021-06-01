import java.util.ArrayList;
import java.util.Scanner;

class Market{
    Scanner scan;
    final int DEFAULT_INDEX = 1;
    private ArrayList<String> userBuyList;
    private ArrayList<Integer> userBuyListStock;

    private String[] marketSellList = {"fan", "keyboard", "mouse", "monitor"};
    private int[] marketSellListPrice = {15000, 30000, 25000, 200000};
    private int myMoney;

    private boolean continueShopping;

    public Market(){
        scan = new Scanner(System.in);
        userBuyList = new ArrayList<String>();
        userBuyListStock = new ArrayList<Integer>();
        input_money();
    }

    public void doShopping(){
        continueShopping = true;
        do {
            showMarketSellList(); // 물건 보여줌
            selectBuyItem();      // 구매할 물건 선택
          //  doPayment();
            checkContinueShopping();
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
//    public void doPayment(){
//        for(int i = 0; i < userBuyList.size(); i++ ){
//            if(userBuyList[i].equals("fan")){
//
//            }
//        }


    public void checkContinueShopping(){
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



    }
public class _1st_Quiz51TeacherSolution {
    public static void main(String[] args) {

        Market m = new Market();

        m.doShopping();

    }
}
