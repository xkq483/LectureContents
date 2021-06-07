public class BankLockTest {
    public static void main(String[] args) throws InterruptedException {
                                             // throws InterruptedException이 붙은 대표적인 메소드는 다음과 같다.
                                             //java.lang.Object 클래스의 wait 메소드
                                             //java.lang.Object 클래스의 sleep 메소드
                                             //java.lang.Object 클래스의 join 메소드
        Counter counter = new Counter();
        System.out.println("First count: " + counter.getCount());

        Thread adder = new Thread(new Worker(counter, true, 1000));
        adder.start();

        Thread subtracter = new Thread(new Worker(counter, false, 1000));
        subtracter.start();

        adder.join();
        subtracter.join();

        System.out.println("Final count: " + counter.getCount());
    }
}