import java.util.Scanner;
class Money{
    private final int YEAR = 10; // 10년
    private float[] AnnualIncome;
    // 생성자에서 YEAR만큼 index를 갖는 AnnualIncome[] 생성.
    // 다른 method들에서도 쓸 수 있게 Money class의 data로 설정.
    // 초봉에 인상률 곱하게 되면 소수로 나오기 때문에 float로 설정.

    public Money(String name) {
        this.AnnualIncome = new float[YEAR]; // 연봉 배열 생성
        AnnualIncome[0] = (int) (Math.random() * 1101 + 2400); // 초봉 설정
        calcAnnualIncome(); // 직원의 연차별 연봉을 배열의 값으로 설정하는 method 실행.
    }

    public void calcAnnualIncome(){ // 직원의 연차별 연봉을 배열의 값으로 설정하는 method
        for(int i = 1; i < YEAR; i++ ){
            AnnualIncome[i] = AnnualIncome[i-1] + AnnualIncome[i-1] * (float)((Math.random()*20 + 1)/100);
        }
    }
    public float getYearTenAnnualIncome(){
        return AnnualIncome[YEAR-1];
    } // 10년 후 연봉 return
    public float getAYearIncome(int year){
        return AnnualIncome[year-1];
    } // a년차 연봉 return
}

public class _1st_Quiz43Enhance {
    public static void main(String[] args) {
//        class array를 이용해서 랜덤 연봉 적용을
//        어떤 회사에 직원이 10명 있다.
//        10명의 이름은 적당히 지어주도록 한다.
//       이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
//       또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
//       10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍!
//       또한 연별로 평균 연봉값을 계산.

        // 1.직원수(n)를 Scanner로 입력
        // 2.'직원수' 만큼의 index를 갖는 배열 setting - employeeName[]
        // 3. for 이용해서 employeeName[]에 Scanner로 직원 이름 입력
        // 4. employeeName은 'Stirng type'의 배열이기 때문에 Money type을 이용하려면
        //    for 이용해서 'employeeName의 length'만큼의 index를 같는
        //    'Money type의 employee'배열을 만든다.
        // 5. for 이용해서 생성자 loop 실행하고 그 인자로 employeeName[]의 값들인 직원의 이름을 이용한다.
        // 6. 직원의 이름 class data로 설정
        // 7. 직원의 초봉 설정(1년차) x[0]
        // 8.  연봉의 인상률 계산
        // 9  그 직원의 연봉을 배열로 만듬 x[1] = 2년차 / x[9] = 10년차
        // 10. main에서 for문을 이용해서 각 직원의 10년 후 연봉을 print
        // 11. n년의 연봉 평균을 구하는 method 생성 - n년 각 직원의 연봉 합/직원수
        // 12. 11번을 class 내의 method로 생성하는 것 실패
        // 13. main에서 각 직원별 n년차 연봉 for문과 getter로 구하고 이를 이용해서 평균을 구함.
        Scanner scan = new Scanner(System.in);

        System.out.print("직원 수 n: "); // 직원수 Scanner 사용해서 입력
        int n = scan.nextInt();
        String[] employeeName = new String[n];
        // 직원수 만큼의 인자를 같는 String배열 생성(직원 이름 넣을 것이므로 String)

        for (int i = 0; i < n; i++) {
            scan.nextLine(); // java nextLine bug
            System.out.print("직원의 이름: ");
            employeeName[i] = scan.nextLine(); // 직원의 이름 Scanner로 입력
            System.out.println("Enter를 입력"); // java nextLine bug 인지용 멘트
        }
        Money[] employee = new Money[employeeName.length];
        // Money class를 datatype으로 하는 employee 배열 생성. 그 index수는 employeeName.length로 설정.

        for(int i = 0; i < employeeName.length; i++){
            employee[i] = new Money(employeeName[i]); // Constructor에 employeeName 배열의 값들을 인자로 받도록 함.
            System.out.printf("10년 후 %s의 연봉은: %.0f만원\n", employeeName[i], employee[i].getYearTenAnnualIncome());
            // 10년 후 연봉 출력
        }

        System.out.print("a년차 연봉을 구한다. a: ");
        int a = scan.nextInt();
        for(int i = 0; i < employeeName.length; i++){
            employee[i].getAYearIncome(a);
            System.out.printf("%s의 %d년차 연봉은: %.0f만원\n", employeeName[i], a, employee[i].getAYearIncome(a));
        }

        float AyearIncomesum = 0;
        for (int i = 0; i < employeeName.length; i++ ){
            AyearIncomesum += employee[i].getAYearIncome(a);
        }
        System.out.printf("직원들의 %d년차 연봉의 평균은: %.0f만원\n", a, AyearIncomesum/employeeName.length);
    }
}