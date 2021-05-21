import java.util.Scanner;

class Fibonacci {
   private int fiBo;
//   결과값은 출력되지만, fiBo가 사용되지않음.
   private int scanNum;
   private int res;

   public Fibonacci() {
       Scanner scan = new Scanner(System.in);
       System.out.print("피보나치 수열의 n 번째 값을 구하시오. (n을 입력하세요) : ");
       scanNum = scan.nextInt();
   }
   public void FibonacciRes() {

           if(scanNum <= 0) {
               System.out.println("잘못된 입력입니다.");
           } else if (scanNum < 3) {
               System.out.printf("%d번째 피보나치 수열의 값은 1입니다.", scanNum);
           } else {
               int f1 = 1;
               int f2 = 1;
               for(int i = 2; i < scanNum; i++) {
                   res = f1 + f2;
                   f1 = f2;
                   f2 = res;
               }
               System.out.printf("%d번째 피보나치 수열값은 : %d", scanNum, res);
           }
       }
   }
public class Day9_Quiz40 {
    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();

        fb.FibonacciRes();



    }
}
