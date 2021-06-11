import java.math.BigInteger;
public class _99th_BigInteger {
    public static void main(String[] args) {
        final int N = 5; // 고정된 숫자(final)는 전부 대문자로 표기하는 것이 관습.
        BigInteger[] fibArr = new BigInteger[N];

        // BigInteger.ONE >> BigInteger 타입에서 제공하는 숫자 1.
        // BigInteger.ONE 과 같이 표현하는 것 외에 아래와 같이 표현할 수 있다..
        fibArr[0] = new BigInteger("1");
        fibArr[1] = BigInteger.ONE;

        for (int i = 2; i < fibArr.length; i++) {
            // BigInteger에서는 아래와 같이 add 매서드를 통해 연산.
            // 뺄셈은 subtract()를 사용
            // 곱셈은 multiply()를 사용
            // 나눗셈은 divide()를 사용
            // 나머지연산은 remainder()를 사용
            fibArr[i] = fibArr[i - 1].add(fibArr[i - 2]);
            System.out.println("fibArr[" + i + "] = " + fibArr[i]);
        }
        System.out.println("피보나치 수열의 N번째항 = " + fibArr[N - 1]);

        BigInteger two = new BigInteger("2");
        BigInteger veryBigNum = new BigInteger("2374923749237482384238482");
        System.out.println("2 - 2374923749237482384238482 = " +
                two.subtract(veryBigNum));
    }
}
// 정의된 정보보기: Ctrl + B, 돌아오기: Alt + <-방향키
// BigInteger: 무한 정수를 구현한 datatype.
//BigInteger는 메모리를 얼마나 사용하는가??
// int + int + int + int 필요할때마다 계속 동적할당해서 추가
// 32 비트 + 32 비트 + 32 비트 + 32 비트 + ... +
// 숫자 계산 체계를 새롭게 만든다.