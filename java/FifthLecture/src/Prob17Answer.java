public class Prob17Answer {
    public static void main(String[] args) {
        System.out.println("컴퓨터가 주사위를 굴립니다.");

        // 컴퓨터 주사위1과 주사위2를 Math.random으로 구현
        int comp_dice1 = (int)(Math.random() * 6 + 1);
        int comp_dice2 = (int)(Math.random() * 6 + 1);

        System.out.println("사용자가 주사위를 굴립니다.");

        // 유저의 주사위1과 주사위2를 구현
        int user_dice1 = (int)(Math.random() * 6 + 1);
        int user_dice2 = (int)(Math.random() * 6 + 1);

        // 컴퓨터와 유저의 주사위 값 2개를 더해서 총합을 구함
        int com_total = comp_dice1 + comp_dice2;
        int user_total = user_dice1 + user_dice2;

        // 총합 값이 컴퓨터가 높다면 컴퓨터 승! 이라고 출력해주고
        // 유저가 높다면 유저승! 이라고 출력해줌
        // 그게 아닌경우는 같은 경우 밖에 없으니 무승부! 라고 출력하게 함
        if (com_total > user_total) {
            System.out.printf("컴퓨터 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        } else if (user_total > com_total) {
            System.out.printf("사용자 승! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        } else {
            System.out.printf("무승부! 점수는 %d(컴퓨터) vs %d(사용자)\n", com_total, user_total);
        }
    }
}
