import java.util.Scanner;

public class Quiz7 {
    public static void main(String[] args) {
        //7. while + Scanner 문제
        //1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
        System.out.print("1 ~ n  까지의 수중 3의 배수를 찾아봅시다(n을 입력하시오): ");
        Scanner scan = new Scanner(System.in);
        int loop = scan.nextInt();

        int i = 1;

        while (i <= loop) {
            if (i % 3 == 0) {
                System.out.println("1 ~ " + loop + "까지 3의 배수를 출력하겠습니다.: " + i);
            }
            i++;

            // System.out.println("1 ~ " + loop + "까지 3의 배수를 출력하겠습니다.: " + i);에서+i와
            // 뒤에 i++가 구체적으로어떤 역할을 하는지 잘 모르겠습니다.

        }
    }
}
