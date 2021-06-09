import java.util.ArrayList;
import java.util.Scanner;


class Shop {
    ArrayList<Merchandise> list;
    Customer me;
    Scanner sc;

    final int LIST_LENGTH = 3;

    public Shop() {
        list = new ArrayList<Merchandise>();
        me = new Customer();
        sc = new Scanner(System.in);
    }

    public void linker() {
        listSetting();
        listPrint();
        buy();
    }

    public void buy() {
        System.out.print("스피커 : 0 , 등 : 1, 모니터 : 2");
        int i = sc.nextInt();
        me.addList(list.get(i));
        me.addStock(list.get(i));
    }

    public void listSetting() {
        Merchandise speaker = new Merchandise("스피커", 1000,5);
        Merchandise lamp = new Merchandise("등", 2000,5);
        Merchandise monitor = new Merchandise("모니터", 3000,10);
        list.add(speaker);
        list.add(lamp);
        list.add(monitor);
    }

    public void listPrint() {
        System.out.println("==============상품목록==============");
        for (int i = 0; i < LIST_LENGTH; i++) {
            System.out.println(list.get(i).toString());
        }
    }

}

class Customer {
    ArrayList<Merchandise> cart_M;
    ArrayList<Integer> cart_Stock;
    ArrayList<String> cart;
    int money = 10000;
    Boolean isTrue;

    public Customer() {
        cart = new ArrayList<String>();
        cart_M = new ArrayList<Merchandise>();
        cart_Stock= new ArrayList<Integer>();
    }

    public void addList(Merchandise merchandise) {
        cart.add(merchandise.name);
    }
    public void addStock(Merchandise merchandise) {
        cart_Stock.add(merchandise.stock);
    }

    public void myList() {
        System.out.print("장 바 구 니 : \n");
        for (String data : cart) {
            System.out.println(data);
        }

    }

    public String toString() {
        return "상품 : " + cart + " 수량 : " + cart_Stock;
    }

}

class Merchandise { //상품설정
    String name;
    int price;
    int stock;

    public Merchandise(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String toString() {
        return "상품 : [" + name + "] 가격 : [" + price + "] 재고 : [" + stock + "]";
    }

}
public class ArrayListShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop sh = new Shop();
        Customer ct = new Customer();
        int num = 1;

        while (num != 0) {
            System.out.print("0 : 종료, 1: 상품목록 2: 내 장바구니 3: 총 합계 4: 지갑");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    sh.linker();
                    continue;
                case 2:
                    sh.me.myList();
                    continue;
                case 3:
                    continue;
                case 4:
                    System.out.println(sh.me.money);
                    continue;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }
    }
}
