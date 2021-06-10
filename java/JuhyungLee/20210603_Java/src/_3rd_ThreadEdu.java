import java.util.Random;
class Car implements Runnable{
                //Runnable interface 사용.
                //즉, Runnable에 미구현된 run() method를 여기서 구현해야한다.
   String name;
   private int sleepTime;
   private final static Random generator = new Random(); // Random class의 객체 generator 생성

   public Car(String name){
       this.name = name;
       //Random 클래스로 만든 객체에 nextInt() 매서드를 통해서도 랜덤값을 생성할 수 있다.
       sleepTime = generator.nextInt(3000) + 3000;
   }
    // thread를 사용할 때에는 무조건 run() method를 구현해야됨. 매우중요
    @Override
    public void run() {
        // try라는 키워드를 적는 경우는 I/O나 특정한 이벤트,
        // 인터럽트 등등이 발생하는 경우에 작성하게 됨
        // "이 코드는 에러를 유발할 수 있다"를 암시함
       try {
           Thread.sleep(sleepTime);
           // 정말 에러가 발생했다면 catch 실행.
           // 물론 Thread.sleep()에서 에러가 발생할 일은 99.999999999999999%로 없다.
        } catch(InterruptedException e) {
           System.out.println("error가 나면 이 문장이 print된다.");
        }
        System.out.println(name + "이 경주를 완료하였습니다.");
        //thread.sleep method에서 난수로 지정한 sleepTime이 가장 낮게 나온 차가
        // 제일 경주를 빨리 완료함.
    }
}

public class _3rd_ThreadEdu {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Car("Ferrrari"));
        Thread t2 = new Thread(new Car("Spyder 918"));
        Thread t3 = new Thread(new Car("Maserati MC20"));

        t1.start(); // Thread class의 method 중 하나.
        t2.start();
        t3.start();
    }
}
