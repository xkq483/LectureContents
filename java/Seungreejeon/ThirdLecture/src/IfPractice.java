import java.util.Scanner;
public class IfPractice {
public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 3의 홀수 구분");
        int num = 3;

        if(num % 2 == 0 ) {
             System.out.println("짝수입니다.");

         } else {
             System.out.println("홀수입니다.");
         }


}
}
