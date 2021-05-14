import java.util.Scanner;

public class HW0512 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("15번 for + if 문제");

        // 1 ~ 100까지 숫자중 4의 배수만 출력해보자

        for (int i = 1; i <=100 ; i++) {
            if(i % 4 == 0 ){
                System.out.println("i = " + i );
            }
        }

        System.out.println("==================");

        System.out.println("16번 for + if 문제");
        //1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!

        int sum = 0 ;

        for (int i = 1 ; i <= 100 ; i++)    {

            if (i % 11 == 0)    {

                sum += i;
            }
        }
        System.out.println("1~100 사이 11의 배수의 합은 : " +sum);

        System.out.println("==================");



        System.out.println("17번 Math.random() 응용 문제");

        //컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

       System.out.println("주사위 게임을 해볼까?");
        Thread.sleep(1000);


        System.out.println("Player 1 시작!");
        Thread.sleep(1000);
        int a = (int) (Math.random() * 6 + 1);
        System.out.println("1회 도전 : " + a);
        int b = (int) (Math.random() * 6 + 1);
        System.out.println("2회 도전 : " + b);
        int sum1 = a + b;
        Thread.sleep(1000);
        System.out.println("Player 1 합산점수 : " + sum1);

        Thread.sleep(1000);
        System.out.println("Player 2 시작!");
        int c = (int) (Math.random() * 6 + 1);
        System.out.println("1회 도전 : " + a);
        int d = (int) (Math.random() * 6 + 1);
        System.out.println("2회 도전 : " + b);
        int sum2 = c + d;
        Thread.sleep(1000);
        System.out.println("Player 2 합산점수 : " + sum2);


        System.out.println("과연 결과는~~?");
        Thread.sleep(1000);
        if (sum1 > sum2) {
            System.out.println("Player 1의 승리~!");
        } else {
            System.out.println("Player 2의 승리~!");
        }


    }
}
