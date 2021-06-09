import java.util.Scanner;
public class QuizTest28 {
    public static void main(String[] args) {
        // 28.

        System.out.println("1, 2, 4, 8, ... 1024, ...");
        Scanner scan = new Scanner(System.in);
        System.out.print("n 값을 입력하세요 : ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else if (num < 2) {
            System.out.println("당신이 찾는 값은 1입니다.");
        } else {

            int numArr[] = new int[num];
            numArr[0] = 1;

            for (int i = 1; i <= num; i++) {
                numArr[i] = numArr[i - 1] * 2;

                System.out.printf("%d 번째의 값은 : %d\n", num, numArr[num - 1]);
            }

        }
    }
}
