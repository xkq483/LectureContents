class TestDice {//class방식으로 주사위게임 만들기
    int comDice;
    int userDice;

    TestDice() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }

    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }
    // getRandomDice 생성자를 만들어서 1~6까지 랜덤숫자를 선언한다.
    // 그리고 comdice와 userdice에 getrandomdice를 대입하여 코드를 줄일 수 있다.
    Boolean userWin() {//유저가 이길경우 돌아가는 불린
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice,userDice);

        if (comDice > userDice) {//컴퓨터가 이길경우 거짓
            return false;
        } else if (comDice < userDice) {
            return true;//유저가 이길경우 참
        } else {
            System.out.println("무승부입니다.");
            return false; //무승부일 경우도 거짓
        }
    }
}

public class Prob34 {
    public static void main(String[] args) {
        TestDice td = new TestDice();
        //td new를 하면 무언가를 추가할 수 있다??
        if (td.userWin()) {//td.에 userWin 불린을 불러서
            System.out.println("사용자가 승리하였습니다.");
        } else {//참일경우
            System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다.");
        } //거짓일경우 각각 출력되는것 같다.
    }
}
