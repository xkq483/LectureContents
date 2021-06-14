import java.util.Scanner;

class ScoresTest{
    final int MAX = 5;

    float sum;
    float mean;
    int randArr[];
    // 클래스에 변수 선언


public ScoresTest(){
    // 5개의 배열을 만들고 랜덤값을 할당함.
    System.out.println("생성자 호출 !!");
    sum = 0;// 생성자에 sum값 합산구할 변수선언과 초기화
    randArr = new int[MAX]; // 클래스에서 선언한 배열에 MAX(5) 대입 new

    for (int i = 0; i < MAX; i++){
        randArr[i] = (int)(Math.random() * 50 + 50);
        // for문 5번 돌게 만들고 랜덤값은 0번 인덱스부터 집어넣게 설정
        }
    }
    public void calcMean () {
        for (int i = 0; i < MAX; i++) {
            sum += randArr[i]; // 여기서 도 for문을 5번 돌게 만들고  ex) sum = sum + ranArr[0] ... ~
        }

        mean = sum / (float)MAX;    // 평균 구하는 공식 모든 값의 합산에 총 길이 MAX로 나눈다 평균은
                                    // 소수점 표현을 해야하기 떄문에 float형변환
                                    // 그래서 mean에 대입
    }

    public int[] getRandArr() {
        return randArr;
    }

    public float getMean() {
        return mean;
    }

    public int getMAX() {
        return MAX;
    }

    public float getSum() {
        return sum;
    }

}

public class ClassArrayTest {
    public static void main(String[] args) {
        // 클래스 < ====== 커스텀 데이터 타입(우리가 커스텀하여 만들 수 있는 데이터타입)
        ScoresTest[] st; // 클래스를 배열로 변수 선언
        Scanner scan = new Scanner(System.in); // 스캐너 선언

        System.out.println("몇 개의 학급이 있나요?"); // 입력 받기위한 출력구문

        int num = scan.nextInt();   // 입력을 num변수에 대입

        // 클래스 형식의 커스텀 데이터타입으로 만들어진 배열을 num 개수만큼 만듭니다.
        // 그리고 st라는 변수명이 이 배열 메모리 공간을 관리합니다.
        st = new ScoresTest[num]; // 만약 입력을 5개를 입력했을시 5개의 인덱스가 만들어짐 그걸 st객체 배열에 대입

        float totalSum = 0;
        float totalNumber = 0;
        // 각 객체 별로 독립성을 띄기 떄문에 값을 초기화 해서 사용하려하는부분같음 ..

        //----------------------------------------
        // | 객체 1 | 객체 2 | 객체 3 | 객체 4 | 객체 5 |
        //    [0]     [1]      [2]    [3]    [4]
        for (int i = 0; i < num; i++) {
            st[i] = new ScoresTest();   // 이 부분을 통해 객체 1, 객채2 ......객체 5 가 생성됨
            st[i].calcMean(); // 평균값 구하는 공식을 가진 메서드 호출

            float tmpSum = st[i].getSum(); // getter에  sum값은 tmpSum에 대입 각객체별 합산값을 구하기위해
            totalSum += st[i].getSum(); // 모든 합산값을 구하기위해 두는 구문
            totalNumber += st[i].getMAX(); // 모든 평균값을 구함을위해
            System.out.println("각 객체별 합산값 = "+ tmpSum);
            System.out.println("각 반의 평균 = " + st[i].getMean());
        }

        System.out.println("최종 계산된 전체 평균은 = " + (totalSum / totalNumber));
    }
}
