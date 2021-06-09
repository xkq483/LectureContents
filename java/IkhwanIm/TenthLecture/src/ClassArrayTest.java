import java.util.Scanner;

class ScoresTest {
    final int MAX = 5;

    float sum;
    float mean;
    int randArr[];

    public ScoresTest () { //생성자는 무조건 public
        // 5개의 배열을 만들고 랜덤값을 할당함
        System.out.println("생성자 호출!");
        sum = 0;
        randArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            randArr[i] = (int)(Math.random() * 50 + 50);
                                   //50~100
        }
    }
    public void calcMean () {//평균계산 메소드
        for (int i = 0; i < MAX; i++) {
            sum += randArr[i];
        }

        mean = sum / (float)MAX;
    }
      //게터들을 만든다.
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
        // 클래스 <=== 커스텀 데이터타입(우리가 커스텀하여 만들 수 있는 데이터타입)
        ScoresTest st[];
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
        // --------------------------------------
        //    [0]    [1]    [2]     [3]    [4]

        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest();   // 이 부분을 통해 객체1, 객체2, ... 객체5가 생성됨
            st[i].calcMean();

            float tmpSum = st[i].getSum();
            totalSum += tmpSum;
            totalNumber += st[i].getMAX();
            System.out.println("각 객체별 합산값 = " + tmpSum);
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}