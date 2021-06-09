import java.util.Scanner;

public class QuizNum7 {
    public static void main(String[] args) {

        int num1 ;
        int i=0;
        System.out.printf("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println(num1 + "까지의 3의 배수는!");
        while(i<num1){
            i++;
           if(i % 3 == 0){
               System.out.println(i);
            }

        }
    }
}
