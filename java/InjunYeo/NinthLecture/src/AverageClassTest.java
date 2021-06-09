class ClassScore{
    private int[] scores;
    private float mean;
    private float variance;
    private float stdDeviation;


    //ClassScore 학급의 점수들을 배열로 만드는 메서드
    public ClassScore(int[] studentsScoreArr){
        int i = 0;

        scores = new int[studentsScoreArr.length];

        for(int studentsScore : studentsScoreArr){
            scores[i++] = studentsScore;
        }


    }

    //평균구하는 메서드
    public void calcAverage(){
        int sum = 0;

        //평균: 전체 점수합/ 전체 사람수
        for(int i = 0; i<scores.length;i++){
            sum+= scores[i];
        }

        mean = (float) sum / scores.length;
    }

    //분산구하는 메서드
    public void calcVariance(){

        int sum = 0;

        //분산 : [각각의 샘플(A 사람의 점수, B사람의 점수, ...x사람의 점수) - 평균] 의 제곱을 모두 더함
        //      더해서 나온 값을 사람수로 나누면 분산을 얻을수 있음
        for(int i = 0; i<scores.length;i++){
            Math.pow((scores[i] - mean),2);
        }

        variance = (float)sum/(float) scores.length;

    }

    //표준편차 메서드
    public void calcStdDeviation(){
        /*
        표준편차: 루트(분산)
        Math.sqrt()가 루트연산을 한다.
         */

        stdDeviation = (float)Math.sqrt(variance);
    }

    //평균 겟 메서드
    public float getMean() {
        return mean;
    }

    //분산 겟 메서드
    public float getVariance() {
        return variance;
    }

    //표준편차 메서드
    public float getStdDeviation() {
        return stdDeviation;
    }
}
public class AverageClassTest {
    public static void main(String[] args) {
        int[] studentsScoreArr = {100,92,66,77,54,89,75,68};
        ClassScore cs = new ClassScore(studentsScoreArr);

        cs.calcAverage();
        cs.calcVariance();
        cs.calcStdDeviation();

        System.out.printf("우리반의 평균은 %f,분산%f,표춘편차 %f\n",cs.getMean(),cs.getVariance(),cs.getStdDeviation());
    }
}
