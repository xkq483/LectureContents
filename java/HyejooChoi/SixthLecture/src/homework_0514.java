import java.util.Scanner;

public class homework_0514 {
    public static void main(String[] args) {
        //아래와 같은 형태의 숫자 배치가 있다.
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
        //사용자가 15를 입력하면 15번째 값을, 8을 입력하면 8번째 값을 구하도록 프로그래밍 해보자!
        //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)
        System.out.println("27. 복습 문제(챌린지 문제 - 배열 사용 x)");

        // 피보나치 : 1번째,2번째 항은 1로 두고, 3번 항부터는 바로 앞의 두 수를 더한 수로 놓는다.
        // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 ...

        // 사용자가 n을 입력했을 때 n번째 값을 출력해야 함

        Scanner scan = new Scanner(System.in);
        System.out.println("몇번 째 항을 출력할까요?");
        int j = scan.nextInt(); // j=사용자가 입력한 값

        // 피보나치 수열 출력
        int num1 = 1;
        int num2 = 1; // 1,2번째 항 초기값 1

        for (int i = 0; i <= j; i++) {
            int sum = num1 + num2;

//            System.out.println("num1 = " + num1);
//            System.out.println("num2 = " + num2);

            num1 = num2;
            num2 = sum; // 위에서 두개 더한 값을 저장
            System.out.println(sum);
        }

        // 질문
        // 앞의 두 항을 더하는건 잘 되는거같은데
        // 3을 입력하면 6번째 값까지 나오고, 5를 입력하면 8번째 값까지 나옵니다.
        // 1.입력한 값에서 +3이 되어 출력됨
        // 2.값이 한개만 출력되어야 하는데 앞의 값들까지 같이 나옴

        // 아직 알고리즘?의 이해가 부족해서 어디가 문제인지 잘 모르겠습니다
    }
}
