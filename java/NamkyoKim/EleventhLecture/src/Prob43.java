

class RandomSalary{
    final int MAX = 10;
    final float PERCENT = 0.01f;
    int [] yearSalary;

    public RandomSalary(){
        yearSalary = new int[MAX];

        for (int i = 0; i < MAX; i++){
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);
        }
    }
    public void calcRandomSalary(int year){
        float randIncRate;

        for (int i = 0; i < year; i++){
            randIncRate = (float) (Math.random() * 20 + 1);
            //yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * 0.01);
            yearSalary[i] = (int)(yearSalary[i] *(1.0f + randIncRate * PERCENT));
            // X = A + A * B * C
            // X = A + ABC ====> A * (1 + B + C)
            // 10% 는 ? (10 / 100) <<< 0.01을 곱하는것과 같고
            // %를 없애주기위해 0.01을 곱함
        }
    }
    public void printSalary(){
        for (int i = 0; i < MAX; i++){
            System.out.println("연봉을 출력합니다 : " + yearSalary[i]);
        }
    }
}

// 1. 랜덤 연봉 2400 ~ 3500
// 2. 직원 10명임(고정 상수 10 사용)
// 3. 인상률 1 ~ 20% (랜덤 인상률 0.01 ~ 0.2)
// 4. 10년간 반복하여 결과 계산
// 5. 출력가능
// 6. 퍼센트 계산이므로 고정된 소수점(0.01 사용0

public class Prob43 {
    public static void main(String[] args) {

        RandomSalary rs = new RandomSalary();

        rs.calcRandomSalary(10);
        rs.printSalary();
    }
}
