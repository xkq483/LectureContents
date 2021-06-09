class RandomSalary1 {

/* 랜덤 연봉 적용을 해보자
어떤 회사에 직원이 10명 있다.
10명의 이름은 적당히 지어주도록 한다.
이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
또한 연별로 평균 연봉값을 계산해보도록 한다. */


    // final : 상수를 정의함 (한 번 값을 정해주면 값변경 불가)
    // 변수명은 모두 대문자로 하는것이 프로그래머끼리의 약속
    // final 타입 필드 = 초기값;
    final int MAX = 10; // MAX 라는 int 데이터타입에 10 담음
    final float PERCENT = 0.01f; // PERCENT 라는 float 데이터타입에 0.01 담음
    int[] yearSalary; // 연봉 담는 배열


    // 생성자 : 인스턴스 변수(필드)에 대한 값을 할당(초기화) 하는 것.
    // new를 통해 인스턴스를 생성할때 반드시 호출이 된다.
    // 생성자를 생략하면 컴파일러가 자동으로 기본생성자(Default Constructor)를 생성해준다 - public 클래스(){ }
    // 생성자를 정의하는 클래스의 이름과 동일해야 함

    public RandomSalary1 () {
        yearSalary = new int[MAX]; // yearSalary 에는 10개까지 담을 수 있음

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);
        } // 시작연봉 2400 ~ 3500 지정
    }

    public void calcRandomSalary1 (int year) {
        // (int year) : 매개변수 입력, year를 main메소드로 내보낼 준비

        float randIncRate;

        for (int i = 0; i < year; i++) {
            randIncRate = (float)(Math.random() * 20 + 1); // 연봉 인상률 1 ~ 20%
            // yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * PERCENT);
            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));
            // X = A + A * B * C
            // X = A + ABC ===> A * (1 + B * C)
            // 10% 는 ? (10 / 100) <<<=== 0.01을 곱하는것과 같고
            // %를 없애주기 위해 0.01을 곱함
        }
    }
    public void printSalary () {
        for (int i = 0; i < MAX; i++) {
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);
        }
    }
}

// 1. 랜덤 연봉 범위 2400 ~ 3500
// 2. 직원은 10명임 (고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01 사용)

public class homework_0524 {
    public static void main(String[] args) {
        RandomSalary1 rs = new RandomSalary1(); // 클래스 객체변수 = new 클래스();

        rs.calcRandomSalary1(10);
        // 10년동안의 연봉인상률(1 ~ 20%)을 계산하여 yearSalary 에 담았고
        rs.printSalary(); // yearSalary의 값이 담긴 printSalary 메소드 출력
    }
}