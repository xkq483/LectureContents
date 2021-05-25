import java.util.Scanner;

class Salary_Print {
    Scanner sc;
    String name; //이름
    float sum; //합계
    int yearArr[]; //연봉 배열
    float yearRate[]; // 인상률 배열

    Salary_Print() {
        Customize();
        Year_Setting();
        First_Salary();
        Year_Print();
    }
    //초봉 설정
    void First_Salary() {
        RandomMoney(a,b);
        yearArr[0] =  (int)random_Money;
        sum += random_Money;
    }

    int rate; //입력한 인상률 범위
    //연봉 인상범위
    void RandomRate(int rate) {
        randome_Rate = (float) (Math.random() * rate + 1)/100;
    }
    //연도 설정
    void Year_Setting() {
        System.out.printf("원하는 기간 설정 : ");
        int year = sc.nextInt();
        yearArr = new int[year];
        yearRate = new float [yearArr.length];
    }
    //연도별 연봉 배열 초기화
    void Year_Print() {
        for (int i = 1; i < yearArr.length; i++) {
            RadomMoneyIc();
            yearArr[i] = (int)inMoney;
            random_Money = inMoney;
            yearRate[i] = randome_Rate;
        }
    }

    float random_Money; //연봉
    int a,b; //연봉 인상범위 범위 시작 값 a 최대값 b

    //연봉 범위
    void RandomMoney(int a, int b) {
        random_Money = (float) (Math.random() * (a+1-b) + b);
    }

    float randome_Rate ; //랜덤 인상률
    float inMoney ; // 연봉 증가

    //연봉 증가 , 연봉 sum에 추가
    void RadomMoneyIc() {
        RandomRate(rate);
        inMoney = (randome_Rate*random_Money+ random_Money);
        sum += inMoney;
    }
    //이름,연봉,인상률 설정
    void Customize() {
        sc = new Scanner(System.in);
        System.out.printf("사원이름 : ");
        this.name = sc.nextLine();
        System.out.printf("원하는 연봉 시작 범위 입력 : ");
        b = sc.nextInt();
        System.out.printf(b+" ~ x 까지 원하는 연봉 범위 입력 : ");
        a = sc.nextInt();
        RandomMoney(a,b);
        sc.nextLine();
        System.out.printf("1 ~ x 원하는 연봉 인상범위 : ");
        rate = sc.nextInt();
        RandomRate(rate);
    }

    public String getName() {
        return name;
    }

    public float getSum() {
        return sum;
    }

    public int[] getYearArr() {
        return yearArr;
    }

    public float[] getYearRate() {
        return yearRate;
    }

}
public class Employee {
    public static void main(String[] args) {
        Scanner sc;
        Salary_Print sal [];

        //인원설정
        System.out.printf("원하는 인원 설정 : ");
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        sal = new Salary_Print[num];

        for (int i = 0; i < sal.length; i++) {
            sal[i] = new Salary_Print();
            System.out.print((i+1) + " 명째 저장중\n\n");
        }

        //초기화 확인용
        System.out.println("N번 사원 정보불러오기");
        int load = sc.nextInt();
        for (int i = 0; i < sal[load-1].getYearArr().length; i++) {
            System.out.printf("%d만원\n",sal[load-1].yearArr[i]);

        }System.out.printf("평균 연봉 %.0f\n",sal[load-1].getSum()/sal[load-1].getYearArr().length);

    }
}
