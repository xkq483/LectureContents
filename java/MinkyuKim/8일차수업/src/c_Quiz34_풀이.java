class TestDice {
    int comDice;
    int userDice;

    TestDice() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice() {
        return (int) (Math.random()*6+1);
    }
    Boolean userWin() {
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
        if(comDice > userDice) {
            return false;
        } else if(comDice < userDice) {
            return true;
        } else {
            return false;
        }

    }

}
public class c_Quiz34_풀이 {
    public static void main(String[] args) {
        TestDice td = new TestDice();

        if(td.userWin()) {
            System.out.println("사용자가 승리하였습니다.");
        } else if(td.userDice < td.comDice) {
            System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다.");
        } else {
            System.out.println("무승부이므로 봐주겠다.");
        }

    }
}
