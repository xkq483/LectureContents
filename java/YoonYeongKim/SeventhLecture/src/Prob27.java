import java.util.Scanner;

public class Prob27 {
    public static void main(String[] args) {
    /*27. 복습 문제(챌린지 문제 - 배열 사용 x)
    아래와 같은 형태의 숫자 배치가 있다.
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
    사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
    (n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~) */

        System.out.println("사용자로부터 n을 입력받아 n번째 피보나치 수열의 항을 구합니다.");

        Scanner scan = new Scanner(System.in);
        System.out.print("n값을 입력하시오: ");

        int num = scan.nextInt();
        int res = 0;

        if (num <= 0) {
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다.");
        } else if (num < 3) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int first = 1, second = 1;
            for (int i = 0; i < num - 2; i++) {
                res = first + second;
                first = second;
                second = res;

            }

            System.out.println("결과는 = " + res);
        }
    }
}
