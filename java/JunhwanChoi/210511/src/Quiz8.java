import java.util.Scanner;

public class Quiz8 {

    public static void main(String[] args) {

        // 키보드 입력이 0이 들어오기 전까지는 계속 무한 반복하도록 프로그램을 작성합니다.
        // 입력하는 키보드 값이 짝수인지 홀수인지 지속적으로 판별하도록 프로그래밍 해봅시다!
        Scanner scan = new Scanner(System.in);
      /*  int select = 1;

        while(select != 0) {
            System.out.print("짝수인지 홀수인지 판별해보자: ");
            select = scan.nextInt();

            if (select % 2 == 0) {
                System.out.println(select + " 는 짝수!");
            } else {
                System.out.println(select + " 는 홀수!");
            }
    }
        */
        int num=1;

        while(true)
        {
            System.out.print("숫자입력: ");
            num= scan.nextInt();

            if(num==0)
            {
                System.out.println("0, 종료합니다."); break;
            }
            else if (num%2==0)
            {
                System.out.println(num + " = 짝수입니다.");
            }
            else
            {
                System.out.println(num + " = 홀수입니다.");
            }


        }



}
}
