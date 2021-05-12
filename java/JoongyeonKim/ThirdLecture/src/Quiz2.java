import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        //6번 문제 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력");
        int num = scan.nextInt();

        if (num % 3 == 0) {
            System.out.println("3의 배수이다");
        } else  {
                System.out.println("3의 배수가 아니다");
        }



        //7번 문제 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
        System.out.print("1~n까지 숫자중 3의 배수를 찾아봅시다(n을 입력하세요");
        int loop = scan.nextInt();
        int i = 1;

        while (i <=loop) {
            if (i % 3 == 0) {
                System.out.println("1 ~" + loop + "까지의 3의배수를 출력합니다"+ i);
                System.out.println(i);
            }
            i++;
        }

    }
}
