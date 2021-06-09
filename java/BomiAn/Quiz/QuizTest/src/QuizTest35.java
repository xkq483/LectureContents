class TestDice2 {
    int comDice;
    int userDice;

    TestDice2() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice () {
        return (int)(Math.random() * 6 + 1);
    }
    void checkWinner () {
        switch (whoWin()) {
            case 1 :
                System.out.printf("폐관수련입니다. (사용자) %d점 vs (컴퓨터) %d점\n", userDice, comDice);
                break;
            case 2 :
                System.out.printf("사용자가 이겼습니다. (사용자) %d점 vs (컴퓨터) %d점\n", userDice, comDice);
                break;
            case 3 :
                System.out.printf("비겼으니 형은 면합니다. (사용자) %d점 vs (컴퓨터) %d점\n", userDice, comDice);
                break;
        }
    }

    int whoWin() {

        if (comDice > userDice) {
            return 1;
        } else if(comDice < userDice) {
            return 2;
        } else {
            System.out.println("무승부 입니다. ");
            return 3;
        }
    }


}

public class QuizTest35 {
    public static void main(String[] args) {
        //현재 무승부에 대한 판정도 폐관수련이라는 징벌을 면할 수가 없다.
        // 무승부에 대해서는 봐줘야 한다는 문파내 제자들의 청원이 많다.
        //이에 대한 청원을 들어줄 수 있도록 프로그램 코드를 변경해보자!

        TestDice2 td = new TestDice2();

        td.checkWinner();


    }
}
