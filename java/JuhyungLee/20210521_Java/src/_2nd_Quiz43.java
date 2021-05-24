class annualIncome{
    final int MAX = 10; // 10년
    private float incomeArr[]; // 연봉을 배열로 만듬.

    public annualIncome(){
        incomeArr = new float[MAX];
        incomeArr[0] = (int)(Math.random()*1101 + 2400); // 첫 연봉 설정
        for(int i = 1; i < MAX; i++){
            incomeArr[i] = incomeArr[i-1] * (float)(Math.random()*0.2 + 1.01);
            //첫 연봉에 랜덤한 인상률을 곱해서 incomeArr배열에 setting
        }
    }
    public float getlastAnnulIncome() {
        return incomeArr[MAX-1];
    } // 10년차 연봉 getter
}

public class _2nd_Quiz43 {
    public static void main(String[] args) {
//        class array를 이용해서 랜덤 연봉 적용을
//        어떤 회사에 직원이 10명 있다.
//        10명의 이름은 적당히 지어주도록 한다.
//       이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
//       또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
//       10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍!
//       또한 연별로 평균 연봉값을 계산.

        annualIncome[] employee = new annualIncome[10];
        // 회사직원 employee[0]~employee[9]를 갖는 배열 employee를 만듬.
        for(int i = 0; i < 10; i++){
            employee[i] = new annualIncome();
            System.out.printf("10년 후employee[%d]의 연봉은: %f\n", i, employee[i].getlastAnnulIncome());
        }
    }
}
