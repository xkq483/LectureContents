public class k_Quiz27 {
    //27. 복습 문제(챌린지 문제 - 배열 사용 x)
    //아래와 같은 형태의 숫자 배치가 있다.
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...   피보나치수열
    //사용8을자가 15를 입력하면 15번째 값을,  입력하면 8번째 값을 구하도록 프로그래밍 해보자!
    //(n을 입력하면 n 번째 값을 구하도록 프로그래밍 해보자 ~)
    public static void main(String[] args) throws InterruptedException {
        //switch, if, for

        int a = 1, b = 1;
        int c;

        System.out.println(a);
        System.out.println(b);

        for (int i = 1; ; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
            Thread.sleep(500);
        }



    }
    }

