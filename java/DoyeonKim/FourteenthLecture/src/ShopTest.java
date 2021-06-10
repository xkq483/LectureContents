import java.util.ArrayList;
import java.util.Scanner;

class Shop {
    ArrayList<String> lists;
    Scanner scan;

    public Shop () {
        lists = new ArrayList<String>();
        scan = new Scanner(System.in);
    }

    public void  deliveryCome () {
        System.out.println("필요한 물품을 말씀하세요: ");
        lists.add(scan.nextLine()); //입력한게 리스트에 추가됨
    }

    public  void cancelOrder () {
        System.out.println("취소할 물품을 입력하세요: "); //입력한 물품이 아닌것을 입력하면 스킵될수있음
        lists.remove(scan.nextLine());
    }

    public String toString() {
        return "Shop{" +
                "lists=" + lists +
                '}';
    }
}

public class ShopTest {
    public static void main(String[] args) {
        Shop s = new Shop();

        for (int i = 0; i < 3; i++) { //물품 입력 3번
            s.deliveryCome();

        }

        s.cancelOrder();
        System.out.println(s);
    }
}
