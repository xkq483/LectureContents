import java.sql.SQLOutput;
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1번 숫자: ");
        int num1 = scan.nextInt();

        System.out.print("2번 숫자: ");
        int num2 = scan.nextInt();

        System.out.print("3번 숫자: ");
        int num3 = scan.nextInt();

        // 여기서 파악해야하는 부분은 아래와 같다.
        // 두개의 출력코드를 비교해보면 재미난 현상을 볼 수 있을 것이다.
        // 결론 : 만약 println() 내에서 숫자의 연산과 문자열 표현이 공존한다면 반드시소괄호 내부에 표현할 것!
        System.out.println("모든 숫자의 합 " + (num1+num2+num3));
        System.out.println("모든 숫자의 합 " + num1 + num2 + num3);


    }
}
