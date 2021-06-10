public class Review0512 {
    public static void main(String[] args) throws InterruptedException {

        //for--------------------------------------------------------------

        for(int i = 1; i <= 10; i+=2) { System.out.println("i = " + i);}
        //for (초기화 코드; 조건식 코드; 증감식 코드) {동작시킬 코드}로 구성
        //초기화 코드는 최초 한 번만 실행
        //조건식 코드는 (중괄호 파트)로 진입하기 위한 조건
        //증감식 코드는 내부의 동작이 완료된 이후 동작할 코드
        //초기화->조건식->증감식->조건식->증감식...을 반복하다가 조건이 위배되면 종료


        for(int i = 1, j = 0; ; i++, j--)
        {System.out.println("i = " + i + ", j = " + j);}
        //i에는 1을 더하고 j에는 1을 빼며 무한반복하는 코드


        int sum = 0;
        for (int i = 1; i <= 10; i++) { sum += i;
            System.out.println("sum = " + sum); }
        System.out.println("최종 합산 값 = " + sum);

        //1
        float average = sum / 10;
        System.out.println("평균 = " + average);
        //2
        average = sum / 10.0f;
        System.out.println("평균 = " + average);

        // 위의 결과가 다른 이유
        // 1번은 sum이 int형, 숫자 10도 int형 (기본적으로 정수는 int, 소수점은 double)
        // sum은 int형이지만 나누는 숫자가 소수점(float)이기 때문에
        // 강제로 소수점 연산이 수행되어 5.5라는 결과를 얻게됨



        //Random---------------------------------------------------------------

        System.out.println("주사위 눈금을 굴려봅시다");

        while (true) {
            System.out.println((int)(Math.random() * 6 +1));
            //Math.random 는 [0.0-1.0) > 0.0이상-1.0미만을 의미
            //int 는 정수형이므로 소수점 아래를 버리고 정수로 표현
            //Math.random()은 Uniform Random(모든 항목이 동일한 확률을 가짐)
            Thread.sleep(500);
            //1초 1000밀리세컨드(mills)
            //Thread.sleep > 0.5초 대기하라는 의미로 0.5초마다 출력됨

    }
}}
