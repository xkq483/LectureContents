import java.util.Scanner;

public class QuizTest29 {
    public static void main(String[] args) {

        // 29.
        System.out.println("1, 3, 9, 27, ... ");

        Scanner sc = new Scanner(System.in);
        System.out.print("값을 찾고자 하는 항을 입력하세요 : ");
        int num2 = sc.nextInt();

        if(num2 < 0) {
            System.out.println("잘못 입력하셨습니다.");
        } else if (num2 < 2) {
            System.out.println("1 번째 항의 값은 : 1 입니다.");
        } else {
            int numArr2[] = new int[num2];

            for (int i = 0; i <= num2; i++) {

                // Math.pow(A, B)는 A^B(A의 B승)을 계산한다.
                // Math.pow는 double을 결과로 내놓기 때문에 강제로 int 타입으로 변형하였음

                numArr2[i] = (int)Math.pow(3, i);
            }
            System.out.printf("%d 번째 값은 %d입니다.\n", num2, numArr2[num2 - 1]);
        }
    }
}
