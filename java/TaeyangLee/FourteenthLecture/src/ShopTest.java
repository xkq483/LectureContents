import java.util.ArrayList;
import java.util.Scanner;

class Shop {
    ArrayList<String> lists;
    Scanner scan;

    public Shop () {
        lists = new ArrayList<String>();
        scan = new Scanner(System.in);
    }

    public void deliveryCome () {
        System.out.print("필요한 물품을 말씀하세요: ");
        lists.add(scan.nextLine());
    }

    public void cancelOrder () {
        System.out.print("취소할 물품을 말씀하세요: ");
        lists.remove(scan.nextLine());
    }

    // toString 으로 자동 완성 가능
    // 객체 정보 출력에 사용합니다.
    // 아직 인터페이스 배우지 않았으므로 설명은 향후 진행
    @Override
    public String toString() {
        return "Shop{" +
                "lists=" + lists +
                '}';
    }
}

public class ShopTest {
    public static void main(String[] args) {
        Shop s = new Shop();

        for(int i = 0; i < 3; i++) {
            s.deliveryCome();
        }

        s.cancelOrder();

        // 아래와 같이 객체를 전달하면 toString이 호출됨
        System.out.println(s);
    }
}

// ArrayList는 Queue 혹은 Stack 역할을 할 수 있는데 기본이 Queue(큐) 역할
// 맨 처음 넣은 정보가 가장 앞에 배치되고
// 두 번째 넣은 정보가 두 번째에 배치되고 ...