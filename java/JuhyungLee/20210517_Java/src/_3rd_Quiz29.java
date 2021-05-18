import java.util.Scanner;
public class _3rd_Quiz29 {
    public static void main(String[] args) {
        // 1, 3, 9, 27, 81, 243......
        // n번째 값을 구하도록 코드를 생성.
        System.out.println("1, 3, 9, 27, 81, 243.....");
        System.out.println("n번째 항의 값을 구한다.");
        Scanner scan = new Scanner(System.in);
        System.out.print("n은: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("1이상을 입력하시오.");
        } else {
            int x3Array[] = new int[n];

            for (int i = 0; i < x3Array.length; i++) {
                x3Array[i] = (int)Math.pow(3, i);
                // Math.pow(A, B)는 A^B(A의 B승)을 계산한다.
                // Math.pow는 double을 결과로 내놓기 때문에 강제로 int 타입으로 변형하였음
            }
            System.out.printf("%d 번째 항은 = %d\n", n, x3Array[n-1]);
        }
    }
}

