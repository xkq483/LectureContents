class Bank {
    //만 단위로 10억임
    private int money = 100000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus) {
        int m = this.getMoney();

        //Thread.sleep(300); 딜레이

        this.setMoney(m + plus);
    }

    public void minusMoney(int minus) {
        int m = getMoney();
        // Thread.sleep(1000);

        this.setMoney(m - minus);
    }
}

class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            BankBombEventTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) =  " + BankBombEventTest.myBank.getMoney());

        }

    }
}

class SecondTread extends Thread {
    public void run () {
        for (int i = 0; i < 1000; i++) {
            BankBombEventTest.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) =  " + BankBombEventTest.myBank.getMoney());

        }
    }
}

public class BankBombEventTest {
    public static Bank myBank = new Bank();
    public static void main(String[] args) {

        FirstThread fr = new FirstThread();
        SecondTread sd = new SecondTread();

        fr.start();
        sd.start();


    }
}




