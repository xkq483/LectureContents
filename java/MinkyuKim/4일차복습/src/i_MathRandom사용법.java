public class i_MathRandom사용법 {
    public static void main(String[] args) {
        for(;;) {
            System.out.println((int)(Math.random() * 10 ));

            // 0.00~ 0.99~~ *10을 무작위로 무한 출력. 다만 int로 소수점 버려져서 출력되므로 1~9까지의 정수가 무작위로 출력
            // ;; 조건이 없으므로 무한정 출력
        }
    }
}
