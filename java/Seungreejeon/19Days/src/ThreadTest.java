import java.util.Random;
class Car implements Runnable {
    String name;
    private int sleepTime;
    private final static Random generator = new Random();

    public Car(String name) {
        this.name = name;

        sleepTime = generator.nextInt(3000) + 3000;
    }

    @Override
    public void run() {
        try {

            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("출력도 안 될 것이고 에러가 발생할 일이 없습니다!");
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

// Runnable의 경우 run() 매서드에 대한 구현이 필요함
// Random 클래스로 만든 객체에 nextInt() 매서드를 통해서도 랜덤값을 생성할 수 있다.
// 스레드를 돌릴땐 무조건 이 run() 부분을 구동시키게 되어있다.
// 매우 중요하니 이 run()을 반드시 기억해두자!
// try라는 키워드를 적는 경우는 I/O 나 특정한 이벤트,
// 인터럽트 등등이 발생하는 경우에 작성하게 됨
// 이 녀석은 에러를 유발할 수도 있다! 를 암시함

// 정말 에러가 발생했다면 여기로 오게 됩니다.
// 물론 Thread.sleep()에서 에러가 발생할 일은 99.999999999999999%로 없습니다.

//쓰레드의 구현
//extends Thread 상속 또는 Runnable 인터페이스 구현현
//멀티쓰레드의 장점
// 1.시스템자원을 보다 효율적으로 사용 2. 사용자에 대한 응답성이 향상 3. 작업이 분리되어 코드가 간결해진다.
//채팅프로그램에서 파일을 전송하면서 동시에 채팅을 할수 있다.
//동기화에 주의해야한다.
//교착상태(DEAD-LOCK)이 발생하지않게 주의
//(기아)각 쓰레드가 효율적으로 고르게 실행될수 있게 해야한다.
//프로그래밍 시 고려 사항이 많다.

//            10^-3 + 10^-3 //특정쓰레드를 지정해서 멈추게하는것은 불가능하고 현재의 코드를 실행한 쓰레드가 잠을 자는것
//            Thread.sleep(1,500000); //0.0015초 동안 멈추게 된다 nano초도 가능 10^-9

//스스로한테만 재우는 것 sleep thread 자기자신에대해서만 적용
//sleep의 1 = 10^-3초 ======즉 3초는 3000  시간이 다되거나 interrupted가 발생해서 깨웠을때

//예외처리를 꼭 해줘야한다. Exception 클래스의 자손