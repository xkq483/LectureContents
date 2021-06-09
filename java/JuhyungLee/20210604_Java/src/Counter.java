import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 1;
    private Lock lock = new ReentrantLock();
    //Thread를 사용할 때 lock을 걸려면
    // ReentrantLock을 사용하여 재진입 가능한 형태로 만들어줘야 한다.
    public void increment(){
        try{
            lock.lock();
            count++;
        } finally {
            // 성공적으로 처리했던, 실패했던
            // finally는 무조건 실행된다.
            lock.unlock();;// 따라서 내부에서 문제가 생겨도 lock은 해제를 하겠다는 코드
        }
    }
    public void decrement(){
        try{
            lock.lock();
            count--;
        } finally{
            lock.unlock();
        }
    }
    public int getCount(){
        return count;
    }
}
