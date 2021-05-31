import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// ArrayList를 이용한 상점만들기.
// 1. 소지금을 정한다 (입력값)
// 2. 물건과 구매가를 정해두고 리스트를 만든다.(ArrayList)
// 3. 구매에 따라 소지금 변동을 만든다.
// 4. 구매리스트를 만들어 구매물품을 확인할 수 있도록 한다.
// 5. 구매한 물건을 재판매할 수 있도록 한다.
// 6. 판매에 따라 소지금 변동을 만든다.


class Shop{
    ArrayList<String> storeList;  // 상점 판매목록
    ArrayList<String> myList;     // 나의 장바구니
    final String[] supermarket = {"고기","과자","음료수","라면","햇반","과일"};
    final int[] price = {7000, 1000, 500, 3000, 1200, 5000};
    int answer;
    int wallet;
    int money;
    boolean isTrue;
    int purchaseNum;
    Scanner scan;

    public Shop(){
        scan = new Scanner(System.in);
        isTrue = true;
        storeList = new ArrayList<>(Arrays.asList(supermarket));
        myList = new ArrayList<>();
    }

    public void shoppingStart(){
        Starwallet();
        shopping();
        buyObject();
        moreShopping();
        myShoppingList();
    }

    public void Starwallet(){
        System.out.print("현재 소지하고 계시는 금액을 입력해주세요 : ");
        money = scan.nextInt();
        wallet = money;
    }


    public void myShoppingList(){
        System.out.printf("현재 내 장바구니 = %s\n ", myList);
        System.out.println("가지고 계신 물품을 판매하시겠습니까? (Y:1/N:2) \n");
        answer = scan.nextInt();
        if(answer == 1) {
            sellObj();
        } else if(answer == 2) {
            System.out.printf("현재 내 장바구니 = %s, 소지 금액은 %d입니다. 쇼핑을 종료합니다.\n ",myList,wallet);
        } else {
            System.out.println("잘못된 입력입니다.\n");
        }
    }

    public void plusSellObj(){
        System.out.println("추가적으로 물건을 더 판매하시겠습니까?(Y:1/N:2)\n ");
        answer = scan.nextInt();
        if(answer == 1){
            sellObj();
        } else if(answer == 2){
            System.out.printf("판매를 종료합니다. 현재 내 장바구니 = %s, 소지 금액은 %d입니다",myList,wallet);
        } else {
            System.out.println("잘못된 입력입니다.\n");
        }
    }

    public void sellObj(){
        System.out.print("가지고 계신 물품을 판매시 구매가격의 10%를 제외한 가격에 판매됩니다. " +
                "그래도 판매하시겠습니까?(Y:1/N:2)\n");
        answer = scan.nextInt();
        if(answer == 1){
            System.out.println("판매하고자 하는 물건을 입력하세요. : ");
            String obj = scan.nextLine();
            obj = scan.nextLine();

            int num = storeList.indexOf(obj);
            wallet += (price[num] * 0.9);

            myList.remove(obj);
            System.out.println(myList);

            plusSellObj();
        } else if(answer == 2){
            System.out.printf("판매를 종료합니다. 현재 내 장바구니 = %s, 소지 금액은 %d입니다",myList,wallet);
        } else {
            System.out.println("잘못된 입력입니다.\n");
        }
    }

    public void moreShopping(){
        while(isTrue){
            System.out.print("쇼핑을 더 진행하시겠습니까? (Y:1/N:2)\n");
            answer = scan.nextInt();

            if(answer ==1){
                shopping();
                buyObject();
                break;
            } else if (answer == 2){
                System.out.printf("쇼핑을 종료합니다. 현재 잔액 : %d\n", wallet);
                isTrue = false;
                break;
            } else {
                System.out.println("잘못된 입력입니다.\n");
            }
            break;
        }
    }
    public  void buyObject() {
        System.out.print("구매할 물건의 번호를 입력하여 주세요.\n");
        purchaseNum = scan.nextInt();
        while(isTrue) {
            switch (purchaseNum) {
                case 1:
                    System.out.printf("%s의 가격은 %s입니다. 구입하시겠습니까?  (Y:1/N:2)\n", storeList.get(0), price[0]);
                    answer = scan.nextInt();
                    if (answer == 1) {
                        wallet -= price[0];
                        myList.add(storeList.get(0));
                        System.out.printf("%s를 구매하셨습니다. 현재 잔액 %d \n", storeList.get(0), wallet);
                        moreShopping();
                        break;
                    } else if(answer == 2) {
                        moreShopping();
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.\n");
                    }
                case 2:
                    System.out.printf("%s의 가격은 %s입니다. 구입하시겠습니까?  (Y:1/N:2)\n", storeList.get(1), price[1]);
                    answer = scan.nextInt();
                    if (answer == 1) {
                        wallet -= price[1];
                        myList.add(storeList.get(1));
                        System.out.printf("%s를 구매하셨습니다. 현재 잔액 %d \n", storeList.get(1), wallet);
                        moreShopping();
                        break;
                    } else if(answer == 2) {
                        moreShopping();
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.\n");
                    }
                case 3:
                    System.out.printf("%s의 가격은 %s입니다. 구입하시겠습니까?  (Y:1/N:2)\n", storeList.get(2), price[2]);
                    answer = scan.nextInt();
                    if (answer == 1) {
                        wallet -= price[2];
                        myList.add(storeList.get(2));
                        System.out.printf("%s를 구매하셨습니다. 현재 잔액 %d \n", storeList.get(2), wallet);
                        moreShopping();
                        break;
                    } else if(answer == 2) {
                        moreShopping();
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.\n");
                    }
                case 4:
                    System.out.printf("%s의 가격은 %s입니다. 구입하시겠습니까?  (Y:1/N:2)\n", storeList.get(3), price[3]);
                    answer = scan.nextInt();
                    if (answer == 1) {
                        wallet -= price[3];
                        myList.add(storeList.get(3));
                        System.out.printf("%s를 구매하셨습니다. 현재 잔액 %d \n", storeList.get(3), wallet);
                        moreShopping();
                        break;
                    } else if(answer == 2) {
                        moreShopping();
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.\n");
                    }
                case 5:
                    System.out.printf("%s의 가격은 %s입니다. 구입하시겠습니까?  (Y:1/N:2)\n", storeList.get(4), price[4]);
                    answer = scan.nextInt();
                    if (answer == 1) {
                        wallet -= price[4];
                        myList.add(storeList.get(4));
                        System.out.printf("%s를 구매하셨습니다. 현재 잔액 %d \n", storeList.get(4), wallet);
                        moreShopping();
                        break;
                    } else if(answer == 2) {
                        moreShopping();
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.\n");
                    }
                case 6:
                    System.out.printf("%s의 가격은 %s입니다. 구입하시겠습니까?  (Y:1/N:2)\n", storeList.get(5), price[5]);
                    answer = scan.nextInt();
                    if (answer == 1) {
                        wallet -= price[5];
                        myList.add(storeList.get(5));
                        System.out.printf("%s를 구매하셨습니다. 현재 잔액 %d \n", storeList.get(5), wallet);
                        moreShopping();
                        break;
                    } else if(answer == 2) {
                        moreShopping();
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.\n");
                    }

                    break;
            }
        }

    }

    public void shopping(){
        System.out.print("<< 땡땡마트 판매 물품 목록입니다. >> \n");
        for (int i = 0; i < supermarket.length; i++ ){
            System.out.printf("%d ) %s(%s원)  ",i+1,storeList.get(i),price[i]);
        }
        System.out.println();

    }
}

public class Quiz51 {
    public static void main(String[] args) {
        Shop s = new Shop();
        s.shoppingStart();
    }
}
