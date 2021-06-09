public class ChallengeShortCutExample {
    public static void main(String[] args) {
        // A가 500개
        // B가 30개
        // if (case A || case B)
        // 합격 케이스 500 + 불합격 500 + 추가검사 500
        // if (case B || case A)
        // 합격 케이스 30개 + 불합격 970개 + 추가검사 970개

        // 1 ~ 1000 까지의 숫자중 2의 배수
        // 1 ~ 1000 까지의 숫자중 33의 배수는 B

        int bigFrontCnt = 0, smallFrontCnt = 0;

        for (int i = 1; i <= 1000; i++) {
            //
            if ( ((bigFrontCnt++ != 0) && (i % 2 == 0)) ||
                    ((bigFrontCnt++ != 0) && (i % 33 == 0)) ) {
            }

            if ( ((smallFrontCnt++ != 0) && (i % 33 == 0)) ||
                    ((smallFrontCnt++ != 0) && (i % 2 == 0)) ) {
            }
        }

        System.out.println("큰게 앞에 있: " + bigFrontCnt);
        System.out.println("작은게 앞에 있: " + smallFrontCnt);
    }
}
