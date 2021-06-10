class TestDice2 {
    int comDice;
    int userDice;

    TestDice2(){     // 생성자에선 랜덤값을 셋팅
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice(){
        return (int)(Math.random()* 6 +1);
    }
    // 리턴이 없어서 void(Setter도 리턴이 없어서 void)
    void checkWinner(){
        switch (whoWin()){
            case 1:
                System.out.printf("폐관수련입니다 %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;
            case 2:
                System.out.printf("사용자가 이겼습니다%d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;
            case 3 :
                System.out.printf("비겼으니 형은 먼하였습니다 %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;
        }
    }
    int whoWin(){

        if (comDice > userDice){
            return 1;
        } else if (comDice < userDice){
            return 2;
        }else {
            return 3;

        }
    }
}

public class Prob35 {
    public static void main(String[] args) {
        // 생성자호출
        TestDice2 td = new TestDice2() ;
        td.checkWinner();

        }
    }

