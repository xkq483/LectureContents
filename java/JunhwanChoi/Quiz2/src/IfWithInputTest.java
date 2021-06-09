// 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.

import java.util.Scanner;

public class IfWithInputTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("아무 숫자 입력: ");
        int num= scan.nextInt();

        if(num%3==0)
        {
            System.out.println(num+" = 3의 배수입니다.");
        }
        else
        {
            System.out.println(num+"= 3의 배수가 아닙니다.");

        }
    }
}
