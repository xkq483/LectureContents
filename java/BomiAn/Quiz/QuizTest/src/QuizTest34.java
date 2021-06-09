class TestDice {
    int comDice;
    int userDice;

    TestDice() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice () {
        return (int)(Math.random() * 6 + 1);
    }

    Boolean userWin() {
        System.out.printf("(사용자) %d점 vs (컴퓨터) %d점\n", userDice, comDice);

        if (comDice > userDice) {
            return false;
        } else if(comDice < userDice) {
            return true;
        } else {
            System.out.println("무승부 입니다. ");
            return false;
        }
    }
}

public class QuizTest34 {
    public static void main(String[] args) {
        //우리가 이전에 Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
//이 주사위 게임을 class 방식으로 다시 만들어보자!
//컴퓨터도 주사위를 굴리고 사용자도 주사위를 굴려서 누가 더 큰 숫자를 얻었는지 확인해보자!
//(필요에 따라 커스텀 매서드를 만들어 사용하는것도 좋다)

        TestDice td = new TestDice();

        if (td.userWin()) {
            System.out.println("시용자가 승리하였습니다. ");
        } else {
            System.out.println("컴퓨터도 못이겼다 폐관수련이 답이다. ");
        }
    }
}
