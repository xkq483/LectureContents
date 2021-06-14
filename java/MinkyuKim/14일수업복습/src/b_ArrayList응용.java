import java.util.ArrayList;
import java.util.Scanner;

class Shopping {
    ArrayList<String> lists;
    Scanner scan;
    public Shopping() {
        lists = new ArrayList<String >();
        scan = new Scanner(System.in);
    }
    public void order() {
        System.out.println("필요한 물건이 무엇입니까?");
        lists.add(scan.nextLine());
    }
    public void cancelOrder() {
        System.out.println("취소할 물건이무엇입니까?");
        lists.remove(scan.nextLine());
    }
    @Override
    public String toString() {
        return "Shopping{" +
                "lists=" + lists +
                '}';
    }
}
public class b_ArrayList응용 {
    // 필요한 물건 3개 입력하면 출력
    // 썼던 것 제외까지
    public static void main(String[] args) {
        Shopping sp = new Shopping();

        for(int i = 0; i < 3; i++) {
            sp.order();
        }
        sp.cancelOrder();
        System.out.println(sp);
    }
}
