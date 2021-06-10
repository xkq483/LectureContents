public class AverageWithForTest {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum +=i ;                       //i 는 1부터 10까지 10번 반복시키면서 그에 대한 i의 값을 sum에 더하여 저장
        }
        System.out.println("합계는 :" +sum);

        float average = sum / 10.0f;
        System.out.println("평균 : " + average);

        average = sum / 10;  // 그냥 10으로 나누게되면 소수점이 빠지고 정수값만 결과로 출력됨 10은 정수고 average는 float로 선언이 되어있기때문
        System.out.println("평균 : " + average);
    }


}
