class EmployeeAnnualIncome{

    //못풀겠습니다..
    int randIncreaseRate;
    int randAnnualIncome;
    float incomeAvg;

    EmployeeAnnualIncome(){

        randAnnualIncome = (int)(Math.random() * 1200 + 2400);
        randIncreaseRate = (int)(Math.random() * 20 + 1);



        }
    }




public class QuizTest43 {
    public static void main(String[] args) {
        // 랜덤 연봉 적용을 해보자 어떤 회사에 직원이 10명 있다. 10명의 이름은 적당히 지어주도록 한다.
        // 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
        // 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
        // 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
        // 또한 연별로 평균 연봉값을 계산해보도록 한다.


        String[] employeeName = {"김모모", "이모모", "안모모", "박모모", "최모모", "강모모", "황모모", "임모모", "반모모", "주모모"};
        EmployeeAnnualIncome ep = new EmployeeAnnualIncome();


    }
}
