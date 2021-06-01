//ArrayList를 활용하여 상점을 만들어보자!
//구매, 판매, 목록보기
//소지금, 물건의 구매가 등을 지정해서 적정 버튼을 누르면 처리되도록 만들어봅시다!
//초기에 판매리스트에는 아무것도 없다.
//초기에는 상점 주인이 파는 구매 리스트만 존재한다.      --> 판매하는 상품
//물건을 구매하면 구매한 물품이 판매 리스트에 보인다.     --> 팔린 물품
//목록 보기는 단순히 현재 소지한 물건 리스트만 보여준다.   --> 남아있는 상품


/* 구상

class store()
{
    store()
    {
        Arraylist 초기화
    }

    메인화면구성 메소드(){}

    실행(Run)메소드
    {
        구매리스트 메소드
        판매리스트 메소드
        목록보기리스트 메소드
    }
}
main()
{
    while(true) {
        메인화면구성 메소드(){}
        switch(){
            case 1:  구매리스트 메소드
            case 2:  판매리스트 메소드
            case 3:  목록보기리스트 메소드
        }

    }
}


* */
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

class Store {
    Scanner sc;
    Boolean isRun= true;


    ArrayList<String> purchaselists;
    ArrayList<String> allLists;
    ArrayList<String> saleLists;
    ArrayList<String> remainLists;

    String choiceList;

    public Store() {
        allLists = new ArrayList<String>();
        allLists.add("식빵 3000원");
        allLists.add("우유 1000원");


        purchaselists = new ArrayList<String>();
        purchaselists.add("식빵");
        purchaselists.add("우유");


        sc= new Scanner(System.in);


    }

    public void runStore() {
        System.out.println("");
        System.out.println("<홍길동 상점>");
        System.out.println("");

        printMenu();

        System.out.println("구매(1)\t판매(2)\t물품(3)\t종료(4)");
        System.out.print(": ");
    }

    public void printMenu()
    {
        System.out.println("---전체상품---");
        for (String AllMenuList : allLists) // lists.add() 를 AllMenuList에 저장
        {
            System.out.println("- "+ AllMenuList);
        }
        System.out.println("-------------");
    }

    public void printPurchase() // 판매하는 상품
    {
        System.out.println("구매 리스트");
        for(String purchaseList : purchaselists)
        {
            System.out.println("- "+ purchaseList);
        }
        System.out.print("구매할 물건: ");
        choiceList= sc.nextLine();

    }
    public  void printSale()   // 팔린 상품
    {
        System.out.println("판매 리스트");
        System.out.println(choiceList);

        for(String saleList : saleLists)
        {
            System.out.println("- "+ saleList);
        }

    }


    public void printLists()  // 남아있는 상품
    {
        for(String leftList : remainLists)
        {
            System.out.println("- "+ leftList);
        }

    }

    public void terminate() {
        System.out.println("종료합니다.");

        isRun= false;
    }


}
public class Quiz51 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        Store s= new Store();
        int inputMenu;


        while (s.isRun)
        {
            s.runStore();
            inputMenu= scan.nextInt();

            switch (inputMenu) {
                case 1:
                    s.printPurchase();
                    continue;
                case 2:
                    s.printSale();
                    break;
                case 3:
                    s.printLists();
                    break;
                case 4: s.terminate();
            }
        }
    }
}


