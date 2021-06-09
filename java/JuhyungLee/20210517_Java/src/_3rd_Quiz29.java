import java.util.Scanner;
public class _3rd_Quiz29 {
    public static void main(String[] args) {
        // 1, 3, 9, 27, 81, 243......
        // n번째 값을 구하도록 코드를 생성.
        System.out.println("1, 3, 9, 27, 81, 243.....");
        System.out.println("3^n의 값을 구한다."); // 문제 n번째 항 구하기에서 바꿔봄
        Scanner scan = new Scanner(System.in);
        System.out.print("n은: ");
        int n = scan.nextInt();

//        if (n == 0) {
//            int a = (int)Math.pow(3, n);
//            System.out.printf("3^%d는 = %d\n", n, a);
//        } else {
        // 생각해보니까 아래에 new int[n+1]로 설정해뒀기 때문에 n에 0이 입력되어도 상관없음
            int x3Array[] = new int[n+1];

        x3Array[n] = (int)Math.pow(3, n);
        System.out.printf("3^%d는 = %d\n", n, x3Array[n]);
        //만약에 3^n 값들을 쭉 나열하고 싶으면 for문 쓰면되는거고
        // 그게 아니면 아래에 for문 사용할 필요도 없음 생각해보니까...

//            for (int i = 0; i <= n; i++) {
//                x3Array[i] = (int)Math.pow(3, i);
//            }
        }
    }


