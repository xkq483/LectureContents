class ClassScore {
    private int scores[]; // privaate int[] scores로 표현해도 됨.
    private float mean; // 평균
    private float variance; // 분산
    private float stdDeviation; // 표준편차
    // private이라 하더라도 class 내부에서 바뀐 값들은 대입이 됨. class 외부로부터의 private이기 때문

    public ClassScore (int studentsScoreArr[]) {
        int i = 0;
        // 위에서 scores를 배열로 지정했기 때문에 여기서 scores[]로 쓰면 오히려 error
        scores = new int[studentsScoreArr.length]; // int 배열 = new int[정수] >> 배열을 (정수)개의 만큼 만들겠다.
        for (int studentsScore : studentsScoreArr) {
            scores[i++] = studentsScore;
        // (studentsScoreArr.length{=8})의 개수만큼을 갖는 'scores'라는 배열을 만들고
        //  'studentsScoreArr'배열에 들어있는 각각의 값들을 순차적으로 scores 배열에 대입한다.
        }
    }
    public void calcAverage () {
        int sum = 0;
        // 평균: 전체 점수 합 / 전체 사람 수
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        mean = (float)sum / (float)scores.length; // 여기서 mean 앞에 왜 return을 안 쓰는지...?
        // 여기서 (float)은 빼도 상관 없어보임. 실제로 error 안 남.
        // sum과 scres.length는 소수점이 나올 수 없고
        // 이미 mean은 위에서 float으로 정의되었음.
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

public class _2nd_AverageClassTest {
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
