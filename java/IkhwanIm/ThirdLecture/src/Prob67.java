import java.util.Scanner;

public class Prob67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("아무 숫자나 입력해보세요. 3의 배수를 판별하겠습니다.");
        if (num1 % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
        //7번
        System.out.println("1~n까지의 숫자중 3의 배수를 찾아봅시다(n을 입력하세요)");
        int loop = sc.nextInt();
        int i = 1;
        while (i <= loop) {
            if (i % 3 == 0) {
                System.out.println("1~ " + loop + "까지 3의 배수를 출력합니다: " + i);
            }
            i++;

        }
    }
}