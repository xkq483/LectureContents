import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class Counter {
    private int count = 1;

    private Lock lock = new ReentrantLock();

    public void increment () {
        try {
            lock.lock();//먼저 증가시키고 락걺 누군가가 요정하면 아래 decrement 실행
            count++;
        } finally {
            lock.unlock();
        }
    }
    public void decrement () {
        try {
            lock.lock();
            count--;
        } finally {
            lock.unlock();
        }
    }
    public int getCount() {
        return count; ////문제는 count

    }
}
