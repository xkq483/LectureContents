public class d_for를while로 {
    public static void main(String[] args) {
        int com_total = 0, user_total = 0;
        int i = 0;

        // 뒤이을 수식에 영향을 주지 않기위해 0으로 설정

        while(i < 2) {
            //i가 2이상이 될때까지 계속하여 출력한다. 즉, 0과 1이 만족되어 2번 출력됨. 주사위가 2번 굴려진다는 의미
            System.out.println("주사위를 굴립니다");
            com_total += (int) (Math.random()*6+1);
            user_total += (int) (Math.random()*6+1);

            System.out.printf("현재 상황 : %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
            i++;
            // i++이 없다면 0으로 고정되어 있어, 끊임없이 출력됨
        }
        if (com_total > user_total) {
            System.out.printf("컴퓨터 승! 점수는 각각 %d(컴퓨터) %d(사용자)\n", com_total, user_total);
        } else if(com_total < user_total) {
            System.out.printf("유저 승! 점수는 각각 %d(컴퓨터) %d(사용자)\n", com_total, user_total);
        } else {
            System.out.printf("무승부! 점수는 %d\n", com_total);

        }}
}
