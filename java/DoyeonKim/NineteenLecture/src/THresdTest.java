import java.util.Random;

class Car implements Runnable {

    String name;
    private int sleepTime;
    private  final static Random generator = new Random();

    public Car(String name) {
        this.name = name;
        sleepTime = generator.nextInt(3000) + 3000;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
        }catch (InterruptedException e) {
        }

        System.out.println(name + "이 경주를 완료하였습니다.");
    }
}

public class THresdTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car("Ferrari"));
        Thread t2 = new Thread(new Car("Spyder 918"));
        Thread t3 = new Thread(new Car("Maser"));

        t1.start();
        t2.start();
        t3.start();

    }
}
