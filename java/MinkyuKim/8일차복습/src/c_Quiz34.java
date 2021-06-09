class Dicd {

    int dice1;
    int dice2;

    int getDice1() {
        return dice1;
    }

    void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    int getDice2() {
        return dice2;
    }
    void setDice2(int dice2) {
        this.dice2 = dice2;
    }
}
public class c_Quiz34 {
    public static void main(String[] args) {
        Dicd D = new Dicd();

        D.dice1 = (int) (Math.random()*6+1);
        D.dice2 = (int) (Math.random()*6+1);

        System.out.printf("1p값 : %d / 2p값 : %d", D.dice1, D.dice2);
    }

}
