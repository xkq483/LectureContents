public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        while (true) {
            // [0.0 ~ 1.0]
            // 0.0 이상 1.0 미만
            // 0.0 이상 6.0 미만 (5.9xxx 이하)
            // 1.0 이상 7.0 미만 (6.9xxx 이하)
            // 1 ~ 6 까지 주사위 눈금 숫자만큼
            System.out.println( (int) (Math.random() * 6 + 1)); // 1 ~ 6
//            System.out.println( (int) (Math.random() * 11 + 10)); // 10 ~ 20
            Thread.sleep(500);
        }
    }
}
