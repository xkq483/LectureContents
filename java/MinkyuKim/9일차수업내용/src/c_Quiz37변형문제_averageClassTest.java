class ClassScore {
    private int scores[];
    private float mean;
    private float variance;
    private float stdDeviation;

    public ClassScore (int studentsScoreArr[]) {
        int i = 0;

        scores = new int[studentsScoreArr.length];

        for (int studentsScore : studentsScoreArr) {
            scores[i++] = studentsScore;
        }
    }
    public void calcAverage () {
        int sum = 0;

        // 평균: 전체 점수 합 / 전체 사람 수
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        mean = (float)sum / (float)scores.length;
    }
    public void calcVariance () {
        int sum = 0;

        // 분산: [각각의 샘플(A 사람의 점수, B 사람의 점수, ... X 사람의 점수) - 평균] 의 제곱을 모두 더함
        //      더해서 나온 값을 사람 수로 나누면 분산을 얻을 수 있음
        for (int i = 0; i < scores.length; i++) {
            sum += Math.pow((scores[i] - mean), 2);
        }

        variance = (float)sum / (float)scores.length;
    }
    public void calcStdDeviation () {
        // 표준편차: 루트(분산)
        // Math.sqrt() 가 루트 연산을 합니다.
        stdDeviation = (float)Math.sqrt(variance);
    }

    public float getMean() {
        return mean;
    }
    public float getVariance() {
        return variance;
    }
    public float getStdDeviation() {
        return stdDeviation;
    }
}

public class c_Quiz37변형문제_averageClassTest {
    public static void main(String[] args) {
        int studentsScoreArr[] = { 100, 92, 66, 77, 54, 89, 75, 60 };
        ClassScore cs = new ClassScore(studentsScoreArr);

        cs.calcAverage();
        cs.calcVariance();
        cs.calcStdDeviation();

        System.out.printf("우리반의 평균은 %.4f, 분산 %.3f, 표준편차 %f\n",
                cs.getMean(), cs.getVariance(), cs.getStdDeviation());
    }
}