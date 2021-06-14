// 랜덤 연봉 적용을 해보자
// 어떤 회사에 직원이 10명 있다.
// 10명의 이름은 적당히 지어주도록 한다.
// 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
// 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
// 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
// 또한 연별로 평균 연봉값을 계산해보도록 한다.

// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01 사용)
// 7. 각 연도별 평균값에 대한 정보가 필요함


class SalaryTest3{
    final float PERSENT = 0.01f;

    int salary;
    String name;

    SalaryTest3(String name){
        this.name=name;
        salary = (int)(Math.random() * 1101 + 2400);
        }

        public void calcRandomSalary() {
        for (int i=0; i<10; i++){

        }
        }
    }



public class SelfTest43 {
    public static void main(String[] args) {

    }