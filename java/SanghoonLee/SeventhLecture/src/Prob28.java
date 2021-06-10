import java.util.Scanner;

public class Prob28 {
    public static void main(String[] args) {
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
                // 현재값은 이전값 x 2
                // ------------------------------
                // | 1 | 2 | 4 |   |   |   |   |
                // ------------------------------
                //  [0] [1] [2] [3] [4] [5] [6]

                numArr[i] = numArr[i - 1] * 2;
            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }
    }
}
