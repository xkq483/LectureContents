import java.util.Scanner;

class income{
    final int YEAR = 10;
    float[] AnnualIncome;

    public income(String name){
        this.AnnualIncome = new float[YEAR];
        AnnualIncome[0] = (int)(Math.random() * 1101 + 2400);
        calcAnnualIncome();
    }
    public void calcAnnualIncome(){
        float increase = (int)(Math.random() * 20 + 1);
        for(int i = 1 ; i < YEAR; i++) {
            AnnualIncome[i] = AnnualIncome[i-1] + AnnualIncome[i-1] * increase * 0.01f;
        }
    }

    public float getAnnualIncome() {
        return AnnualIncome[YEAR - 1];
    }

    public float getNYearIncome(int year){
        return  AnnualIncome[year - 1];
    }
}
public class ScanNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("직원 수는 몇명입니까 : ");
        int n = scan.nextInt();
        String[] staff = new String[n];


        for (int i = 0 ; i < n; i++) {
            System.out.print("직원의 이름은 무엇입니까 : ");

            if(i ==0){
                scan.nextLine();
            }
            staff[i] = scan.nextLine();
        }

        income[] staffNum = new income[staff.length];

        for(int i = 0; i < staff.length; i++) {
            staffNum[i] = new income(staff[i]);
            System.out.printf("10년 후 %s의 연봉은 %.0f이다.\n",staff[i], staffNum[i].getAnnualIncome());
        }

        System.out.print("x년차 연봉은?(x값 입력) : ");
        int x = scan.nextInt();

        for(int i = 0; i < staff.length; i++) {
            staffNum[i].getNYearIncome(x);
            System.out.printf("%s의 %d년차 연봉은 %.0f이다.\n", staff[i], x,staffNum[i].getNYearIncome(x));
        }

        float yearIncomeSum = 0;
        for(int i = 0; i < staff.length; i++) {
            yearIncomeSum += staffNum[i].getNYearIncome(x);
        }
        System.out.printf("직원들의 %d년차 연봉의 평균은 %.0f만원이다.\n", x, yearIncomeSum/staff.length );
    }
}
