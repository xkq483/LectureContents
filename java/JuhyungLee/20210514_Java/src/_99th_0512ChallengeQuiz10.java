public class _99th_0512ChallengeQuiz10 {
    public static void main(String[] args) {
        // 1000개의 case가 있다
        // A case 700개 / B case 240개
        // C case 30개  / D case 350개  / F case 500개
        // 'C 또는 F면 통과'라고 할 때, 이를 판정하는 횟수.
        // if (case F || case C)
        // F case 500 + 나머지 case 500 + 추가검사 500개
        // if (case C || case F)
        // C case 30개 + 나머지 case 970개 + 추가검사 970개

        // 위의 시나리오를 숫자중의 배수 판별하는 시나리오로 바꾸면
        // 1 ~ 1000까지의 숫자중 2의 배수는 F
        // 1 ~ 1000까지의 숫자중 33의 배수는 C
        int bigFrontCnt = 0, smallFrontCnt = 0;

        for (int i = 1; i <= 1000; i++) {
//            if (i % 2 == 0 || i % 33 == 0) {
//                cnt++;
//            }
//             주석으로 막은 if문에서는, 하나만 검사할때도 cnt가 증가,
                // 둘 다 검사할때도 cnt가 증가.
                // 확인하고자 하는 것은 검사가 총 몇 번 발생가? 이다.
                // 그러므로 각 검사마다 값의 cnt(카운트)값을 증가시켜야함.

                // 따라서 각 검사마다 카운트를 할 수 있도록
                // 카운트를 하는 코드와 검사 코드를 하나로 묶는다.
                // 카운트 하는 코드는 전위연산자(++a)로 배치하여 무조건 0이 아니게 만들면 참이다. >> cnt 1씩 증가
                // AND 연산의 특성상 뒤의 조건을 확인해야하므로, 무조건 cnt는 증가하고 뒤의 조건을 확인하게 된다.


                if (((++bigFrontCnt != 0) && (i % 2 == 0)) || ((++bigFrontCnt != 0) && (i % 33 == 0))) {
                    ;
                }
                if (((++smallFrontCnt != 0) && (i % 33 == 0)) || ((++smallFrontCnt != 0) && (i % 2 == 0))) {
                    ;
                }
            }
            System.out.println("큰놈이 앞에 있을때: " + bigFrontCnt);
            System.out.println("작은놈이 앞에 있을때: " + smallFrontCnt);
        }
    }
