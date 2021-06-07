class TestDice {
    //질문 사항 없습니다.
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


public class Prob3507 {
    public static void main(String[] args) {

        TestDice td = new TestDice();// 자 객체를 읽으면 ,  TestDice메소드가 실행하게됨
        // TestDice 에서 나온 난수 comDice 3 과 userDice 4가 나왔다고 하자.
        // 그리고 if문으로 갈것이다. td.userwin 이 참이라면, sout의 "사용자가 승라하였습니다가 출력될것이다."
        // td.userwin이 거짓이라면, "컴퓨터도 못이겼다 폐관수련이 답이다."  가 뜰것이다.
        // 여기서, 문제가 생긴다, boolean 으로 참 과 거짓 . 승과패 밖에 결정짓지못하여
        // 무승부 를 띄우지못한다.


        if (td.userWin()) {
            System.out.println("사용자가 승리하였습니다.");
        } else {
            System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다.");

        }
    }
}
