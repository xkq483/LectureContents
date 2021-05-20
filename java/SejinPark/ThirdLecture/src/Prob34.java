class TestDice {                         //TestDice클래스
    int comDice;                         //클래스안의 변수들
    int userDice;

    TestDice() {                         //클래스안의 생성자(생성자와 클래스의 이름은 동일)
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice() {                //클래스안의 1번쨰 메소드(1~6까지 랜덤한 정수를 얻음)
        return (int)(Math.random() * 6 + 1);
    }
    Boolean userWin() {                  //클래스안의 2번째매소드(true,false를 이용해 승자를 가림)
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
    public static void main(String[] args) {             //실제 프로그램 시작!!
        TestDice td = new TestDice();                    //TestDice 클래스의 객체td를 생성

        if (td.userWin()) {                              //TestDice클래스 내부의 userWin()메소드를 사용
            System.out.println("사용자가 승리하였습니다.");
        } else {
            System.out.println("컴퓨터도 못이겼다. 폐관수련이 답이다.");
        }
    }
}