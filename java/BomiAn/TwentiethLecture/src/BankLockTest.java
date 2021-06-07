public class BankLockTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread adder = new Thread(new Worker(counter, true, 10));
        adder.start();

        Thread subtracter = new Thread(new Worker(counter, false, 5));
        subtracter.start();
    }
}
