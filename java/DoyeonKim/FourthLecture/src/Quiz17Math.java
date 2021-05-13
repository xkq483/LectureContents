public class Quiz17Math {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("주사위 게임 시작!");
          int i = 0;
          int num1 = 0;
         while (i++ < 2) {
             System.out.println((int)(Math.random() * 6 + 1));
             if ( num1 < i);
             System.out.println("이겼습니다!");
             //주사위 돌리고 하나 결과 뜨면 그걸 어디에 집어 넣는다
             //그리고 또 반복 후에 두결과를 비교하고
             //컴터가 더 숫자가 크면 졌습니다를 띄우고 내가 더 크면 이겼습니다 띄우기
             //근데 결과를 어떻게 넣는지 모르겠어서 못하겠다

            Thread.sleep(500);
        }
    }
}
