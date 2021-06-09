// 배운거 복습

public class Quiz26 {
    public static void main(String[] args) {

                // A가 500개
                // B가 30개
                // if (case A || case B)
                // 합격 케이스 500 + 불합격 500 + 추가검사 500개
                // if (case B || case A)
                // 합격 케이스 30개 + 불합격 970개 + 추가검사 970개

                // 1 ~ 1000까지의 숫자중 2의 배수는 A
                // 1 ~ 1000까지의 숫자중 33의 배수는 B
                int bigFrontCnt = 0, smallFrontCnt = 0;


                for (int i = 1; i <= 1000; i++) {
                    // if (i % 2 == 0 || i % 33 == 0) {
                    //     cnt++;
                    // }
                    // 위 코드에서는 하나만 검사할때도 cnt가 증가
                    // 둘 다 검사할때도 cnt가 증가한다.
                    // 우리가 확인하고자 하는 것은 검사가 총 몇 번 발생하는지다.
                    // 그러므로 각 검사마다 값의 cnt(카운트)값을 증가시켜야한다.

                    // 그러니까 각 검사마다 카운트를 할 수 있도록
                    // 카운트를 하는 코드와 검사 코드를 하나로 묶어놓은 것이다.
                    // 카운트 하는 코드는 전위연산자로 배치하여 무조건 0이 아니게 만들면 참이다.
                    // AND 연산의 특성상 뒤의 조건을 확인해야하므로
                    // 무조건 카운트는 증가하고 뒤의 조건을 확인하게 된다.
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
            }
        }

