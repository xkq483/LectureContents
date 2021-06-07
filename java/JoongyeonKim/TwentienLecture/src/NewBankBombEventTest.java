class NewBank {
    private int money = 10000;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus){
        int m = this.getMoney();

        try{
            Thread.sleep(0);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m+plus);
    }
    public void minusMoney(int minus){
        int m = this.getMoney();

        try {
            Thread.sleep(0);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m-minus);
    }
}

class NewFirstThread extends Thread{
    public void run(){
        for (int i = 0; i<1000; i++){
            BankBombEventTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) =" + BankBombEventTest.myBank.getMoney());
        }
    }
}

class NewSecondThread extends Thread{
    public void run(){
        for(int i=0; i<1000; i++){
            BankBombEventTest.myBank.plusMoney(1000);
            System.out.println("minusMoney(1000) =" + BankBombEventTest.myBank.getMoney());
        }
    }
}

public class NewBankBombEventTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금 :" + myBank.getMoney());

        NewFirstThread first = new NewFirstThread();
        NewSecondThread second = new NewSecondThread();

        first.start();
        second.start();
    }
}
