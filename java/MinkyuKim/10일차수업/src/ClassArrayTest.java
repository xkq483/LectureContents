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

        // 평균을 구하기 위하여 값을 더하고 개수를 나눔.
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

        //클래스 < == 커스텀 데이터타입(우리가 커스텀하여 만들 수 있는 데이터타입)

        // ScoreTest st[];도 상관없음 - 배열선언 과정
        ScoresTest[] st;
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt();

        // 클래스 형식의 커스텀 데이터타입으로 만들어진 배열을 num 개수만큼 만듭니다.
        // 그리고 st라는 변수명이 이 배열 메모리 공간을 관리합니다.
        st = new ScoresTest[num];

        float totalSum = 0;
        float totalNumber = 0;

        // --------------------------------------
        // | 객체1 | 객체2 | 객체3 | 객체4 | 객체5 |
        // ---------------------------------------
        //   [0]     [1]    [2]    [3]     [4]
        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest(); // 이 부분을 통해 객체1, 객체2, ... 객체5가 생성됨
            st[i].calcMean();
            totalSum += st[i].getSum();  //5명 성적의 합계
            totalNumber += st[i].getMAX(); // Max 고정값인 5(5명)
            //5명 성적의 합계 / 5명 = 평균값 출력
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        // 입력된 학급들의 평균값의합 / 학급수 = 해당 학급의 평균값 출력
        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}