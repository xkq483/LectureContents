public class AverageFor {
    public static void main(String[] arg) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " + sum);

        //주석과 관련된 작업 주의 사항

        float average = sum / 10;
        System.out.println("평균 = " + average);

        //위와 다름 값이 출력되는 이유는 sum이 int형, 숫자도 10도 default로 int형이기때문
        // sum은 int형이지만 float는 소수점이기때문에 자동형변환되어 5.5결과값이 추력됨
        average = sum / 10.0f;
        System.out.println("평균 =" + average);
    }
}
