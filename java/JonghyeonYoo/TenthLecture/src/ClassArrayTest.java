import java.util.Scanner;

class ScoresTest {
    final int MAX = 5;

    float sum;
    float mean;
    int randArr[];

    public ScoresTest () {
        // 5개의 배열을 만들고 랜덤값을 할당함
        System.out.println("생성자 호출!!");
        sum = 0;
        randArr = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            randArr[i] = (int)(Math.random() * 50 + 50);
        }
    }
    public void calcMean () { //평균계산하는 생성자
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
        //클래스 <=== 커스텀 데이터타입 (우리가 커스텀하여 만들 수 있는 데이터타입)
        ScoresTest[] st; // ScoresTest st[]; <<이렇게 해도 상관없음.
       Scanner scan = new Scanner(System.in);

        System.out.print("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt();

        st = new ScoresTest[num];
        //클래스 형식의 커스텀 데이터타입으로 만들어진 배열을 num 개수만큼 만듭니다.
        //그리고 st라는 변수명이 이 배열 메모르 공간을 관리합니다.

        float totalSum = 0;
        float totalNumber = 0;

        // -------------------------------------
        // | 객체1 | 객체2 | 객체3 | 객체4 | 객체5 |     //각 객체는 독립적이다!!
        // -------------------------------------
        //    [0]    [1]    [2]     [3]    [4]
        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest();
            // 이 부분을 통해 객체1, 객체2, ....객체5가 생성됨.
            // 위 new를 할때마다 class의  public ScoresTest () 생성자를 호출하여 돌린다.
            st[i].calcMean(); //평균을 계산하는 곳

            totalSum += st[i].getSum();
            totalNumber += st[i].getMAX();
            //-------각 객체별 합산 값 구할때(아래 주석) --------
            // float tmpSum = st[i].getSum();
            // totalSum += tmpSum;
            // System.out.println("각 객체별 합산 값 = "+ tmpSum);
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}