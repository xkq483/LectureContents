import java.util.Scanner;

class ScoreTest {
    final  int MAX = 5;

    float sum;
    float mean;
    int randArr[];

    public ScoreTest () {
        sum = 0;
        randArr = new int[MAX];

        for(int i = 0; i < MAX; i++) {
            randArr[i] = (int)(Math.random()* 50 + 50);
            //배열 안에 index를 넣어주어야하니까 i값 입력.
            // ++ 50~99까지의 랜덤 수자 randArr에 배열 생성된다. i만큼. 즉 MAX값만큼 배열생성된다.
        }
    }
    public void calcMean() {
        for(int i = 0; i < MAX; i++) {
            sum += randArr[i];
        }
        mean = sum / (float) MAX;
    }
    public int[] getRandArr() {
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
public class e_Quiz {
    //학급 평균구하기 예제
    public static void main(String[] args) {
        ScoreTest[] st;
        Scanner scan = new Scanner((System.in));

        System.out.println("몇개의 학급이 있나요?");

        int num = scan.nextInt();

        st = new ScoreTest[num];

        float totalSum = 0;
        float totalNumber = 0;

        for(int i = 0; i < num; i++) {
            st[i] = new ScoreTest();
            st[i].calcMean();
            totalSum += st[i].getSum(); //학급수
            totalNumber += st[i].getMAX(); // 학생숫자
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}
