// 학급인원 10명
// 학급 n개

import java.util.Scanner;

// 학생수 10명 / 입력한 학급의 개수 / 점수 합계 / 평균
class ScoreTest {
    final int MAX = 10;

    int sum;
    float average;
    int randArr[];

    public ScoreTest() {
        sum = 0;
        randArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            randArr[i] = (int) (Math.random() * 50 + 50);

        }
    }

    public void calcScoreSum() {
        for (int i = 0; i < MAX; i++) {
            sum += randArr[i];
        }
        average = sum / (float) MAX;
    }

    public int getSum() {
        return sum;
    }

    public float getAverage() {
        return average;
    }

    public int getMAX() {
        return MAX;
    }

    public int[] getRandArr() {
        return randArr;
    }
}

public class practice {
    public static void main(String[] args) {
        ScoreTest[] st;
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        st = new ScoreTest[num];

        float totalSum = 0;
        float totalNumber = 0;

        for(int i = 0; i < num; i++) {
            st[i] = new ScoreTest();
            st[i].calcScoreSum();
            totalSum += st[i].getSum(); //학급수
            totalNumber += st[i].getMAX(); // 학생숫자
            System.out.println("각 반의 평균 = " + st[i].getAverage());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}
