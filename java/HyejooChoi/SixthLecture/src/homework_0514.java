import java.util.Scanner;

public class homework_0514 {
    public static void main(String[] args) {
        System.out.println("27. 복습 문제(챌린지 문제 - 배열 사용 x)");
        //아래와 같은 형태의 숫자 배치가 있다.
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
        //사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
        //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)

        // 피보나치 : 1번째,2번째 항은 1로 두고, 3번 항부터는 바로 앞의 두 수를 더한 수로 놓는다.
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 ...

        // 사용자가 n을 입력했을 때 n번째 값을 출력해야 함

//        Scanner scan = new Scanner(System.in);
//        System.out.println("몇번 째 항을 출력할까요?");
//        int j=scan.nextInt();
//
//        int num1,num2,sum;
//        num1=0; // 첫번째와 두번째 값이 1이어야 하므로 초기값을 0과
//        num2=1; // 1로 준다
//        sum=1; // 첫번째 1은 그냥 초기값으로 설정
//
//        for(int i=0; i<j; i++)
//        {
//
//            sum=num1+num2; // 두 값을 더한 후
//            num1=num2;
//            num2=sum; // 두번째 연산자에 더한 값을 넣어준다.
//            System.out.print(sum+" ");
//        }

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.println(fibonacci(N));

    }

    // 피보나치 함수
    static int fibonacci(int N) {
        if (N == 0)	return 0;
        if (N == 1)	return 1;
        return fibonacci(N - 1) + fibonacci(N - 2);
    }
}
