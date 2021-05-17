import java.util.Scanner;

public class Quiz_25_27 {
    public static void main(String[] args) {
        //25번 문제

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && 1 % 5 == 0 && i % 2 == 0) {
                System.out.println("110의 배수 = " + i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                System.out.println("55의 배수 = " + i);
            } else if (i % 11 == 0 && i % 2 == 0) {
                System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("10의 배수 = " + i);
            } else if (i % 11 == 0) {
                System.out.println("11의 배수 = " + i);
                sum += i;
            } else if (i % 5 == 0) {
                System.out.println("5의 배수 = " + i);
                sum -= i;
            } else if (i % 2 == 0) {
                System.out.println("2의 배수 = " + i);
                sum += i;
            }
        }

        System.out.println("최종값 : " + sum);

        //27번 문제   (피보나치수열)

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        int num = scan.nextInt();

        int a = 0, b = 1, c = 0;


        for(int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(num + "번째 숫자 값 : " + c);









    }
}