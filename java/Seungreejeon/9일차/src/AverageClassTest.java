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
    // 평균
    public void calcAverage () {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        mean = (float)sum / (float)scores.length;
    }
    // 분산
    public void calcVariance () {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += Math.pow((scores[i] - mean), 2);
        }
        variance = (float)sum / (float)scores.length;
    }
    // 표준편차
    public void calcStdDeviation () {
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

public class AverageClassTest {
    public static void main(String[] args) {
        int studentsScoreArr[] = {100, 92, 66, 77, 54, 89, 75, 60};
        ClassScore cs = new ClassScore(studentsScoreArr);

        cs.calcAverage();
        cs.calcVariance();
        cs.calcStdDeviation();

        System.out.printf("우리반의 평균은 %.4f, 분산 %.3f, 표준편차 %f\n",
                cs.getMean(), cs.getVariance(), cs.getStdDeviation());
    }
}