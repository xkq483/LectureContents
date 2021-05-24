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
    final int MAX= 10;  // 10명의 for문을 돌리기 위해 작성 = (str.length)

    private String[] str = {"가","나","다","라","마","바","사","아","자","차",};  //직원 이름 배열에 초기화
    private float income[]= new float[MAX]; // 연봉
    private float increase[]= new float[MAX]; // 연봉인상률
    private float nextYearIncome[]= new float[MAX]; // 다음년도 연봉
    private float sum;  // 연봉 합계

    private int year=1; // while문 돌리기 위해 미리 초기화
    int i;

    public Employee()   // income[i]와 increase[i]에 각각 랜덤값를 받음
    {
        for(int i=0; i<MAX; i++)
        {
            income[i]= getIncome();  // income[i]에 2400~3500사이의 연봉값 저장
            increase[i]= getIncrease();   // increase[i]에 인상률 저장
        }
    }

    private float next_income()     // 다음년도 연봉을 구해서 전달하기 위한 메소드
    {
        for(int i=0; i<MAX; i++)
        {
            nextYearIncome[i]= income[i]+(income[i]*increase[i]); // 다음년도 연봉 = 현재연봉 + (현재연봉 * 인상률)
        }

        return nextYearIncome[i];
    }

    public void finish()
    {
        while (year<=10)    // 10년차만큼  while문을 돌림
        {
            sum=0;  // while문을 다시 돌때마다 sum을 0으로 초기화

            next_income();  // 질문: 다음년도 연봉을 가져옴? 이라고 해석해도 될까요?
                            // nextYearIncome[0] ~ nextYearIncome[9]의 값만 가져오게 되는건가요??
                            // return의 개념을 잘 모르겠습니다..

            for(int i=0; i<MAX; i++)
            {
                sum+=income[i]; // sum= sum + 현재연봉

                System.out.printf("[%s]의 %d년차 연봉= %.2f만원 \t |   ",str[i],year,income[i]);   // float 연산을 할때 모든 연산에서 조금의 오차가 발생하는데
                                                                                                // 코드가 오류인건지 원래 이런건지 모르겠습니다..
                                                                                                // ex) 1년차연봉= 3092만원  | 연봉인상률= 0.12%  --> 2년차 연봉 = 3459.85만원  이렇게 출력됩니다..
                                                                                                //                                           --> 계산기로 해봤을때는 3463.04가 나와야 정상..
                System.out.printf("연봉인상률= %.2f%%   -------->   ", increase[i]);
                System.out.printf("%d년차 연봉= %.2f만원    \t   \n",year+1, nextYearIncome[i]);

                income[i]= nextYearIncome[i]; // 현재연봉 = 다음년도연봉
            }

            System.out.println("");

            System.out.printf("%d년차 직원연봉 합계= %.2f\n", year, sum);
            System.out.printf("%d년차 직원연봉 평균= %.2f\n", year, sum / 10);

            System.out.println("=============================================================================================");

            year++;
        }
    }


    private int getIncome()     // 현재연봉을 2400 ~ 3500의 랜덤 값으로 던져주기 위한 메소드
    {
        return (int)(Math.random()*1100+2400);
    }

    public float getIncrease()  // 0.01 ~ 0.2의 랜덤인상률을 던져주기 위한 메소드
                                // 질문 : 랜덤값을 실수로 던져주려고 (Marh.randon())앞에 (float)로 지정해서 코드를 구성했는데,
                                // 맞게 작성된 코드가 맞을까요?? 오류는 없어서 그대로 썼습니다...
    {
        return ((float)(Math.random()*20+1) / 100); // 랜덤 인상률
    }

}

public class Quiz43 {
    public static void main(String[] args) {
        Employee ep = new Employee();

       ep.finish();
    }

}
