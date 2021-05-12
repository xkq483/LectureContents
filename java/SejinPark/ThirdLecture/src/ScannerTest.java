import java.io.PrintStream;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("첫번째 입력:");
        int a = scan.nextInt();
        System.out.print("두번째 입력:");
        int b = scan.nextInt();
        System.out.print("세번째 입력:");
        int c = scan.nextInt();

        System.out.printf("%d",a+b+c);
    }
}
