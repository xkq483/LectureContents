import java.util.Scanner;

public class InputTest03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하여주시오.");
        int num = scan.nextInt();
        System.out.println("당신이 입력한 값은" + num);

    }
}
