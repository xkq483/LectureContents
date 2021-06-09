//10명에 10년째 연봉을 출력하는 코드

class RandomSalary {
    final int MAX = 10;
    final float PERCENT = 0.01f;
    int[] yearSalary;

    public RandomSalary () {   //생성자는 요렇게 값의 초기화만 해준다!
        yearSalary = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);
        }
    }
    public void calcRandomSalary (int year) {
        float randIncRate;

        for (int i = 0; i < year; i++) {
            // 1 ~ 20%
            randIncRate = (float)(Math.random() * 20 + 1);
            // yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * PERCENT);
            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));
            // X = A + A * B * C
            // X = A + ABC ===> A * (1 + B * C)  //왜 1인 것인가!? (두 식 모두 같다)(분배법칙)(수학공부 다시 해야하나!?)
            // 10% 는 ? (10 / 100) <<<=== 0.01을 곱하는것과 같고
            // %를 없애주기 위해 0.01을 곱함  (기억해두자 퍼센트는 써먹을데가 많을 것이다!)
        }
    }
    public void printSalary () {
        for (int i = 0; i < MAX; i++) {
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);  //각 배열의 맞는 연봉을 출력한다
        }
    }
}

public class Prob43 {
    public static void main(String[] args) {
        RandomSalary rs = new RandomSalary();

        rs.calcRandomSalary(10);  //메소드 괄호안에 값을 입력하여 메소드를 호출한다
        rs.printSalary(); //연봉을 출력하는 메소드를 호출한다
    }
}