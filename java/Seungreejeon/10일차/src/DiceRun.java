class Dice {
    int comDice;
    int UserDice;

    Dice() {
        System.out.println("주사위게임");
        comDice = randomNum();
        UserDice = randomNum();
    }

    int randomNum() {
        return (int) (Math.random()*6+1);
    }

    public void checkReader() {
        if (comDice > UserDice) {
            System.out.printf("컴퓨터가 이겼다.%d vs %d",comDice,UserDice);
        } else if (comDice < UserDice) {
            System.out.printf("컴퓨터가 졌따.%d vs %d",comDice,UserDice);
        } else {
            System.out.printf("무승부 %d Vs %d ", comDice, UserDice);
        }
    }
}

public class DiceRun {
    public static void main(String[] args) {
        Dice dc = new Dice();
        dc.checkReader();
    }
}
