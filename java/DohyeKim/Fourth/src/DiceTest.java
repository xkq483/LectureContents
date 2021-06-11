public class DiceTest {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("주사위 눈금을 굴려봅시다");

        while(true){
            System.out.println((int)(Math.random()
            * 6 +1));
            Thread.sleep(500

            );
        }
    }
}
