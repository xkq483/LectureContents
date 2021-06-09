public class _6th_DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위를 굴리자");

        while (true) {
            // [0.0 ~ 1.0)
            // 0.0 이상 1.0미만
            // 위에 6을 곱했으니 0.0이상 6.0미만(5.9xxxxxxx 이하)
            // 거기에 +1을 하면 1.0이상 7.0미만(6.9xxxxxxx 이하)
            // int형으로 정의했기 떄문에 1~6이 출력됨.
            System.out.println((int)(Math.random() * 6 + 1));
            Thread.sleep(500);
            // 위에 throws InterruptedException 자동추가하는 법 기억할 것
            // (sleep에 error 떴을 때 마우스 올려두면 나옴)
            // 500도 기입하면 자동으로 millis 나오는 것도 개념확인
            // 1초 = 1000 밀리세컨드 = 1000000 마이크로세컨드 = 1000000000 나노세컨드
            // 1초 = 10^3 ms = 10^6 us = 10^9 ns
            // 결국 0.5초 대기하라는 의미

            // 랜덤에도 종류가 있음.
            // 가우시안 랜덤(정규분포), 푸아송 분포, 이항 분포, 기하 분포 등등
            //      >> 인공지능 스터디에서는 중요한 요소긴 하지만 아직 배울 필요 없음
            // Math.random() 이라는 랜덤은 Uniform Random >> 모든 항목이 동일한 확률을 가진다.
        }
    }
}
