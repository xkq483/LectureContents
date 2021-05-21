import java.util.Scanner;

class ScoresTest{
    final  int Max = 5;
    int randArr[];
    int sum;
    float mean;
    //생성자 , randArr가 5명의 점수를 입력받는다. 50점~100점
    public ScoresTest() {
        sum = 0;
        randArr = new int[Max];

        for (int i = 0; i < Max; i++) {
            randArr[i] = (int)(Math.random() * 50 + 50);
        }
    }
    //평균
    public void calcMean() {
        for (int i = 0; i < Max; i++) {
            sum += randArr[i];
        }
        mean = sum / (float)Max;
    }

    public int getSum() {
        return sum;
    }

    public float getMean() {
        return mean;
    }

    public int[] getRandArr() {
        return randArr;
    }

    public int getMax() {
        return Max;
    }
}


public class ClassArrayTest {
    public static void main(String[] args) {
        // 클래스 <==== 커스텀 데이터타입(우리가 커스텀하여 만들 수있는 데이터타입)
        ScoresTest[] st;
        Scanner sc = new Scanner(System.in);

        //
        System.out.println("몇개의 학급이 있나요? :");
        int num = sc.nextInt();

        st = new ScoresTest[num];

        float totalSum = 0;
        float totalNumber = 0;
        float totalMean = 0;
        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest();
            st[i].calcMean();
            float tmpSum = st[i].getSum();

            totalSum += tmpSum;
            totalMean += st[i].getMean();
            totalNumber += st[i].getMax();
            System.out.println("각반의 평균은 = "+ st[i].getMean());
        }
        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}
