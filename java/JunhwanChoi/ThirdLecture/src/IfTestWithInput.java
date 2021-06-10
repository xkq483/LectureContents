import java.util.Scanner;

public class IfTestWithInput {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("두 개 숫자를 입력 받아 비교해봅시다.");


        System.out.print("첫 번째 수 입력: ");
        int num1= scan.nextInt();

        System.out.print("두 번째 수 입력: ");
        int num2= scan.nextInt();

        //  이 식은 숫자가 같을 경우를 고려하지 않고 있음
        //  else if문으로 제어해야함.
        if(num1<num2)
        {
            System.out.printf("%d < %d\n", num1,num2);
        }
        else
        {
            System.out.printf("%d > %d\n", num1,num2);
        }


    }
}
