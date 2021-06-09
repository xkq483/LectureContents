public class DiceHwRe {
    public static void main(String[] args) {
        //컴퓨터와 주사위 게임을 해보자!
        //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

        System.out.println("컴퓨터가 주사위를 굴립니다.");
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);

        int total1 = dice1 + dice2;
        System.out.println("컴퓨터 주사위의 합은 = "  + (dice1 + dice2));

        System.out.println("사용자가 주사위를 굴립니다.");
        int dice3 = (int)(Math.random() * 6 + 1);
        int dice4 = (int)(Math.random() * 6 + 1);

        int total2 = dice3 + dice4;
        System.out.println("사용자 주사위의 합은 = "  + (dice3 + dice4));

        if (total1 > total2){
            System.out.println("컴퓨터가 이겼습니다.");
        }else if (total1 < total2){
            System.out.println("사용자가 이겼습니다.");
        }else {
            System.out.println("무승부 입니다.");
        }
    }
}
