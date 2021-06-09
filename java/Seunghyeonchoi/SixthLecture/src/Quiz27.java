import java.util.Scanner;

public class Quiz27 {
    public static void main(String[] args) {
        //27. 복습 문제(챌린지 문제 - 배열 사용 x)
        //아래와 같은 형태의 숫자 배치가 있다.
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
        //사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
        //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)

        int check;
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;


        Scanner scan = new Scanner(System.in);
        //스캔받은 값까지만 for가 돌게 해보자
        System.out.print("몇 번째 값을 구해드릴까요? : ");
        check = scan.nextInt();

        if ( check == 1 | check == 2 ) {
            num3 = 1;
        } //    Q. 이렇게 따로 빼지 않고 한번에 처리할 수 있는 방법은 없나요?

        for (int i = 2; i < check ; i++) {

            num3 = num1 + num2;  //이럼 1이고
            num1 = num2;
            num2 = num3;

            //이러면 1일 때
            // num3 = 1 + 1 = 2
            // num1 = 1
            // num2 = 2  종료
            // 2가 입력되면 한 번 더 반복
            // num3 = 1 + 2 = 3
            // num1 = 2
            // num2 = 3
        }

        System.out.println("값은" + num3);

    }
}
