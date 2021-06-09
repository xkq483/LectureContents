import java.util.Scanner;

public class Quiz27 {
    public static void main(String[] args) {
        /*
        아래와 같은 형태의 숫자 배치가 있다.
        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
        사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
        (n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scan.nextInt();

        int a = 0, b = 1, c = 0;

        for (int i = 0; i < num; i++) {
           c = a+b;
           a = b;
           b = c;
        }
        System.out.println("피보나치수열 " + num +"번째 숫자의 값 : "+ c);

    }
}