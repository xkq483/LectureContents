import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {
        // 3번 문제
        int num = 3;
        int num2 = 1;

        if (num%2 == num2){
            System.out.println("홀수");
        }else {
            System.out.println("짝수");
        }
        // 4번문제
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        System.out.print("첫번째 정수를 입력하세요 : ");
        a = scan.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        b = scan.nextInt();
        System.out.print("세번째 정수를 입력하세요 : ");
        c = scan.nextInt();

        System.out.println("입력한 세정수의 합은 : "+ (a+b+c));

        //5번 문제
         int i = 1;

         while (i++<=20){
             if (i%2==0){
                 System.out.println(i);
             }
         }
    }
}
