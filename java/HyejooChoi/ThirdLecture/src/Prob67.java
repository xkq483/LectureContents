import java.util.Scanner;

public class Prob67 {
    public static void main(String[] args) {
        //아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        Scanner scan = new Scanner(System.in);

        System.out.println("아무숫자 입력 : ");
        int num = scan.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + " 은 3의 배수임");
        } else {
            System.out.println(num + " 은 3의 배수아님");
        }


        //1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
//        System.out.println("1 ~ n까지 숫자중 3의 배수를 찾아봅시다(n을 입력하셈) : ");
//        int loop = scan.nextInt();
//        int i = i;
//
//        while (i <= loop) {
//            if (i % 3 == 0) {
//                System.out.println("1 ~ " + loop + " 까지 3의 배수를 출력합니다: " + i);
//            }
//            i++;
//        }
    }
}
