public class NewBankLockTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        System.out.println("First count:" + counter.getCount());

        Thread adder = new Thread(new Worker(counter, true, 1000));
        adder.start();

        Thread subtractor = new Thread(new Worker(counter, false, 1000));
        subtractor.start();

        adder.join();
        subtractor.join();

        System.out.println("Final count" + counter.getCount());
    }
}
