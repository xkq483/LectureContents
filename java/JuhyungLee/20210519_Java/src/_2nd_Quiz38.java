import java.util.Scanner;
class StudentsScore {
    private int[] scores;
    Scanner scan;
    private float mean;
    private float variance;
    private float stdDeviation;

    public StudentsScore () { //생성자// inputStudentsScore()를 실행시키도록 한다
        scan = new Scanner(System.in); // scan이 생성자에서 쓰이지 않으니까 다른 method로 옮겨도 될듯?
        inputStudentsScore();
    }

    private void inputStudentsScore() {
        Boolean isTrue = true; // java는 Boolean 초기값 설정해줘야 됨
        int studentsNum;
        char code; // char는 문자

        while (isTrue) {
            System.out.print("학생 성적 기록을 진행하시겠습니까 ? (Y/N) ");
            code = scan.next().charAt(0);
            // charAt(n) > 문자열에서 n번째 문자 하나를 추출하고 싶을 때 사용.
            // ex) String str = "apple" 일 때
            // str.charAt(0)은 a / str.charAt(1)과(2)는 p / str.charAt(3)은 l
            //따라서 여기서 scanner를 이용해서 'Y'만 입력을하던
            // "Yesbaby"를 입력하던 어짜피 0번째 값만 가져오기 때문에 Y만 출력됨.
            // N도 마찬가지. 'N'이나 "No아니라고진짜"나 똑같음
            if (code == 'Y') {
                isTrue = false; // false니까 while문 끝내고 다음 점수 입력 실행
            } else if (code == 'N') {
                System.out.println("더 이상 점수 입력을 진행하지 않습니다.");
                return; //  >> method를 종료(return값이 없는 method 이므로 void)
            } else {
                System.out.println("올바른 값을 입력하세요!"); // while문 반복
            }
        }

        System.out.print("몇 명의 학생 점수를 입력하시겠습니까 ? ");
        studentsNum = scan.nextInt();
        scores = new int[studentsNum]; // studnetsNum개의 index를 갖는 배열을 만들겠다.

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
}

public class _2nd_Quiz38 {
    public static void main(String[] args) {
        // 키보드 입력을 통해 점수를 입력 받도록 만들자
        // 또한 특정키를 입력하면 더 이상 점수 입력을 받지 않도록 한다.
        StudentsScore ss = new StudentsScore();

        ss.calcAverage();
        ss.calcVariance();
        ss.calcStdDeviation();

        System.out.printf("우리반의 평균은 %.4f, 분산 %.3f, 표준편차 %f\n",
                ss.getMean(), ss.getVariance(), ss.getStdDeviation());
    }
}