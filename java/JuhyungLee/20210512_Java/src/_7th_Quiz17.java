public class _7th_Quiz17 {
    public static void main(String[] args) {

        //Quiz 17. Math.random() 응용 문제
        //주사위 게임 vs 컴퓨터
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

        int com_sum = 0;
        int zu_sum = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("[Dice]");
            int com = ((int) (Math.random() * 6 + 1));
            int zu = ((int) (Math.random() * 6 + 1));

            System.out.println("computer: " + com);
            System.out.println("zu: " + zu);
            System.out.println();

            com_sum += com;
            zu_sum += zu;
        }
        System.out.println("computer가 던진 주사위들의 합: " + com_sum);
        System.out.println("zu가 던지 주사위들의 합: " + zu_sum);

        if (com_sum > zu_sum) {
            System.out.println("Computer 승");
        } else if (com_sum < zu_sum) {
            System.out.println("zu 승");
            // 대충 생각나는대로 계속 썼다 고쳤다 했는데 이게 맞나 싶음.
        }
    }
}