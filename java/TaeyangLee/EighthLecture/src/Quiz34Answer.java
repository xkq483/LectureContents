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
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice, userDice);

        if (comDice > userDice) {
            return false;
        } else if (comDice < userDice) {
            return true;
        } else {
            System.out.println("무승부입니다.");
            return false;
        }
    }
}

public class Quiz34Answer {
    public static void main(String[] args) {
        TestDice td = new TestDice();

        if (td.userWin()) {
            System.out.println("사용자가 승리하였습니다.");
        } else {
            System.out.println("이걸 지네");
        }
    }



}
