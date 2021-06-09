import java.util.Scanner;

public class Prob28 {
    public static void main(String[] args) {
        /*
        28. 배열 문제
        아래와 같은 형태의 숫자들이 있다.
        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, ...
        n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!
         */

        // 문제풀이 1

        System.out.println("1, 2, 4, 8, ... 1024, ...");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요 ? ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else if (num < 2) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1;

            for (int i = 1; i < numArr.length; i++) {
                numArr[i] = numArr[i - 1] * 2;
            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }
    }
}