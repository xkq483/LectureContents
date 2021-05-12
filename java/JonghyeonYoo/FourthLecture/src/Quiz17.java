public class Quiz17 {
    public static void main(String[] args) {
        // Quiz17. Math.random()응용문제
        // 컴퓨터 주사위 게임을 해보자!
        // 주사위 2번을 굴려서 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.

        System.out.println("컴퓨터 주사위 게임을 해보자!!");
        int A = 0, B = 0;
        int i;
        for(i=1; i < 2; i++){
            A +=((int)(Math.random() * 6 + 1));
            B +=((int)(Math.random() * 6 + 1));

        }
        System.out.printf("A팀의 주사위의 합 : %d\n", A);
        System.out.printf("B팀의 주사위의 합 : %d\n", B);

        if (A > B) {
            System.out.println(" A팀 승리");
        } else if(B > A) {
            System.out.println(" B팀 승리");
        } else{
            System.out.println("무승부");
        }
    }
}
