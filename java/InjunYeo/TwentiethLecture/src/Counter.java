import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count = 1;
    //Thread를 사용할때 Lock을 ㄹ랴먄
    //ReentrantLock을 사용하여 재진입이 가능한 형태로 만들어줘야 한다.
    private Lock lock = new ReentrantLock();

    public void increment(){
        try{
            //크리티컬섹션에 락을 거는것이다.
            lock.lock();
            count++;
        }finally{
            //성공적으로 처리했던, 실패를 했던 finally는 무조건 실행
            //그러므로 문제가 생겨도 Lock는 해제를한다는뜻
            lock.unlock();
        }
    }

    public void decrement(){
            try{
                lock.lock();
                count--;
            }finally {
                lock.unlock();
            }
    }

    public int getCount(){
        return count;
    }



}
