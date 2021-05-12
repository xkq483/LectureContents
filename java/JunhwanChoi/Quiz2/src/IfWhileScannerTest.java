//키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
//        입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!

import java.util.Scanner;

public class IfWhileScannerTest {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        int num=1;

        while(true)
        {
            System.out.print("숫자입력: ");
            num= scan.nextInt();

            if(num==0)
            {
                System.out.println("0, 종료합니다."); break;
            }
            else if (num%2==0)
            {
                System.out.println(num + " = 짝수입니다.");
            }
            else
            {
                System.out.println(num + " = 홀수입니다.");
            }


        }

    }
}
