//주사위 굴리기 문제를 ACL을 적용하여 풀어보자

class DiceGame{
    private  int comDice;
    private  int userDice;

    public DiceGame()
    {
        comDice= getRandDice();
        userDice= getRandDice();
    }
    private int getRandDice()
    {
        return (int)(Math.random()*6+1);
    }

    public void checkWinner()
    {
        if(comDice < userDice)
        {
            System.out.printf("컴퓨터( %d )  vs  사용자( %d )  : 사용자 승!",comDice,userDice);
        }
        else if (comDice > userDice)
        {
            System.out.printf("컴퓨터( %d )  vs  사용자( %d )  : 컴퓨터 승!",comDice,userDice);
        }
        else
        {
            System.out.printf("컴퓨터( %d )  vs  사용자( %d )  : 무승부!",comDice,userDice);

        }
    }

}

public class Quiz39 {
    public static void main(String[] args) {

     DiceGame dg= new DiceGame();

     dg.checkWinner();
    }
}
