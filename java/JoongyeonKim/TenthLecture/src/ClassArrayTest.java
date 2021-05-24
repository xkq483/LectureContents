import java.util.Scanner;
// 클래스 배열에 관한 예제
class ScoresTest {
    final int MAX = 5;

    float sum;
    float mean;
    int randArr[];

    public ScoresTest () {
        //5개의 배열을 만들고 랜덤값을 할당함
        sum = 0;
        randArr = new int[MAX];  //동적 변수 할당하는 방법

        for (int i = 0; i < MAX; i++) {    //i가 0~4까지 구해지면 빠져나감
            randArr[i] = (int)(Math.random() * 50 + 50);
        }
    }
    public void calcMean () {
        for (int i = 0; i < MAX; i++) {  
            sum += randArr[i];  //5개의 결과값을 모두 sum에 더한다
        }

        mean = sum / (float)MAX;  //각 객체의 평균을 구한다
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
        // 클래스 <- 커스텀데이터타입(우리가 커스텀하여 만들 수 있는 데이터 타입)
        ScoresTest[] st;    //객체 생성
        Scanner scan = new Scanner(System.in);

        System.out.print("몇 개의 학급이 있나요 ? ");

        int num = scan.nextInt(); 

        // 클래스 형식의 커스텀 데이터타입으로 만들어진 배열을 num 개수만큼 만듭니다
        // 그리고 st라는 변수명이 이 배열 메모리 공간을 관리합니다.
        st = new ScoresTest[num]; // int num = scan.nextInt(); <- 이 문장 아래에 있어야 배열이 만들어짐

        float totalSum = 0;
        float totalNumber = 0;

        //--------------------------
        //| 객체1 | 객체2 | 객체3 | 객체4 | 객체5 |
        //--------------------------------------
        //  [0]    [1]    [2]    [3]     [4]
        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest(); //이 부분을 통해 객체1, 객체2...
            st[i].calcMean();  //위에 있던 한 객체의 평균을 구하는 메소드
            totalSum += st[i].getSum(); //각각의 반 하나에 값을 더함
            totalNumber += st[i].getMAX();  //반의 수를 대입함
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}