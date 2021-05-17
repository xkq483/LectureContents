import java.util.Scanner;

public class Day6_Quiz2 {
    public static void main(String[] args) {
//        27번 문제

//        1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987 ...
//        fn= f(n-2) + f(n-1)

        Scanner scan = new Scanner(System.in);
        int num;
        int f1 = 1;
        int f2 = 1;
        int sum ;

        for(int i = 0; i < 20 ; i++) {
            System.out.print("피보나치 수열의 n번째 값은?(n을 입력하시오) : ");
            num = scan.nextInt();

            if ( num == 0 ) {
                System.out.println("입력을 종료합니다.");
                break;
            } else if ( num == 1) {
                System.out.printf("%d번째 피보나치 수열 값은 : %d\n", num, f1);
            } else if ( num == 2) {
                System.out.printf("%d번째 피보나치 수열 값은 : %d\n", num, f2);
            } else {
                System.out.println();
//                num > 2일때, 출력해야하는 값.
            }
        }
    }
}



