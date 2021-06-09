public class g_Quiz13 {
    //13. for + if 문제
    //1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if ( i % 2 == 0) {
                System.out.printf("%d는 짝수입니다.\n", i);
            } else {
                System.out.printf("%d는 홀수입니다.\n", i);
            }

            // for문 -> i는 1부터 시작, 30 이하일때 동작, i = i+1
            //i를 2로 나누어 나머지가 0일 때 짝수, 그외는 홀수 \n은 엔터, i는 출력되는 값(변수)
        }
    }
}
