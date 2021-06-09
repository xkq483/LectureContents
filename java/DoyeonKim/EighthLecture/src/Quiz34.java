import java.util.Scanner;

class TestDice {
    int comDice;
    int userDice;

    TestDice() {
        comDice = getRandomDice();
        userDice = getRandomDice(); //아래 주사위 돌리는 넣어줌
    }

    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    } //주사위 돌리기 초기화해준다

    Boolean userWin() {
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice, userDice);

        if (comDice > userDice) {
            return false;
        } else if (comDice < userDice) {
            return true;
        } else {
            System.out.println("무승부입니다");
            return false;
        }
    }
}




    public class Quiz34 {
        public static void main(String[] args) {

            TestDice td = new TestDice(); //테스트다이스를 불러오고

            if (td.userWin()) { //테스트다이스의 유저윈을 불러와줌
                System.out.println("사용자가 승리하였습니다.");
            } else {
                System.out.println("컴퓨터가 승리하였습니다.");
            }

        }
    }

