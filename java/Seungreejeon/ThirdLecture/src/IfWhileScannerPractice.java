import java.util.Scanner;

public class IfWhileScannerPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("값을 입력하시오");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(num % 2 == 0) {
                System.out.println("짝수입니다.");
            } else  {
                System.out.println("홀수입니다.");
            }



        }
    }
}
