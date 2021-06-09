import java.util.Scanner;
class Gamble {
    Scanner sc;
    private int dice;
    private int[] myDice;
    private int[] comDice;
    private int myMoney;
    private int comMoney;
    private int betMoney;
    private final int rollTIME = 3;
    private int myValue;
    private int comValue;
    public Gamble() {
        myDice = new int[rollTIME];
        comDice = new int[rollTIME];
        myMoney = 1000;
        comMoney = 1000;
        //생성자에는 초기화, 즉 처음 값을 넣는다.
    }
    public void operation() {
        do{
            while (isDeath()) {
                gameStart();
                firstDice();
                secondDice();
                calcDice(myDice, comDice);
                calcDice(comDice, myDice);
                printDice();
                printResult();
            }
        }while (isOver());
    }
    private void gameStart() {
        sc = new Scanner(System.in);
        System.out.print("배팅할 금액 입력 : ");
        betMoney = sc.nextInt();
    }
    private int rollinDice() {
        return (int)(Math.random()*6+1);
    }
    private void firstDice() {
        myDice[0] = rollinDice();
        comDice[0] = rollinDice();
//        System.out.print("내 첫 주사위 : " + myDice[0]);
//        System.out.println("컴 첫 주사위 : " + comDice[0]);
    }
    private void secondDice() {
        if (myDice[0] % 2==0) {
            myDice[1] = rollinDice();
        }
        if (comDice[0] % 2==0) {
            comDice[1] = rollinDice();
        }
//        System.out.print("내 둘째 주사위 " + myDice[1]);
//        System.out.println("컴 둘째 주사위 " + comDice[1]);
    }
    private void calcDice(int[] curDice, int[] targetDice) {
        switch (curDice[1]) {
            case 1 :
                // curDice[2] = curDice[2] + curDice[0] + 3
                curDice[2] += (curDice[0] + 3);
                break;
            case 3 :
                targetDice[2] += (targetDice[2] - 2);
                curDice[2] += curDice[0];
                break;
            case 4 :
                curDice[2] = 0;
                break;
            case 6 :
                curDice[2] += (curDice[0]+curDice[1])*2;
                targetDice[2] += (targetDice[0]+targetDice[1])*2;
                break;
            default :
                curDice[2] += (curDice[0] + curDice[1]);
        }
    }
    private void printDice() {
        myValue =  myDice[2];
        comValue = comDice[2];
        System.out.println("내 최종 주사위 값 : " + myValue);
        System.out.println("컴 최종 주사위 값 : " + comValue);
    }
    private void printResult() {
        if(myValue > comValue) {
            System.out.printf("나의 승리! 컴퓨터 돈 %d에서 %d 차감해 남은 돈 %d\n", comMoney, betMoney, comMoney-betMoney);
            comMoney = comMoney - betMoney;
            myMoney = myMoney + betMoney;
        } else if(comValue > myValue) {
            System.out.printf("컴퓨터의 승리! 내 돈 %d에서 %d 차감해 남은 돈 %d\n", myMoney, betMoney, myMoney-betMoney);
            myMoney = myMoney - betMoney;
            comMoney = comMoney + betMoney;
        } else if(comValue == myValue) {
            myMoney = myMoney;
            comMoney = comMoney;
            System.out.printf("무승부! 내 돈 %d, 컴퓨터 돈 %d\n", myMoney, comMoney);
        }
        System.out.printf("현재 금액 내돈 : %d, 컴퓨터 : %d\n", myMoney, comMoney);
    }
    private boolean isDeath() {
        boolean isDeath = true;
        if(myMoney <= 0) {
            System.out.println("컴퓨터의 승리!");
            isDeath = false;
        } else if(comMoney <= 0) {
            System.out.println("나의 승리!");
            isDeath = false;
        }
        return isDeath;
    }
    public boolean isOver() { //게임을 반복시켜보려했는데 잘 안됩니다..
        boolean isOver = true;
        sc = new Scanner(System.in);
        System.out.print("게임을 다시 진행하겠습니까 ? (다시 판돈을 새롭게 올리세요)");
        String yOrN = sc.nextLine();
        if(yOrN.equals("Y")) {
            System.out.println("게임을 계속합니다.");
            isOver = true;
            myMoney = 1000;
            comMoney = 1000;
        } else if(yOrN.equals("N")) {
            System.out.println("게임을 종료합니다.");
            isOver = false;
        }
        return isOver;
    }
}
public class SomeProblemSolve {
    public static void main(String[] args) {
        Gamble gb = new Gamble();
        gb.operation();
    }
}