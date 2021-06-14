class TestDice2 {
    int comDice;
    int userDice;

    TestDice2() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice() {
        return (int)(Math.random() * 6 + 1);
    }
    void checkWinner() {
        switch(whoWin()){
            case 1 :
                System.out.printf("이걸 지다니 ! %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;
            case 2 :
                System.out.printf("사용자가 이겼습니다 ! %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;
            case 3 :
                System.out.printf("이걸 비겼네,, %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;
        }
    }
    int whoWin() {


        if (comDice > userDice) {
            return 1;
        } else if (comDice < userDice) {
            return 2;
        } else {
            return 3;
        }
    }
}


public class QuizNum35 {
    public static void main(String[] args) {
        TestDice2 td2 = new TestDice2();

    td2.checkWinner();

}
}
