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

        //27번 문제  변수3개만있으면 된데!!! (피보나치수열)









    }
}