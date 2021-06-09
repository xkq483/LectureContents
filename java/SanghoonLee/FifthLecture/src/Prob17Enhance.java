public class Prob17Enhance {
    public static void main(String[] args) {
        System.out.println("컴퓨터가 주사위를 굴립니다.");

        int com_total = 0, user_total = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("사용자가 주사위를 굴립니다.");
            com_total += (int)(Math.random() * 6 + 1);
            user_total += (int)(Math.random() * 6 + 1);
            System.out.printf("현재 상황: %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
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
