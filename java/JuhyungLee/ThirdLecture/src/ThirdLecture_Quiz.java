import java.util.Scanner;

public class ThirdLecture_Quiz {
    public static void main(String[] args) {

        // ##Quiz no.3 //숫자 3이 짝수인지 홀수인지 판별
        int a = 3;

        if(a%2==0){
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        // ##Quiz no.4 //아무 숫자나 3개 입력 받아서 숫자의 합을 출력

        Scanner scan = new Scanner(System.in);
        System.out.println("첫 번쨰 숫자를 입력하세요: ");
        int b = scan.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int c = scan.nextInt();
        System.out.println("두 번째 숫자를 입력하세요: ");
        int d = scan.nextInt();


        // 여기서 파악해야 하는 부분은 아래와 같다.
        // 두 개의 출력 코드를 비교해보면 재미난 현상을 볼 수 있을 것이다.
        // 결론: 만약 println() 내에서 숫자의 연산과 문자열 표현이 공존한다면 반드시 소괄호 내부에 표현할 것!
        System.out.printf("%d+%d+%d=%d\n", b, c, d, b+c+d);
        System.out.println(b+c+d);
        System.out.println((b+c+d));
        System.out.println("숫자 3개의 합은 = " + b+c+d);
        System.out.println("숫자 3개의 합은 = " + (b+c+d));

        // Q: 아래는 왜 숫자 + 문장인데 정상으로 나오나요 ?
        // A: 숫자를 먼저 더하는 경우엔 숫자 연산이 정상적으로 진행됩니다.
        //    반면 문장이 나온 상태에서 숫자가 나오면
        //    숫자를 문장으로 바꿔서 붙이게 됩니다.
        //    그러므로 문장 뒤에 숫자가 오고 연산을 하게 된다면 소괄호를 꼭 넣어주세요!
        System.out.println(b+c+d+"=숫자 3개의 합은");


        // ##Quiz no.5 // 1 ~ 20까지의 숫자중 2의 배수만 출력

        int e = 0;
        while(e++<10) {
            System.out.println(2 * e);
        }
            e = 2;

        while(e<=20){
            System.out.println(e);
            e+=2;
            }

        // A += B는 A = A + B
        // A -= B는 A = A - B
        // A *= B는 A = A * B
        // A /= B는 A = A / B
        // A %= B는 A = A % B

        // 주의할 점은 이와 같은 연산을 하게 되면 A의 값이 변경된다는 점에 주의해야 한다!
        // 우리가 수학을 하면서 '=' 기호는 ~과 같다로 보통 인식함
        // 실제로 어떤 프로그래밍 언어가 되었든 '='은 대입 연산으로 취급합니다.

        }
    }
