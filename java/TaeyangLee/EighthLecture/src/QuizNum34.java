class DiceGame {
    int human1;
    int human2;

    DiceGame(int a, int b){
        human1 = a;
        human2 = b;
        System.out.printf("human1의 합는 : %d , human2의 합은 %d \n",a,b);
        if(a>b){
            System.out.println("human1 의 승리 !");
        }else if(a<b){
            System.out.println("human2 의 승리 !");
        }else{
            System.out.println("비겼습니다!");
        }

    }
}

public class QuizNum34 {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        for(int i=0; i<2; i++){
            a += (int)(Math.random() * 6 + 1);
            b += (int)(Math.random() * 6 + 1);

        }
        DiceGame d = new DiceGame(a,b);
    }
}