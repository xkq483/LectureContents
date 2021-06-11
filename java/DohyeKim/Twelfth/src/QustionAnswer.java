import java.util.Scanner;//Scanner클래스 불러오기
class Money{//Money는 new로부터 호출된다.
    private final int YEAR = 10; //전역변수1 생성
    private float[] AnnualIncome; //전역번수(배열)2 생성

    public Money(String name) {//메서드1, public접근제한자를 가진 Money메소드에 String name(직원)을 인자로 받았다.
        this.AnnualIncome = new float[YEAR]; //YEAR만큼 index를 갖는 AnnualIncome[] 생성.
        AnnualIncome[0] = (int) (Math.random() * 1101 + 2400);//초봉 계산
        calcAnnualIncome(); // 직원의 연차별 연봉을 배열의 값으로 설정하는 method 실행.
    }

    public void calcAnnualIncome(){ //메서드2, 직원의 연차별 연봉을 배열의 값으로 설정하는 method
        for(int i = 1; i < YEAR; i++ ){//10번 for문 실행, 연차별 연봉을 구한다.
            AnnualIncome[i] = AnnualIncome[i-1] + AnnualIncome[i-1] * (float)((Math.random()*20 + 1)/100);
        }//연봉+인상률을 더한게 다음 연봉. -1은 베열특성상 해줌
    }
    public float getYearTenAnnualIncome(){//메서드3, 10년후 연봉값을 리턴한다.
        return AnnualIncome[YEAR-1];
    }
    public float getAYearIncome(int year){//메서드4, a년후 연봉값을 리턴한다.
        return AnnualIncome[year-1];
    }
}

public class QustionAnswer {//메인메서드를 가진 클래스
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//scan객체 생성 및 Scanner메서드 호출

        System.out.print("직원 수 n: ");
        int n = scan.nextInt();
        String[] employeeName = new String[n];//키보드로 입력한 n값은 직원(이름)수 배열이 된다.

        for (int i = 0; i < n; i++) {//for문에서 키보드로 입력한 n값만큼 돈다.

            System.out.print("직원의 이름: ");

            if (i == 0) {
                scan.nextLine();
            }

            employeeName[i] = scan.nextLine();
        }
        Money[] employee = new Money[employeeName.length];//employee객체 생성 및 Money메서드 호출
                                                          // , employeeName을 인자로 받음.

        for(int i = 0; i < employeeName.length; i++){//for문을 열어서 employeeName의 길이만큼 돌게한다.
            employee[i] = new Money(employeeName[i]);//employee배열 객체 생성 및 Money메서드 호출
            System.out.printf("10년 후 %s의 연봉은: %.0f만원\n", employeeName[i], employee[i].getYearTenAnnualIncome());
        }//10년 차 연봉 구하기

        System.out.print("a년차 연봉을 구한다. a: ");
        int a = scan.nextInt();//키보드로 a값을 입력받는다
        for(int i = 0; i < employeeName.length; i++){//for문을 열고 employeeName의 길이만큼 돌게한다.
            employee[i].getAYearIncome(a);//employee[i]배열에 .getAYearIncome메서드를 불러와 a를 인자로 넣는다.
            System.out.printf("%s의 %d년차 연봉은: %.0f만원\n", employeeName[i], a, employee[i].getAYearIncome(a));
        }//a년 차 연봉 구하기

        float AyearIncomesum = 0;//전역변수 생성
        for (int i = 0; i < employeeName.length; i++ ){////for문을 열고 employeeName의 길이만큼 돌게한다.
            AyearIncomesum += employee[i].getAYearIncome(a);//AyearIncomesum에 앞에서 나온 직원별 a년차 값을 모두 더함
        }
        System.out.printf("직원들의 %d년차 연봉의 평균은: %.0f만원\n", a, AyearIncomesum/employeeName.length);
    }//작원들의 a년차 연봉의 평균을 구한다.
}