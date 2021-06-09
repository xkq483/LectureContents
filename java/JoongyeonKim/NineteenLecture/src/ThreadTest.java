import java.util.Random;

class Car implements Runnable{

    String name;
    private int sleepTime;
    private final static Random generator = new Random();

    public Car(String name){
        this.name=name;
        //Random 클래스로 만든 객체 nextInt() 메소드를 통해서도 랜덤값을 생성할 수 있다
        sleepTime=generator.nextInt(3000) + 3000;
    }

    // 스레드를 돌릴땐 무조건 이 run()부분을 구동시키게 되어있다
    // 매우 중요하니 이 run()을 반드시 기억해두자!
    @Override
    public void run() {
        //try라는 키워드를 적는 경우는 I/O나 특정한이벤트,
        //인터럽트 등등이 발생하는 경우에 작성하게 됨
        //이 녀석은 에러를 유발할 수도 있다! 를 암시함
        try{
            Thread.sleep(sleepTime);
        } catch (InterruptedException e){
            //정말 에러가 발생했다면 여기로 온다
            //물론 Thread.sleep()에서 에러가 발생할 일은 99.99999999%없다

        }
        System.out.println(name + "이 경주를 완료하였습니다!");
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car("Ferrari"));
        Thread t2 = new Thread(new Car("Spyder 918"));
        Thread t3 = new Thread(new Car("Maserati MC20"));

        t1.start();
        t2.start();
        t3.start();

    }
}
