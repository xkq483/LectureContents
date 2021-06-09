public class DiceTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");


        while(true){
            System.out.println((int)(Math.random() * 6 + 1)); //난수발생  6을 곱해준 이유는 0.0이상 6.0미만의 난수를 발생시키는데 주사위는 1~6이므로 +1해줌
            Thread.sleep(500);
        }
    }
}
