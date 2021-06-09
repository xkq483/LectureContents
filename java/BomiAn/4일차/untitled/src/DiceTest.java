public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");
        //랜덤에도  종류가 있습니다
        //기우시안 램덤(정규분포)/푸아송 분포/ 이항분포/ 기하분포 등등
        // Math.random() 이라는 랜덤은 uniform random(모든 항목이 동일한 확률을 가짐)

        while (true) {
            //10~20 -> Math.random() * 11 + 10
            System.out.println((int)(Math.random() * 6 + 1));
            // 1초 = 1000 밀리세컨드 = 1000000 마이크로세컨드 = 100000000 나노세컨드
            //결국 0.5초 대기하라는 의미
            //그래서 결과가 0.5 초마다 출력되는 것임
            Thread.sleep(500);
        }
    }
}
