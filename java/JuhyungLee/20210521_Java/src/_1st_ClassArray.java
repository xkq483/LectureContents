import java.util.Scanner;
class ScoresTest {
    final int MAX = 20; //이 class에서 MAX의 값은 각 학급 별 학생의 수
    private float sum;
    private float mean;
    private int studentScoreArr[];

    public ScoresTest () {
        studentScoreArr = new int[MAX];
        // 20개(MAX)의 index를 갖는 배열을 만들어 랜덤값을 할당하고 이를 studentScoreArr[]에 setting.
        // 여기서는 50~100점의 랜덤한 점수를 20개 갖는 배열
        for (int i = 0; i < MAX; i++) {
            studentScoreArr[i] = (int)(Math.random() * 50 + 50);
        }
    }
    public void calcMean () {
        sum = 0;
        for (int i = 0; i < MAX; i++) {
            sum += studentScoreArr[i]; // stduentScoreArr배열 안의 값들의 총 합.
        }
        mean = sum / MAX;
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

public class _1st_ClassArray {
    public static void main(String[] args) {
        //class << custom datatype(우리가 custom해서 만들 수 있는 datatype)
        // ScoresTest[] st; >> 배열 선언 - 배열의datatype[] 배열이름
        // 배열 선언 먼저 안 하고 아래 배열 만드는 곳에서 같이 배열선언 해봄.
        Scanner scan = new Scanner(System.in);

        System.out.print("학급의 수: ");
        int num = scan.nextInt();

        ScoresTest[] schoolClass = new ScoresTest[num];
        // class 형식의 custom datatype으로 만들어진 배열을 num개수만큼 만든다.
        // 그리고 schoolClass라는 변수명이 이 배열 메모리 공간을 관리.

        float totalSum = 0;
        float totalNumber = 0;

        for (int i = 0; i < num; i++) {
            schoolClass[i] = new ScoresTest();
            // 객체1, 객체2, ... 객체num이 생성됨. + 생성자 호출
            // --------------------------------------
            // |배열객체1|배열객체2|배열객체3| .... |배열객체num |
            // --------------------------------------
            //    [0]     [1]      [2]    ...     [num-1]
            schoolClass[i].calcMean(); // 각 객체별(학급별) 평균을 구하는 method 실행
            totalSum += schoolClass[i].getSum(); // 학급별 총점수의 총합.
            totalNumber += schoolClass[i].getMAX(); // 학급별 학생수의 총합
            System.out.println("각 반의 평균 = " + schoolClass[i].getMean());
        }
        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}