// 39. ACL 문제 (주사위 문제 만들기) ------------------------------------------------------------
class Dice39 {
    private int me;
    private int com;

    public Dice39(){
        me = getRandomDice();
        com = getRandomDice();
    }

    private int getRandomDice() {
        return (int) (Math.random() * 6 + 1); }

    public void checkWinner(){
        if(me > com){
            System.out.printf("%s(사용자) vs %s(컴퓨터) 사용자가 승리하였습니다.", me, com);
        }else if(me < com){
            System.out.printf("%s(사용자) vs %s(컴퓨터) 컴퓨터가 승리하였습니다.", me, com);
        }else {
            System.out.printf("%s(사용자) vs %s(컴퓨터) 무승부입니다.", me, com);
        }
    }

}

public class Quiz0520Prob39 {
    public static void main(String[] args) {
        Dice39 d = new Dice39();

        d.checkWinner();

    }
}
