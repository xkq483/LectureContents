public class RandomTest {
    public static void main(String[] args) {
        for (;;) {

            System.out.println( (int)  (Math.random() * 10) );

            // math.random()은 0~1까지의 소수점 데이터만 출력한다고 했고
            // matt.random() * 10이 여기가 10배를 곱한다는거지? 그 앞에 System.out.println은 줄바꾸면서
            // 출력을 해준다는 거고
            // 그리고 계속 반복되는 이유가 break인가 를 안써서 그렇다고 하셨던것 같은데...
            // double이 아니라 int를 썼기 때문에 정수만 나와서 소수점은 그냥 버리는 거고
            // 결국 0~9까지의 정수가 나온다?

        }
    }
}