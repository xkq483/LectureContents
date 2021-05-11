import java.util.Scanner;

public class Prob345 {
    public static void main(String[] args) {
        // 숫자 3이 짝수인지 홀수인지 판별
        int num = 3;

        // A를 B로 나눴을때 나머지가 0이란 뜻은
        // 결국 A가 B의 배수란 의미
        if (num % 2 == 0) {
            System.out.println("이 숫자는 2의 배수(짝수)입니다.");
        } else {
            System.out.println("이 숫자는 2의 배수가 아닙니다.(홀수)");
        }

        // 아무 숫자나 3개 입력 받아서 숫자의 합을 출력
        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 하나 입력하세요: ");
        int num1 = scan.nextInt();
        System.out.print("아무 숫자나 하나 입력하세요: ");
        int num2 = scan.nextInt();
        System.out.print("아무 숫자나 하나 입력하세요: ");
        int num3 = scan.nextInt();

        // 여기서 파악해야 하는 부분은 아래와 같다.
        // 두 개의 출력 코드를 비교해보면 재미난 현상을 볼 수 있을 것이다.
        // 결론: 만약 println() 내에서 숫자의 연산과 문자열 표현이 공존한다면 반드시 소괄호 내부에 표현할 것!
        System.out.println("숫자 3개의 합은 = " + num1 + num2 + num3);
        System.out.println("숫자 3개의 합은 = " + (num1 + num2 + num3));
        // Q: 아래는 왜 숫자 + 문장인데 정상으로 나오나요 ?
        // A: 숫자를 먼저 더하는 경우엔 숫자 연산이 정상적으로 진행됩니다.
        //    반면 문장이 나온 상태에서 숫자가 나오면
        //    숫자를 문장으로 바꿔서 붙이게 됩니다.
        //    그러므로 문장 뒤에 숫자가 오고 연산을 하게 된다면 소괄호를 꼭 넣어주세요!
        System.out.println(num1 + num2 + num3 + "숫자 3개의 합은 = ");

        // 1 ~ 20까지의 숫자중 2의 배수만 출력
        int i = 2;

        while (i <= 20) {
            System.out.println(i);

            i += 2;
            // i = i + 2;
        }

        // 여기서 A += B 는 아래와 같다.
        // A = A + B
        // A -= B
        // A = A - B
        // A *= B
        // A = A * B
        // A /= B
        // A = A / B
        // A %= B
        // A = A % B
        // 주의할 점은 이와 같은 연산을 하게 되면 A의 값이 변경된다는 점에 주의해야 한다!

        // 우리가 수학을 하면서 '=' 기호는 ~과 같다로 보통 인식함
        // 실제로 어떤 프로그래밍 언어가 되었든 '='은 대입 연산으로 취급합니다.
        int A = 3, B = 5;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        A += B;
        // A = A + B
        // A + B 결과를 A에 대입하세요.
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}
