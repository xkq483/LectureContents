public class Prob17Answer {
    public static void main(String[] args) {
        System.out.println("컴퓨터가 주사위를 굴립니다.");

        int comp_dice1 = (int)(Math.random() * 6 + 1);
        int comp_dice2 = (int)(Math.random() * 6 + 1);

        System.out.println("사용자가 주사위를 굴립니다.");

        int user_dice1 = (int)(Math.random() * 6 + 1);
        int user_dice2 = (int)(Math.random() * 6 + 1);

        int com_total = comp_dice1 + comp_dice2;
        int user_total = user_dice1 + user_dice2;

        if (com_total > user_total) {
            System.out.printf("컴퓨터 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        } else if (user_total > com_total) {
            System.out.printf("사용자 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        } else {
            System.out.printf("무승부! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        }
    }
}