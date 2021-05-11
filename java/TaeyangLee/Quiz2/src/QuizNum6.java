import java.util.Scanner;

public class QuizNum6 {
    public static void main(String[] args) {
        System.out.printf("숫자를 입력해주세요 : ");
        int num1;
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        if(num1 % 3 == 0){
            System.out.println(num1+"은 3의 배수입니다");
        }
    }
}
