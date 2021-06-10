public class Prob15_16_17 {
    public static void main(String[] args) {
        //Prob 15 1 ~ 100까지 숫자중 4의 배수만 출력해보자
        for (int i = 4; i <= 100; i ++) {
            if (i % 4 == 0) {
                System.out.println("4의배수는" + i);
            }
        }
        //prob 16 1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                sum += i;
                System.out.println("11의 배수들의 합 =" + sum);
            }
        }
        //sout를 if문 밖으로 넣을시 여러개가 중복되어 출력됨

        //prob 17 컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

        //해당문제는 변수 별 주사위 할당 및 합산 식을 구현하기 어려워 아직은 잘 모르겠ㅅ브니다.


        /*
         int me, com
         if( me> com) {
                    System.out.println("당신이 이겼습니다");
                }
                else if (me < com){
            System.out.println("당신이 졌습니다");
        }
                else {
                    System.out.println("비겼습니다");
                }

         */














    }
}