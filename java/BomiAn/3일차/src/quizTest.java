import java.util.Scanner;

public class quizTest {
    public static void main(String args[]) {
        //3.숫자 3이 짝수인지 홀수인지 판별하는 코드를 작성해봅시다

        if(3 % 2 == 1) {
            System.out.println("3은 홀수입니다");
        }else {

        }

        //4.아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드를 작성해봅시다!
        Scanner scan = new Scanner(System.in);
        System.out.print("1.아무 숫자나 입력하세요 : ");
        int num1 = scan.nextInt();
        System.out.print("2.아무 숫자나 입력하세요 :  ");
        int num2 =scan.nextInt();
        System.out.print("3.아무 숫자나 입력하세요 : ");
        int num3 = scan.nextInt();

        System.out.println(num1 + num2 + num3);

        //5.1 ~ 20까지의 숫자중 2의 배수만 출력해봅시다.
        int i = 0;
        while(i < 20) {
            System.out.println(i += 2);
        }

        //6.아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
        Scanner sc = new Scanner(System.in);
        System.out.print("아무 숫자나 입력 : ");
        int num4 = sc.nextInt();

        if(num4 / 3 == 0) {
            System.out.println("3의 배수 입니다.");
        } else {
            System.out.println("3의 배수가 아닙니다.");
        }

        //7.1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력해봅시다.
        Scanner ne = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num5 = ne.nextInt();
        int a = 1;

        while(a < num5) {
            if(a % 3 == 0) {
                System.out.println(" 3의 배수가 맞습니다");
            } else {
                System.out.println(" 3의 배수가 아닙니다.");
            }
            a++;
        }

        //8.키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!

        Scanner scc = new Scanner(System.in);
        int select = 1;

        while (select != 0) {
            System.out.print("짝수인지 판별해보자 : ");
            select = scan.nextInt();

            if(select % 2 == 0) {
                System.out.println(select + "은 짝수");
        } else {
            System.out.println(select + "은 홀수");}
        }


    }

}
