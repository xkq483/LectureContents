// 아무숫자나 입력 받아서 숫자의 합을 출력하도록 코드를 작성

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("num1입력: ");
        int num1= scan.nextInt();

        System.out.print("num2입력: ");
        int num2= scan.nextInt();

        System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);



    }
}
