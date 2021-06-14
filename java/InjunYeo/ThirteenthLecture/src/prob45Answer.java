import java.util.Scanner;

class DiceDeathGame{
    final int MAX_PLAYER =2;
    final int DICE_IDX = MAX_PLAYER+1;
    final int START_MONEY = 1000;

    final int FIRST_IDX = 0;
    final int SECOND_IDX = 1;
    final int TOTAL_IDX =2;

    final int DICE_RANGE = 6;
    final int DICE_OFFSET =1;

    int comMoney;
    int userMoney;
    int betMoney;
    int roundNum;

    Boolean isAlive;
    Scanner scan;

    int[] comDice;
    int[] userDice;



    public DiceDeathGame(){
        roundNum =0;

        comDice = new int[DICE_IDX];
        userDice = new int[DICE_IDX];

        isAlive = true;
        scan = new Scanner(System.in);

        comMoney = START_MONEY;
        userMoney = START_MONEY;
    }

    private  void bettingMoney(){
        System.out.printf("현재 %d 라운드입니다.\n",++roundNum);
        System.out.print("판돈을 입력하시오: ");
        betMoney=scan.nextInt();
    }
    public void gameStart(){
        do{

            bettingMoney();
            runDice();
            checkMagicDiceSkill();
            whoGetBetMoney();
            canWePlay();
            checkEachMoney();

        }while(isAlive);
    }

    private void checkEachMoney(){
        System.out.printf("사용자 남은돈 : %d, 컴퓨터 남은돈 : %d\n",userMoney,comMoney);
    }
    private void canWePlay(){
        if(userMoney <= 0 || comMoney<=0) {
            isAlive = false;
        }
    }
    private void whoGetBetMoney(){
        int userTotDice = userDice[TOTAL_IDX];
        int comTotDice = comDice[TOTAL_IDX];
         if(userTotDice > comTotDice){
             System.out.printf("이번판은 사용자가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",userTotDice,comTotDice);
             userMoney += betMoney;
             comMoney -= betMoney;
         }else if(userTotDice < comTotDice){
            System.out.printf("이번판은 컴퓨터가 이겼습니다! %d(사용자) vs %d(컴퓨터)\n",userTotDice,comTotDice);
            userMoney -= betMoney;
            comMoney+= betMoney;
        }
         else{
             System.out.printf("이번판은 무승부 입니다! %d(사용자) vs %d(컴퓨터)\n",userTotDice,comTotDice);
         }

         }

    private void checkSkill(int[] curDice,int[] targetDice){
        switch(curDice[SECOND_IDX]){
            case 1:
                curDice[TOTAL_IDX] = curDice[SECOND_IDX]+3;
                break;
            case 3:
                targetDice[TOTAL_IDX] = targetDice[FIRST_IDX] -2;
                break;
            case 4:
                curDice[TOTAL_IDX] = 0;
                break;
            case 6:
                curDice[TOTAL_IDX] = (curDice[FIRST_IDX]+curDice[SECOND_IDX])*2;
                targetDice[TOTAL_IDX] = (targetDice[FIRST_IDX]+targetDice[SECOND_IDX]) *2;
                break;
            default:
                curDice[TOTAL_IDX] = curDice[FIRST_IDX]+curDice[SECOND_IDX];
                break;
        }
    }
    private void checkMagicDiceSkill(){
        checkSkill(userDice,comDice);
        checkSkill(comDice,userDice);

    }

    private void runSecondDice(int[] dice){
        if(dice[FIRST_IDX]%2 ==0){
            dice[SECOND_IDX] = getRandoValue(DICE_RANGE,DICE_OFFSET);
        }

    }
    private void runFirstDice(int[] dice){
        dice[FIRST_IDX] = getRandoValue(DICE_RANGE,DICE_OFFSET);
    }
    private void runDice(){
        runFirstDice(userDice);
        runFirstDice(comDice);

        runSecondDice(userDice);
        runSecondDice(comDice);


    }

    public int getRandoValue(int range, int startOffset){
        return (int) (Math.random()*range+startOffset);
    }

}







public class prob45Answer {
    public static void main(String[] args) {

        DiceDeathGame ddg = new DiceDeathGame();
        ddg.gameStart();

    }
}
