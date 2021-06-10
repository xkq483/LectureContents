import java.util.Scanner;

public class Prob345 {
    public static void main(String[] args) {
        // [3번 문제] 숫자 3이 짝수인지 홀수인지 판별
        int num = 3;

        if (num % 2 == 0) {
            System.out.println("이 숫자는 2의 배수(짝수)입니다.");
        } else {
            System.out.println("이 숫자는 2의 배수가 아닙니다.(홀수)");
        }

        // [4번 문제] 아무 숫자나 3개 입력 받아서 숫자의 합을 입력
        Scanner scan = new Scanner(System.in);

        System.out.println("아무 숫자나 하나 입력하세요: ");
        int num1 = scan.nextInt();
        System.out.println("아무 숫자나 하나 입력하세요: ");
        int num2 = scan.nextInt();
        System.out.println("아무 숫자나 하나 입력하세요: ");
        int num3 = scan.nextInt();

        System.out.println("숫자 3개의 합은 = " + num1 + num2 + num3);
        System.out.println("숫자 3개의 합은 = " + (num1 + num2 + num3));

        System.out.println(num1 + num2 + num3 + "숫자 3개의 합은 = ");
        System.out.printf("세 숫자의 합은 %d입니다.\n", num1 + num2 + num3);

        // [5번 문제] 1 ~ 20까지의 숫자 중 2의 배수만 출력
        int i = 2;

        while (i <= 20) {
            System.out.println(i);

            i += 2;

            int A = 3, B = 5;
            System.out.println("A = " + A);
            System.out.println("B = " + B);
            A += B;
            System.out.println("A = " + A);
            System.out.println("B = " + B);
        }
    }
}
