import java.util.Scanner;

public class a_Quiz27 {
    public static void main(String[] args) {
        System.out.println("사용자로부터 n을 입력받아 n번째 피보나치 수열의 항을 구합니다.");

        Scanner scan = new Scanner(System.in);
        System.out.print("n 값을 입력하시오.");

        int num = scan.nextInt();
        int res = 0;

        if(num <= 0) {
            System.out.println("0번째 항 혹은 음수항은 존재하지 않습니다.");
        } else if(num < 2) {
            System.out.println("값은 1입니다.");
        } else {
            int first = 1, second = 1;

            // i < num-2를 하는 이유


            // i = 0부터 시작. i(0)=2, i(1)=3, i(2)=5, i(3)=8, i(4)=13, i(5)=18
            // num에 3을 입력시 2가 출력되야하지만, 5이 출력됨 (num-2 안했을 때, 3입력시 5 출력됨)
            // num-2 에서 3입력시 i(2)=5가 출력되지만 -2로 i(0)=2가 출력됨. 이후 순서대로
            for ( int i = 0; i < num; i++) {
                res = first + second;
                first = second;
                second = res;

            }
            System.out.println("결과는 = " + res);

        }
    }
}
