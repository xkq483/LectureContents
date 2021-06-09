
import java.util.Scanner;

public class Remind0301 {
    public static void main(String[] args) {
        // 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 입력해보세요(11의 배수를 판정하겠습니다): ");
        int num = scan.nextInt();

        if (num % 11 == 0) {
            System.out.println(num + " 은 11의 배수입니다.");
        } else {
            System.out.println(num + " 은 11의 배수가 아닙니다.");
        }

        // 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력
        System.out.print("1 ~ n까지 숫자중 3의 배수를 찾아봅시다(n을 입력하세요): ");
        int loop = scan.nextInt();
        int i = 1;
        // 내가 입력한 데이터값을 룹이라는이름으로 int 형태로 대입.
        // 인트 i를 1로 대입
        while (i <= loop)
        // while 문 에서 이 안쪽에 있는 i가 loop보다 작거나 같아질때. 연속해서 돌린다는뜻인거같은데
            // i는 1이고 loop이 만약내가 15를 넣었다면, 저 와일문은 false로 조건충족이 안되어
            // 안돌려질거같은데 여기서 이해가 잘 가지않는다.

        {
            if (i % 3 == 0) {
                System.out.println("1 ~ " + loop + " 까지 3의 배수를 출력합니다: " + i);
            }
        i++;
        }
    }
}