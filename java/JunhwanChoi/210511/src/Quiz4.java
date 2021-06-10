//질문 X
import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        // 4번 문제
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
        System.out.println("숫자 3개의 합은 = " + num1 + num2 + num3);            //결과  123
        System.out.println("숫자 3개의 합은 = " + (num1 + num2 + num3));          //결과   6
        // Q: 아래는 왜 숫자 + 문장인데 정상으로 나오나요 ?
        // A: 숫자를 먼저 더하는 경우엔 숫자 연산이 정상적으로 진행됩니다.
        //    반면 문장이 나온 상태에서 숫자가 나오면
        //    숫자를 문장으로 바꿔서 붙이게 됩니다.
        //    그러므로 문장 뒤에 숫자가 오고 연산을 하게 된다면 소괄호를 꼭 넣어주세요!
        System.out.println(num1 + num2 + num3 + "숫자 3개의 합은 = ");
        System.out.printf("세 숫자의 합은 %d입니다.\n", num1 + num2 + num3);
    }
}

