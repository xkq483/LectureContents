class Bank {
    // 만 단위로 10억임
    private int money = 100000;
    // money = Critical Section
    // 원래라면 1000씩 플러스 마이너스 되어 100000가 유지되어야 하지만
    // 데이터 무결성이 깨져 매번 다른 결과값이 나옴

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
            // 에러 발생하면 어디서 에러가 났는지 출력
            e.printStackTrace();
        }
        this.setMoney(m + plus); // -> 값을 실제로 더하는 여기에 쉴드를 쳐야 함
        // * Critical Section에 접근하는 스레드에 쉴드를 쳐주는 것 *
        // * 쉴드 = lock *
    }
    public void minusMoney(int minus) {
        int m = this.getMoney();

        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setMoney(m - minus); // -> 값을 실제로 빼는 여기에 쉴드를 쳐야 함
    }
}

class FirstThread extends Thread {
    public void run () {
        for (int i = 0; i < 1000; i++) {
            Review0604BankTest.myBank.plusMoney(1000);
            System.out.println("plusMoney(1000) = " + Review0604BankTest.myBank.getMoney());
        }
    }
}

class SecondThread extends Thread {
    public void run () {
        for (int i = 0; i < 1000; i++) {
            Review0604BankTest.myBank.minusMoney(1000);
            System.out.println("minusMoney(1000) = " + Review0604BankTest.myBank.getMoney());
        }
    }
}

public class Review0604BankTest {
    public static Bank myBank = new Bank();
    // Bank를 전역으로 공유해서 myBank를 사용

    public static void main(String[] args) {
        System.out.println("원금: " + myBank.getMoney());

        FirstThread first = new FirstThread();
        SecondThread second = new SecondThread();

        first.start();
        second.start();
    }
}




















