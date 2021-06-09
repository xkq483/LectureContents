import java.util.Scanner;
class DiceGame {
    private int user_money = 1000;
    private int computer_money = 1000;
    Scanner scan;
    public int user_Dice;
    public int user_Dice2;
    public int computer_Dice;
    public int computer_Dice2;
    public int bet_money;
    public boolean one_more_round = true;
    public int round = 1;

    public DiceGame() { // 생성자
        while (one_more_round) {
            start_Game(); // 현재금액 + 배팅금액(배팅금액 오기입시 배팅금액 재설정)
            user_Dice = getRanDice(6, 1);
            computer_Dice = getRanDice(6, 1);
            let_Me_Know_firstDice(); // 첫번째 주사위 print
            //if_User_Dice(); // 주사위 홀수/짝수 판정 후 짝수인 경우 두번째 주사위
            //if_Computer_Dice(); // 주사위 홀수/짝수 판정 후 짝수인 경우 두번째 주사위
            if_Dice(user_Dice, user_Dice2, computer_Dice, computer_Dice2);
            //if_Dice(computer_Dice, computer_Dice2, user_Dice, user_Dice2);
            //if_Dice(computer_Dice, user_Dice);
            // 이 방식으로는 참조를 전달할 방법이 없어서 변수 자체를 수정할 수 없음
            // 이와 같은 방식이 되는 언어는 C/C++만 가능함(포인터 연산이라)

            // 배열 객체는 결국 메모리고 배열의 이름은 이 배열 객체의 대표로 전체 메모리를 전달하게 된다.
            // 위의 한 줄이 이 질문에서 제일 중요한 한 줄이라 보면 되겠다.
            // int[] arr에서 arr은 배열 객체 전체
            // arr[5] 와 같은 특정 인덱스 지정은 변수와 동일하게 값을 전달함
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

    // user_Dice, user_Dice2, computer_Dice, computerDice2
    // computer_Dice, computerDice2, user_Dice, user_Dice2
    public void if_Dice(int curDice1, int curDice2,
                        int targetDice1, int targetDice2) {
        curDice2 = 0;
        // 다음 라운드에서 첫번째 주사위가 홀수 일 경우를 대비해서 두번째 주사위 0으로 초기화
        if (curDice1 % 2 == 0) {
            curDice2 = getRanDice(6, 1);
        }
        switch (curDice2) {
            case 1:
                curDice1 += curDice1 + 3;
                break;
            case 3:
                targetDice1 += targetDice1 - 2;
                break;
            case 4:
                curDice1 = 0;
                break;
            case 6:
                curDice1 += (curDice1 + curDice2) * 2;
                targetDice1 += (targetDice1 + targetDice2) * 2;
                break;
            default:
                break;
        }
    }

    public void if_User_Dice() { // user주사위 홀수/짝수 판정 후 짝수인 경우 두번째 주사위
        user_Dice2 = 0;
        // 다음 라운드에서 첫번째 주사위가 홀수 일 경우를 대비해서 두번째 주사위 0으로 초기화
        if (user_Dice % 2 == 0) {
            user_Dice2 = getRanDice(6, 1);
        }
        switch (user_Dice2) {
            case 1:
                user_Dice = user_Dice + 3;
                break;
            case 3:
                computer_Dice = computer_Dice - 2;
                break;
            case 4:
                user_Dice = 0;
                break;
            case 6:
                user_Dice = (user_Dice + user_Dice2) * 2;
                computer_Dice = (computer_Dice + computer_Dice2) * 2;
                break;
            default:
                break;
        }
    }
    public void if_Computer_Dice() {// computer주사위 홀수/짝수 판정 후 짝수인 경우 두번째 주사위
        computer_Dice2 = 0;
        // 다음 라운드에서 첫번째 주사위가 홀수 일 경우를 대비해서 두번째 주사위 0으로 초기화
        if (computer_Dice % 2 == 0) {
            computer_Dice2 = getRanDice(6, 1);
        }
        switch (computer_Dice2) {
            case 1:
                computer_Dice = computer_Dice + 3;
                break;
            case 3:
                user_Dice = user_Dice - 2;
                break;
            case 4:
                computer_Dice = 0;
                break;
            case 6:
                computer_Dice = (computer_Dice + computer_Dice2) * 2;
                user_Dice = (user_Dice + user_Dice2) * 2;
                break;
            default:
                break;
        }
    }
    public void let_Me_Know_firstDice() {
        System.out.printf("-----\nuser의 첫번째 dice는 %d\ncomputer의 첫번째 dice는 %d\n-----\n"
                , user_Dice, computer_Dice);
    }

    public void let_Me_Know_secondDice() {
        System.out.printf("user의 두번째 dice는 %d \ncomputer의 두번째 dice는 %d\n-----\n"
                , user_Dice2, computer_Dice2);
        System.out.printf("***round%d의 결과***\n", round++);
    }
    public void calc_Betting_Money() { // Round승자 판단 후 betting money 계산
        if (user_Dice > computer_Dice) {
            System.out.printf("user승!\nuser: %d\ncomputer: %d\n", user_Dice, computer_Dice);
            user_money += bet_money;
            computer_money -= bet_money;
        } else if (user_Dice < computer_Dice) {
            System.out.printf("computer승!\nuser: %d\ncomputer: %d\n", user_Dice, computer_Dice);
            user_money -= bet_money;
            computer_money += bet_money;
        } else {
            System.out.printf("무승부!\nuser: %d\ncomputer: %d\n", user_Dice, computer_Dice);
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
public class QuestionProblemSolve {
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
        DiceGame casino = new DiceGame();
    }
}

// 배열의 이름은 배열의 대표로 객체가 전달된다(원본 형태로 전달)
// 배열 전달시 인덱스 지정하여 전달하면 값이 전달된다.
// 클래스를 메모리에 올린 객체를 전달하면 말 그대로 객체가 전달된다.
// 나머지는 전부 값이라 보면 되겠다.

// 원리 관점에서 바라보면 결국 메모리를 바라보는지,
// 메모리 내부에 박혀 있는 값을 보는것인지

// 객체(메모리)를 요청하면 원본을 줌
// 객체내에 들어있는 객체를 요청하면 원본을 줌 <<<<<<<<<<--------- 제일 주의해야하는 부분
// 객체내에 들어있는 값을 요청하면 이 값을 복사해서 줌
// 게터에서도 값을 리턴하는 것은 전부 복제
// 게터에서도 객체를 리턴하는 것은 메모리 즉, 원본 !
// 인간 vs 복제 인간
// 둘은 같은 인간일까요 ? 다른 인간일까요 ?
// DNA 정보는 같지만 나는 나, 너느 너 관점이라고 보면 되겠다