public class b_Quiz10 {
    public static void main(String[] args) {
        int bcnt = 0, scnt = 0;

        for (int i = 1; i <= 1000; i++) {
            // 아래와 같은 코드는 조건이 몇 번 검사되었는지를 보는 것이 아니라
            // if 문이 몇 번 통과되었는지를 체크하는 cnt(카운트) 값에 해당한다.
            // 공배수 제외하면 515개가 출력됨
            if ((i % 2 == 0) || (i % 33 == 0)) {
                //500 || 30
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
