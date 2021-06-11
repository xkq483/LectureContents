public class WhileNumberTest {
    public static void main(String[] args) {
        int i = 0;

        System.out.println("i++은 다음 라인에서 연산이 진행됩니다.");
        //i++<10은 i 값을 1 더하고 10하고 비교하라는 뜻으로 볼 수 있음
        //i <10에 대한 조건을 검사를 먼저하고
        //while 문의 중괄호(본문)를 실행하기 직전에 값이 증가한다.
        // ++i 전위연산자 , i++후위 연산자

        while (i++ < 10) {
            //i=0, 0<10(참), i=1, 1 print

            System.out.println(i);

            // 따라서 1이 프린트 됨

            //i=0, 0<10(참), i=1, 1 print
            //i=1, 1<10(참), i=2, 2 print
            //...
            //i=9, 9<10(참), i=10, 10 print
            //i=10, 10<10(거짓)
        }

            i = 0; //이미 i는 10까지 증가해 있으니까 초기화
            System.out.println("++i은 해당 라인에서 연산이 진행됩니다.");
            while (++i < 10) {
                System.out.println(i);
            }
        }
    }
