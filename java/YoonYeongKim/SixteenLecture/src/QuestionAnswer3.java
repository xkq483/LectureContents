import java.util.ArrayList;
import java.util.Scanner;

// 문제를 풀기 위해서 필요한 것들에 대한 리스팅
// 혹은 문제를 풀기 위한 절차 정리하기

class Shop  {

    ArrayList<String> shopProductLists; // 상점 물품 리스트
    ArrayList<Integer> shopProductPriceLists; // 상점 물품 가격 리스트

    ArrayList<String> sellOutLists; //가게에서 팔린 물건 리스트

    ArrayList<String> shoppingLists; //가게에서 산 물건 리스트
    ArrayList<Integer> shoppingPriceLists; //가게에서 산 물건 가격 리스트
    Scanner scan;
    int money;
    int menu;
    String selectProduct;
    String selectProduct2;


    public Shop()   { //기본 Array 설정
        shopProductLists = new ArrayList<String>();
        shopProductPriceLists = new ArrayList<Integer>();
        sellOutLists = new ArrayList<String >();
        shopProductLists = new ArrayList<String>();
        scan = new Scanner(System.in);
    }

    public void setShopLists()  { //상점 물품 리스트 설정
        System.out.print("판매할 물건은 몇 개? : ");
        int cnt = scan.nextInt();
        scan.nextLine(); //찌꺼기 제거

        for (int i = 0; i < cnt ; i++) {
            System.out.print("판매할 물건의 이름을 입력해주세요 : ");
            shopProductLists.add(scan.nextLine());

            System.out.print("그 물건의 가격을 입력해주세요 : ");
            shopProductPriceLists.add(scan.nextInt());
            scan.nextLine(); //찌꺼기 제거
        }


        /*System.out.print("구입하고 싶은 물건 입력 : ");
        selectProduct = scan.nextLine();
        int idx = shopProductLists.과indexOf(selectProduct);
        System.out.println("idx 테스트 : " + shopProductPriceLists.get(idx));*/
    }

    public void setMoney()  { // 소지금 설정
        System.out.print("당신의 소지금은? : ");
        money = scan.nextInt();
        scan.nextLine(); //찌꺼기 제거
    }

    public void wellCome()  {  // 첫화면
        System.out.println("*** KH 가게에 오신 걸 환영합니다 ***");
        System.out.println("");
        System.out.println("1. 구매하기  2. 판매하기  3. 내 장바구니 보기");
        menu = scan.nextInt();

        switch (menu){
            case 1:
                button1();
                break;
            case 2:
                button2();
                break;
            case 3:
                button3();
                break;
            default:
                break;
        }
    }

    public void button1()   {  // 1. 구매하기 버튼
        showShopLists();
        System.out.println("");
        purchase();
        wellCome();
    }

    public void button2()   {  // 2. 판매하기 버튼
        showShoppingLists();
        System.out.println("");
        sale();
        wellCome();
    }

    public void button3()   {  // 3. 내 장바구니 보기 버튼
        showShoppingLists();
        System.out.println("");
        wellCome();
    }



    public void purchase()   {
        scan.nextLine(); //찌꺼기 제거
        System.out.print("구입하고 싶은 물건 입력 : ");
        selectProduct = scan.nextLine();

        int idx = shopProductLists.indexOf(selectProduct);  //인덱스 검색하고
        shopProductLists.remove(selectProduct);  // 가게 물품 목록에서 지워

        System.out.printf("%s를 구입하셨습니다." , selectProduct);
        //shoppingLists.add(selectProduct);  // 그리고 장바구니에 넣고

        int tempmoney = money;
        money -= shopProductPriceLists.get(idx); // 소지금 계산
        System.out.printf("당신의 소지금 %d원에서 물건가격 %d원을 냈고, 남은 금액은 %d 원입니다.",
                tempmoney, shopProductPriceLists.get(idx), money);

        shoppingPriceLists.add(shopProductPriceLists.get(idx));// 산 물건의 가격을 내 장바구니 목록(가격)에 추가
        shopProductPriceLists.remove(shopProductPriceLists.get(idx));  // 가격도 마저 지워


    }

    public void sale()  {
        System.out.print("판매하고 싶은 물건 입력 : ");
        selectProduct2 = scan.nextLine();

        int idx2 = shoppingLists.indexOf(selectProduct2); // 인덱스 검색
        shoppingLists.remove(selectProduct2); // 내 장바구니에서 지워
        shopProductLists.add(selectProduct2);   // 가게 진열대에 판 물건 올라가고

        money += shoppingPriceLists.get(idx2); // 소지금 계산

        shopProductPriceLists.add(shoppingPriceLists.get(idx2)); // 산 물건의 가격을 가게 리스트에 추가
        shoppingPriceLists.remove(idx2);  // 가격도 마저 지워
    }




    public void showShopLists()  { // 상점 목록 보여주기
        System.out.println(" :: 상점 목록 ::");
        for (String list: shopProductLists) {
            System.out.println(" " + list);
        }
    }

    public void showSellOutLists()  { // 팔린 물품 목록 보여주기
        System.out.println(" :: 팔린 물품 목록 ::");
        for (String list: sellOutLists) {
            System.out.println(" " + list);
        }
    }

    public void showShoppingLists()  { // 구입한 물품 목록 보여주기
        System.out.println(" :: 구입한 물품 목록 ::");
        for (String list: shoppingLists) {
            System.out.println(" " + list);
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopProductLists=" + shopProductLists +
                ", shopProductPriceLists=" + shopProductPriceLists +
                '}';
    }
}


public class QuestionAnswer3 {
    public static void main(String[] args) {
        ////51. 종합 문제
        //ArrayList를 활용하여 상점을 만들어보자!
        //구매, 판매, 목록보기
        //소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!
        //초기에 판매리스트에는 아무것도 없다.
        //초기에는 상점 주인이 파는 구매 리스트만 존재한다.
        //물건을 구매하면 구매한 물품이 판매 리스트에 보인다.
        //목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.


        // 판매 목록 array 하나
        // 같은 인덱스로 물건 가격 array 하나

        // 구매 목록(내 가방) array 하나
        // 똑같이 가격

        // 와리가리는 어떻게 하지? 검색으로 하자 값 받아다 인덱스 번호 찾고 그 숫자를 와리가리
        //

        Shop cd = new Shop();

        cd.setShopLists();
        cd.setMoney();
        cd.wellCome();


    }
}

// 배열에 있을때는
/*
for (int i = 0; i < ~~.length; i++) {
    if (arr[i].equals(키보드입력데이터)) {
        여기서 if문 내부로 들어가면 해당 i 인덱스가 찾은 데이터가 위치하는 인덱스임을 뜻함
    }
}
 */

/*
for (int i = 0; i < ~~~; i++) {
    ~~~
}
sout(i) ?
i 변수가 for문 내부에서만 사용할 수 있으므로 외부 사용 불가
 */ 