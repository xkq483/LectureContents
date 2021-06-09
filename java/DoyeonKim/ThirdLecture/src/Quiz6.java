import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 입력");
        int num = scan.nextInt();

        if (num % 3 == 0) {
            System.out.println(num + "은 3의 배수 입니다.");
        } else {
            System.out.println(num + "은 3의 배수가 아닙니다.");
    }
        }


        /*System.out.print("3의 배수인지 확인하세요: ");
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자를 입력하세요: ");
        int num1 = scan.nextInt();

        int num2 = num1++;

        if (num1 + num2) {
            System.out.printf((num1 + num2) + "은 3의 배수가 맞습니다"); }
        /*else {
                System.out.printf("%d > %d\n", num1, num2);
                */


    }

