/*  카지노 게임 (컴퓨터 vs 사람)
컴퓨터와 사람에게 각 1000만원씩 있다
Scanner를 통해 판돈을 직접 걸 수 있고, 상대방을 파산시키면 승리

주사위 2개를 사용하고, 굴린 2개의 주사위 합이 높은 사람이 이긴다

** 룰 **
1. 첫번째 주사위가 짝수가 나왔을 경우에만 두번째 주사위를 굴릴 수 있다
(첫번째 주사위 홀수가 나오면 그 값으로만 대결)

2. 두번째 주사위는 특수한 능력을 가지고 있다
	- 숫자 1 나오면 내 주사위 값에 +3  (본인 첫번째 + 두번째 + 3)
	- 숫자 3 나오면 상대방 주사위 값에 -2 (상대방 첫번째 + 두번째 - 2)
	- 숫자 4 나오면 내 주사위 값 0
	- 숫자 6 나오면 각자 만든 주사위 값 * 2 ( (각자 첫번째 + 두번째) * 2)

누가 파산하고 승리하는지 프로그래밍
*/


/*
    - 설계 -
    1. 데이터 - 사람 보유금액, 컴퓨터 보유금액, 판돈 저장, 각자 던진 첫번째두번째의 주사위 값, 각자 굴린 주사위 합, 현재 라운드
    2. 메소드 - 주사위 랜덤 적용, 주사위 합산, 승리시 보유금액+판돈, 패배시 보유금액-판돈
    3. 초기값 설정(생성자) - 보유금액, 주사위, 라운드

    4. 컴퓨터와 사람한테 천만원씩 넣는다
    5. 사람이 Scanner를 통해 판돈 입력한다
    6. 사람이랑 컴퓨터가 첫주사위를 동시에 던진다
    7. 첫번째 주사위 짝수,홀수 판단 후 두번째 주사위를 던질지 결정
        짝수(true)인 플레이어만 두번째 주사위를 던지고,
        홀수(false)인 플레이어는 두번째 주사위 안던지고 해당라운드에서 빠져나간다.
    8. 두번째 주사위의 특수 능력에 따라서 플레이어의 주사위 값을 바꾼다
    9. 플레이어 주사위 합산 값 비교 후 보유금액 변경
        주사위값 많으면 - 5번에서 걸었던 판돈만큼 보유금액 증가
        주사위값 적으면 - 판돈만큼 보유금액 차감
   10. 현재 라운드의 주사위값 결과와 각자 보유금액 출력 --> 몇판째인지 보여줄 라운드 변수 round++;

   11. 플레이어의 보유금액이 0 이하가 될때까지 4번~10번 반복
   12. 0 이하 나오면 각자 보유금액,승패 출력하며 프로그램 종료 --> comcoin < 1 || usercoin < 1
*/

class Casino {
    int userCoin; // 사람 보유금액
    int comCoin; // 컴퓨터 보유금액
    int ante; // 판돈 저장

    int userDice;
    int comDice;
    int dice1;
    int dice2;
    int userDiceSum;
    int comDiceSum;

    public Casino () {
        userCoin = 10000000;
        comCoin = 10000000;

        userDice = getRandDice();
        comDice = getRandDice();
    }


    private int getRandDice () {
        return (int)(Math.random() * 6 + 1);
    }

    // 주사위 결과 메소드
    public void calcDice () {
//        승패 결정될 경우 저장해뒀던 판돈변수 가져와서 각자에게 대입하여 연산 (판돈 계산할 식 필요)
//        이긴유저보유금액 += ante;
//        진유저보유금액 -= ante;
    }


    // 파산결과 출력할 메소드
    public void printResult () {
        if (userCoin > comCoin) {
            System.out.printf("유저 보유금액 : %d원, 컴퓨터 보유금액 : %d원으로 컴퓨터가 파산하였습니다.\n 유저가 승리했습니다!",
                    userCoin, comCoin);
        } else if (userCoin < comCoin){
            System.out.printf("유저 보유금액 : %d원, 컴퓨터 보유금액 : %d원으로 유저가 파산하였습니다.\n 컴퓨터가 승리했습니다!",
                    userCoin, comCoin);
        } else {
            System.out.printf("유저 보유금액 : %d원, 컴퓨터 보유금액 : %d원으로 무승부입니다!",
                    userCoin, comCoin);
        }
    }




}

public class homework_0525 {
    public static void main(String[] args) {
        System.out.println("ㅠㅠ");
    }
}


/*
        ----- 주사위 던지기 -----

        // 사람 - 첫번째 주사위가 짝수일 경우
        userDice1 = Math.random() * 6 + 1;
        if ((userDice1 % 2 == 0)) {
            userDice2 = Math.random() * 6 + 1;
        } else { // 홀수일 경우
            userDiceSum += userDice1;
        }

        // 컴퓨터 - 첫번째 주사위가 짝수일 경우
        comDice1 = Math.random() * 6 + 1;
        if (comDice1 % 2 == 0) {
            comDice2 = Math.random() * 6 + 1;
        } else { // 홀수일 경우
            comDiceSum += comDice1;
        }


         if

        ----- 주사위 결과값 구하기 (특수능력에 따른) -----
        switch (userDice2) { // 사람이 2번째 주사위를 던졌을 때
            case 1:
                userDiceSum = userDice1 + userDice2 + 3;
            case 3:
                comDiceSum = comDice1 + comDice2 - 2;
            case 4:

            case 6:
                userDiceSum *= userDice1 + userDice2
                comDiceSum *= comDice1 + comDice2 }


        ----- 주사위 결과값 구하기 (특수능력에 따른) -----
        switch (userDice2) { // 사람이 2번째 주사위를 던졌을 때
            case 1:
                userDiceSum = userDice1 + userDice2 + 3;
            case 3:
                comDiceSum = comDice1 + comDice2 - 2;
            case 4:

            case 6:
                userDiceSum *= userDice1 + userDice2
                comDiceSum *= comDice1 + comDice2 }
*/




