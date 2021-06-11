public class b_Quiz17_2 {
    //17. Math.random() 응용 문제
    //컴퓨터와 주사위 게임을 해보자!
    //주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
    // for문을 활용한 문제풀이
    public static void main(String[] args) {
            int com_total = 0, user_total = 0;

        //com_total = 0으로 설정, user_total = 0으로 설정정
        // 0으로 설정하는 이유는 다이스 수식에 영향을 미치기 때문에, 1로 설정하면 다이스 수식의 +1을 제외해도 될듯

           for (int i = 0 ; i < 2; i++) {
               // int i = 0으로 설정, i가 2미만일때 동작, i = i + 1
               // 여기서 i는 주사위를 굴리는 횟수, 0, 1일때 굴러가므로 주사위가 2번 굴러감.

                System.out.println("컴퓨터와 사용자가 주사위를 굴립니다.");

                com_total += (int)(Math.random() * 6);
                user_total += (int)(Math.random() * 6);

               // com_total = com_total + 무작위 숫자(1~6)
               // user_total = user_total + 무작위 숫자(1~6)
               //
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
