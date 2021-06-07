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

public class Prob34 {
    public static void main(String[] args) {
        // 우리가 이전에 Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
        // 이 주사위 게임을 class 방식으로 다시 만들어보자!
        // 컴퓨터도 주사위를 굴리고 사용자도 주사위를 굴려서 누가 더 큰 숫자를 얻었는지 확인해보자!
        TestDice td = new TestDice();

        if (td.userWin()) {
            System.out.println("사용자가 승리하였습니다.");
        } else {
            System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다.");
        }
    }
}