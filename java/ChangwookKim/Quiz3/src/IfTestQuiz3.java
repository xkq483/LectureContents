import java.util.Scanner;

public class IfTestQuiz3 {
    public static void main(String[] args) {
        // 3번 문제

        int num = 4;


        if (num % 2 == 0) {
            System.out.println("이 숫자는 2의 배수(짝수)입니다.");
        } else {
            System.out.println("이 숫자는 2의 배수가 아닙니다.(홀수)");
        }



        // 4번문제
        // 아무 숫자나 3개 입력 받아서 숫자의 합을 출력


        // 강사님께서 풀어주실때는 집중해서 들으면 아 ~ 이래서 어쩌구 저쩌구 구나! 하고서 논리적으로
        // 이해가 가는데 풀어주셨던것을 안보고 혼자서 문제를 풀어보려고 하면
        // 풀어야 할 문제의 메커니즘을 알고 있어도
        // 이거 다음에 무엇을... 입력을 해야 했더라?
        // 변수가 어쩌구... 중괄호가 어쩌구... 그냥 머리속이 백지입니다 ㅠㅠ
        // 일단은 몇몇 간단한 문제라도 풀이 방식을
        // 문자 그대로 전체 암기를 하여
        // 이 다음엔 이걸 써야하고 그 다음엔 저걸 써야하고
        // 를 머릿속에 슥듭해보는건 괜찮을까요?
        // 무식한 방법이긴 하다..

        // 그리고 막힐때마다 강사님께서 풀어주신만 가장 확실한 방법일 것 같아서요.것만 쳐다보니깐 스스로 풀어본다는 느낌이
        // 잘 안드는것 같아요
        // 아직 혼자서 풀 수 있는게 없는 수준이라서 그런거긴 한데
        // 프로그래밍 할 때 스스로 실력을 늘릴 수 있는 좋은 습관? 같은게 있을까요?

        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 하나 입력하세요: ");
        int num1 = scan.nextInt();
        System.out.print("아무 숫자나 하나 입력하세요: ");
        int num2 = scan.nextInt();
        System.out.print("아무 숫자나 하나 입력하세요: ");
        int num3 = scan.nextInt();

        System.out.println("숫자 3개의 합은 = " + (num1 + num2 + num3));
        System.out.println(num1 + num2 + num3 + "숫자 3개의 합은 = ");
        System.out.printf("세 숫자의 합은 %d입니다.\n", num1 + num2 + num3);






        // 5번 문제
        // 1 ~ 20까지의 숫자중 2의 배수만 출력


        int i = 2;

        while (i <= 20) {
            System.out.println(i);

            i += 2;
        }

        int A = 3, B = 5;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        A += B;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }

}

