import java.util.Scanner;

class CalcScores {
    Scanner sc;
    private int scoresSum;
    private int len;
    private int scoresArray[];
    private float mean;
    private float variance;
    private float stdDev;

    public CalcScores() {
        sc = new Scanner(System.in);
        System.out.print("입력할 점수 개수 : ");
        len = sc.nextInt();

        scoresArray = new int[len];
        scoresSum = 0;
        for(int i=0; i<scoresArray.length; i++) {
            System.out.print("입력할 점수 입력 : ");
            scoresArray[i] = sc.nextInt();
            scoresSum += scoresArray[i];
        }
    }

    private float calcMean() { //<---얘네들을 private으로 하면 get메소드 출력이 main에서 0.0이됩니다.
        mean = (float)scoresSum / (float)len;
        return mean;
    }

    private float calcVariance() { //<---얘네들을 private으로 하면 get메소드 출력이 main에서 0.0이됩니다.
        scoresSum = 0;
        for(int i=0; i<scoresArray.length; i++) {
            scoresSum += Math.pow(scoresArray[i]-mean, 2);
        }
        variance = (float)scoresSum / (float)len;
        return variance;
    }
    private float calcStdDev() { //<---얘네들을 private으로 하면 get메소드 출력이 main에서 0.0이됩니다.
        stdDev = (float)Math.sqrt(variance);
        return stdDev;
    }

    public float getMean() {
        return mean;
    }
    public float getVariance() {
        return variance;
    }
    public float getStdDev() {
        return stdDev;
    }

    }

public class Prob38 {
    public static void main(String[] args) {
        CalcScores cs = new CalcScores();
//        System.out.println("배열의 평균은 : " + cs.calcMean());
//        System.out.println("배열의 분산은 : " + cs.calcVariance());
//        System.out.println("배열의 표준 편차는 : " + cs.calcStdDev());

        //위에 이름에 calc이 붙은 계산 메소드를 public으로 지정하면 아래 get메소드 프린트 값들이 올바르게 출력되는데,
        //private로 바꾸면 get 메소드들 값이 모두 0.0으로 나옵니다. 왜 그런지 잘 모르겠습니다.

        System.out.println("배열의 평균은 : " + cs.getMean());
        System.out.println("배열의 분산은 : " + cs.getVariance());
        System.out.println("배열의 표준 편차는 : " + cs.getStdDev());
    }
}
