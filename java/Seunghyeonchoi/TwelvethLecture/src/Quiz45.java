import java.util.Scanner;

class Dice  {

    //배열 0번이 user, 1번이 enemy
    int[] dice1;
    int[] dice2;
    int[] magicpower;//상대한테 적용할 특수능력
    int[] totalDice;
    int WoL;

    int userMoney;
    int enemyMoney;

    public Dice(int userMoney, int enemyMoney) {

        for (int i = 0; i < 2; i++) {
            this.dice1 = new int[2];
            this.totalDice = new int[2];
            dice1[i] = (int) (Math.random() * 6 + 1);

            if (dice1[i] % 2 == 0) {
                MagicDice();
            }else {
                totalDice[i] = dice1[i];
            }
        }
        System.out.printf("작동확인중 1");

    }

    //두 번째 주사위 및 특수능력 결정
    public void MagicDice() {
        this.dice2 = new int[2];

        for (int i = 0; i < 2; i++) {
            dice2[i] = (int) (Math.random() * 6 + 1);

            switch (dice2[i]) {
                case 1:
                    totalDice[i] = dice1[i] + dice2[i] + 3;
                    break;
                case 3:
                    totalDice[i] = dice2[i];
                    magicpower[i] = -2;
                    break;
                case 4:
                    dice2[i] = 0;
                    break;
                case 6:
                    totalDice[i] = dice1[i] + dice2[i];
                    magicpower[i] = 0; //이따 magicpower가 0이면 둘 다 2배 적용하도록 만들자
                    break;
            }
        }

        System.out.printf("작동확인중 2");
    }
    //dice 1 2 구했으니.... 이제 특수능력 적용

    public void MagicResult()   {
        if (magicpower[0] == -2)    {
            totalDice[1] -= 2;
        }else if(magicpower[0] == 0 || magicpower[1] ==0)    {
            totalDice[0] *= 2;
            totalDice[1] *= 2;
        }else if(magicpower[1] == -2)   {
            totalDice[0] -= 2;
        }
        System.out.printf("작동확인중 3");
    }
    //승패 판정
    public void Judgment()  {
        if (totalDice[0] > totalDice[1])    {
            WoL = 1;
            System.out.printf("%d : %d로 당신의 승리입니다.", totalDice[0], totalDice[1]);
        }else if(totalDice[0] < totalDice[1])   {
            WoL = 2;
            System.out.printf("%d : %d로 상대의 승리입니다.", totalDice[0], totalDice[1]);
        }else   {
            WoL = 3;
            System.out.printf("%d : %d로 무승부입니다.", totalDice[0], totalDice[1]);
        }

        System.out.printf("작동확인중 4");
    }
    //판돈 계산
    public void Result(int bet) {
        switch (WoL)    {
            case 1:
                userMoney += bet;
                enemyMoney -= bet;
                break;
            case 2:
                userMoney -= bet;
                enemyMoney += bet;
                break;
            default:
        }

        System.out.printf("작동확인중 5");
    }

}


public class Quiz45 {
    public static void main(String[] args) {
        //// Quiz45
        //        //아주 특수한 카지노에 왔다.
        //        //현재 내 수중엔 1000만원이 있다.
        //        //카지노에서 판돈을 걸 수 있고 베팅 비율은 Scanner를 통해 입력 받을 수 있다.
        //        //상대방이 파산하면 이기는 게임이다.
        //        //주사위 2개를 사용하는 게임이다.
        //        //숫자가 높은 사람이 이긴다(컴퓨터 vs 사람)
        //        //첫 번째 주사위가 짝수가 나온 경우에만 두 번째 주사위를 굴릴 수 있다.
        //        //두 번째 주사위는 특수 능력을 가지고 있는 주사위다.
        //        //숫자 1이 나오면 내 주사위 값을 + 3 할 수 있다.
        //        //숫자가 3이 나오면 상대방 주사위 값을 -2 할 수 있다.
        //        //숫자 4가 나오면 내 주사위 값이 0이 된다.
        //        //숫자 6이 나오면 각자 만든 주사위 값을 2배로 뻥튀기 한다.
        //        //(2배 뻥튀기는 첫번째 주사위 + 두번째 주사위를 모두 진행한 후 적용한다)
        //        //누가 파산하고 누가 승리를 거머쥐는지 프로그래밍해보자!


        int userMoney = 1000;
        int enemyMoney = 1000;

        Scanner scan = new Scanner(System.in);

        System.out.printf("만원 단위로 판돈을 걸어주세요 : ");
        int bet = scan.nextInt();

        Dice cd = new Dice(userMoney, enemyMoney);

        cd.MagicDice();
        cd.Judgment();
        cd.Result(bet);

        System.out.printf("당신 지갑에는 %d 만원이 있으며\n상대 지갑에는 %d 만원이 있습니다.", userMoney, enemyMoney);



    }
}
