// 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.

import java.util.Scanner;

public class WhileWithInputTest {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("숫자 입력:");
        int num= scan.nextInt();

        int i=1;

        while(i < num)
        {
            i++;
            if(i%3==0)
            {
                System.out.println("3의배수i="+i);
            }
        }

    }
}
