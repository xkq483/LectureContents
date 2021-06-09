import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 1;

    public Lock lock = new ReentrantLock();

    public void increment () {
        try {
            lock.lock();
            count++;
        } finally {
            //성공적으로 처리했던, 실패했던
            //finally 는 무조건 실행된다.
            // 그러므로 내부에서 문제가 생겨도 Lock 은 해제를 한다는 뜻
            //ex) 화장실에서 문 잠그고 죽음???

            lock.unlock();
        }
    }

    public void decrement () {
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }
}
