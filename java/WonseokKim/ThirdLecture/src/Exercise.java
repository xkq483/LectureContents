import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        System.out.println("첫번째 문제 입니다.");
        int num = 3;
        if (num % 2 == 0){
            System.out.println("짝수 입니다.");
        }else{
            System.out.println("홀수 입니다.");

        }

        System.out.println("-------------------");

        System.out.println("두번째 문제 입니다.");
        System.out.println("숫자 3개를 입력 받아 합을 구해봅시다");
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자 입력");
        int num1 = scan.nextInt();

        System.out.println("두번째 숫자 입력");
        int num2 = scan.nextInt();

        System.out.println("세번째 숫자 입력");
        int num3 = scan.nextInt();

        System.out.println("숫자 3개의 합은 = " + (num1+num2+num3));


        System.out.println("==================");

        System.out.println("3번째 문제 입니다.");

        int i = 0;
        while(i<10){
            i++;
            System.out.println(2*i);
        }

        System.out.println(" 끝 ");


    }
}
