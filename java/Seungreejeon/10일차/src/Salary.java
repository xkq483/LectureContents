class Money {
    float sum = 0;
    int random_Money;
    float random_rate;
    int year_Money[] = new int[10];

    //생성자
    public  Money(){
        Random_Money();
        Random_rate();
        Constructor();
    }

    //랜덤 생성
    public void Constructor() {
        System.out.printf("1 년차 연봉 : %d만원\n", random_Money);
        year_Money[0] = random_Money;
        sum += random_Money;

        for (int i = 1; i < year_Money.length; i++) {
            int sum_Year = (int)(random_Money*random_rate)+random_Money; //연봉 인상금액
            sum += sum_Year; // 연봉 합계에 넣는 변수
            System.out.printf((i+1) +" 년차 연봉 : %d만원\t 연봉인상률 : %.1fP\t 인상액: %d만원 \n"
                    ,sum_Year, random_rate*100,(int)(random_Money*random_rate)); //출력 부분
            Random_rate(); // 랜덤 인상률 생성
            random_Money =sum_Year; //N년차으로 연봉 초기화
            year_Money[i] = sum_Year; //N년차 연봉 배열에 저장
        }
        System.out.printf("연봉 10년간 평균 : %.0f만원\n",sum/year_Money.length);

    }

    //인상률
    float Random_rate() {
        random_rate = (float)(Math.random() * 20 + 1)/100;
        return random_rate;
    }
    //랜덤 돈
    int Random_Money() {
        random_Money = (int) (Math.random() * 1100 + 2400);
        return random_Money;
    }

    public float getSum() {
        return sum;
    }

    public int[] getYear_Money() {
        return year_Money;
    }
}

public class Salary {
    public static void main(String[] args) {
        //이름 생성
        String r_Name[] = {"김", "이", "박", "전", "오", "서", "임", "마", "신", "왕"};
        Money mo[] = new Money[r_Name.length];
        float sum = 0;
        int total_Year = 0;
        float selectSum = 0;

        for (int i = 0; i < r_Name.length; i++) {
            System.out.printf("이름 : %s\n", r_Name[i]); //이름
            mo[i] = new Money(); //클래스 배열 생성
            total_Year += mo[i].year_Money.length; // 연도 수 총합
            sum += mo[i].getSum(); //모든 연봉 합계

        }
        System.out.printf("모든 사원 10년 평균 연봉 : %.0f만원 \n", sum/total_Year);

        int j = 0;
        int cnt = 0;
        while (j < 10) {
            for (int i = 0; i < 10; i++) {
                selectSum += mo[i].year_Money[j]; //모든 사원 N년차 연도 평균연봉 출력
            }
            cnt++; // 5개 출력이후에 엔터
            if (cnt == 6) {
                System.out.println();
            } System.out.printf("  "+(j + 1) + "년차 평균 연봉 : %.0f", selectSum / mo.length); //N년차 연봉 출력
            selectSum = 0; //N년차 연봉 초기화
            j++;
        }







    }



}

