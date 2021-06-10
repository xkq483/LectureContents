import java.util.Scanner;

public class IfTestWithInput {
    public static void main(String[] args) {
        System.out.println("두개의 숫자를 입력 받아 비교해봅시다.");
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력해주세요");
        int num = sc.nextInt();
        System.out.println("두번째 숫자를 입력해주세요");
        int num2 = sc.nextInt();


        if(num > num2) {
            System.out.printf("%d > %d\n", num, num2);
        } else if (num == num2){
            System.out.printf("%d = %d\n", num, num2);
        } else {
                System.out.printf("%d < %d\n", num, num2);



        }
    }
}
