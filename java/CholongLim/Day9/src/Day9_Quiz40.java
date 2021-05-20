import java.util.Scanner;

class Fibonacci {
    private int fibo;

    public void Fibores() {
        Scanner scan = new Scanner(System.in);

        System.out.print("피보나치 수열값에서 n번째 값을 구하시오.(n을 입력하세요) : \n");
        int fibo = scan.nextInt();
        int i ;
        int f1 = 1;
        int f2 = 1;
        int fiboRes = 0;

       if (fibo <= 0) {
           System.out.println("잘못된 값입니다.");
        } else if(fibo < 3) {
           System.out.printf("구하고자 하는 %d번째 피보나치 수열값은 1입니다.\n", fibo);
       } else {
           for(i = 3; i <= fibo; i++) {

               fiboRes = f1 + f2;
               f1 = f2;
               f2 = fiboRes + f1;

           }

           System.out.println("피보나치 수열값은 : " + f2);
       }
    }
}
public class Day9_Quiz40 {
    public static void main(String[] args) {

        Fibonacci fibon = new Fibonacci();
        fibon.Fibores();

    }
}
