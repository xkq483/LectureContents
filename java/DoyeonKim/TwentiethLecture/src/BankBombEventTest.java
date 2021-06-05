class Bank {
    //만 단위로 10억임
    private int money = 10000;//임계영역이 됨 한스레드만 접근할 수 있도록 해야함,
    // 쉴드 필요

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus) {
        int m = this.getMoney();
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
            ;
        }
        this.setMoney(m + plus);
    }

    public void minusmoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMoney(m - minus); //여기에 쉴드를 치면 됨(락),접근을 못하게 접근하는 곳에 쉴드를 치는 개념
    }//뮤텍스랑 세마포어는 노크도 안하고 다른데 감
    //동기화가 모든 해결방안은 아니다 있음에도 무결성이 깨짐
}

class FirstThred extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            BankBombEventTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) = " + BankBombEventTest.myBank.getMoney());

        }
    }
}

class SecondThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            BankBombEventTest.myBank.minusmoney(1000);
            System.out.println("minusMOney(1000) = " + BankBombEventTest.myBank.getMoney());

        }
    }
}
public class BankBombEventTest {
    public  static Bank myBank = new Bank();//이코드를 쓴 목적.myBank를 전역으로 공유하려고 static안붙으면 전역으로 공유가 안됨

    public static void main(String[] args) {
        System.out.println("원금: " + myBank.getMoney());

        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();

        first.start();
        second.start();
//데이터 무결성이 깨짐

    }
}


