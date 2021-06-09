import java.util.Scanner;

class Money {
    private final int YEAR = 10;
    private float[] AnnualIncome;
    // 생성자에서 YEAR만큼 index를 가지는 AnuualIncome[] 배열 생성
    // 다른 method에서도 쓸 수 있게 Money class의 data로 설정
    // 초봉에 인상률을 곱하게 되면 소수가 나오므로 float로 설정

    // Convention(규약)
    //나중에 팀 프로젝트 할 때도 팀간에 컨벤션 설정이 중요
    //전부 다 가져오는 것은 표기를 어떻게 하자
    //낱개로 가져오는 것은 표기를 어떻게 하자
    //위와 같은 규약에 따라 그냥 지금 생각나는대로 작성한 부분
    //calc_종류_변수 : 변수의 속성에 해당하는 종류 전체값을 전부 처리함
    //calcYearPay : pay 변수의 속성 year에 해당하는 전체값을 모두 처리
    //이 규약은 만들기 나름이고 팀 프로젝트를 하는 경우엔 반드시 필요함
    //왜냐하면 내가 만든 매서드를 다른 사람이 사용할 수도 있기 때문

    public Money(String name)   {
        this.AnnualIncome = new float[YEAR]; // this는 생성자의 매개변수로 선언된 변수의 이름이 인스턴스 변수와 같을 때 인스턴스 변수와 지역변수를 구분하기 위해서 사용한다.
        AnnualIncome[0] = (int)(Math.random() * 1101 + 2400);
        calcAnnualIncome();//다른 매서드 실행
    }

    public void calcAnnualIncome()  { // 직원의 연차별 연봉을 배열에 저장하는 method
        for (int i = 1; i < YEAR; i++ ) {
            AnnualIncome[i] = AnnualIncome[i-1] + AnnualIncome[i-1] * (float) ((Math.random() * 20 + 1 ) / 100 );
        }
    }

    public float getYearTenAnnualIncome() {
        return AnnualIncome[YEAR-1];
    }

    public float getYearIncome(int year) {
        return AnnualIncome[year-1];
    }
}

public class Review12_1 {
    public static void main(String[] args) {
        //무작정 따라해보자

        // static 매서드의 대표 예
        // int number = (int)Math.pow(2, 2);
        // 굳이 특정한 클래스에 소속될 필요없이 필요하면 항상 사용하는 녀석들
        // 이런 경우를 유틸리티 매서드라고 하는데
        // 이런 유틸리티 매서드들은 static 매서드로 만들어서 사용하곤 한다.
        // 필요하다면 클래스에 static 매서드를 만든다.
        // ex) Math.exp() ====> 오일러 상수 e^x 같은거 표현할때 쓰는 거
        // ex) Math.pow() ====> x^y 표현 등등
        // 결론적으로 앞의 Math <<< 라는것이 수학 관련 라이브러리임을 알려주고
        // 뒤에 exp, pow, sqrt 등이 어떤 매서드인지를 알려준다.
        // 현재 우리가 main 근처에 작성한 유틸리티 클래스는
        // Math나 기타 어딘가에 종속 돼있다고 표현하기도 애매한 상황
        // 그러므로 그냥 별도 클래스에 적지 않고 내부에 작성하였다.
        // 예를 들어 나중에 주식 관련 무언가를 만든다 가정한다면
        // Trade.inputName() 이런식으로 작성할 수도 있다.

        Scanner scan = new Scanner(System.in);

        System.out.print("직원 수 n : ");
        int n = scan.nextInt();
        String[] employeeName = new String[n]; //n만큼 employeeName 배열 생성

        for (int i = 0; i < n; i++) {
            System.out.print("직원의 이름 : ");

            if(i == 0)  {
                scan.nextLine();
            }
            employeeName[i] = scan.nextLine(); // 생성한 배열에 n명 이름 저장
        }

        Money[] employee = new Money[employeeName.length]; // n만큼 employee 배열 생성

        for (int i = 0; i < employee.length; i++)   {
            employee[i] = new Money(employeeName[i]);// Constructor에 employeeName 배열값을 인자로 넣는다.
            System.out.printf("10년 후 %s의 연봉은 %.0f만원\n", employeeName[i], employee[i].getYearTenAnnualIncome());
        }

        System.out.printf("a년차 연봉을 구한다. a : ");
        int a = scan.nextInt();
        for (int i = 0; i < employeeName.length; i++)   {
            employee[i].getYearIncome(a);
            System.out.printf("%s의 %d년차 연봉은: %.0f만원\n", employeeName[i], a, employee[i].getYearIncome(a));
        }
        float AyearIncomesum = 0;
        for (int i = 0; i < employeeName.length; i++ ){
            AyearIncomesum += employee[i].getYearIncome(a);
        }
        System.out.printf("직원들의 %d년차 연봉의 평균은: %.0f만원\n", a, AyearIncomesum/employeeName.length);



    }
}

