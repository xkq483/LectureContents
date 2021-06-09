class Bank {
    // 만 단위로 10억임
    private  int money = 100000;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney (int plus) {
        int m = this.getMoney();

        try{
            Thread.sleep(0);
        }catch (InterruptedException e) {
            // 에러가 발생하면 어디서 에러가 났는지 출력해줘~
            e.printStackTrace();
        }
        this.setMoney(m + plus);
    }

    public void minusMoney(int minus) {
        int m = this.getMoney();

        try{
            Thread.sleep(0);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMoney(m - minus);
    }
}

class FirstThread extends Thread {
    public void run () {
        for (int i = 0; i < 1000; i++) {
            BankBombEventTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) = " + BankBombEventTest.myBank.getMoney());
        }
    }
}

class SecondTread extends Thread {
    public void run () {
        for (int i = 0; i < 1000; i++) {
            BankBombEventTest.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) = " + BankBombEventTest.myBank.getMoney());
        }
    }
}

public class BankBombEventTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금:" + myBank.getMoney());

        FirstThread first = new FirstThread();
        SecondTread second = new SecondTread();

        first.start();
        second.start();

    }
}
