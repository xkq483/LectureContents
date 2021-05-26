/*
변수
1. 컴퓨터 vs 사람
2. 주사위 2개 사용
3. 수중엔 1000만원이 있다.
4. 판돈을 걸 수 있고, Scanner를 통해 베팅비율 입력

조건
1. 상대방이 파산하면 이긴다.
2. 숫자가 높은 사람이 이긴다.

계산
1. 첫번째 주사위가 짝수가 나올경우, 두번재 주사위를 다시 굴림
2. 두번재 주사위의 경우
   1이 나올시 +3
   3이 나오면 상대방 -2
   4가 나오면 내 주사위값은 0
   6이 나오면 각자의 주사위 값이 2배로 증가한다.(단. 첫번재 두번재 주사위 모두 진행 후 적용)
 */
class DiceGambling {
    final int myCoin = 10000000;
    final int yourCoin = 10000000;
    int myDice;
    int yourDice;
    int battingMoney;

    public DiceGambling() {
        myDice = getRandDice();
        yourDice = getRandDice();

    }

    public int getRandDice() {
        return (int) (Math.random() * 6 + 1);
    }

    //public void money() {
     //   if (totalMyDice > totalyourDice) {
     //       myCoin += next


    public void redoMyDice() {
        if (myDice % 2 == 0) {
            myDice = (myDice + getRandDice()); // 다시 실행해라?
        } else {
            myDice = myDice; //첫번째 주사위가 홀수이므로 그대로
        }
        // 첫번째 주사위
        // 짝수 주사위가 나올시 주사위를 한번 더 굴린다.
    }

    public void redoMyDice2() {
        int totalMyDice = 0;
        int totalYourdice = 0;

        if (myDice = 1) {
            totalMyDice + 3;
        } else if (myDice = 3) {
            totalYourdice - 2;
        } else if (myDice = 4) {
            totalMyDice = 0;
        } else if (myDice = 6) {
            totalMyDice * 2;
            totalYourdice * 2;
        } else {
            ;
            // 두번째 주사위값 나올시 적용
        }
    }

    public void redoYourDice() {
        if (yourDice % 2 == 0) {
            yourDice = yourDice + getRandDice() // 다시 실행해라?
        } else {
            yourDice = yourDice; //첫번째 주사위가 홀수이므로 그대로
        }
    }

    public void redoYourDice2() {
        int totalMyDice;
        int totalYourDice;

        if (yourDice = 1) {
            totalMyDice + 3
        } else if (yourDice = 3) {
            totalMyDice - 2
        } else if (yourDice = 4) {
            totalYourDice = 0
        } else if (yourDice = 6) {
            totalMyDice * 2;
            totalYourDice * 2;
        } else {
            ;
            // 두번째 주사위값 나올시 적용
        }
    }
}
public class c_Quiz45 {
    DiceGambling dg = new DiceGambling();


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


}
