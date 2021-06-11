// 랜덤 연봉 적용을 해보자
//어떤 회사에 직원이 10명 있다.
//10명의 이름은 적당히 지어주도록 한다.
//이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
//또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
//10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
//또한 연별로 평균 연봉값을 계산해보도록 한다.

// ----------어떻게 짜야할지 구상? ------------
/* 직원 class
   {
        변수선언 및 초기화부분..(직원이름, 연봉, 증가율 등등)

       1. 연봉반환해주는 메서드() {}
       2. 인상률 반환해주는 메서드() {}
       3. 다음년도연봉 구하는 메소드() {}
       4. 받아서 연산 + 출력하는 메서드() {}

   }

   메인 class{}



 */
class Employee
{
    final int MAX= 10;

    private String[] str = {"가","나","다","라","마","바","사","아","자","차",};  //직원 이름 배열에 초기화
    private float income[]= new float[MAX]; // 연봉
    private float increase[]= new float[MAX]; // 연봉인상률
    private float nextYearIncome[]= new float[MAX]; // 다음년도 연봉
    private float sum;  // 연봉 합계

    private int year=1;
    int i;

    public Employee()
    {
        for(int i=0; i<MAX; i++)
        {
            income[i]= getIncome();
            increase[i]= getIncrease();
        }
    }

    private void calcNextIncome()
    {
        for(int i=0; i<MAX; i++)
        {
            nextYearIncome[i]= income[i]+(income[i]*increase[i]);
        }
    }

    public void calcIncome(int year) {
        for (int j = 0; j < year; j++)
        {
            sum = 0;

            calcNextIncome();

            for (int i = 0; i < MAX; i++)
            {
                sum += income[i]; // sum= sum + 현재연봉

                System.out.printf("[%s]의 %d년차 연봉= %.2f만원 \t |   ", str[i], year, income[i]);
                System.out.printf("연봉인상률= %.2f%%   -------->   ", increase[i]);
                System.out.printf("%d년차 연봉= %.2f만원    \t   \n", year + 1, nextYearIncome[i]);

                income[i] = nextYearIncome[i]; // 현재연봉 = 다음년도연봉
            }
            System.out.println("");
            System.out.printf("%d년차 직원연봉 합계= %.2f\n", year, sum);
            System.out.printf("%d년차 직원연봉 평균= %.2f\n", year, sum / 10);
            System.out.println("=============================================================================================");


        }
    }


    private int getIncome()
    {
        return (int)(Math.random()*1100+2400);
    }

    public float getIncrease()
    {
        return ((float)(Math.random()*20+1) / 100); // 랜덤 인상률
    }

}
public class Prob43 {
    public static void main(String[] args) {
        Employee ep = new Employee();

        ep.calcIncome(10);
    }

}
