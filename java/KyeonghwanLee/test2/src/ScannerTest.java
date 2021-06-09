import java.util.Scanner;

public class ScannerTest {public static void main(String[] args) {
    int num1,num2,num3;

    Scanner scan = new Scanner(System.in);
    System.out.print("첫 번쨰 숫자를 입력하세요 : ");
    num1 = scan.nextInt();
    System.out.print("두 번쨰 숫자를 입력하세요 : ");
    num2 = scan.nextInt();
    System.out.print("세 번쨰 숫자를 입력하세요 : ");
    num3 = scan.nextInt();
    System.out.println("세 숫자의 합은 :"+ (num1+num2+num3));


}
}
