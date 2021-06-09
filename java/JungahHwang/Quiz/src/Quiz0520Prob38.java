import java.util.Scanner;
// 38. ACL 문제 (키보드로 입력한 값으로 평균, 분산, 표준편차를 구하고 특정 키 입력으로 계산을 시작/종료 만들기) -----
class ClassScore {
    private int scores[];
    Scanner scan;
    private float mean;
    private float variance;
    private float stdDeviation;

    public ClassScore() {
        scan = new Scanner(System.in);

        inputClassScore();
    }

    private void inputClassScore() {
        Boolean isTrue = true;
        int studentsNum;
        char code;

        while (isTrue) {
            System.out.print("학생들의 성적을 기록하시겠습니까? Y / N");

            code = scan.next().charAt(0);
            // 문자열을 입력받아 첫번째 값만 가져온다. (배열의 시작이 0이므로 0이 첫 번째임)
            // 1은 두 번째, 2는 세 번째...

            if (code == 'Y') {
                isTrue = false;
            } else if (code == 'N') {
                System.out.println("성적 입력을 진행하지 않습니다.");
                return;
                // return : 매서드를 종료한다(void 매서드라 리턴값은 없음)
            } else {
                System.out.println("올바른 값을 입력하시오.");
            }
        }
        System.out.print("몇 명의 학생 점수를 입력하시겠습니까?");
        studentsNum = scan.nextInt();

        scores = new int[studentsNum];

        for (int i = 0; i < studentsNum; i++) {
            System.out.printf("학생들의 점수를 입력하세요: ");

            scores[i] = scan.nextInt();
        }
    }

    public void calcAverage(){
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; }

        mean = (float) sum / (float) scores.length; }
        // 평균 : 전체 점수 합 / 전체 사람 수

    public void calcVariance () {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += Math.pow((scores[i] - mean), 2); }
            variance = (float) sum / (float) scores.length; }
            // 분산 : [각각의 샘플(A 사람의 점수, B 사람의 점수, ... X 사람의 점수) - 평균] 의 제곱을 모두 더함
            //      더해서 나온 값을 사람 수로 나누면 분산을 얻을 수 있음

    public void calcDeviation () {
        stdDeviation = (float) Math.sqrt(variance); }
        // 표준편차 : 루트(분산)
        // Math.sqrt() : 루트 연산

    public float getMean () {
        return mean;
        }
    public float getVariance () { return variance; }
    public float getDeviation () { return stdDeviation; }
}

public class Quiz0520Prob38 {
    public static void main(String[] args) {

        ClassScore cs = new ClassScore();

        cs.calcAverage();
        cs.calcVariance();
        cs.calcDeviation();

        System.out.printf("우리반의 평균은 %.4f, 분산 %.3f, 표준편차 %f\n",
                cs.getMean(), cs.getVariance(), cs.getDeviation());
    }
}