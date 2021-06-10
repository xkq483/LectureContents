import java.util.Scanner;

// 6. if + Scanner 문제 : 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
public class QuizSix {
    public static void main(String[] args) {
        int num = 3;

        if (num % 3 == 0) {
            System.out.println("이 숫자는 3의 배수입니다.");
        } else {
            System.out.println("이 숫자는 3의 배수가 아닙니다.");
        }
            Scanner scan = new Scanner(System.in);

            System.out.print("아무 숫자나 하나 입력하세요: ");
            int num1 = scan.nextInt();
            System.out.print("아무 숫자나 하나 입력하세요: ");
            int num2 = scan.nextInt();

        }
    }
