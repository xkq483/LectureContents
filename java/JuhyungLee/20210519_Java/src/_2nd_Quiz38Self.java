import java.util.Scanner;
class StudentsScore1 {
    private int[] scores;
    Scanner scan;
    private float mean;
    private float variance;
    private float stdDeviation;
    private int studentsNum;
    // inputStudentsScore()의 지역변수였던 것을 빼와서 inputScores()로 사용 할 수 있게 함
    private char code; // main에서 code가 Y일 때에만 실행하는 if문에서 사용하기 위해서.

    public StudentsScore1 () {
        inputStudentsScore();
        // scan = new Scanner(System.in) inputStudentsScore()로 이동
        }

    private void inputStudentsScore() {
        Boolean isTrue = true;
                // int studentsNum; Class객체로 빼서 inputScores에서 사용할 수 있도록 함
        scan = new Scanner(System.in);
                // char code; 객체 data로 자리 옮김
        while (isTrue) {
            System.out.print("학생 성적 기록을 진행하시겠습니까 ? (Y/N) ");
            code = scan.next().charAt(0); //
            if (code == 'Y') {
                isTrue = false;
            } else if (code == 'N') {
                System.out.println("더 이상 점수 입력을 진행하지 않습니다.");
                return;
            } else {
                System.out.println("올바른 값을 입력하세요!");
            }
        }
    }

        public void inputScores() { // 학생 점수 입력하는 식을 따로 method로 만들어서 진행
            System.out.print("몇 명의 학생 점수를 입력하시겠습니까 ? ");
            studentsNum = scan.nextInt();
            scores = new int[studentsNum];

            for (int i = 0; i < studentsNum; i++) {
                System.out.print("학생 점수를 입력하세요: ");
                scores[i] = scan.nextInt();
            }
        }
    public void calcAverage () {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        mean = (float)sum / (float)scores.length;
    }
    public void calcVariance () {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += Math.pow((scores[i] - mean), 2);
        }

        variance = (float)sum / (float)scores.length;
    }
    public void calcStdDeviation () {
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
    public char getCode(){
        return code;
    } // code의 getter 생성
}
public class _2nd_Quiz38Self {
    public static void main(String[] args) {
        StudentsScore1 s1 = new StudentsScore1();

        if(s1.getCode() == 'Y'){  // Y를 입력했을 때에만 실행되도록 if문 활용
            s1.inputScores();
            s1.calcAverage();
            s1.calcVariance();
            s1.calcStdDeviation();
            System.out.printf("우리반의 평균은 %.4f, 분산 %.3f, 표준편차 %f\n",
                    s1.getMean(), s1.getVariance(), s1.getStdDeviation());
        }
    }
}
