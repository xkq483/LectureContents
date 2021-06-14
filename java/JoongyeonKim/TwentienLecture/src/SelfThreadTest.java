class Bank1{

    private int money = 100000;

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

        try{
            Thread.sleep(0);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m-minus);
    }
}

class FirstThread1 extends  Thread{
    public void run(){
        for (int i=0; i<1000; i++){
            SelfThreadTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) =" + BankBombEventTest.myBank.getMoney());
        }
    }
}

class SecondThread2 extends Thread{
    public void run(){
        for (int i=0; i<1000; i++) {
            SelfThreadTest.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) =" + BankBombEventTest.myBank.getMoney());
        }
    }
}

public class SelfThreadTest {
    public static Bank1 myBank = new Bank1();
    public static void main(String[] args) {
        System.out.println("원금 :" + myBank.getMoney());

        FirstThread1 first = new FirstThread1();
        SecondThread2 second = new SecondThread2();

        first.start();
        second.start();

    }
}
