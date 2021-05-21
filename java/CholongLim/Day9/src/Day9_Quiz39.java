class DiceGame {

    private int comDice2;
    private int userDice2;

    public DiceGame() {
         comDice2 = getRandomDice();
         userDice2 = getRandomDice();
    }

    public int getRandomDice () {
        return (int) (Math.random() * 6 + 1);
    }
    public void whoIsWinner() {
        if (comDice2 > userDice2) {
            System.out.printf("%d VS %d, 컴퓨터의 승리입니다.\n", comDice2, userDice2);
        } else if (comDice2 < userDice2) {
            System.out.printf("%d VS %d, 사용자의 승리입니다.\n", comDice2, userDice2);
        } else {
            System.out.printf("%d VS %d, 무승부입니다.\n", comDice2, userDice2);
        }
    }

    public static class Day9_Quiz39 {
        public static void main(String[] args) {
            DiceGame dg = new DiceGame();
            dg.whoIsWinner();

        }
    }
}




//    class 내부에서 만들어지는 코드들은 어떤 식으로 사용이던
//    생성자이기때문에 그 방식으로 만들어지는듯 하다.
//    따라서 조건문이나 추가문이 붙더라도 checkWinner()와 같은 형식으로 시작해야한다.