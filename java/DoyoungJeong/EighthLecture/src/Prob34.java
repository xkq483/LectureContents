class Dice {
    int time;
    int num;
    int sum;
    int Dice = (int)(Math.random()*6+1);

    int rollinDice(int time) {
        this.time = time;
        sum=0; //for문 밖에 sum을 0으로 초기화해서 문제 해결했습니다.
        for(int i=0; i<time; i++) {
           num = (int)(Math.random()*6+1);
           //System.out.println(num);
           sum += num;
        }
        return sum;
    }

    int myDice() {
        return (rollinDice(3));
    }
    int comDice() {
        return(rollinDice(3));
    }
    void compare() {
        System.out.printf("나의 점수 : %d, 컴퓨터의 점수 : %d|\n", myDice(), comDice());
    }

    void result() {
        if(myDice() > comDice()) {
            System.out.printf("나의 승리! 나의 점수 : %d, 컴퓨터의 점수 : %d", myDice(), comDice());
        } else if(myDice() < comDice()) {
            System.out.printf("컴퓨터의 승리! 나의 점수 : %d, 컴퓨터의 점수 : %d", myDice(), comDice());
        } else if (myDice() == comDice()) System.out.println("무승부");
    }

} //올바른 result 값이 안나온다;; 그 이유가 궁금합니다. 수정본에서 myDice, comDice메소드를 변수로 바꿔 지정하니
  //문제가 해결됐습니다. myDice, comDice가 메소드일때 올바른 result가 나오지 않은 것은 myDice, comDice 자체의 메소드의 리턴값과 별개로
  //compare, result메소드와 연결된 myDice, comDice의 sum값이 출력되기 때문인지?가 제가 추측한 원인입니다.

public class Prob34 {
    public static void main(String[] args) {
        Dice dc = new Dice();
        dc.compare();
        dc.result();

 


    }
}
