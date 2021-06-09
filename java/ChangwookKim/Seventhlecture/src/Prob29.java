import java.util.Scanner;

public class Prob29 {
    public static void main(String[] args) {
        System.out.println("1, 3, 9, 27, ... ");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까요 ? ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값을 입력하였습니다.");
        } else {
            int numArr[] = new int[num];

            for (int i = 0; i < numArr.length; i++) {

                // Math.pow(A, B)는 A^B(A의 B승)을 계산한다.
                // Math.pow(3, i)라서 3의 제곱이 순서대로 나열되는 것이다.
                // Math.pow는 double로 결과가 나오기 때문에 int 붙여서 정수로 바꿔줌.


                numArr[i] = (int)Math.pow(3, i);

            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }
    }
}