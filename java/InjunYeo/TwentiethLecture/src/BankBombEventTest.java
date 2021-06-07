class Bank{
    //억단위
    private int money = 10;

    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public void plusMoney(int plus){
        int m = this.getMoney();
        try {
            Thread.sleep(0);
        }catch(InterruptedException e){
            //에러발생시 어디서 에러났는지 출력
            e.printStackTrace();
        }

        this.setMoney(m+plus);
    }

    public void minusMoney(int minus){
        int m = this.getMoney();

        try {
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.setMoney(m-minus);
    }

}

//native는 씨언어 호출하는거
class FirstThread extends Thread{
    public void run(){
        for(int i =0;i<1000;i++){
            BankBombEventTest.myBank.plusMoney(2);
            System.out.println("plustMoney : "+BankBombEventTest.myBank.getMoney());
        }

    }

}

class SecondThread extends Thread{
    public void run(){
        for(int i =0;i<1000;i++){
            BankBombEventTest.myBank.minusMoney(2);
            System.out.println("minusMoney : "+BankBombEventTest.myBank.getMoney());
        }

    }
}

public class BankBombEventTest {
    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금 : "+myBank.getMoney());

        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();

        first.start();
        second.start();


    }
}
