import java.util.Scanner;

public class IfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println(" 1번째 정수 입력 : ");
        num1 = sc.nextInt();
        System.out.println(" 2번째 정수 입력 : ");
        num2 = sc.nextInt();
        System.out.println("3번째 정수 입력 : ");
        num3 = sc.nextInt();

        System.out.println("정수의 합 : "+ (num1+num2+num3));
    }
}
