import java.util.Scanner;

public class ifScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 3의 배수 입력");
        int num = sc.nextInt();

        if(num % 3 == 0 && num > 0) {
            System.out.println("3의 배수입니다.");

        } else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}
