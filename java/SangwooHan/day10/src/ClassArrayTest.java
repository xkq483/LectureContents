import java.util.Scanner;

class ScoresTest {
    final int MAX = 5;

    float sum;
    float mean;
    int randArr[];

    public ScoresTest () {
        sum = 0;
        randArr = new int[MAX];
        // 현재 randArr는 5개의 방을 만듬.

        for (int i = 0; i < MAX; i++) {
            randArr[i] = (int)(Math.random() * 50 + 50);

            // randArr [0]~[4]까지 각각

            // 50~100까지 랜덤하게 숫자가 뽑힘.
            // 숫자를 랜덤하게 뽑는 매서드
        }
    }

    public void calcMean () {
        for (int i = 0; i < MAX; i++) {
            sum += randArr[i];
            System.out.println("랜덤수 5개 더한값= "+sum);
            // 그숫자들을 한곳에 더해주는 매서드
        }

        mean = sum / (float)MAX;
        System.out.println("평균="+mean);

    }

    public int[] getRandArr() {
        return randArr;
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

public class ClassArrayTest {
    public static void main(String[] args) {

        ScoresTest[] st;
        // 배열선언.
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt();

        st = new ScoresTest[num];//생성자가 배열생성자이다.  배열칸안에n을 적었다면,  ScoresTest가  생성자는 5번 만들어질것이다.
        // 생성자 역할도 하는거같음.  ScoresTest[] st = new ScoresTest[num]  이랑 동의어 인가보다.
        // 클래스 형식의 커스텀 테이터타입으로 만들어진 배열을
        float totalSum = 0;
        float totalNumber = 0;

        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest();


            st[i].calcMean();
            totalSum += st[i].getSum();
            totalNumber += st[i].getMAX();
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}