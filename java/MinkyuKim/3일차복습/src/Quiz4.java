import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        //Scanner(키보드 입력) 문제
        //아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자 첫번째 입력 : ");
        int num1 = scan.nextInt();
        System.out.print("숫자 두번째 입력 : ");
        int num2 = scan.nextInt();
        System.out.print("숫자 세번째 입력 : ");
        int num3 = scan.nextInt();

        System.out.println(num1 + num2 + num3 + " 숫자 3개의 합은 =");
        System.out.println("숫자 3개의 합은 =" + (num1 + num2 +num3));
    }
}
