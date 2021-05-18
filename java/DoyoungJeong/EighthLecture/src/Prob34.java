class Dice {
    int time;
    int num;
    int sum;
    int Dice = (int)(Math.random()*6+1);

    int rollinDice(int time) {
        this.time = time;
        for(int i=0; i<time; i++) {
           num = (int)(Math.random()*6+1);
           //System.out.println(num);
           sum += num;
        }
        return sum;
    }
    int myDice() {
        return rollinDice(2);
    }
    int comDice() {
        return rollinDice(2);
    }
}

public class Prob34 {
    public static void main(String[] args) {
        Dice dc = new Dice();

        System.out.println(dc.myDice());
        System.out.println(dc.myDice());



    }
}
