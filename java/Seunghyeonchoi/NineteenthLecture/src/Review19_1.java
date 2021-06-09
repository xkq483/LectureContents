import java.util.Random;
// Runnable의 경우 run() 매서드에 대한 구현이 필요함
class Car implements Runnable {

    String name;
    private int sleepTime;
    private final static Random generator = new Random();

    public Car(String name) {
        this.name = name;
        // Random 클래스로 만든 객체에 nextInt() 매서드를 통해서도 랜덤값을 생성할 수 있다.
        sleepTime = generator.nextInt(3000) + 3000;
    }

    // 스레드를 돌릴땐 무조건 이 run() 부분을 구동시키게 되어있다.
    // 매우 중요하니 이 run()을 반드시 기억해두자!
    @Override
    public void run() {
        // try라는 키워드를 적는 경우는 I/O 나 특정한 이벤트,
        // 인터럽트 등등이 발생하는 경우에 작성하게 됨
        // 이 녀석은 에러를 유발할 수도 있다! 를 암시함
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            // 정말 에러가 발생했다면 여기로 오게 됩니다.
            // 물론 Thread.sleep()에서 에러가 발생할 일은 99.999999999999999%로 없습니다.
            System.out.println("출력도 안 될 것이고 에러가 발생할 일이 없습니다!");
        }
        System.out.println(name + "이 경주를 완료하였습니다!");
    }
}

public class Review19_1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car("Ferrari"));
        Thread t2 = new Thread(new Car("Spyder 918"));
        Thread t3 = new Thread(new Car("Maserati MC20"));

        t1.start();
        t2.start();
        t3.start();

        System.out.printf("%f는 파이다.", 2 * 6 * (double)(Math.PI));

        //프로세스(process)란 실행중에 있는 프로그램(Program)을 의미한다.
        //스케줄링의 대상이 되는 작업(task)과 같은 의미로 쓰인다.
        //프로세스 내부에는 최소 하나의 스레드(thread)를 가지고있는데, 실제로는 스레드(thread)단위로 스케줄링을 한다.
        //하드디스크에 있는 프로그램을 실행하면, 실행을 위해서 메모리 할당이 이루어지고, 할당된 메모리 공간으로 바이너리 코드가 올라가게 된다. 이 순간부터 프로세스라 불린다.

        //프로세스(process)의 메모리 구조
        //Code 영역 : 프로그램을 실행시키는 실행 파일 내의 명령어들이 올라간다.
        //
        //Data 영역 : 전역변수, static 변수의 할당.
        //
        //Heap 영역 : 동적할당을 위한 메모리 영역.
        // ↑ ↓
        //Stack 영역 : 지역변수, 함수 호출시 전달되는 인자(파라미터)를 위한 메모리 영역.

        //스레드(thread)란 프로세스(process) 내에서 실제로 작업을 수행하는 주체를 의미합니다.
        //모든 프로세스에는 한 개 이상의 스레드가 존재하여 작업을 수행합니다.
        //또한, 두 개 이상의 스레드를 가지는 프로세스를 멀티스레드 프로세스(multi-threaded process)라고 합니다


        //컨텍스트 스위칭
        //CPU가 어떤 프로세스를 실행하고 있는 상태에서 인터럽트에 의해 다음 우선 순위를 가진 프로세스가 실행되어야 할 때
        //기존의 프로세스 정보들은 PCB에 저장하고 다음 프로세스의 정보를 PCB에서 가져와 교체하는 작업을 컨텍스트 스위칭이라 한다.
        //이러한 컨텍스트 스위칭을 통해 우리는 멀티 프로세싱, 멀티 스레딩 운영이 가능하다.

        //컨텍스트 스위칭 단점
        //위의 그림을 보면 P0가 Excute에서 idle이 될 때 P1이 바로 Excute가 되지 않고 idle을 좀 더 하다가 Excute가 된다.
        //그 이유는 P0 상태를 PCB에 저장하고 P1 상태를 PCB에서 가져와야 하기 때문이다.
        //위 과정에서 PCB를 저장하고 가져올때는 CPU가 아무런 일도 하지 못하게 된다.
        //따라서 컨텍스트 스위칭이 너무 잦으면 오버헤드가 발생하여(비용이 높아) 성능이 떨어진다.

    }
}
