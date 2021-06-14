public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        // 10부터 ~ 20의 경우 * 11 + 10으로 지정하면됨
        while (true) {
            System.out.println((int)(Math.random() * 6 + 1));
            Thread.sleep(500);
        }
    }
}
