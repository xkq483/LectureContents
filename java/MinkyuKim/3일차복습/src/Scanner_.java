import java.util.Scanner;

public class Scanner_ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("아무 숫자나 입력하시오 : ");
        int num = scan.nextInt();

        System.out.println("입력된 숫자는 = " + num);
    }
}
