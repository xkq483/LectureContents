import java.util.Scanner;

public class Quiz27 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 입력해보세요: ");
            int num1 = scan.nextInt();


            if (num1 == 1 || num1 ==2 ) {
                System.out.print("다시 입력해보세요 : ");
            } else  {
                int num2;
                num2 = ((num1 - 2) + (num1 - 1));
                System.out.printf("피보나치 수열은 (%d-2) + (%d -1) = %d ", num1, num1, num2);
            }


    }
}
