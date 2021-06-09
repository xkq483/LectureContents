import java.util.Random;


//Runnable의 경우 run()메서드에 대한 구현이 필요함
class Car implements Runnable{

    private String name;
    private int sleepTime;
    private final static Random generator = new Random();

    Car(String name){
        this.name= name;
        //Random 클래스로 만든 객체에 nextInt() 메서드를 통해서도 랜덤값을 생성할 수 있다.
        sleepTime = generator.nextInt(3000)+3000;
    }

    //스레드를 돌릴땐 무조건 이 run()부분을구동시키게 되어있다.
    //.매우 중요하니 이run()을 반드시 기억해두자!
    @Override
    public void run() {
        //try라는 키워드를 적는경우는 I/O 나 특정한 이벤트,
        // 인터럽트 등등이 발생하는 경우에 작성하게 됨
        // 이녀석은 에러를 유발할 수도 있다! 를 암시함.
        try{
            Thread.sleep(sleepTime);
        }catch (InterruptedException e){
            //정말 에러가 발생했다면 여기로 오게된다.
            //물론 Thread.sleep()에서 에러가 발생할 일은 진짜 거의없다.
            System.out.println("에러가 발생할 일이 없습니다!");
        }

        System.out.println(name +"이 경주를 완료 하였습니다!");
    }
}
public class ThreadTest {

    public static void main(String[] args) {

        //현재 쓰레드 3개를 만들어서 CPU3개를 사용한다는의미이다.
        Thread t1 = new Thread(new Car("Ferrari"));
        Thread t2 = new Thread(new Car("Spyder 918"));
        Thread t3 = new Thread(new Car("Maserti"));

        //이 start는 Thread의 메소드
        t1.start();
        t2.start();
        t3.start();
    }
}
