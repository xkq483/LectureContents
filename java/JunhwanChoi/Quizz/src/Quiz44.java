class Employee2
{
    final int MAX= 10;
    final float PERSENT= 0.01f;

    private String[] str = {"가","나","다","라","마","바","사","아","자","차",};  //직원 이름 배열에 초기화
    private float income[]= new float[MAX]; // 연봉
    private float increase[]= new float[MAX]; // 연봉인상률
    private float nextYearIncome[]= new float[MAX]; // 다음년도 연봉
    private float sum;  // 연봉 합계

    private int year=1;
    int i;

    public Employee2()      //생성자부분  : 생성자: 초기화만 해주는것이 좋다 (출력, 계산 등등 지양)
    {
        for(int i=0; i<MAX; i++)
        {
            income[i]= getIncome();
            increase[i]= getIncrease();
        }
    }

    private void calcNextIncome()   // 다음년도 연봉구하는 메소드
    {
        for(int i=0; i<MAX; i++)
        {
            nextYearIncome[i]= income[i]+(income[i]*increase[i]);
        }
    }
    private  void calcSum()    // sum구하는 메소드
    {
        for (int i = 0; i < MAX; i++)
        {
            sum += income[i]; // sum= sum + 현재연봉

            System.out.printf("[%s]의 %d년차 연봉= %.2f만원 \t |   ", str[i], year, income[i]);
            System.out.printf("연봉인상률= %.2f%%   -------->   ", increase[i]);
            System.out.printf("%d년차 연봉= %.2f만원    \t   \n", year + 1, nextYearIncome[i]);

            income[i] = nextYearIncome[i]; // 현재연봉 = 다음년도연봉
        }
    }

    public void calcTotalIncome(int year) {
        for (int j = 0; j < year; j++)
        {
            sum = 0;

            calcNextIncome();   // 다음년도 연봉구하는 메소드

            calcSum();  // 합계 구하는 메소드

            printSum(); // 출력

        }
    }

    public void printSum()  // 평균, 합계 출력
    {
        System.out.println("");
        System.out.printf("%d년차 직원연봉 합계= %.2f\n", year, sum);
        System.out.printf("%d년차 직원연봉 평균= %.2f\n", year, sum / 10);
        System.out.println("=============================================================================================");
    }


    private int getIncome()
    {
        return (int)(Math.random()*1100+2400);
    }

    public float getIncrease()
    {
        return ((float)(Math.random()*20+1) *PERSENT); // 랜덤 인상률
    }

}
public class Quiz44 {
    public static void main(String[] args) {
        Employee2 ep = new Employee2();

        ep.calcTotalIncome(10);
    }

}