public class Prob17Enhance {
    public static void main(String[] args) {
        System.out.println("컴퓨터가 주사위를 굴립니다.");

        int com_total = 0, user_total = 0;


        // 이전 주사위 프로그램과 다른 점은
        // 이번 코드는 주사위를 한번 굴렸을 때와 두번 굴렸을 때를 각각 구분해서 보여준다.
        // 여기서 눈여겨 보아야할 부분은
        // com_total += (int)(Math.random() * 6 + 1);
        // user_total += (int)(Math.random() * 6 + 1);
        // 이 두줄인데
        // A += B ===> A == A + B 이고
        // for (int i = 0; i < 2; i++)이니깐
        // 2번까지 A(주사위 한번 굴린값)을 더해주는 거다.
        // 유저와 컴퓨터의 주사위를 한번 굴리고 현재상황을 출력 해주고
        // 다시 한번 더 굴려서 총 2번의 값을 더해서 승자를 출력해준다.
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
