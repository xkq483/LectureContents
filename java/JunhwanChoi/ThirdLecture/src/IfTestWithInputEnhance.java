import java.util.Scanner;

public class IfTestWithInputEnhance {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("두 개 숫자를 입력 받아 비교해봅시다.");


        System.out.print("첫 번째 수 입력: ");
        int num1= scan.nextInt();

        System.out.print("두 번째 수 입력: ");
        int num2= scan.nextInt();

        // else if를 추가해서  두개의 수가 같은 경우에 정상 결과를 도출하지 않는 것을 보완하였음.
        if(num1<num2)
        {
            System.out.printf("%d < %d\n", num1,num2);
        }
        else if(num1 > num2)
        {
            System.out.printf("%d > %d\n", num1,num2);
        }
        else
        {
            System.out.printf("두 개의 수(%d, %d)는 같습니다.\n",num1,num2);
        }




    }
}
