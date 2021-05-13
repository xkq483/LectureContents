public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        while (true){
            // [0.0 ~ 1.0)
            // 0.0 이상 1.0 미만
            // 0.0 이상 6.0 미만 (5.9xxx 이하)
            // 1.0 이상 7.0 미만 (6.9xxx 이하)
            // 1 ~ 6 까지 주사위 눈금 숫자만큼

            // 랜덤에도 종류가 있습니다.
            // 가우시안 랜덤(정규 분포), 푸아송 분포, 이항 분포, 기하 분포 등등
            // Math.random() 이라는 랜덤은 Uniform Random(모든 항목이 동일한 확률을 가짐)
            System.out.println((int)(Math.random() * 6 + 1));
            // 1초 = 1000 밀리세컨드 = 1000000 마이크로세컨드 =1000000000 나노세컨드
            // 1초 = 10^3 ms = 10^6 us = 10^9 ns
            // 결국 0.5초 대기하라는 의미
            // 그래서 결과가 0.5 초마다 출력되는 것임
            Thread.sleep(500);
        }
    }
}
