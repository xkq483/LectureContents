class TestDice {
    int comDice;
    int userDice;

    TestDice(){     // 생성자에선 랜덤값을 셋팅
        comDice = getRandomDice();
        userDice = getRandomDice();
    }
    int getRandomDice(){
        return (int)(Math.random()* 6 +1);
    }
    Boolean userWin(){
        System.out.printf("%d(컴퓨터) vs %d(사용자)",comDice,userDice);
        if (comDice > userDice){
            return false;
        } else if (comDice < userDice){
            return true;
        }else {
            return false;


        }
    }


}

public class Prob34Teacher {
    public static void main(String[] args) {

        // 생성자호출
        TestDice td = new TestDice() ;

        // 사용자가 이겻는지 체크
        if (td.userWin()){
            System.out.println("사용자가 승리 하였습니다.");
        }else {
            System.out.println("컴퓨터가 이겼습니다.");
        }
    }
}
