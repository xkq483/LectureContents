import java.util.Scanner;

class Dice {
    Scanner sc;
    private int time;
    private int dice;
    private int myDice;
    private int comDice;
    private int sum;
    private int myDicearray[];

    public void getDice() {
        System.out.printf("\n내 주사위 값들의 합은 : %d, 컴퓨터의 주사위 값들의 합은 : %d\n", myDice, comDice);
    }
    public void getDiceArray() { //퍼블릭 메소드로 주사위 값 배열을 불러오고자했지만 실패.
        for(int arr : myDicearray) {
            System.out.print(arr + "\t");
        }
    }
    public Dice() {
        sc = new Scanner(System.in);
        System.out.print("주사위를 몇 회 굴리시겠습니까? : ");
        time = sc.nextInt();
        myDice = rollinDice(time);
        comDice = rollinDice(time);
    }

    private int rollinDice(int time) {
        this.time = time;
        int myDicearray[] = new int[time];
        int i=0, sum=0;
        while (i < time) {
            dice = (int)(Math.random()*6+1);
            myDicearray[i] = dice;
            //System.out.print(myDicearray[i] + "\t");
            sum += dice;
            i++;
        }
        System.out.print("주사위 값의 나열은 : \t");
        for(int arr : myDicearray) {
            System.out.print(arr + "\t"); }
        return sum;
    }
    private int whoWin() {
        if(comDice > myDice) {
            return 1;
        } else if(comDice < myDice) {
            return 2;
        } else return 3;
    }
    public void printWinner() {
        switch (whoWin()) {
            case 1 :
                System.out.println("컴퓨터의 승리!"); break;
            case 2 :
                System.out.println("나의 승리!"); break;
            case 3 :
                System.out.println("무승부!"); break;
        }
    }
}
public class Prob39 {
    public static void main(String[] args) {

        Dice dc = new Dice();
        dc.getDice();
        //dc.getDiceArray();
        dc.printWinner();

    }
}
