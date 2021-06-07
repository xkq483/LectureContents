import java.util.Scanner;

class Dicegame {

    int num;
    private int comDice, userDice;
    Boolean isTrue;

    Dicegame() {
        System.out.println("주사위게임 시작");
        loadDice();
    }

    void loadDice() {
        comDice = RandomNum();
        userDice = RandomNum();
    }

    void CheckReader() {
            if (comDice > userDice) {
                System.out.printf("컴퓨터가 이겼다 %d Vs %d ", comDice, userDice);
            } else if (comDice > userDice) {
                System.out.printf("유저가 이겼다. %d Vs %d ", comDice, userDice);
            } else {
                System.out.printf("무승부입니다. %d Vs %d ", comDice, userDice);
        }

    }

    void Regame() {
        while (true) {
            System.out.println("더하시겠습니까? (Y/N) :");
            Scanner sc = new Scanner(System.in);
            char Ans = sc.nextLine().charAt(0);
            if (Ans == 'Y' || Ans == 'y') {
                loadDice();
                CheckReader();
            } else if (Ans == 'N' || Ans == 'n') {
                return;
            } else {
                System.out.println("정확한 값을 입력해주세요 ");
                continue;
            }

        }
    }
    int RandomNum() {
        return (int) (Math.random() * 6 + 1);
    }

}


public class DicePrint {
    public static void main(String[] args) {
        Dicegame dg = new Dicegame();

        dg.CheckReader();
        dg.Regame();
    }
}
