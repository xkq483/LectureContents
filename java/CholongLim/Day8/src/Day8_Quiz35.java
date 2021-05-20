class Dice3 {
    int comDice;
    int userDice;

    Dice3() {
        comDice = getRandomDice();
        userDice  = getRandomDice();
    }
    int getRandomDice() {
        return (int)(Math.random() * 6 + 1);
    }
}

public class Day8_Quiz35 {
    public static void main(String[] args) {

        Dice3 dg = new Dice3();

        if(dg.comDice > dg.userDice) {
            System.out.printf("%d(컴퓨터) vs %d(사용자)\n",dg.comDice, dg.userDice);
            System.out.println("컴퓨터의 승리입니다.");
        } else if(dg.comDice < dg.userDice) {
            System.out.printf("%d(컴퓨터) vs %d(사용자)\n",dg.comDice, dg.userDice);
            System.out.println("사용자의 승리입니다.");
        } else {
            System.out.printf("%d(컴퓨터) vs %d(사용자)\n",dg.comDice, dg.userDice);
            System.out.println("무승부입니다.");
        }
    }
}

