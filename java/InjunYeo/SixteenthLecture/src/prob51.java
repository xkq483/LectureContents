
import java.util.ArrayList;
import java.util.Scanner;

/*
1.상점 목록과 상점 가격은 배열로 처리한다
2.사용자의 구매목록은 ArrayList로 처리한다.
3.소지금을 설정한다.
4.사용자가 구매한 리스트에 대한 재고를 ArrayList로 처리한다.
 */
class Market{
    private ArrayList<String> userBuyList;
    private ArrayList<Integer> userBuyListStock;

    private String[] marketSellList ={"선풍기","키보드","마우스","모니터"};
    private int[] marketSellListPrice = {38,8,7,40};

    private int myMoney;
    Scanner scan;

    private Boolean continueShopping;
    final int DEFAULT_IDX = 1;

    public Market(){
        userBuyList = new ArrayList<String>();
        userBuyListStock = new ArrayList<Integer>();

        continueShopping = false;
        scan = new Scanner(System.in);

        /*변수추가(숙제부분)*/
        myMoney = 100;
    }

    public void doShopping(){
        do{
            //중재자 메소드를 활용해 코드하나씩 테스트 해가면서 작성하자.
            //마켓에서 판매하는 물품을 보여줌
            showMarketsellList();
            //2. 구매할 물건을 선택하세요.
            selectBuyItem();
            //3. 구매리스트가 작성되었다면 비용 산정 지행
            doPayment();
            //4. 계속 구매할 것인지 여부 판단
            checkContinueShopping();
        }while(continueShopping);
    }

    private void showMarketsellList(){
        int length = marketSellList.length;

        System.out.println("판매 목록");

        for(int i=0;i<length;i++){
            System.out.printf("%d. %s: %d 만원\n",i+1,marketSellList[i],marketSellListPrice[i]);
        }
    }

    private void selectBuyItem(){
        Boolean continueBuying = true;

        do {
            System.out.print("구매할 물건의 번호를 누르세요(결제진행 :0) : ");

            int itemNum = scan.nextInt();

            if(itemNum>4){
                System.out.println("잘못된 숫자입니다.");
                continue;
            }else if(itemNum <0){
                System.out.println("잘못된 숫자입니다.");
                continue;
            }else if(itemNum == 0){
                continueBuying =false;
                continue;
            }
            //실제 물건구매 수량전에 해당물품 구매므로 ArrayList설정필요
            //중복감지 메서드가 필요
//            userBuyList.add(marketSellList[itemNum - DEFAULT_IDX]);
//            System.out.println(userBuyList);

            //물품을 모두 선택하고 ㅕㅊ 개 구할지 결정하는 메서드
            //현재 createNonDuplicateBuyList 도 stock를 처리하고
            //아래쪽의 selectBuyItemStock도 stock을 처리한다.
            //이렇게 혼동이 발생하는 경우에는 누가더 우선권을 가져야 하는지 분석이 필요하다.
            //cNDBBL 은 실제 물건의 구매에 있어서 중복이 있는지 검사한다.
            //
            //createNonDuplicateBuyList(marketSellList[itemNum - DEFAULT_IDX]);

            //물품을 모두 선택하고 몇개 구할지 결정하는메서드
            selectBuyItemStock(marketSellList[itemNum - DEFAULT_IDX]);
            System.out.println(userBuyList);
            System.out.println(userBuyListStock);
        }while(continueBuying);

    }

    private void selectBuyItemStock(String selectItem){

        Boolean isntErrorAmount = true;
        int amount;
        do {
            System.out.print("구매할 수량을 선택하세요 : ");
            amount = scan.nextInt();

            if(amount <=0){
                System.out.println("잘못된수량입니다.");
                continue;
            }

            isntErrorAmount = false;



        }while(isntErrorAmount);

        createNonDuplicateBuyList(selectItem,amount);

    }

    private void createNonDuplicateBuyList(String target,int amount){
        //실제 중복이 되었다면 인덱스 값이 나올것이고
        //중복이 없으면 -1이 나오게 될 것이다.
        int idx = userBuyList.indexOf(target);

        if(idx == -1){ //중복없음
            userBuyList.add(target);
            userBuyListStock.add(amount);
        }else{ //idx가 중복된 요소를 알려줌
            //set(idx,데이터)는 특정인덱스의 값을 갱신함
            //add(idx,데이터)+remove(idx+1)과 동일한 역할을 함
            userBuyListStock.set(idx,userBuyListStock.get(idx)+amount);
        }
    }

    private void checkContinueShopping(){

        Boolean isOK = false;
        do {
            String res;
            System.out.print("쇼핑을 계속하시겠습니까? Y/N ");
            scan.nextLine();
            res = scan.nextLine();


            if (res.equals("Y")) {
                isOK =false;
                continueShopping = true;
            } else if (res.equals("N")) {
                isOK = false;
                continueShopping = false;
            } else {
                isOK = true;
                continue;
            }
        }while(isOK);

    }


    /*숙제부분*/
    private void doPayment(){
        /*
        System.out.println("현재 가지고 있는 돈 : "+myMoney+"만원");
        int priceSum=0;

        // userBuyList, userBuyListStock에
        // 구매 물품과 구매 물량이 기록되어 있음
        // 물건 가격 정보는 marketSellList, marketSellListPrice 를 통해 알 수 있음
        // userBuyList와 userBuyListStock을 활용하여 어떤 물건을 몇 개 구하는지 체크하고
        // marketSellList, marketSellListPrice를 활용하여 가격 정보를 획득하여
        // 전부 합산 얼마가 나오는지 계산하도록 한다.
        // 그리고 지갑에다가 적용한다.(지갑 설정기능이 빠져있음 현재)
        for(int i=0;i<userBuyList.size();i++){
            String productName = userBuyList.get(i);
            int productStock = userBuyListStock.get(i);
            int productPrice = 0;
            switch (productName){
                case "선풍기":
                    productPrice = 38;
                    break;
                case "키보드":
                    productPrice =  8;
                    break;
                case "마우스":
                    productPrice = 7;
                    break;
                case "모니터":
                    productPrice = 40;
                    break;
            }

            int productTotalPrice = productPrice*productStock;
            priceSum+=productTotalPrice;
            System.out.printf("%d. %s %d개 %d만원\n",i+1,productName,productStock,productTotalPrice);
        }
        System.out.println("합계 : "+priceSum+" 만원");
        myMoney = moneyCheck(myMoney,priceSum);

         */
        int length = marketSellList.length;

        //userBuyList는 별도의 연결리스트
        //marketSellList는 별도의 배열
        for(int i =0; i<length;i++){
            for(String element : userBuyList){
                //해당 i번째 인덱스의 요소 위치에 price를 사용하면 됨을 의미함
                //우리가 키도르 입력을 통해서 받는 userBuyList는 위의 순서대로 배치되지않는다.
                //순서가 역순으로 들어갔다고 생각해보자
                //
                if(marketSellList[i].equals(element)){
                    myMoney -= marketSellListPrice[i] * userBuyListStock.get(userBuyList.indexOf(element));
                    System.out.println("찾은 물품 : "+element+ "가격 : "+marketSellListPrice[i]+" 수량 : "
                            +userBuyListStock.get(userBuyList.indexOf(element)) );

                    //결제 완료 이후 구매 리스트를 비울 필요가 있음(방법1)
                    //현재 케이스 에서는 닶을 지워버리면 루프를 도는 중에 지워지기때문에 문제가 발생함
                    /*
                    int deleteIdx = userBuyList.indexOf(element);
                    userBuyListStock.remove(deleteIdx);
                    userBuyList.remove(deleteIdx);
                    내부에서 바로 처리하기때문에 동작속도가 더빠름
                     */
                }
            }

        }

        System.out.println("현재 남은돈 : "+myMoney);
        //방법 2) 결제 완료 이후 구매리스트를 비울수 있음
        //데이터 리스트가 많을때 내부에서 순회를 또함
        userBuyListStock.clear();
        userBuyList.clear();


    }

    /*돈부족시 예외처리 메소드(숙제부분)*/
    private int moneyCheck(int myMoney,int priceSum){
        if(priceSum>myMoney){
            System.out.println("돈이 부족합니다! 물건을 다시 골라주세요!");
            userBuyList.clear();
            userBuyListStock.clear();
            return myMoney;
        }else{
            myMoney -= priceSum;
            System.out.println("남은돈 : "+myMoney+" 만원");
            //산물품 초기화
            userBuyList.clear();
            userBuyListStock.clear();
            return myMoney;

        }
    }









}


public class prob51 {
    public static void main(String[] args) {
        Market m = new Market();

        m.doShopping();

    }
}
