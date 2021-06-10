import java.util.Scanner;

public class _99th_Quiz27_Solution {
    public static void main(String[] args) {
        //        아래와 같은 형태의 숫자 배치가 있다.
        //        1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   (피보나치수열)
        //        사용자가 n를 입력하면 n번째 값을 구하는 코드 작성.

        Scanner scan = new Scanner(System.in);
        System.out.print("n값 입력: ");

        int num = scan.nextInt();
        int res = 0;

        if (num <= 0) {
            System.out.println("0번째 항 혹은 음수 항은 존재하지 않는다.");
        } else if (num < 3) {
            System.out.println("당신이 찾는 값은 1이다.");
        } else {
            int first = 1, second = 1;
            for (int i = 0; i < num - 2; i++) {
                res = first + second;
                first = second;
                second = res;
            }
        }
        System.out.println("결과는 =" + res);
    }
}
