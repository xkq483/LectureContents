public class SampleTest {
    public static void main(String[] args) {
        // 3번 문제
        // 숫자 3이 짝수인지 홀수인지 판별

        // 문제에서 숫자 3이 짝수인지 홀수인지 판별하라고
        // 했기 떄문에 숫자 3이 필요해서 적은건가요 ?
        int num = 3;

        // 3 나누기 2는 몫이 1, 나머지가 1이니까 0이 아님(거짓 ???)
        // 거짓이니까 else 로 가는게 맞는건가요 ?
        // else로 갔으니까 홀수 판정이 됩니다.
        if (num % 2 == 0) {
            System.out.println("이 숫자는 2의 배수(짝수)입니다.");
        } else {
            System.out.println("이 숫자는 2의 배수가 아닙니다.(홀수)");
        }
    }
}
