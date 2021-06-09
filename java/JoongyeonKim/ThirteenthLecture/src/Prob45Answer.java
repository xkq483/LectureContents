/*
아주 특수한 카지노에 왔다.
현재 내 수중엔 1000만원이 있다.
카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
상대방이 파산하면 이기는 게임이다.
주사위 2개를 사용하는 게임이다.
숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
숫자 4가 나오면 내 주사위 값이 0이 된다.
숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
(2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!
컴퓨터 돈, 내 돈, 판돈, 뽕빨 났는지 여부, 키보드 입력, 주사위 2개 사용
첫번째 주사위가 짝수가 아니면 두번째 주사위 사용 불가
두번째 주사위는 특수 스킬이 존재함
승패 판정은 두 개의 주사위 값의 합산으로 판정
 */

import java.util.Scanner;

class DiceDeathGame { //우선 객체에 사용할 변수들을 입력한다
    final int MAX_DICE = 2;  //인덱스[1],[2]는 첫 번째와 두 번째 주사위이고
    final int DICE_IDX = MAX_DICE + 1;  //인덱스 [2]가 합산 주사위이다
    final int START_MONEY = 1000;

    final int FIRST_IDX = 0; //첫번째 인덱스
    final int SECOND_IDX = 1; //두번째 인덱스
    final int TOTAL_IDX = 2; //세번째 인덱스

    final int DICE_RANGE = 6;
    final int DICE_START_OFFSET = 1;

    int comMoney;
    int usrMoney;
    int betMoney;

    int roundNum;

    Boolean isAlive;
    Scanner scan;

    int[] comDice;
    int[] usrDice;

    public DiceDeathGame () {  // 생성자는 변수의 값을 초기화해준다
        roundNum = 0;

        comDice = new int[DICE_IDX];
        usrDice = new int[DICE_IDX];

        isAlive = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY;
        usrMoney = START_MONEY;
    }
    private void bettingMoney () {    //판돈을 키보드로 입력하는 메소드이다
        System.out.printf("현재 %d 라운드입니다.\n", ++roundNum);
        System.out.printf("이게임을 시작한 당신 오늘 둘중 하나는 인생 로그아웃합니다.\n" +
                "돈이 부족하면 손모가지나 장기로 대체 가능합니다.\n" +
                "판돈을 입력하시오: ");
        betMoney = scan.nextInt();  //betMoney를 키보드 입력으로 설정
    }
    public void gameStart () {   //모든 메소드들을  중재한다(이렇게 해놓으면 메인에서 이 메소드만 호출하면 끝난다)
        do {                    // 아래에 있는 메소드들은 순서대로 나열해야 한다 순서대로 하지않으면 사소한 불량이 발생한다(게임이 제때 안끝난다던가)
            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetBetMoney();
            canWePlay();
            checkEachMoney();
        } while (isAlive); // canWePlay메소드에서 false가 나오지 않으면 계속 게임이 실행된다
    }
    private void checkEachMoney () {  //양쪽의 남은 돈을 확인
        System.out.printf("사용자 수중 금전: %d, 컴퓨터 수중 금전: %d\n", usrMoney, comMoney);
    }
    private void canWePlay () {  //게임진행 여부를 확인
        if (usrMoney <= 0 || comMoney <= 0) {  //둘중 하나라도 0이 나오면 게임(반복)을 중단한다.
            isAlive = false;
        }
    }
    private void whoGetBetMoney () {  //각 판의 결과를 출력하고 돈 계산을 하는 메소드
        int usrTotDice = usrDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];

        if (usrTotDice > comTotDice) {
            System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney += betMoney;
            comMoney -= betMoney;
        } else if (usrTotDice < comTotDice) {
            System.out.printf("이번판은 컴퓨터가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
            usrMoney -= betMoney;
            comMoney += betMoney;
        } else {
            System.out.printf("승부가 나지 않았습니다! %d(사용자) vs %d(컴퓨터)\n",
                    usrTotDice, comTotDice);
        }
    }
    private void checkSkill (int[] curDice, int[] targetDice) {  //사용자와 타겟으로 변수를 지정하고 checkMagicDiceSkill메소드에서 변수를 지정해준다
        switch (curDice[SECOND_IDX]) {                           //FIRST_IDX,SECOND_IDX,TOTAL_IDX 배열을 만들어서 그 안에 결과값을 넣을 수 있게 만들었다
            case 1:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + 3;
                break;
            case 3:
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] - 2;
                break;
            case 4:
                curDice[TOTAL_IDX] = 0;
                break;
            case 6:
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX] + curDice[SECOND_IDX]) * 2;
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX] + targetDice[SECOND_IDX]) * 2;
                break;
            default:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX] + curDice[SECOND_IDX];
                break;
        }
    }
    private void checkMagicDiceSkill () {  //checkSkill메소드에 변수값을 입력한다 (변수의 위치만 바꿔서 메소드를 효과적으로 사용한다)
        // 사용자 관점에서의 2번째 주사위 스킬 발동
        checkSkill(usrDice, comDice);
        // 컴퓨터 관점에서의 2번째 주사위 스킬 발동
        checkSkill(comDice, usrDice);
    }
    private void runSecondDice (int[] dice) {  //첫 번째 주사위가 짝수라면 두 번째 주사위를 굴리는 메소드다
        if (dice[FIRST_IDX] % 2 == 0) {
            dice[SECOND_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);  // 6과 1을 파이널 변수로 지정해서 Math.random에 사용할 수 있게하였다
        }
    }
    private void runFirstDice (int[] dice) { //첫 번째 주사위를 굴리는 메소드다
        dice[FIRST_IDX] = getRandomValue(DICE_RANGE, DICE_START_OFFSET);
    }
    private void runDice () {  //위에 있는 runFirstDice, runSecondDice 메소드의 결과를  (usrDice)(comDice)에 대입한다
        //usrDice[0] = getRandomValue(6, 1);
        //comDice[0] = getRandomValue(6, 1);
        runFirstDice(usrDice);
        runFirstDice(comDice);

        /*
        if (usrDice[0] % 2 == 0) {
            usrDice[1] = getRandomValue(6, 1);
        }
        if (comDice[0] % 2 == 0) {
            comDice[1] = getRandomValue(6, 1);
        }
         */
        runSecondDice(usrDice);
        runSecondDice(comDice);
    }
    public int getRandomValue (int range, int startOffset) { //주사위를 굴리는 메소드 (숫자를 변수로 지정하여 나중에 더 편하게 할 수 있게 만들었다)
        return (int)(Math.random() * range + startOffset);
    }
}

public class Prob45Answer {
    public static void main(String[] args) {
        DiceDeathGame ddg = new DiceDeathGame();

        ddg.gameStart();
    }
}