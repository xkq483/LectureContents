public class RandomTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위를 굴려봅시다.");
        //랜덤의 종류
        //가우시안 랜덤(정규분포), 푸아송 분포, 이항분포, 기하분포 등등
        //Math.random() 이라는 랜덤은 uniform Random(모든 항목이 동일한 확률을 가짐)
        while (true) {
            System.out.println((int)(Math.random() * 6 + 1));
            //10~20값 랜덤 구하기
            System.out.println((int)(Math.random() * 11 + 20));

            //1초 1000 mu = 10^3 us = 10^6 ns,ps'''''
            Thread.sleep( 100);
            //Thread 비동기 처리
        }
//        System.out.println((float)(Math.random() * 10));

    }
}
