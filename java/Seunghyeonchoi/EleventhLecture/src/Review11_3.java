class AnnualSalary  {
    final float PERCENT = 0.01f;

    String name;
    int salary;
    // 3. public a에서 초봉 랜덤으로 구하기.
    public AnnualSalary(String name)   {
        this.name = name;
        salary = (int) (Math.random() * 1101 + 2400); // 1100이 아니라 1101
    }
    // 4. public b에서 해마다 연봉 인상률 구하기
    // 5. public c에서 연별 연봉값 구하기  ->>>>>4, 5 쪼개니깐 아래서 못불러오겠다....

    //이건 확장성 안 좋은 버전
    public void calcRaise   (int year) {
        float raise;

        for (int i = 0; i < year; i++) {
            raise = (int) (Math.random() * 20 + 1);
            // 원가 + 증액분
            salary = (int) (salary + salary * raise * PERCENT);
        }
    }


    public void calcRaise ()    {
        float raise = (int) (Math.random() * 20 + 1);
        salary = (int)(salary + salary * raise * PERCENT);
    }
    // 6. public d에서 연별 평균 연봉값 구하기
    // 7. public e에서 10년후 연봉값 구하기
    // 이거는 여기서 위에 만든 걸로 충분하고 아래 main에서 처리하자

    public void printAnnualSalary () {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);
    }





    public int getSalary()  {
        return salary;
    }

}

public class Review11_3 {
    public static void main(String[] args) {
        ////////43. 클래스 배열 문제
        //        //랜덤 연봉 적용을 해보자
        //        //어떤 회사에 직원이 10명 있다.
        //        //10명의 이름은 적당히 지어주도록 한다.
        //        //이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
        //        //또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
        //        //10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
        //        //또한 연별로 평균 연봉값을 계산해보도록 한다.   -> 배열로 저장해두면 나중에 계산할 때 편하겠지?

        // 1. 회사원 10명 이름 입력
        // 2. 클래스 작성 시작
        // 3. public a에서 초봉 랜덤으로 구하기.
        // 4. public b에서 해마다 연봉 인상률 구하기
        // 5. public c에서 연별 연봉값 구하기
        // 6. public d에서 연별 평균 연봉값 구하기
        // 7. public e에서 10년후 연봉값 구하기
        // 8. 이제 main에서 class값만 불러오기


        // 1. 회사원 10명 이름 입력
        String[] employeesNameArr = {"김씨", "이씨", "정씨", "고씨", "최씨", "강씨", "임씨", "백씨", "박씨", "남궁씨"};

        // 8. 이제 main에서 class값만 불러오기

        int nameLength = employeesNameArr.length; // 사원 숫자 뽑아내기
        AnnualSalary[] cd = new AnnualSalary[nameLength]; // 사원 숫자만큼 배열 생성

        for (int i = 0; i < nameLength; i++)    {
            cd[i] = new AnnualSalary(employeesNameArr[i]);
        }

        for (int i = 0; i < 10; i++)    {

            float sum = 0; //초기화

            for (int j = 0; j < nameLength; i++)    {
                cd[j].calcRaise();//초봉 설정
                sum += cd[j].getSalary();// 각 사원의 초봉 합산
                cd[j].printAnnualSalary();
            }
            System.out.printf("%d년차 사원 평균 연봉은 %f다\n", i + 1, sum / 10.0f);
        }



    }
}