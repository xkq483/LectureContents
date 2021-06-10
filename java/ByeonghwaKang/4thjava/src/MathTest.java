import com.sun.jdi.InternalException;

public class MathTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 눈금을 굴려봅시다!");

        while (true) {
            System.out.println(() (Math.random() * 11 + 10));
            Thread.sleep(500);

        }
    }
}
