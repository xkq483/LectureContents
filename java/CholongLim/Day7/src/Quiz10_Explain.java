public class Quiz10_Explain {
    public static void main(String[] args) {
        int bigFrontCnt = 0, smallFrontCnt = 0;

        for (int i = 1; i <= 1000; i++) {
            if (((++bigFrontCnt != 0) && (i % 2 == 0)) ||
                    ((++bigFrontCnt != 0) && (i % 33 == 0))) {
                ; // 아무것도 안합니다라는 뜻의 코드입니다.
            }

            if (((++smallFrontCnt != 0) && (i % 33 == 0)) ||
                    ((++smallFrontCnt != 0) && (i % 2 == 0))) {
                ;
            }
        }

        System.out.println("큰놈이 앞에 있을때: " + bigFrontCnt);
        System.out.println("작은놈이 앞에 있을때: " + smallFrontCnt);

        int bcnt = 0, scnt = 0;

        for (int i = 1; i <= 1000; i++) {
            // 아래와 같은 코드는 조건이 몇 번 검사되었는지를 보는 것이 아니라
            // if 문이 몇 번 통과되었는지를 체크하는 cnt(카운트) 값에 해당한다.
            if ((i % 2 == 0) || (i % 33 == 0)) {
                bcnt++;
            }

            // 이하 동문
            if ((i % 33 == 0) || (i % 2 == 0)) {
                scnt++;
            }
        }

        System.out.printf("많은 수/작은 수가 있던 이 경우는 모두 %d, %d", bcnt, scnt);
    }
}

