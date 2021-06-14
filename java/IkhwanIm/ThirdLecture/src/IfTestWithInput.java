import java.util.Scanner;

public class IfTestWithInput {
    public static void main(String[] args) {

        System.out.println("두 개 숫자를 입력 받아 비교해봅시다");
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번쨰 숫자를 입력하세요: ");
        int num1 = sc.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        if(num1>num2) {
            System.out.printf("%d > %d\n", num1, num2 );
        }
        else{
            System.out.printf("%d < %d\n", num1, num2);
        }


    }
}
