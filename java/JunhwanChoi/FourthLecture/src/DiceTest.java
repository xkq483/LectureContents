import java.util.Random;

public class DiceTest {
    public static void main(String[] args) throws InterruptedException  {
        System.out.println("주사위 눈금을  10번 굴려봅시다.");

        int i=1;

        while( i<=10)
        {
            System.out.println((int)(Math.random()*6+1)); //   기본 0.0~5.xxxx에서 +1을 해줘서
            Thread.sleep(500);                      //   1.0 ~ 6.xxx  즉 정수 1~6사이 랜덤값 출력

                                                        // 연습 : 10~20까지 정수 출력하려면?
                                                        // (int)(Math.random) * 11 +10
                                                        // 11 = 0~10까지의 정수 출력
                                                        // +10 = 10~20까지 정수 출력

            //0.5초 대기하라는 의미
            //그래서 결과가 루프동안에 0.5초마다 출력되는것

            i++;

            //랜덤에도 몇가지 종류가 있음.
            // 가우시안랜덤(정규분포), 푸아송분포, 이항분포, 기하 분포 등등
            //  Math.random()이라는 랜덤은 uniform Random(모든항목이 동일한 확률을 가짐)
        }
    }
}
