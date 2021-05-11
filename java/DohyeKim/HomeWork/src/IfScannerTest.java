import java.util.Scanner;
public class IfScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("아무 수나 입력해서 3의 배수인지 알아보자");
        int num1 = scan.nextInt();

        if(num1 % 3 ==0){
            System.out.println("3의배수입니다");
        }else{
            System.out.println("3의배수가 아닙니다");
        }
    }
}
