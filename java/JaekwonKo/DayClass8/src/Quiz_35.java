class TestDice1 {
    int com;
    int user;

    TestDice1() {
        com = getRandomDice();
        user = getRandomDice();
    }

    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }

    void  checkWinner() {
        switch (whoWin()) {
            case 1:
                System.out.printf("폐관수련입니다. %d(컴퓨터) vs %d(사용자)\n", com, user);
                break;
            case 2:
                System.out.printf("사용자가 승리하였습니다. %d(컴퓨터) vs %d(사용자)\n", com, user);
                break;
            case 3:
                System.out.printf("무승부입니다. %d(컴퓨터) vs %d(사용자)\n", com, user);
                break;


        }

    }
    int whoWin() {

        if (com > user) {
            return 1;
        } else if (com < user) {
            return 2;
        } else {
            return 3;
        }
    }



}

public class Quiz_35 {
    public static void main(String[] args) {

        TestDice1 td = new TestDice1();

        td.checkWinner();
    }
}

