import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
//        3.if문제
        int i1 = 3, i2 = 2;
        if (i1 % i2 > 0) {
            System.out.println("3은 홀수이다");
        }
//        4.Scanner(키보드 입력) 문제
        Scanner scan = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요. : ");
        int num1 = scan.nextInt();
        System.out.print("두번째 숫자를 입력하세요. : ");
        int num2 = scan.nextInt();
        System.out.print("세번째 숫자를 입력하세요. : ");
        int num3 = scan.nextInt();

        System.out.printf("%d + %d + %d = %d\n", num1, num2, num3, num1 + num2+ num3);

//        5.while 문제
        int i = 0;
        while (i++ < 20) {
            if(i%2==0) {
            System.out.println(i);
        }
            }
    }
}
