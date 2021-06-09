import java.util.Scanner;

public class QuizNum4 {
    public static void main(String[] args) {
        int num1,num2,num3;
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("첫 번쨰 숫자를 입력하세요 : ");
        num1 = sc.nextInt();
        System.out.printf("두 번쨰 숫자를 입력하세요 : ");
        num2 = sc.nextInt();
        System.out.printf("세 번쨰 숫자를 입력하세요 : ");
        num3 = sc.nextInt();
        sum = num1+num2+num3;
        System.out.println("입력한 세 숫자의 합은 :"+sum);


    }
}
