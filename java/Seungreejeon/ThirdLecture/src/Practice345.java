import java.util.Scanner;

public class Practice345 {
    public static void main(String[] args) {
        //==========3번 문제==========
        int num = 3;
        if (num % 2 == 0) {
            System.out.println("이 숫자는 2의 배수짝수입니다.");
        } else{
        System.out.println("이 숫자는 2의 배수가 아닙니다.");
        }

        //==========4번 문제==========
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 숫자 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("2번째 숫자 입력하세요: ");
        int num2 = sc.nextInt();
        System.out.print("3번째 숫자 입력하세요: ");
        int num3 = sc.nextInt();

        System.out.println("숫자 의 합은 = " + (num1 + num2 + num3));

        //==========5번 문제==========
        int i = 2;

        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }
}
