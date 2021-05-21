class Dice{

int computer;
int zu;

Dice(){
    computer = (int)(Math.random() * 6 + 1);
    zu = (int)(Math.random() * 6 + 1);

    System.out.println(computer);
    System.out.println(zu);
    }
    public int getDice1() {
        return computer;
    }
    public int getDice2() {
        return zu;
    }
}
public class _3rd_Quiz34 {
    public static void main(String[] args) {
        //Quiz34. 이전에 random과 제어문을 활용해서 주사위 게임을 만들었던 적이 있다.
        // 이 주사위 게임을 class 방식으로 만들어볼 것.
        // 컴퓨터 vs 사용자
        Dice dice = new Dice();

        if(dice.computer>dice.zu){
            System.out.println("computer win");
        } else if (dice.computer == dice.zu) {
            System.out.println("draw");
        }  else {
            System.out.println("zu win");
        }
    }
}
