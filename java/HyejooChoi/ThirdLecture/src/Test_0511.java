import java.util.Scanner;

public class Test_0511 {

    public static void main(String[] args) {
        // 3. if 문제 : 숫자 3이 짝수인지 홀수인지 판별하는 코드 작성
/*        System.out.println("3. if 문제");
        int num1 = 3;
        if(num1 % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
*/

        // 4. Scanner(키보드 입력) 문제 : 아무 숫자나 3개 입력 받아서 숫자의 합을 출력하도록 코드작성
/*        System.out.println("4. Scanner(키보드 입력) 문제");

        Scanner input = new Scanner(System.in);

        int a, b, c;
        int sum;

        System.out.print("첫번째 값 입력 : ");

        a = input.nextInt();

        System.out.print("두번째 값 입력 : ");

        b = input.nextInt();

        System.out.print("세번째 값 입력 : ");

        c = input.nextInt();

        sum = a + b + c;

        System.out.println("합은 " + sum + "입니다.");
*/

        // 6. if + Scanner 문제 : 아무런 숫자나 입력 받아 3의 배수인지 판별을 해봅시다.
/*        System.out.println("6. if + Scanner 문제");

        Scanner scan = new Scanner(System.in);

        System.out.print("아무숫자나 입력하셈 : ");
        int num1 = scan.nextInt();

        if (num1 % 3 == 0) {
            System.out.println("3의 배수입니다");
        } else {
            System.out.println("3의 배수가 아닙니다");
        }
*/

        // 7. while + Scanner 문제 : 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력
        System.out.println("7. while + Scanner 문제");

        Scanner scan2 = new Scanner(System.in);

        System.out.print("1부터의 숫자를 입력하셈 : 1 ~  ");
        int num2 = scan2.nextInt();

        while (num2 * 3 >= 20) {
            System.out.println("?");
        }



    }




    // 5. while 문제 : 1 ~ 20 까지의 숫자중 2의 배수만 출력


    // 6. if + Scanner 문제 : 아무런 숫자를 입력 받아 3의 배수인지 판별


    // 7. while + Scanner 문제 : 1 ~ 키보드로 입력 받은 숫자중 3의 배수를 판별하여 출력


    // 8. if + while + Scanner 문제 : 키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 코드 작성.
    //입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍
}
