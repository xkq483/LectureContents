public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        // InterruptedException 에 대한 부분은 내일 설명!
        System.out.println("주사위 눈금을 굴려봅시다!");

        while (true) {
            // (0.0 ~ 1.0)
            // 0.0이상 1.0 미만
            // 0.0이상 6.0 미만 (5.9xxxx 이하)
            // 여기서 +1 이 되어서
            // 1.0 이상 7.0 미만 (6.9xxxxx 이하)
            // 소수점이지만 값을 int로 처리하면 소수점은 버려짐
            // 결국 1 ~ 6 출력


            // 만약 10 ~ 20 까지 숫자를 랜덤하게 돌리고 싶다면
            // System.out.println((int)(Math.random() * 10 + 11)); 으로 하면 됨됨

            // 랜덤에도 종류가 있다
            // 가우시안 랜덤 (정규분포), 푸아송 분포, 이항 분포, 기하 분포 등등
            // Math.random() 이라는 랜덤은 Uniform Random(모든 항목이 동일한 확률을 가짐짐)
           System.out.println((int)(Math.random() * 6 + 1));
            // 1초 = 1000 밀리세컨드 = 100000 마이크로세컨드 = 1000000000 나노세컨드
            // 1초 = 10^3 ms = 10^6 us = 10^9 ns
            // 결국 0.5초 대기하라는 의미
            // 그래서 결과가 0.5초마다 출력되는 것임
            // 지금은 thread가 0.5초 대기하는 것만 기억합니다.
            Thread.sleep(500);



            //------------------이해 완료
        }
    }
}
