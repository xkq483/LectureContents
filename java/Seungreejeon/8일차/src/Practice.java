import java.time.Year;
import java.util.Scanner;

class Dice {
    int comDice;
    int userDice;


    int getRandomDice() {
        return (int) (Math.random() * 6 + 1);
    }

    Dice() {
        comDice = getRandomDice();
        userDice = getRandomDice();
    }

    char WhoWin() {
        if (comDice == userDice) {
            return 'a';
        } else if (userDice > comDice) {
            return 'b';
        } else {
            return 'c';
        }

    }

    Scanner sc = new Scanner(System.in);
    Boolean isTrue = true;

    void repeat() {
        while(isTrue){
            System.out.println("주사위게임");
        checkWinner();
            System.out.println("더하시겠습니까? Y/N");
            char more = sc.nextLine().charAt(0);

            if (more == 'y' || more == 'Y') {
                System.out.println("이어서 합니다");
                Boolean isTrue = true;
                comDice = getRandomDice();
                userDice = getRandomDice();

            } else if(more == 'n' || more == 'N'){
                System.out.println("종료합니다");
                Boolean isTrue = false;
                break;
            } else{
                System.out.println("종료합니다");
                Boolean isTrue = false;
                break;
            }
        }
    }

    void checkWinner() {
        switch (WhoWin()) {
            case 'a':
                System.out.printf("무승부 \n 님 숫자 : %d\n 컴퓨터 숫자 : %d\n", userDice,comDice);
                break;
            case 'b':
                System.out.printf("이겼습니다\n 님 숫자 : %d\n 컴퓨터 숫자 : %d\n", userDice,comDice);
                break;
            case 'c':
                System.out.printf("졌습니다\n 님 숫자 : %d\n 컴퓨터 숫자 : %d\n", userDice,comDice);
                break;
        }
    }


}

public class Practice {
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.repeat();
    }
}
