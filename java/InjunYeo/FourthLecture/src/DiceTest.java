public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다! ");

        while (true) {
            /*
            [0.0~1.0)
            0.0이상 1.0 미만
            0.0이상 6.0 미만
            1.0 이상 7.0 미만
            1~6까지 주사위 눈금

            랜덤에도 종류가있다
            가우시안 랜덤(정규분포), 푸아송 분포, 이항 분포, 기하 분포 등등
            Math.random()이라는 랜덤은 Uniform Random(모든 항목이 동일한 확률을 가짐)
             */
            System.out.println((int) (Math.random() * 6 + 1));
            Thread.sleep(500);
        }
    }
}


