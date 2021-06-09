class TestDice {
    int comDice;
    int userDice;

    TestDice() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice() {
        return (int)(Math.random() * 6 + 1);
    }

    Boolean userWin() {
        System.out.println(comDice + "vs" + userDice);
        if (comDice > userDice) {
            return false;
        } else if (comDice < userDice) {
            return true;
        } else {
            System.out.println("무승부.");
            return false;
        }
    }
}
public class _3rd_Quiz34_Solution {
    public static void main(String[] args) {

        TestDice td = new TestDice();

        if (td.userWin()) {
            System.out.println("사용자 승.");
        } else {
            System.out.println("컴퓨터 승.");
        }
    }
}
