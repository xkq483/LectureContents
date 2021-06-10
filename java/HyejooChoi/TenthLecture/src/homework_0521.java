/*  랜덤 연봉 적용을 해보자
    어떤 회사에 직원이 10명 있다.
    10명의 이름은 적당히 지어주도록 한다.
    이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
    또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
    10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
    또한 연별로 평균 연봉값을 계산해보도록 한다. */

class Income {
    private int salary; // 연봉
    private float randomIncrease; // 랜덤인상률


    // 클래스의 생성자
    public Income () {
        Income salary = new Income();
        Income randomIncrease = new Income();
    }

    public void salary () {
        // 초봉 2400~3500의 랜덤값은 (Math.random) * 1100 + 2400 으로 구하고
        salary = (int)((Math.random() * 1100 + 2400));
    }

    public void RandomIncrease () {
        // 연봉 인상 1% ~ 20%는 어떻게 구할까요?
        randomIncrease = ((float)(Math.random() * 0.19f + 0.1f));
    }

    // getter, setter 영역
    public int getSalary() {
        return salary;
    }

    public float getRandomIncrease() {
        return randomIncrease;
    }

}

// 생성자, 메소드를 구현하는 방법을 아직 잘 모르겠습니다.
// 코드를 보고 각자 어떤 역할을 하는지는 대충 감이 오는데, 프로그래밍을 직접하는건

public class homework_0521 {

    public static void main(String[] args) {
        Income income = new Income();
        System.out.println();
    }


}
