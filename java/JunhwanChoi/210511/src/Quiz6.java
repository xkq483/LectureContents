//질문X
import java.util.Scanner;
public class Quiz6 {
    public static void main(String[] args) {
            // 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
            Scanner scan = new Scanner(System.in);

            System.out.print("아무 숫자나 입력해보세요(11의 배수를 판정하겠습니다): ");
            int num = scan.nextInt();

            if (num % 11 == 0) {
                System.out.println(num + " 은 11의 배수입니다.");
            } else {
                System.out.println(num + " 은 11의 배수가 아닙니다.");
            }




    }
}

