import java.sql.SQLOutput;
import java.util.Scanner;

public class Review1 {
    public static void main(String[] args) {
        int num1 = 7, num2 = 5;
        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        } else {
            System.out.printf("%d . %d\n", num1, num2);
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("아무숫자나 입력해보세요 : ");

        int num = scan.nextInt();
        System.out.println("당신이 입력한 숫자는 = " + num);

        //Q1 : prinln, print. printf 의 차이점이 뭘까요? 어떤 상황에 쓰여지는건지 궁금합니다.

        // while 루프를 작성하는 방법

        // 1. 먼저 while을 적고 소괄호를 열고 닫고 중괄호를 열고 닫습니다.
        // 2. 소괄호 내부에는 if 문과 마찬가지로 조건을 적습니다.
        // 3. 조건이 만족하는 동안 동작시킬 코드를 중괄호 내부에 적습니다.


        int i = 0;
        while(i++ < 10) {
            System.out.println(i);
            System.out.println("++i는 해당 라인에서 바로 연산이 진행된다.");

            i = 0;
            while(++i < 10) {
                System.out.println(i);
            }

        }
        // 관계 연산자 AND (&&)
        // AND 의 특성 ===> 양쪽 조건이 모두 참인 경우에만 참
        //                 한쪽이라도 거짓이 있다면 거짓으로 판정
        int num5 = 3, num6 = 7;
        int num7 = 21, num8 = 24;

        if ((num5 % num6 == 0) && (num7 % num8 == 0)) {
            System.out.printf("%d는 %d의 배수이며, %d의 배수이다\n", num7, num5, num6);
        }

        if ((num1 % 3 == 0) || (num2++ % 6 == 0)) {
            System.out.println("이 조건은 실행됩니다.");
        }

        System.out.printf("num1 = %d, num2 = %d\n", num1, num2);




        // 표기법 ===> 앤터 위에 원 표시가 있다.
        //            Shift + 원 표시를 누르면 파이프 기호가 생성된다.
        // 관계 연산자 OR (||)
        // OR 의 특성 ===> 양쪽 중 하나라도 참이라면 참
        //                양쪽 모두가 거짓인 경우에만 거짓으로 판정






    }
}
//Q1 : prinln, print. printf 의 차이점이 뭘까요? 어떤 상황에 쓰여지는건지 궁금합니다.
