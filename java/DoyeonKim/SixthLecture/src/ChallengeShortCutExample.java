public class ChallengeShortCutExample {
    public static void main(String[] args) {
//10번문제 정답
        // A가 500개
        // B가 30개
        // if (case A || case B)
        // 합격 케이스 500 + 불합격 500 + 추가검사 500개
        // if (case B || case A)
        // 합격 케이스 30개 + 불합격 970개 + 추가검사 970개
        
//or은 앞이 많은 케이스가 적게 연산한다
//and는 앞이 적은 케이스가 적게 연산한다

        //1~1000까지의 숫자중 2의 배수는 a
        // 1~
        int bigFrontCnt = 0, smallFrontCnt = 0;

        for (int i = 1; i <= 1000; i++) {
            if (((++bigFrontCnt != 0) && (i % 2 == 0)) || //a가 2의 배수니까 나누기 2
                    ((++bigFrontCnt != 0) && (i % 33 == 0))) {
                //둘중 하나가 참이면 참 근데 a명제 부터 시작

                ;
            }
            if (((++smallFrontCnt != 0) && (i % 33 == 0)) ||
                    ((++smallFrontCnt != 0) && (i % 2 == 0))) {
                ;

            }
        }

        System.out.println("큰놈이 앞에 있을 때 : " + bigFrontCnt);
        System.out.println("작은놈이 앛에 왔을 때 : " + smallFrontCnt);
    }
}