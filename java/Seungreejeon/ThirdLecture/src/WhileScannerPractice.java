import java.util.Scanner;

public class WhileScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("3의 배수 판별합니다");
        System.out.println("값을 입력하시오 : ");
        int num = sc.nextInt();

        while(num == 0 || num % 3 != 0) {
            System.out.println("3의 배수가 아닙니다.");
            break;
        }
        while(num % 3 == 0&& num > 0) {

            System.out.println("3의 배수입니다.");
            break;
        }



    }
}
