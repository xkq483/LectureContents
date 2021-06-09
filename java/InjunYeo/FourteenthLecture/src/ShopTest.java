import java.util.ArrayList;
import java.util.Scanner;

class Shop{
    ArrayList<String> lists;
    Scanner scan;

    public Shop(){
        lists = new ArrayList<String>();
        scan = new Scanner(System.in);
    }

    public void deliveryCome(){
        System.out.print("물품 : ");
        lists.add(scan.nextLine());
    }

    public void cancelOrder(){
        System.out.print("취소할 물품 : " );
        lists.remove(scan.nextLine());
    }

    public String toString(){
        return "Shop {"+"lists = " + lists+"}";
    }


}

public class ShopTest {
    public static void main(String[] args) {

        Shop s =new Shop();

        for(int i = 0;i<3;i++){
            s.deliveryCome();
        }
        s.cancelOrder();

        System.out.println(s);

    }
}

/*
ArrayList는 Queue 혹은 Stack역할을 할 수 있는데 기본이 Queue(큐)역할
맨처음 넣은정보가 가장 앞에 배치되고
두번째 넣은정보가 두번째에 배치된다
 */