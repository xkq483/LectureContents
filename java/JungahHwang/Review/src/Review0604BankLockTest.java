public class Review0604BankLockTest {
    public static void main(String[] args) throws InterruptedException {
        Review0604Counter counter = new Review0604Counter();
        System.out.println("First count: " + counter.getCount());

        Thread adder = new Thread(new Review0604Worker(counter, true, 1000));
        adder.start();

        Thread subtracter = new Thread(new Review0604Worker(counter, false, 1000));
        subtracter.start();

        adder.join();
        subtracter.join();

        System.out.println("Final count: " + counter.getCount());
    }
}