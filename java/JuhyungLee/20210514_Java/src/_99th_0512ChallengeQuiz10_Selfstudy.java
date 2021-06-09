public class _99th_0512ChallengeQuiz10_Selfstudy {
    public static void main(String[] args) {

        int bigFrontCnt = 0, smallFrontCnt = 0;
        for (int i = 1; i <= 10; i++) {

            if (((++bigFrontCnt != 0) && (i % 2 == 0)) || ((++bigFrontCnt != 0) && (i % 3 == 0))) {
                ;
            }
            if (((++smallFrontCnt != 0) && (i % 3 == 0)) || ((++smallFrontCnt != 0) && (i % 2 == 0))) {
                ;
            }
        }
        System.out.println("큰놈이 앞에 있을때: " + bigFrontCnt);
        System.out.println("작은놈이 앞에 있을때: " + smallFrontCnt);
    }
}

//   2의배수인가? | 3의 배수인가? (체크하는지 안 하는지의 여부)
//1     Check       Check
//2     Check
//3     Check       Check
//4     Check
//5     Check       Check
//6     Check
//7     Check       Check
//8     Check
//9     Check       Check
//10    Check
    // 총 15번 Check
//   3의배수인가? | 2의 배수인가? (체크하는지 안 하는지의 여부)
//1     Check       Check
//2     Check       Check
//3     Check
//4     Check       Check
//5     Check       Check
//6     Check
//7     Check       Check
//8     Check       Check
//9     Check
//10    Check       Check
    // 총 17번 Check