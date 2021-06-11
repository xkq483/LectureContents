// 아주 특수한 카지노에 왔다.
// 현재 내 수중엔 1000만원이 있다.
// 카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
// 상대방이 파산하면 이기는 게임이다.
// 주사위 2개를 사용하는 게임이다.
// 숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
// 첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
// 두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
// 숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
// 숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
// 숫자 4가 나오면 내 주사위 값이 0이 된다.
// 숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
// (2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
// 누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!

// 1. user와 com 만들기
//    1-1 판돈설정
// 2. 배팅비율 Scanner사용하기
// 3. 주사위게임을 만드는데 주사위는 동시에2개가 아니라 각각 1개씩 굴리게하기
// 4. 주사위가 홀수면 한번만굴리고 짝수면 두번굴리게 설정
// 5. 두번째 주사위 특수능력
// 6. 승패설정 및 누가 파산하는지...

import java.util.Scanner;

class Casino {
    int comDice;
    int comDice2;
    int comSum;
    int comMoney;

    int userDice;
    int userDice2;
    int userSum;
    int userMoney;

    int bet;

    Scanner scan;

    public Casino() {
        comMoney = 10000000;
        userMoney = 10000000;

        userSum = (userDice+userDice2);
        comSum = (comDice+comDice2);
    }

    public void inputBet() {
        scan = new Scanner(System.in);
        System.out.print("얼마를 거시겠습니까? : ");
        bet = scan.nextInt();
        if (bet <= 0) {
            System.out.printf("0원을 배팅할순 없습니다.");
        }
    }

    public void randomDice() {
        comDice = (int)(Math.random() * 6 + 1);
        userDice = (int)(Math.random() * 6 + 1);
    }

    public void randomDiceSecond() {
        if(comDice % 2 == 0 ) {
            comDice2 = (int)(Math.random() * 6 + 1);
        } else if (comDice2 == 1) {
            comDice2 = comSum +3;
        } else if (comDice2 == 3) {
            userDice2 = userSum -2;
        } else if (comDice2 == 4) {
            comDice2 = comSum * 0;
        } else if (comDice2 == 6) {
            comDice2 = comSum * 2;
            userDice2 = userSum * 2;
        } else {
            comDice2 = comSum;
        }

        if(userDice % 2 == 0) {
            userDice2 = (int)(Math.random() * 6 + 1);
        }else if (userDice == 1) {
            userDice2 = userSum +3;
        } else if (userDice == 3) {
            comDice2 = comSum -2;
        } else if (userDice == 4) {
            userDice2 = userSum * 0;
        } else if (userDice == 6) {
            comDice2 = comSum * 2;
            userDice2 = userSum * 2;
        } else {
            userDice2 = userSum;
        }

    }


}

public class Quiz_45 {
    public static void main(String[] args) {
        Casino ca = new Casino();


    }
}
