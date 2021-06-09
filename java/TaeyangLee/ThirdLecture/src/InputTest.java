import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("아무 숫자나 입력해보세요 : ");
        int num = scan.nextInt();

        System.out.println("당신이 입력한 숫자는 = " + num);
    }
}
