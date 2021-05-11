package Day0511;

import java.util.Scanner;

//아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!
public class TaskScanner {
    public static void main(String[] args) {
        int sum = 0;
        int i =1;
        Scanner scanner = new Scanner(System.in);
        while(i<4){
            System.out.print(i+"번째 숫자를 입력하세요 : ");
            int num = scanner.nextInt();
            sum+=num;
            i++;
        }
        System.out.println("모든합은 : "+sum);





    }


}
