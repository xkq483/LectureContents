class TestDice2 {
    int comDice;
    int userDice;

    TestDice2() {//생성자를 만든다.
        comDice = getRandomDice();//각각 getRandomdice를 대입하여
        userDice = getRandomDice();// 간결하게 보일 수 있게함.
    }
                          //getRandomDice는 1~6 랜덤숫자 선언.
    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }
    void checkWinner(){// 이부분에 void가 무슨뜻인지 잘 모르겠습니다.
        switch (whoWin()){//승패 판별을 위한 스위치문.
            case 1:
                System.out.printf("폐관수련입니다. %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;//지는 경우
            case 2:
                System.out.printf("사용자가 이겼습니다. %d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;//이기는 경우
            case 3:
                System.out.printf("비겼으니 형은 면하였습니다.%d(컴퓨터) vs %d(사용자)\n",comDice,userDice);
                break;//비기는 경우
        }
    }

    int whoWin(){//int whoWin으로 스위치문 안으로 들어갈 수 있는것 같다.
        if(comDice > userDice){
            return 1; //com이 이길경우 1번으로 가라
        }else if (comDice < userDice){
            return 2; // user가 이길경우 2번으로 가라
        }else{
            return 3;// else 3번으로 가라
        }
    }
}

public class Prob35 {
    public static void main(String[] args) {
        TestDice2 td = new TestDice2();
              //td 생성자 호출
        td.checkWinner();
    }
}
