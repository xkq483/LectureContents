class RandomSalary {
    final int MAX = 10;
    final float PERCENT = 0.01f;
    int[] yearSalary;

    public RandomSalary () {
        yearSalary = new int[MAX];

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);
        }
    }
    public void calcRandomSalary (int year) {
        float randIncRate;

        for (int i = 0; i < year; i++) {

            randIncRate = (float)(Math.random() * 20 + 1);

            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));


            // 10% 는 ? (10 / 100) <<<=== 0.01을 곱하는것과 같고

        }
    }
    public void printSalary () {
        for (int i = 0; i < MAX; i++) {
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);
        }
    }
}


public class Prob43 {
    public static void main(String[] args) {
        RandomSalary rs = new RandomSalary();

        rs.calcRandomSalary(10);
        rs.printSalary();
    }
}