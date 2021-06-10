public class Prob17WithWhile {
    public static void main(String[] args) {
        int com_total = 0, user_total = 0;
        int i = 0;


        // for문에서는  for (int i = 0; i < 2; i++)라고 썼던 부분이
        // while문에서는 int i = 0  /  while (i < 2)  /  i ++; 이라고 3부분으로 나눠서 코딩이 되어있다
        // for문과 while문이 어떻게 다른지 구조적으로 파악만 해두자
        // 그런데 for문과 while문을 쓸때 고작 이런 간단한 프로그램에서는 상관없겠지만
        // 나중에는 경우에 따라 for문을 쓰면 안되는 프로그램이나 while을 쓰면 안되는 프로그램 같은게 있는걸까?

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
