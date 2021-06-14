class DiceTest{

int comDice;
int zuDice;

DiceTest(){
    comDice = throwDice();
    zuDice = throwDice();
    }
    int throwDice(){
    return (int)(Math.random() * 6 + 1);
    }

    int whoWin(){
        if(comDice > zuDice){
            return 0;
        } else if(comDice == zuDice){
            return 1;
        } else {
            return 2;
        }
    }
    void announce(){
        switch(whoWin()){
            case 0:
                System.out.println("Com 승");
                System.out.printf("Com:%d\n zu:%d\n", comDice, zuDice);
                break;
            case 1:
                System.out.println("무승부");
                System.out.printf("Com:%d\n zu:%d\n", comDice, zuDice);
                break;
            case 2:
                System.out.println("zu 승");
                System.out.printf("Com:%d\n zu:%d\n", comDice, zuDice);
                break;
        }
    }
}
public class _3rd_Quiz35 {
    public static void main(String[] args) {
        //Quiz34. 이전에 random과 제어문을 활용해서 주사위 게임을 만들었던 적이 있다.
        // 이 주사위 게임을 class 방식으로 만들어볼 것.
        // 컴퓨터 vs 사용자
        // 무승부도 표현하도록 만들어볼 것.
        DiceTest dt = new DiceTest();

        dt.announce();
    }
}

