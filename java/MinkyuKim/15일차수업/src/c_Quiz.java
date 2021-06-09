import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
// 소지금, 물건 구매가, 판매리스트, 구매하기, 구매한물건값 빼기, 구매현황,
// 1) 돈에 대한 계산
// - 소지금, 물건값, 소지금 - 구매물건값, 소지금의 한계를 넘어서면 구매불가,
// 2) 리스트 표기
// - 판매물건 목록 / 구매한 물건 입력 / 구매한 물건 목록(소지목록) /

class Shop {
    final int wallet = 10000;
    // 소지금
    String[] salesLists;
    ArrayList<String> arraySalesLists;
    //판매목록
    ArrayList<Integer> price;
    // 물건값
    Scanner scan;
    ArrayList<String> purchaseLists;
    //구매목록
    String[] purchaser;

    public Shop() {
        salesLists = new String[]{"스윙칩", "포카칩", "오감자", "눈을감자"};
        arraySalesLists = new ArrayList<>(Arrays.asList(salesLists));
        for(int i = 0; i < salesLists.length; i++)
            System.out.printf("판매중인 상품 = %s\n", arraySalesLists.get(i));
        //판매중인 상품 출력
        scan = new Scanner(System.in);
        purchaseLists = new ArrayList<String>();
        // 구매목록
    }
    public void PurchaseLists() {
        System.out.print("구매하실 물건을 말씀해주세요 : ");
        purchaseLists.add(scan.nextLine());
    }
    /* public void RemoveSalesLists() {
         arraySalesLists.remove()
         // 구매시 품절
     }*/
    @Override
    public String toString() {
        return "Shop{" +
                "purchaseLists=" + purchaseLists +
                '}';
    }
}
public class c_Quiz {
    public static void main(String[] args) {
        System.out.println("-- 현재 구매가능한 목록 --");

        Shop s = new Shop();
        System.out.println(s);

        for(int i = 0; i < 4; i++) {
            s.PurchaseLists();
        }
        System.out.println("구매하신 상품은" + s);

        //s.RemoveSalesLists();
    }
}
