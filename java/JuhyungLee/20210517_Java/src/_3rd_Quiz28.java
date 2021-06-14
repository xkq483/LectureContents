import java.util.Scanner;

public class _3rd_Quiz28 {
    public static void main(String[] args) {
        // 아래와 같은 형태의 숫자들이 있다.
        // 1, 2, 4, 8, 16, 32, 64 .....
        // n을 입력해서 n번째 값을 구하도록 배열을 사용하여 코드를 만들어라
        Scanner scan = new Scanner(System.in);
        System.out.print("2의 n승 값을 구한다. n은: ");
        int n = scan.nextInt();

        if (n < 0){
            System.out.println("0 이상의 값을 입력하시오");
        } else {
            int x2Array[] = new int[n];
            x2Array[0] = 1;

            for(int i = 1; i <= x2Array.length; i++){
                x2Array[i] = x2Array[i-1]*2;

            }
            System.out.println(x2Array[n]);
        }
    }
}
