class TestDice {
    int com;
    int user;

    TestDice() {
        com = getRandomDice();
        user = getRandomDice();
    }

    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }
    Boolean userWin() {
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", com, user);

        if (com > user) {
            return false;
        } else if (com < user) {
            return true;
        } else {
            System.out.println("무승부 입니다.");
            return true;
        }
    }



}

public class Quiz_34 {
    public static void main(String[] args) {

        TestDice td = new TestDice();

        if (td.userWin()) {
            System.out.println("사용자가 승리하였습니다");
        } else {
            System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다!!!!");
        }
    }
}
