public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        while (true) {
            System.out.println((int)(Math.random() * 6 +1));

            Thread.sleep(500);

            // 6+1 에서 1때문에 0이 안나오는 것이다
            // 500은 0.5초 대기하라는  의미
            // millis는 입력 하는게 아니라 뒤에 숫자를 입력하면 알아서 자동완성이 되는거다.
        }

    }
}
