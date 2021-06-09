import java.util.Scanner;

public class k_Quiz27 {
    //27. 복습 문제(챌린지 문제 - 배열 사용 x)
    //아래와 같은 형태의 숫자 배치가 있다.
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
    //사용8을자가 15를 입력하면 15번째 값을,  입력하면 8번째 값을 구하도록 프로그래밍 해보자!
    //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)
    public static void main(String[] args) throws InterruptedException {

        System.out.println("구하고싶은 n번째 값을 입력하시오");
        Scanner scan = new Scanner(System.in);
        //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열

        int a = 0, b = 1;
        int c = 0;
        int n;

        n = scan.nextInt();


        for (int i = 0; i < n ; i++) {
            a = b;
            b = c;
            c = a + b;



            // a = b;
            // b = c;
            // c = a + b;
            // 1) a = 1, b = 0, c = 0 + 1  == > 1
            // 2) a = 0, b = 1, c = 0 + 1  == > 1
            // 3) a = 1, b = 1, c = 1 + 1  == > 2
            // 4) a = 1, b = 2, c = 1 + 2  == > 3
            // 5) a = 2, b = 3, c = 2 + 3  == > 5
            // 6) a = 3, b = 5, c = 3 + 5  == > 8
            // 7) a = 5, b = 8, c = 5 + 8  == > 13
            // >> int i = 0일때 n번째 값이 출력됨. int i = 1일때 n-1번째 값이 출력됨
            // i < n 조건으로 i = 0일 경우 1)번부터 시작. i = 1일경우 n이 1로 입력될시 1<1이므로 0
            // i = 1부터시작하려면  i <= n 로 조건문을 변경해야함





            // System.out.printf("피보나치수열의 %d번째 값은 = %d\n",n, c);
            // 몇번째 값까지 출력되는 과정을 보여줌

        }
        System.out.printf("%d번째 피보나치 수열값은 = %d\n", n, c);

        // 최종값만을 출력하고 싶은데 잘 안되는것 같음 >> int c;에서 int c = 0;으로 변경하였더니 정상 작동 됨.
        // 이번시간에 배운 변수 스코핑과 관련된 것 같음.
        // int c = 0; 에서 값을구해지는 것이랑, int c;에서는 동작을 안하는 이유를 모르겠습니다.

    }

}