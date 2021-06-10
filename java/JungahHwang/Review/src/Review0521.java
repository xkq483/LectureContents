import java.math.BigInteger;
import java.util.Scanner;
// 클래스 배열 --------------------------------------------------------------------------
class ScoresTest {
    final int MAX = 5;

    float sum;
    float mean;
    int randArr[];

    public ScoresTest () {
        // 5개의 배열을 만들고 랜덤값을 생성함
        sum = 0;
        randArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            randArr[i] = (int)(Math.random() * 50 + 50);
        }
    }
    public void calcMean () {
        // 평균값
        for (int i = 0; i < MAX; i++) {
            sum += randArr[i];
        }

        mean = sum / (float)MAX;
        // 평균값을 구해 클래스의 max에 저장
    }

    public int[] getRandArr() {
        return randArr;
    }
    public float getSum() {
        return sum;
    }
    public float getMean() {
        return mean;
    }
    public int getMAX() {
        return MAX;
    }
}

public class Review0521 {
    public static void main(String[] args) {
        // 클래스 : 커스텀해서 만들 수 있는 데이터타입

        ScoresTest[] st; // = ScoresTest st[];
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt();

        st = new ScoresTest[num];
        // 클래스 형식의 커스텀 데이터 타입으로 만들어진 배열을 num개수만큼 만든다.
        // 그리고 st라는 변수명이 이 배열 메모리 공간을 관리한다.

        float totalSum = 0;
        float totalNumber = 0;

        // 객체들은 모두 독립적이라 각자의 sum값은 다름

        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest(); // 이 부분에서 객체1, 객체2, 객체3 .... 이 생성된다
            // 위의 public ScoresTest () 생성자가 호출되어 객체가 생성

            st[i].calcMean();
            totalSum += st[i].getSum(); // 전체 성적 합
            totalNumber += st[i].getMAX(); // 전체 학급수
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }
        // MAX가 5니까 for문을 돌때마다 5씩 더해짐

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));



        // equals------------------------------------------------------------------
        Scanner scan1 = new Scanner(System.in);
        // 문자열의 비교 방법

        String str = scan1.nextLine();

        if (str.equals("네")) {
            System.out.println("오 그래");
        } else if (str.equals("아니오")) {
            System.out.println("맞는말");
        } else {
            System.out.println("무조건 동의하세요!");}



        // BigInteger 큰 숫자 처리 방법 ----------------------------------------------

        final int MAX = 5;
        // 고정된 숫자는 전부 대문자로 표기

        BigInteger[] fibArr = new BigInteger[MAX];
        // 무한 정수를 구현한 데이터타입이라고 보면 됨

        // BigInteger.ONE 과 같이 표현하는 것 외에 아래와 같이 표현할 수도 있음
        // 진입은 Ctrl + B, 돌아오기 Alt + <- (화살표)
        fibArr[0] = new BigInteger("100");
        // BigInteger 타입에서 제공하는 숫자 1을 의미합니다.
        fibArr[1] = BigInteger.ONE;

        // 뺄셈은 subtract()를 사용
        // 곱셈은 multiply()를 사용
        // 나눗셈은 divide()를 사용
        // 나머지연산은 remainder()를 사용
        for (int i = 2; i < fibArr.length; i++) {
            // BigInteger에서는 아래와 같이 add 매서드를 통해 연산을 해야합니다.
            fibArr[i] = fibArr[i - 1].add(fibArr[i - 2]);
            System.out.println("fibArr[" + i + "] = " + fibArr[i]);
        }

        // int + int + int + int 필요할때마다 계속 동적할당해서 추가
        // 32 비트 + 32 비트 + 32 비트 + 32 비트 + ... +

        System.out.println("피보나치 수열의 n번째항은 = " + fibArr[MAX - 1]);

        BigInteger two = new BigInteger("2");
        BigInteger veryBigNum = new BigInteger("2374923749237482384238482");

        System.out.println("2 - 2374923749237482384238482 = " +
                two.subtract(veryBigNum));
    }
}