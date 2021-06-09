class Bank{
    private int money = 100000;

    public void plusMoney(int plus){
        int m = this.getMoney();
        try{
            Thread.sleep(0); // 기다리기 귀찮아서 sleep시간 0으로
        } catch (InterruptedException e){
            e.printStackTrace(); //erorr 발생시 어디서 error 발생했는지 출력
        }
    this. setMoney(m + plus);
    }

    public void minusMoney(int minus){
        int m = this.getMoney();
        try{
            Thread.sleep(0);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m - minus);
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
}

class FirstThread extends Thread{
    //Thread를 상속받기 때문에 FirstThread에 대한 생성자를 호출하지 않아도
    //동작되게 되어 있음.
    public void run() {
        for (int i = 0; i < 1000; i++) {
            _1st_ThreadError.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) = " + _1st_ThreadError.myBank.getMoney());
        }
    }
}

class SecondThread extends Thread{
    public void run() {
        for (int i = 0; i < 1000; i++) {
            _1st_ThreadError.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) = " + _1st_ThreadError.myBank.getMoney());
        }
    }
}
public class _1st_ThreadError {
    public static Bank myBank = new Bank();
    // myBank를 전역으로 공유하기 위해 작성한 code(static)
    // static 빼보면 위에 class들에서 erorr나는 것 볼 수 있음.
    public static void main(String[] args) {
        System.out.println("원금: " + myBank.getMoney());

        FirstThread t1 = new FirstThread();
        SecondThread t2 = new SecondThread();

        t1.start();
        t2.start();
    }
}
