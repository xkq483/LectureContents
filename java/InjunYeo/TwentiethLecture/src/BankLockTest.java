public class BankLockTest {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread adder = new Thread(new Worker(counter,true,200));
        adder.start();

        Thread substracter = new Thread(new Worker(counter,false,200));
        substracter.start();

        adder.join();
        substracter.join();

        System.out.println("Final count: "+counter.getCount());
    }
}
