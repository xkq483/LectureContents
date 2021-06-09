package Day0511;

import java.util.Scanner;

//아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
public class TaskIfScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();



        if(num%3 == 0){
            System.out.printf("%d 는 3의 배수입니다",num);
        }
        else{
            System.out.printf("%d 는 3의 배수가 아닙니다",num);
        }
    }
}
