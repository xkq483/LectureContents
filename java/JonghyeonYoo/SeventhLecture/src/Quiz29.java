import java.util.Scanner;

public class Quiz29 {
    public static void main(String[] args) {
/*      아래와 같은 형태의 숫자들이 있다.
        1, 3, 9, 27, 81, 243, 729, 2187, ...
        n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!
 */

        System.out.print("숫자를 입력하세요 : ");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();



        if (num <= 0) {
            System.out.println("숫자를 잘못 입력하였습니다.");
        } else  {
            int numArr[] = new int[num];

            numArr[0] = 1;

            for(int i = 1; i < num; i++) {

                numArr[i] = (int)Math.pow(3, i); // (int)Math.pow(3, i) 3의 i승
                // Math.pow(A, B)는 A^B(A의 B승)을 계산한다.
                // Math.pow는 double을 결과로 내놓기 때문에 강제로 int 타입으로 변형하였음
            }
            System.out.printf(" %d 번째 항은 = %d\n", num, numArr[num-1]);
            //numArr[num-1]  -1은  배열의 값은 0부터 시작하기때문에 -1을 한다
        }
    }
}
