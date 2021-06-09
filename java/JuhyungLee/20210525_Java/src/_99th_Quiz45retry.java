import java.util.Scanner;

class DiceGameRetry {
    private int user_money = 1000;
    private int computer_money = 1000;
    Scanner scan;

    final int FIRST_DICE = 0;
    final int SECOND_DICE = 1;
    final int LAST_DICE = 2;

    public int[] user_Dice;
    public int[] com_Dice;
    public int bet_money;
    public boolean one_more_round = true;
    public int round = 1;

    public DiceGameRetry() { // 생성자
        while (one_more_round) {
            start_Game(); // 현재금액 + 배팅금액(배팅금액 오기입시 배팅금액 재설정)
            user_Dice = new int[3];
            com_Dice = new int[3];
            run_dice();
            last_dice();
            let_Me_Know_firstDice(); // 첫번째 주사위 print
            let_Me_Know_secondDice(); // 두번쨰 주사위 print
            calc_Betting_Money(); // Round승자 판단 후 betting money 계산
            gameSet(); // 파산여부 검사
        }
    }
    public void start_Game(){ // 현재금액 + 배팅금액(배팅금액 오기입시 배팅금액 재설정)
        System.out.printf("현재 user_money:%d만원\n현재 computer_money: %d만원\n", user_money, computer_money);
        System.out.print(">>>라운드를 진행하려면 배팅하시오(1~1000만원): ");
        scan = new Scanner(System.in);
        bet_money = scan.nextInt();
        while(bet_money > 1000 || bet_money <= 0){
            System.out.print(">>>범위 안의 값을 배팅하시오(1~1000만원): ");
            bet_money = scan.nextInt();
        }
    }

    public void run_dice(){
        user_Dice[LAST_DICE] = 0; // 전 게임 마지막 결과 리셋
        com_Dice[LAST_DICE] = 0;
        run_first_dice(user_Dice);
        run_first_dice(com_Dice);
        run_second_dice(user_Dice);
        run_second_dice(com_Dice);
    }

    public void run_first_dice(int[] dice){
        dice[FIRST_DICE] = getRanDice(6,1);
    }
    public void run_second_dice(int[] dice){
        if(dice[FIRST_DICE] % 2 == 0){
            dice[SECOND_DICE] = getRanDice(6,1);
        }
    }

    public void last_dice(){

        second_dice_skill(user_Dice, com_Dice);
        second_dice_skill(com_Dice, user_Dice);
    }

    public void second_dice_skill(int[] mydice, int[] opponent){
        switch (mydice[SECOND_DICE]){
            case 1:
                mydice[LAST_DICE] = mydice[FIRST_DICE] + 3;
            case 3:
                opponent[LAST_DICE] = opponent[FIRST_DICE] - 2;
            case 4:
                mydice[LAST_DICE] = 0;
            case 6:
                mydice[LAST_DICE] = (mydice[FIRST_DICE] + mydice[SECOND_DICE]) * 2;
                opponent[LAST_DICE] = (opponent[FIRST_DICE] + opponent[SECOND_DICE]) * 2;
        }
    }


    public void let_Me_Know_firstDice() {
        System.out.printf("-----\nuser의 첫번째 dice는 %d\ncomputer의 첫번째 dice는 %d\n-----\n"
                , user_Dice[FIRST_DICE], com_Dice[FIRST_DICE]);
    }

    public void let_Me_Know_secondDice() {
        System.out.printf("user의 두번째 dice는 %d \ncomputer의 두번째 dice는 %d\n-----\n"
                , user_Dice[SECOND_DICE], com_Dice[SECOND_DICE]);
        System.out.printf("***round%d의 결과***\n", round++);
    }
    public void calc_Betting_Money() { // Round승자 판단 후 betting money 계산
        if (user_Dice[LAST_DICE] > com_Dice[LAST_DICE]) {
            System.out.printf("user승!\nuser: %d\ncomputer: %d\n", user_Dice[LAST_DICE], com_Dice[LAST_DICE]);
            user_money += bet_money;
            computer_money -= bet_money;
        } else if (user_Dice[LAST_DICE] < com_Dice[LAST_DICE]) {
            System.out.printf("computer승!\nuser: %d\ncomputer: %d\n", user_Dice[LAST_DICE], com_Dice[LAST_DICE]);
            user_money -= bet_money;
            computer_money += bet_money;
        } else {
            System.out.printf("무승부!\nuser: %d\ncomputer: %d\n", user_Dice[LAST_DICE], com_Dice[LAST_DICE]);
        }
    }
    public void gameSet() { // 파산여부 검사
        if (user_money <= 0 || computer_money <= 0) {
            System.out.printf("최종 user_money:%d만원\n최종 computer_money: %d만원\n", user_money, computer_money);
            one_more_round = false;
        } else {
            System.out.println("------------------\n------------------");
        }
    }
    public int getRanDice(int range, int offset) {
        return (int) (Math.random() * range + offset);
    }
}

public class _99th_Quiz45retry {
    public static void main(String[] args) {
//        ---Casino gaem---
//        Start Money 1000만원.
//        베팅금액은 Scanner를 통해 입력.
//        둘 중 하나가 파산하면 game set.
//        주사위 2개를 사용.
//        숫자가 높은 사람이 round 승자.
//        첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
//        두 번째 주사위는 특수 능력을 가지고 있다.
//        두 번째 주사위가 1이 나오면 첫 번째 주사위의 값을 + 3 할 수 있다.
//        두 번째 주사위가 3이 나오면 상대방 첫 번째 주사위 값을 -2 할 수 있다.
//        두 번 째 주사위가 4가 나오면 내 첫 번째 주사위 값이 0이 된다.
//        두 번 째 주사위가 6이 나오면 상대방과 나의 주사위 값을 2배로 한다.
//        (2배 적용은 (첫 번째 주사위 + 두 번째 주사위)를 진행한 후 2배 적용한다)
        DiceGameRetry casino = new DiceGameRetry();
    }
}

