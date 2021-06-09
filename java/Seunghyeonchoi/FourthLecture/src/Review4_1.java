public class Review4_1 {
    public static void main(String[] args) throws InterruptedException {
        //for문
        //초기화 코드 ; 조건식 코드; 증감식 코드  로 구성
        //초기화는 최초 진입시 한 번만
        //조건식은 for {} 안으로 진입하기 위한 조건
        //증감식은 for {} 동작이 완료된 이후 동작할 코드
        //이후 다시 조건식으로 가서 조건을 만족하면 다시 {} 안으로 진입-> 루틴 반복
        //조건식 코드를 만족하지 못한다면 for문 종료

        //주의점 : 작거나 같다(<=)는 작아도 true, 같아도 true, 크면 false
        //        작다(<)는 작으면 true, 같으면 false, 커도 false
        for(int i = 1 ; i <= 10 ; i+=2) {
            System.out.println("i =" +i);
        }

        //while(true)와 다르게 for문은 무조건이라는 식을 만들 수 있다.
        //조건부에 아무것도 없다는 것은???  무조건
        // (초기화 ;  ; 증감식) 이렇게

        /*for(int i=1, j=0 ;  ; i++, j--) {
            System.out.println("i = " +i + ",j = " +j);
        }*/

        //11. for 문제 1
        //1 ~ 10까지 출력하는 프로그램을 만들어보자!
        for(int i1 =1 ; i1<=10 ; i1++)  {
            System.out.println(+i1);
        }

        //12. for 문제 2
        //1 ~ 20에서 3의 배수를 출력하는 프로그램을 만들어보자(if 문 없이!)
        for(int i2=3 ; i2<=20 ; i2+=3)  {
            System.out.println(+i2);
        }

        //13. for + if 문제
        //1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
        for(int i3=1 ; i3<=30 ; i3++)   {
            if (i3 % 2 == 0)    {
                System.out.printf("%d는 짝수\n", i3);
            }else {
                System.out.printf("%d는 홀수\n", i3);
            }
        }

        //for문을 활용한 합산 + 정수형 / 정수형 & 정수형 / 소수점 차이

        int sum = 0;

        for (int i = 1; i <= 10; i++)    {
            sum += i;
            System.out.println("sum = " + sum);
        }
        System.out.println("최종 합산 값 = " +sum);

        float average = sum / 10;
        System.out.println("평균 = "+average);

        //최종 합산 값 = 55
        //평균 = 5.0
        //위처럼 출력
        //이유? sum이 int형, 숫자 10도 default로 int형
        //(기본적으로 정수는 int, 소수점은 double을 채택함)

        //sum은 int형이지만 나누는 숫자가 소수점(double)이기 때문에
        //강제로 소수점 연산이 수행되어 5.5라는 결과가 나옴

        average = sum / 10.0f;
        System.out.println("평균 = " +average);

        //for (;;)    {
            //Math.random()은 [0~1)에 해당하는 소주점 데이터를 출력합니다.
            //0.0 이상 1.0 미만 사이의 소수점
            //여기에 10을 곱하면?
            //0.0 이상 10.0 미만
            //소수점이지만 값을 int로 처리하면 소수점은 버려진다
            //0~9로 출력되겠지

            //System.out.println((int) (Math.random()*10));

        System.out.println("주사위를 굴려볼까요");

        while (true)    {

            //랜덤에도 종류가 있다
            //가우시안 랜덤, 푸아송 분포, 이항 분포, 기하 분포 등등
            System.out.println((int) (Math.random()*10));

            Thread.sleep(500);

        }

    }
}
