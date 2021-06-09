import java.util.Scanner;

public class ThirdLecture_Quiz2 {
    public static void main(String[] args) {


        // Quiz6. if + Scanner 문제
        // 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.

        Scanner scan = new Scanner(System.in);

        System.out.println("3의 배수인지 확인 할 숫자: ");
        int a = scan.nextInt();

        if (a % 3 == 0) {
            System.out.println("3의 배수가 맞습니다");
        } else {
            System.out.println("3의 배수가 아닙니다");
        }

        // Quiz7. while + Scanner 문제 (강사님은 if도 사용함)
        // 1 ~ (키보드로 입력 받은 숫자) 중 3의 배수를 판별하여 출력해봅시다.
        // 선생님 풀이 다시 보기

        System.out.print("1~n 중 3의 배수를 판별한다. n을 기입 하시오: ");
        int b = scan.nextInt();
        int c = 1;

        while (c <= b) {
            if (c % 3 == 0) {
                System.out.println(c);
            }
            c++;
        }
    }
}

