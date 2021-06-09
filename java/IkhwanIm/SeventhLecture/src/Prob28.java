import java.util.Scanner;

public class Prob28 {
    public static void main(String[] args) {
        System.out.println("1, 2, 4, 8, ... 1024, ...");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요 ? ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else if (num < 2) { //첫 숫자가 1이기 때문에
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1; //0번째 항에 1을 대입

            for (int i = 1; i < numArr.length; i++) {
                numArr[i] = numArr[i - 1] * 2;
                //현재값은 이전값 x 2
                //-------------------------
                //| 1 | 2 | 4 | 8 | 16
                // -------------------------
                // [0] [1] [2] [3] [4]
            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }                                       // 4번째 항은 8 = 2^3 따라서 -1을함
    }
}