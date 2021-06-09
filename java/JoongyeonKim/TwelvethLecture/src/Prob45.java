//아주 특수한 카지노에 왔다.
//현재 내 수중엔 1000만원이 있다.
//카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
//상대방이 파산하면 이기는 게임이다.
//주사위 2개를 사용하는 게임이다.
//숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
//첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
//두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
//숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
//숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
//숫자 4가 나오면 내 주사위 값이 0이 된다.
//숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
//(2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
//누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!

import java.util.Scanner;

// 1. 각자 돈 천만원씩 2. 판돈을 걸 수 있고스캐너타입을 통해 베팅 비율을 입력받는다 3. 주사위는 2개 숫자가 높은 쪽이 승리
// 4. 두 번째 주사위는 특수 능력을 가지고 있음(1 = 주사위값 +3, 3 =상대방 주사위 값 -2, 4=내 주사위 값 0, 6= 양쪽 주사위 합산값 *2) [if문을 사용하여 맞추어야 하나?아니면 배열?]
// 5. 파산해야 겜종료 (money=0 이면 false로 해서 겜 종료하고 결과 나오게 하면 되겠다)
// 짜야 할 메소드 1.판돈거는 메소드 2. 각자의 주사위 값을 구하는 메소드 3.주사위 게임진행하는 메소드 4. 겜결과에 따라 돈먹고돈잃기 정하기
class Casino{
    int userMoney = 10000000;
    int comMoney = 10000000;
    int comBetting;
    int userBetting;


    public Casino() {
        int comdice1 = (int) (Math.random() * 6 + 1);
        int comdice2 = (int) (Math.random() * 6 + 1);

        int peopledice1 = (int) (Math.random() * 6 + 1);
        int peopledice2 = (int) (Math.random() * 6 + 1);
    }

    public void Betting() {  //베팅한다 여기서는 베팅 금액을 자산에서 빼기만 하고 돈을 더하는 메소드는 나중에 만들자
        Scanner scan = new Scanner(System.in);
        System.out.println("돈을 얼마나 베팅하실건가요??");
        comBetting =scan.nextInt();
        userBetting = scan.nextInt();

        userMoney -= userBetting;
        comMoney -= comBetting;
    }

    public void ComputerTurn() {  //첫번째 주사위가 짝수인 경우에만 두 번째 주사위를 굴릴수있다 수정해라
        for (int i = 0; i < 2; i++) {
            System.out.println("컴퓨터가 주사위를 굴립니다.");
            comDice1 = (int) (Math.random() * 6 + 1);
            comDice2 = (int) (Math.random() * 6 + 1);
            if (comDice2 = 1) {
                System.out.println("1이 나왔습니다! 주사위 값을 3 더합니다.");
                comSum += 3;
            } else if (comDice2 = 3) {
                System.out.println("3이 나왔습니다! 상대방의 주사위 값을 2내립니다.");
                userSum -= 2;
            } else if (comDice2 = 4) {
                System.out.println("4가 나왔습니다... 주사위 값이 0이 됩니다.");
                comSum = 0;
            } else if (comDice2 = 6) {
                System.out.println("6이 나왔습니다! 주사위 값이 2배가 됩니다.");
                comSum *= 2;
            }
        }
    }
    public void UsetTurn() {
        for (int i = 0; i < 2; i++) {
            System.out.println("사용자가 주사위를 굴립니다.");
            userDice1 = (int) (Math.random() * 6 + 1);
            userDice2 = (int) (Math.random() * 6 + 1);
            if (userDice2 = 1) {
                System.out.println("1이 나왔습니다! 주사위 값을 3 더합니다.");
                userSum += 3;
            } else if (userDice2 = 3) {
                System.out.println("3이 나왔습니다! 상대방의 주사위 값을 2내립니다.");
                comSum -= 2;
            } else if (userDice2 = 4) {
                System.out.println("4가 나왔습니다... 주사위 값이 0이 됩니다.");
                userSum = 0;
            } else if (userDice2 = 6) {
                System.out.println("6이 나왔습니다! 주사위 값이 2배가 됩니다.");
                userSum *= 2;
            }

        }
       
    }

}



public class Prob45 {
}
