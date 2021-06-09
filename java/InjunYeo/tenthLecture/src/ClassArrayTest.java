import java.util.Scanner;

//학급의 점수를 5개로 정해놈
class ScoreTest{
    float sum;
    float mean;
    //학급당 인원의 역할을 하는 변수
    final int MAX =5;

    int[] randArr;

    public ScoreTest(){
        sum =0;
        randArr = new int[MAX];


        for(int i =0;i<MAX;i++){
            randArr[i] = (int)(Math.random()*50 + 50);
        }
    }

    public void calcMean(){
        for(int i =0;i<MAX;i++){
            sum+=randArr[i];
        }

        mean = sum/ (float)MAX;
    }

    public int[] getRandArr(){
        return randArr;
    }

    public float getSum() {
        return sum;
    }
    public float getMean() {
        return mean;
    }

    public int getMAX() {
        return MAX;
    }
}


public class ClassArrayTest {
    public static void main(String[] args) {

        //클래스<== 커스텀 데이터타입(우리가 커스텀하여 만들 수 있는 데이터타입)
        ScoreTest[] st;
        Scanner scan = new Scanner(System.in);

        System.out.println("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt();

        //클래스 형식의 커스텀 데이터타입으로 만들어진 배열을 num개수만큼 만듭니다.
        //그리고 st라는 변수명이 이 배열 메모리 공간을 관리합니다.
        st = new ScoreTest[num];

        float totalSum = 0;
        float totalNumber=0;


        for(int i = 0; i<num;i++){
            st[i] = new ScoreTest();
            st[i].calcMean();
            totalSum +=st[i].getSum();
            totalNumber+=st[i].getMAX();
        }

        System.out.println("최종계산된 전체 평균은 = "+ (totalSum/totalNumber));
    }
}
