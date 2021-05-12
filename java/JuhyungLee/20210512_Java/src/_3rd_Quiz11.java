public class _3rd_Quiz11 {
    public static void main(String[] args) {

//        Quiz 11. for 사용해서
//        1~10까지 출력하는 프로그램 만들기
        for(int i = 1; i <= 10; i++){
                System.out.printf("%3d", i);
            // %3d는 먼저 %d가 정수형 숫자를 출력하는 역할을 수행함을 상기.
            // %3d에서 '3'의 의미는 '3칸을 확보'하라는 뜻이다.
            // 숫자 '10'의 경우 '2칸'을 차지하니까
            // '%2d'를 사용했다면 9와 10이 구별이 안됨. 이런식으로 될거임 >> 7_8_910

                if(i % 5 == 0){
                    System.out.println();
                    // i 값이 5로 나눠서 떨어지면 앤터 적용
                    // 아무것도 출력 안하고 앤터만 적용함(println()) >> 5에서 줄바꿈 되는 식으로 추출.

                }
            }
        }
    }
