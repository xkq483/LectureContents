package Day0511;
//1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.

import java.util.Scanner;

public class TaskWhileScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요");
        int num = scanner.nextInt();
        int i=1;
        while(i<=num){
            if (i%3==0){
                System.out.println(i);
            }
            i++;

        }

    }


}
