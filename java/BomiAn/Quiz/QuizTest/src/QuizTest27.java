import java.util.Scanner;

public class QuizTest27 {
    public static void main(String[] args) {
        // 27. 아래와 같은 형태의 숫자 배치가 있다.
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
        //사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
        //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~) 배열사용 X

        Scanner scan = new Scanner(System.in);
        System.out.print("아무 숫자나 입력하세요 : ");
        int num1 = scan.nextInt();

        int i;
        int a = 1, b = 1, c = -1;

        if (num1 == 0) {
            System.out.printf("%d 번째 피보나치 수열 값은 : 0\n", num1);
        }
        else if (num1 == 1 || num1 == 2) {
            System.out.printf("%d 번째 피보나치 수열 값은 : 1\n", num1);
        } else {
            for (i = 3; i <= num1; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.printf("%d 번째 피보나치 수열 값은 : %d\n", num1, c);
        }


    }
}
