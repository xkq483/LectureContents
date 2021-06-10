class Dice{
    int comDice;
    int userDice;

    Dice() {

        comDice = getRandomDice();
        userDice = getRandomDice();
    }

    int getRandomDice(){
        return (int)(Math.random()*6+1);
    }

    Boolean userWin(){
        System.out.printf("%d(컴퓨터) vs %d(사용자)\n", comDice,userDice);

        if(comDice> userDice){
            return false;
        }
        else if (comDice < userDice){
            return true;
        }
        else{
            System.out.println("무승부입니다");
            return false;
        }
    }


}





public class TodayTest {
    /*
    Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
    이 주사위 게임을 class 방식으로 다시 만들어보자!
    (필요에 따라 커스텀 메서드를 만들어 사용하는것도 좋다)
     */
    public static void main(String[] args) {
        Dice d = new Dice();

        if(d.userWin()){
            System.out.println("사용자 승리입니다");
        }
        else{
            System.out.println("수련을 더하세요.");
        }
    }


}
