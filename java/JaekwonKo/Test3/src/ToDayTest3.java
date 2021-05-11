import java.util.Scanner;

public class ToDayTest3 {
    public static void main(String[] args) {

        //3
        int num = 3;
        if(num % 2 == 1) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }

        //4
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력:");
        int num1 = scan.nextInt();
        System.out.print("두 번째 숫자 입력:");
        int num2 = scan.nextInt();
        System.out.print("세 번째 숫자 입력:");
        int num3 = scan.nextInt();

        System.out.println("숫자의 총 합:" + (num1 + num2 + num3));

        //5

        int i = 2;

        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }





    }

}
