class Dice {

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



public class c_Quiz34_생성자문제 {
    public static void main(String[] args) {
        // 34. 생성자 문제
        // 우리가 이전에 Random과 제어문을 활용해서 주사위 게임을 만들었던적이 있다.
        // 이 주사위 게임을 class 방식으로 다시 만들어보자!
        // (필요에 따라 커스텀 매서드를 만들어 사용하는것도 좋다)
        Dice D = new Dice();

        D.dice1 = (int) (Math.random() * 6 + 1);
        D.dice2 = (int) (Math.random() * 6 + 1);

        System.out.printf("1p값 : %d / 2p값 : %d", D.dice1, D.dice2);


    }
}
