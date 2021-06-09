import java.util.Scanner;

class ScoresArray {
    private int stuScores[];
    private int stuNum = (int)(Math.random()*8+5);
    private int sum;
    private float mean;

    public ScoresArray() {
        stuScores = new int[stuNum];
        for(int i=0; i<stuNum; i++) {
            stuScores[i]=(int)(Math.random()*30+70);
            sum+=stuScores[i];
        }
    }
    public void pirntArray() {
        for (int arr : stuScores) {
            System.out.print(arr + "\t");
        }
        System.out.println();
    }
    public float calcMean() {
        for(int i=0; i<stuNum; i++) {
            sum+=stuScores[i];
        }
        mean = sum/(float)stuNum;
        return mean;
    }
    public int getSum() {
        return sum;
    }
    public int getStuNum() {
        return stuNum;
    }
}
public class ClassArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;
        int totalStuNum = 0;

        //ScoresArray sa = new ScoresArray(); <--- 이 경우는 클래스를 sa라는 하나의 객체로 만들 때!
        //ScoresArray sa[] = new ScoresArray[4]; <--- 클래스를 sa라는 객체로 만들어 하나가 아닌 4개로 배열화한다!
        ScoresArray sa[]; //<---일단 sa라는 객체들의 배열이 있다고 선언만 해 둔 상태이다.

        System.out.print("학급의 수 : ");
        int classNum = sc.nextInt();
        sa = new ScoresArray[classNum]; //sa라는 클래스 배열의 길이(갯수)는 classNum개이다!

        for(int i=0; i<sa.length; i++) {
            sa[i] = new ScoresArray();
            System.out.print((i+1)+"학급 점수 나열 : ");
            sa[i].pirntArray();
            System.out.printf("%d학급의 평균 점수 : %.2f\n", i+1, sa[i].calcMean());
            System.out.println((i+1) + "학급의 총 점수 합계 :" + sa[i].getSum());

            totalSum += sa[i].getSum();
            totalStuNum += sa[i].getStuNum();
        }
        System.out.printf("최종 점수 합계 : %d, 점수 평균 : %.2f", totalSum, totalSum / (float)totalStuNum);
    }
}
