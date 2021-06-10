class Bank {
    // 만 단위로 10억임
    private int money = 100000;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus) {     //돈을 더하는 스레드를 만듬
        int m = this.getMoney();  // 변수 m에 getMoney값을 대입한다

        try {  //try는 일단 실행해봐~ 라는 의미
            Thread.sleep(0);
        } catch (InterruptedException e) {
            // 에러 발생하면 어디서 에러가 났는지 출력해줘 ~
            e.printStackTrace();
        }
        this.setMoney(m + plus);
    }
    public void minusMoney(int minus) {    //돈을 빼는 스레드를 만듬
        int m = this.getMoney();

        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMoney(m - minus);
    }
}

class FirstThread extends Thread {  //스레드를 만듬
    public void run () {
        for (int i = 0; i < 10; i++) {
            BankBombEventTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) = " + BankBombEventTest.myBank.getMoney());
        }
    }
}

class SecondThread extends Thread {
    public void run () {
        for (int i = 0; i < 10; i++) {
            BankBombEventTest.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) = " + BankBombEventTest.myBank.getMoney());
        }
    }
}

public class BankBombEventTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금: " + myBank.getMoney());  //데이터의 무결성이 꺠졌다!  전역변수money를 두 스레드가 번갈아 마구잡이로 사용함

        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();

        first.start();   //스레드는 스타트를 해줘야 시작한다!
        second.start();
    }
}