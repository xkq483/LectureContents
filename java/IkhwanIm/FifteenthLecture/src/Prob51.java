import java.util.ArrayList;
import java.util.Scanner;

class Shop {
    ArrayList<String> buyList;
    ArrayList<String> sellList;
    ArrayList<String> directory;
    Scanner scan;
    String viewBuyList;

    public Shop() {
        scan = new Scanner(System.in);
        buyList = new ArrayList<String>();
        sellList = new ArrayList<String>();

    }


    public void Buy() {
        System.out.println("구매할 물건 입력");
        boolean isTrue = true;
        while (isTrue) {
            buyList.add(scan.nextLine());
            if (buyList.contains("쇼핑끝")) {
                isTrue = false;
            }
        }
        buyList.remove("쇼핑끝");
    }

    public void Sell() {
        System.out.println("판매할 물건 입력");
        boolean isTrue = true;
        while (isTrue) {
            sellList.add(scan.nextLine());
            if (scan.nextLine() == "쇼핑끝") {
                isTrue = false;

            }
        }
        sellList.remove("쇼핑끝");
    }
    public void ViewItems(){
        System.out.println("구매목록 / 판매목록 입력");
        viewBuyList = scan.nextLine();
        if(viewBuyList == ("구매목록")){
            System.out.println(buyList);
        }else if(viewBuyList == ("판매목록")){
            System.out.println(sellList);
        }else {
            System.out.println("잘못된값이다.");
        }
    }
}

public class Prob51 {
    public static void main(String[] args) {
        Shop s = new Shop();
        s.Buy();
        System.out.println(s.buyList);
        s.ViewItems();


    }
}
