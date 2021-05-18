import java.util.Scanner;

public class Prob28Enhance {
    public static void main(String[] args) {
        System.out.println("1, 2, 4, 8, ... 1024, ...");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요 ? ");
        int num = scan.nextInt();

        // byte test = scan.nextByte();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else if (num < 2) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int i;
            int numArr[] = new int[num];

            numArr[0] = 1;

            // 만약 for문 밖에서도 i 값을 활용하고 싶다면 요렇게 ~
            for (i = 1; i < numArr.length; i++) {
                // 현재값은 이전값 x 2
                // ------------------------------
                // | 1 | 2 | 4 |   |   |   |   |
                // ------------------------------
                //  [0] [1] [2] [3] [4] [5] [6]

                numArr[i] = numArr[i - 1] * 2;
            }

            System.out.printf("%d 번째 항은 = %d\n", i, numArr[i - 1]);
        }
    }
}
