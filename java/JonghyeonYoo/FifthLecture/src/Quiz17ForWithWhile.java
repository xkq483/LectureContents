public class Quiz17ForWithWhile {
    public static void main(String[] args) {
        // Quiz17. Math.random()응용문제
        // 컴퓨터 주사위 게임을 해보자!
        // 주사위 2번을 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
        // for문 사용
        System.out.println("컴퓨터 주사위 게임을 해보자!!");
        int com = 0, user = 0;
        int i;
        for(i=0; i < 2; i++){

            com +=((int)(Math.random() * 6 + 1));
            user +=((int)(Math.random() * 6 + 1));

        }
        System.out.printf("A팀의 주사위의 합 : %d\n", com);
        System.out.printf("B팀의 주사위의 합 : %d\n", user);

        if (com > user) {
            System.out.println(" A팀 승리");
        } else if(user > com) {
            System.out.println(" B팀 승리");
        } else{
            System.out.println("무승부");
        }

        //while문 사용
    int com_total = 0, user_total = 0;
    int a = 0;

    while (a < 2) {
        System.out.println("주사위를 굴립니다.");
        com_total += (int)(Math.random() * 6 + 1);
        user_total += (int)(Math.random() * 6 + 1);
        System.out.printf("현재 상황: %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);

        a++;
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
