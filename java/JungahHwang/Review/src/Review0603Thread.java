import java.util.Random;
// implements -> 인터페이스
class Car implements Runnable{
    // Runnable의 경우 run() 메소드에 대한 구현이 필요

    String name;
    private int sleepTime;
    private final static Random generator = new Random();

    public Car(String name){
        this.name = name;
        // Random클래스로 만든 객체에 nextINt() 메소드르 통해서도 랜덤값을 생성할 수 있다
        sleepTime = generator.nextInt(3000) + 3000;}

    // 스레드를 돌릴땐 무조건 이 run() 부분을 구동해야 함
    @Override
    public void run() {
        // try는 I/O 나 특정한 이벤트, 인터럽트 등등 발생하는 경우에 작성
        // 에러를 유발할 수 있는 코드 -> try를 이용해줘야 함 ex) Thread.sleep() 등
        try{
            Thread.sleep(sleepTime);
        }catch(InterruptedException e){
            // 에러가 발생하면 여기로 옴
            System.out.println("출력도 안되고 발생할 일이 거의 없음");

        }
        System.out.println(name + "이 경주를 완료하였습니다.");
    }

}
public class Review0603Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car("Ferrari"));
        Thread t2 = new Thread(new Car("Spyder 981"));
        Thread t3 = new Thread(new Car("Maserati MC20"));

        t1.start();
        t2.start();
        t3.start();
    }
}
/* Thread ----------------------------------------------------------------------------------
 -프로세스는 cpu의 추상화
 -cpu는 오직 한 순간에 한 가지 동작만 함
 -thread는 cpu개수만큼 1대1로 할당이 가능??
 CISC(컴퓨터 프로세스) -> RISC(핸드폰, 가전 프로세스) -> Multi-core -> Heterogeneous Architecture

 [스레드 동기화(Synchronization) 문제]
  -스레드가 여러개 동시에 실행될 떄 동기화가 안돼 값이 변해버림 -> 데이터 무결성이 깨짐
  -위의 문제를 해결하는 것은 한 번에 한 번 씩 일을 처리할 것
  -Mutex, Semaphore, Spinlock 등등의 쉴드를 씌워 하나의 스레드의 역할이 끝나지 않으면
   다른 스레드는 접근할 수 없게 함
  -이 쉴드 부분을 Critical Section(임계영역)이라고 함
   Critical Section : 여러 개의 스레드가 동시 다발적으로 접근할 수 있는 데이터
                      (하나의 스레드만 동작 중이면 Critical Section이 아님)

 [Multi-Tasking]
  -아주 빠르게 순차적으로 동작하는데 사람 눈에는 동시에 발생하는 것 처럼 느껴짐

  (Context Switching이 없는 상태)
   -데이터 무결성이 깨짐
  (Context Switching이 있는 상태)
   -제어권을 넘기기 전에 현재 하드웨어 레지스터 정보를 메모리에 저장함
    (이 정보는 운영체제가 관리하고 있어 찾을 수 없음)
   -데이터 무결성 보장

   * Mutex vs Spinlock
   Mutex : Context Switching을 함 -> 복잡한 작업에 사용
   Spinlock : Context Switching을 안 함 -> 간단한 작업에 사용

*/