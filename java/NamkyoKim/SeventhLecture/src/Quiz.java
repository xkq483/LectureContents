import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        //아래와 같은 형태의 숫자들이 있다.
        //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, ...
        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!

        System.out.println("1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024,......");

        Scanner sc = new Scanner(System.in);
        System.out.print("몇번째 번호를 구해드릴까요 ? 숫자를 입력해 주세요 : ");

        int num = sc.nextInt();


        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다");
        } else if (num < 2) {
            System.out.println("당신이 찾는 값은 1입니다");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1;

            for (int i = 1; i < numArr.length; i++) {
                // 현재값은 이전값 x 2
                //---------------------
                // | 1 | 2 | 4 | 8 |  |  |  |  |
                // [0] [1] [2] [3] [4] [5] [6]
                numArr[i] = numArr[i - 1] * 2;
            }
            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }


    }
}
