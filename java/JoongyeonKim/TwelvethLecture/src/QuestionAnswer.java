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

public class QuestionAnswer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("직원 수 n: "); // 직원수 Scanner 사용해서 입력
        int n = scan.nextInt();
        String[] employeeName = new String[n];

        for (int i = 0; i < n; i++) {
            // scan.nextLine(); // java nextLine bug
            System.out.print("직원의 이름: ");

            if (i == 0) {
                scan.nextLine();
            }

            employeeName[i] = scan.nextLine(); // 직원의 이름 Scanner로 입력
            //System.out.println("Enter를 입력"); // java nextLine bug 인지용 멘트
        }
        Money[] employee = new Money[employeeName.length];

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