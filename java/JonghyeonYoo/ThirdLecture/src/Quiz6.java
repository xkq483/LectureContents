import java.util.Scanner;

public class Quiz6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자나 입력해 주세요: ");
        int num = scan.nextInt();

        if (num %3 ==0) {
            System.out.print(" 3의 배수 입니다.");

        } else {
            System.out.println("3의 배수가 아닙니다.");

        }
    }
}
