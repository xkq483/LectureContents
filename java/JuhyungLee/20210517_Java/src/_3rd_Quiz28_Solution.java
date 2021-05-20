import java.util.Scanner;
public class _3rd_Quiz28_Solution {
    public static void main(String[] args) {
        // 아래와 같은 형태의 숫자들이 있다.
        // 1, 2, 4, 8, 16, 32, 64 .....
        // n을 입력해서 n번째 값을 구하도록 배열을 사용하여 코드를 만들어라
        System.out.println("1, 2, 4, 8, ... 1024, ...");
        Scanner scan = new Scanner(System.in);

        System.out.print("n번 째 항을 구한다. n: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("1이상의 값을 입력하시오.");
        } else if (n < 2) {
            System.out.printf("%d번 째 항의 값은 %d\n", n, 1);
        } else {
            int x2Array[] = new int[n];
            x2Array[0] = 1;

            for (int i = 1; i < n; i++) { //"x2Array.length"를 (n+1)로 바꾸면 왜 error가 나는지..?
                x2Array[i] = x2Array[i - 1] * 2;
            }
            System.out.printf("%d 번째 항의 값은 %d\n", n, x2Array[n - 1]);
        }
    }
}
// 현재값은 이전값 x 2
// ------------------------------
// | 1 | 2 | 4 | 8 | 16 | 32 | 64 |
// ------------------------------
//  [0] [1] [2] [3] [4] [5] [6]

//"x2Array.length"를 (n+1)로 바꾸면 왜 error가 나는지..?