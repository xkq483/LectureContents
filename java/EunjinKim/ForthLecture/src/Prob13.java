public class Prob13 {
    public static void main(String[] args) {
        //13번
        //1~30까지 숫자중 짝수와 홀수를 모두 판정
        //1은 2는 3은 4는 5는 6은 7은 8은 9는 10은

        for(int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d는 짝수입니다!\n", i); }
            else {
                System.out.printf("%d는 홀수입니다!\n", i);

            }
        }

    }
}
