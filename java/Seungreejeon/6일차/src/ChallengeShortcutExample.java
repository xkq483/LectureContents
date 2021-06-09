public class ChallengeShortcutExample {
    public static void main(String[] args) {
        int bigFrontCnt = 0, smallFrontcut = 0;
        // A가 500개
        // B가 30개
        // if (case A || case B)
        // 합격 케이스 500 + 불합격 500 + 추가검사 500개
        // if (case B || case A)
        // 합격 케이스 30개 + 불합격 970개 + 추가검사 970개


        // 1 ~ 1000까지의 숫자중 2의 배수는 A
        // 1 ~ 1000까지의 숫자중 33의 배수는 B
        for (int i = 0; i <= 1000; i++) {
            if (((++bigFrontCnt != 0) && (i % 2 == 0)) ||
                    ((++bigFrontCnt != 0) && (i % 33 == 0))) {
            }
                ; //아무것도 안한다는 뜻
                if (((++smallFrontcut != 0) && (i % 33 == 0)) ||
                        ((++smallFrontcut != 0) && (i % 2 == 0))) {
                    ;
                }
        }

        System.out.println("케이스수가 많은 A가 앞 에있는 경우" + bigFrontCnt);
        System.out.println("케이스수가 적은 B가 앞 에있는 경우" + smallFrontcut);
    }
}