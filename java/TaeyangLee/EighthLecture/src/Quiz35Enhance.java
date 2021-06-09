import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

class TestDice3 {
    int comDice;
    int userDice;

    Scanner scan;

    TestDice3() {
        comDice = getRandomDice();
        userDice = getRandomDice();

        scan = new Scanner(System.in);
    }

    int getRandomDice() {
        return (int)(Math.random() * 6 + 1);
    }

    void checkWinner() {
        switch (whoWin()) {
            case 1:
                System.out.printf("폐관수련입니다. %d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
                break;
            case 2:
                System.out.printf("사용자가 이겼습니다. %d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
                break;
            case 3:
                System.out.printf("비겼으니 형은 면하였습니다. %d(컴퓨터) vs %d(사용자)\n", comDice, userDice);
                break;
        }
    }

    int whoWin() {
        if (comDice > userDice) {
            return 1;
        } else if (comDice < userDice) {
            return 2;
        } else {
            return 3;
        }
    }

    Boolean redoDiceGame() {
        System.out.print("게임을 계속 하시겠습니까 ? 0(아니오), 1(예) ");

        int num = scan.nextInt();

        Boolean isTrue = false;

        switch (num) {
            case 0:
                isTrue = false;
                break;
            case 1:
                // 게임을 다시 재개하므로 주사위값을 새롭게 설정할 필요가 있다.
                comDice = getRandomDice();
                userDice = getRandomDice();
                isTrue = true;
                break;
        }

        return isTrue;
    }
}


public class Quiz35Enhance {
    public static void main(String[] args) {
        TestDice3 td = new TestDice3();
        //두와일
        //처음은 실행하고 이후엔 조건을 따라반복

        do{
            td.checkWinner();
        }while(td.redoDiceGame());
        //주사위를 다시 굴려서 셋팅
        //다시 진행할지 여부는 어떻게 설정할 것인가?
    }
}
