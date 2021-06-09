import java.util.Scanner;

public class Quiz_25_27 {
    public static void main(String[] args) {
        //25번 문제

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0 && 1 % 5 == 0 && i % 2 == 0) {
                System.out.println("110의 배수 = " + i);
            } else if (i % 11 == 0 && i % 5 == 0) {
                System.out.println("55의 배수 = " + i);
            } else if (i % 11 == 0 && i % 2 == 0) {
                System.out.println("22의 배수 = " + i);
            } else if (i % 5 == 0 && i % 2 == 0) {
                System.out.println("10의 배수 = " + i);
            } else if (i % 11 == 0) {
                System.out.println("11의 배수 = " + i);
                sum += i;
            } else if (i % 5 == 0) {
                System.out.println("5의 배수 = " + i);
                sum -= i;
            } else if (i % 2 == 0) {
                System.out.println("2의 배수 = " + i);
                sum += i;
            }
        }

        System.out.println("최종값 : " + sum);

        //27번 문제   (피보나치수열)

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");

        int num = scan.nextInt();

        int a = 0, b = 1, c = 0;


        for (int i = 1; i < num; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(num + "번째 숫자 값 : " + c);

        //System.out.println("사용자로부터 n을 입력받아 n 번째 피보나치 수열의 항을 수합니다.")

        //Scanner scan = nwe Scanner(System.in);
        //System.out.print("n 값을 입력하시오: ");

        //int num = scan.nextInt();
        //int res;

        // 예외처리 (음수와 0)
        //if (num <= 0 ) {
        //    System.out.println("0번째 항 혹은 음수 항은 존재하지 않습니다.");
        //} else if (num < 3 ) { 0이 아니며 음수가 아니고 3미만이라면 1번째와 2번째뿐
        //    1번째와 2번째값은 무조건적으로 1에 해당함
        //    System.out.println("당신이 찾는 값은 1입니다.");
        //} else {
        // 위의 조건이 모두 만족되지 않는다는 것은 결론적을 ㅗ숫자 3보다 크다는 것을 의미함
        //    int first = 1, second = 1;
        // -2를 했던 이유는 시작할때 first 값고 second값 2개를 알고 시작했기 때문에
        // 2개를 빼주고 루프를 돌게 하기위해 -2를 넣는다
        //    for (int i = 1; i < num -2; i ++) {
        //         res = first + second;
        //         first = second;
        //         second = res
        //       }
        // System.out.println("값은 ? " + res)

        // first     second        res
        //   1          1           2      첫번째 루프에서 first + second 까지의 상태
        //   1          2           3      두번째 루프에서 first + second 까지의 상태
        //   2          3           5      세번째 루프에서 first + second 까지의 상태
        //   3          5           8      네바바번째 루프에서first + second 까지의 상태









    }
}