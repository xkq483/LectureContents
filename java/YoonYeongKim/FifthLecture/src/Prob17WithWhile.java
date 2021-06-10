public class Prob17WithWhile {
    public static void main(String[] args) {
        int com_total = 0, user_total = 0;
        int i = 0;

        while (i < 2) {
            System.out.println("주사위를 굴립니다.");
            com_total += (int)(Math.random() * 6 + 1);
            user_total += (int)(Math.random() * 6 + 1);
            System.out.printf("현재 상황: %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);

            i++;
        }

        if (com_total > user_total) {
            System.out.printf("컴퓨터 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        } else if (user_total > com_total) {
            System.out.printf("사용자 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        } else {
            System.out.printf("무승부! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        }
    }
}