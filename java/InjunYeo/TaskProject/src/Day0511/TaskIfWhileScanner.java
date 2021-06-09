package Day0511;
//키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
//입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
import java.util.Scanner;


public class TaskIfWhileScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        while(num != 0){


             if(num%2 == 0){
                System.out.println("짝수입니다");
            }

            else{
                System.out.println("홀수입니다");
            }

            System.out.print("숫자를 입력하세요");
            num = scanner.nextInt();



        }
    }

}
