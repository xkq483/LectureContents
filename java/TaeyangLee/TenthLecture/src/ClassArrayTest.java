import java.util.Scanner;
class ScoresTest {
    final int MAX = 5;
    float sum;
    float mean;
    int randArr[];

    public ScoresTest () {

        sum = 0;
        randArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            randArr[i] = (int)(Math.random() * 50 + 50);
        }
    }
    public void calcMean () {
        for (int i = 0; i < MAX; i++) {
            sum += randArr[i];
        }
        mean = sum / (float)MAX;
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

public class ClassArrayTest {
    public static void main(String[] args) {

        ScoresTest st[];
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt();

        st = new ScoresTest[num];

        float totalSum = 0;
        float totalNumber = 0;



        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest();
            st[i].calcMean();

            float tmpSum = st[i].getSum();
            totalSum += tmpSum;
            totalNumber += st[i].getMAX();
            System.out.println("각 객체별 합산값 = " + tmpSum);
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }
    }
}