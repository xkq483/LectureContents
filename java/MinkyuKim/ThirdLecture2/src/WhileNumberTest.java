public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;

        // i++에 해당되는 부분, 이게 뭘까?
        // 여기서 ++의 경우엔 더하기 1과 동일한 개념입니다.
        // i++ < 10은 i 값을 1 더하고 10 하고 비교하라는 뜻으로 볼 수 있음.
        // i < 10에 대한 조건 검사를 먼저하고
        // while 문의 중괄호(본문)를 실행하기 직전에 값이 증가합니다.

        // i++은 10까지 출력 - ++i는 9까지 출력. 이유는?
        // i++은 다음 라인에서 연산이 진행됩니다
        // ++i는 해당 라인에서 바로 연산이 진행됩니다.
        while(i++ < 10) {
            // 여기서 출력을 하고 다시 while 의 조건을 검사하러 올라간다.
            System.out.println(i);
        }
    }
}
