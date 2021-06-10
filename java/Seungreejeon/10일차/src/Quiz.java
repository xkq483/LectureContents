import java.util.Arrays;
import java.util.Scanner;

class Salaryman {
    float randomMoney;
    float random_Rate;
    float random_RateMoney;
    float toTal = 0;
    float arrRecord[] = new float[10];
    float sum = 0;

    //100만원단위까지만 출력하는 방법..
    //인상률이 소숫점 단위로 계산되서 연봉금액차이가 발생함..
    //2년차 출력 줄만 왜 띄어써지는지 모르겠다.
    //무엇보다 변수들이 의식의흐름대로 짜여진 코드같아서 보기가 너무힘들다...

    //생성자 클래스배열용
    public Salaryman() {
        RandomBox();
        toTal = randomMoney;
        System.out.printf("  1년차 연봉 : %.0f \n",randomMoney);
        arrRecord[0] = randomMoney;
        sum +=randomMoney;

        for (int i = 1; i < 10; i++) {
            Random_Rate();
            toTal += randomMoney*random_Rate;
            System.out.printf( i + 1 +" 년차 인상률 : %.1fP  연봉 : %.0f 만원 \n  ", (random_Rate*100), toTal);

            sum += toTal; //합계 저장
            arrRecord[i] = toTal; // 배열에 저장

        }

    }

    //랜덤 초봉 2400~3500
    public void RandomBox() {
        randomMoney = (float)(Math.random() *1100)+ 2400;
    }

    //랜덤 인상율 범위 1~20%
    void Random_Rate() {
        random_Rate = ((float)(Math.random() * 19 + 1))/100;
    }

    public float[] getArrRecord() {
        return arrRecord;
    }

    public float getSum() {
        return sum;
    }

    public float getToTal() {
        return toTal;
    }

}


public class Quiz {
    public static void main(String[] args) {
        Salaryman ss[] = new Salaryman[10];
        float sum;
        float tmpSum = 0;
        float PeopleSum = 0;
        int totalYear = 0;
        float ts_sum = 0;
        float selectSum =0;
        String[] Name = {"김씨","이씨","박씨","전씨","신씨","서씨","고씨","주씨","장씨","문씨"};
        //사원 10명 평균연봉 출력
        for (int i = 0; i < 10; i++) {
            System.out.printf("  이름 : %s\n\n",Name[i]);

            ss[i] = new Salaryman();
            System.out.println();

            sum = ss[i].getSum();
            tmpSum += sum;
            totalYear += ss[i].arrRecord.length;
            PeopleSum += tmpSum;

            System.out.printf("  평균 연봉 : %.0f만원 \n\n", tmpSum/10);
            tmpSum= 0;
        }

        //사원 10명의 10년 평균 연봉
        System.out.printf("  사원 10년 평균 연봉 : %.0f 만원\n\n",PeopleSum/ totalYear);

        //년도 별 연봉조회
        Scanner sc = new Scanner(System.in);
        System.out.printf("  조회하고자하 하는 년도 평균 연봉 : ");
        int num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            selectSum = ss[i].arrRecord[num-1];
            ts_sum += selectSum;
        }
        System.out.printf("  %d 년 차 평균 연봉 조회 : %.0f 만원" ,num,ts_sum/10);

    }
}