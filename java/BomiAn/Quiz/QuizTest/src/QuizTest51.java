//ArrayList를 활용하여 상점을 만들어보자!
//구매, 판매, 목록보기
//소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!
//초기에 판매리스트에는 아무것도 없다.
//초기에는 상점 주인이 파는 구매 리스트만 존재한다.
//물건을 구매하면 구매한 물품이 판매 리스트에 보인다.
//목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.


// 1. 구매리스트를 만들어 상품이름을 나열한다
//    상품에 따른 가격 리스트도 만든다.
// 2. 자신의 소지금을 입력할 스캐너를 만들고 변수지정
// 3. 구매할 상품을 입력하고,
// if로 검색한 상품과 같다면 IndexOf로 인덱스 값을 찾아 가격을 배열의 인덱스 값을 알려주는 메소드를 만든다.
// 4. 구매할 개수를 정하는 메소드를 만들어준다.
// 5. 상품을 추가할 때마다 변경된 쇼핑리스트를 보여준다
// 6. 쇼핑을 더 진행할건지 묻고 Y를 하면 계속 진행 N를 하면 루프를 빠져나가 결과를 출력하는 메소드
// 7. 물품을 삭제할 수 있는 메소드
// 8. 마지막으로 빌지 출력 구매한 상품이름/ 가격/ 구매수량 /토탈금액/ 잔액 등을 for문을 통해 출력하도록 함



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class ShopTest2 {
    Scanner scan;
    String[] shopArr = {"사과", "바나나", "딸기", "포도", "배", "수박"};
    ArrayList<String> shopList;
    ArrayList<String> wishList;
    ArrayList<Integer> priceList;
    ArrayList<Integer> cntItemList;
    Integer[] priceArr = {1000, 2000, 3000, 4000, 5000, 6000};
    int budget;
    String item;
    int getNum;
    int priceNum;
    int totalPrice;
    Boolean isTrue;
   String delItem;


    public ShopTest2() {
        shopList = new ArrayList<>(Arrays.asList(shopArr));
        wishList = new ArrayList<>();
        priceList = new ArrayList<>(Arrays.asList(priceArr));
        cntItemList = new ArrayList<>();

        isTrue = true;

        scan = new Scanner(System.in);
        System.out.print("소지금을 입력하세요 : ");
        budget = scan.nextInt();
        scan.nextLine();



    }

    public void startShop() {
        System.out.println("현재 판매중인 상품입니다. ");
        System.out.println(shopList);
        do {
            inputWishItem();
            checkPrice();
            inputAmount();
            printResult();
            canWeShop();
        } while (isTrue);

        printBill();
    }

    private void inputWishItem() {

        System.out.print("구매할 상품을 입력하세요 : ");
        item = scan.nextLine();


        if (shopList.indexOf(item) != -1) {
            wishList.add(item);

        } else if (shopList.indexOf(item) == -1) {
            System.out.println("입력하신 상품은 현재 판매하지 않습니다. 다시 입력하세요!");
            inputWishItem();
        }
    }



    private void checkPrice() {
        priceNum = shopList.indexOf(item);
        System.out.println(item + "의 가격은 " + priceList.get(priceNum) + "입니다.");

    }

    private void inputAmount() {
        System.out.print("구매하실 수량을 입력하세요 : ");
        getNum = scan.nextInt();
        cntItemList.add(getNum);
    }

    private void printResult() {
        totalPrice += priceList.get(priceNum) * getNum;
        System.out.println("장바구니 목록 : " + wishList);
       System.out.println("구매 수량 : " + cntItemList);
       System.out.println("합계 : " + totalPrice);


    }

    private void canWeShop() {
        char select;
        System.out.print("쇼핑을 계속 하시겠습니까 ? (Y/N) : ");
        select = scan.next().charAt(0);
        if(select == 'n' || select == 'N') {
            removeItem();
            isTrue = false;
        } else if (select == 'Y' || select == 'y'){
            isTrue = true;
                 scan.nextLine();

        } else if (select != 'y' && select !='Y' && select != 'n' && select != 'N') {
            System.out.println("잘못 입력하셨습니다. ");
            canWeShop();
        }

        }

        private void removeItem() {

        int num;
        System.out.print("몇 개의 상품을 취소하고 싶으십니까 ?! (️없다면 0을 입력하세요.) : ");
        num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            scan.nextLine();
            System.out.print("삭제할 상품명을 입력하세요 : ");
            delItem = scan.nextLine();

            for(int j = 0; j < wishList.size(); j++) {

                if (wishList.indexOf(delItem) == j) {
                    totalPrice -= priceList.get(shopList.indexOf(delItem)) * cntItemList.get(j);
                    wishList.remove(delItem);
                    cntItemList.remove(cntItemList.get(j));
                    System.out.println(wishList);

                }

            }
           }
        }

        private void printBill() {
        System.out.println("========================= 영수증 =========================");
        System.out.println("\t 상품명 \t 원가 \t 수량 \t 합산금액 ");
        for (int i = 0; i < wishList.size(); i++) {
           int findName = shopList.indexOf(wishList.get(i));
            System.out.println("     "+ wishList.get(i) + "      " + priceList.get(findName) + "     " + cntItemList.get(i) + "     " + priceList.get(findName) * cntItemList.get(i));
        }
        System.out.println("=============== 총 합계 : " + totalPrice);
        System.out.println("================= 잔액  : "  + budget + "-" + totalPrice + " = " + (budget - totalPrice));

        }


    }





public class QuizTest51 {
    public static void main(String[] args) {

        ShopTest2 st = new ShopTest2();

        st.startShop();


    }
}
