public class QuizTest17 {
    // 17. 선생님 풀이방법
    public static void main(String[] args) {
        System.out.println("컴퓨터가 주사위를 굴립니다.");

        int comp_dice1 = (int)(Math.random() * 6 + 1);
        int comp_dice2 = (int)(Math.random() * 6 + 1);

        System.out.println("사용자가 주사위를 굴립니다. ");

        int user_dice1 = (int)(Math.random() * 6 + 1);
        int user_dice2 = (int)(Math.random() * 6 + 1);

        int comp_total = comp_dice1 + comp_dice2;
        int user_total = user_dice1 + user_dice2;

        if (comp_total > user_total) {
            System.out.printf("컴퓨터 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", comp_total, user_total);
        } else if (user_total > comp_total) {
            System.out.printf("사용자 승! 점수는 %d(사용자) vs %d(컴퓨터)\n", user_total, comp_total);
        } else {
            System.out.printf("무승부! 점수는 %d(사용자) vs %d(컴퓨터)\n", user_total, comp_total);
        }

        //더 깔끔한 버전

        System.out.println("컴퓨터가 주사위를 굴립니다. ");

        int com_total = 0, users_total = 0;

        for (int i = 0; i < 2; i++) {
            System.out.println("사용자가 주사위를 굴립니다.");
            com_total += (int)(Math.random() * 6 + 1);
            users_total += (int)(Math.random() * 6 + 1);
            System.out.printf("현재상황 : 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, users_total);
        }

        if (comp_total > users_total) {
            System.out.printf("컴퓨터 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", comp_total, users_total);
        } else if (users_total > comp_total) {
            System.out.printf("사용자 승! 점수는 %d(사용자) vs %d(컴퓨터)\n", users_total, comp_total);
        } else {
            System.out.printf("무승부! 점수는 %d(사용자) vs %d(컴퓨터)\n", users_total, comp_total);
        }
    }

}