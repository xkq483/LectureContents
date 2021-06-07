import java.util.Scanner;

public class Prob345 {
    public static void main(String[] args) {
        // 숫자 3의 짝수 홀수 판별
        int num = 3;
        
        //A를 B로 나눴을때 나머지가 0이면 짝수, 나머지가 1이면 홀수
        if (num % 2 ==0) {
            System.out.println("이 숫자는 2의 배수(짝수)입니다");
        } else {
            System.out.println("이 숫자는 2의 배수가 아닙니다.(홀수)");
        }
        
        //아무 숫자나 3개 입력 받은 후 합을 출력
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력 : ");
        int num1 = scan.nextInt();
        System.out.println("두번째 숫자 입력 : ");
        int num2 = scan.nextInt();
        System.out.println("세번째 숫자 입력 : ");
        int num3 = scan.nextInt();

        // println() 에서 숫자연산+문자열이 있다면 반드시 소괄호 내부에 표현할것
        System.out.println("숫자 3개의 합은 = " + num1 + num2 + num3);
        System.out.println("숫자 3개의 합은 = " + (num1 + num2 + num3));

        // 숫자를 먼저 더하면 숫자연산이 정상출력
        // 문장이 먼저 나오고 숫자가 나오면 숫자가 문자열로 바뀜
        // 문장뒤에 숫자가 올때에는 반드시 소괄호안에 숫자를 넣을것
        System.out.println(num1 + num2 + num3 + "숫자 3개의 합은 = ");


        // 1 ~ 20 까지의 숫자중 2의 배수만 출력
        int i = 2;

        while (i <= 20) {

            System.out.println(i);

            i += 2;
            // i = i + 2;

            int A = 3, B = 5;
            System.out.println("A =" + A);
            System.out.println("B =" + B);
            A += B;
            System.out.println("A =" + A);
            System.out.println("B =" + B);
        }
    }
}
