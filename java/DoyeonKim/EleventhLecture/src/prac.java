/* class RandSalary {
    final int MAX = 10;
    final float PERCENT = 0.01f;
    int incrate;
    int[] year;
    int salary;

    public salary() {
        for (int i; i < MAX; i++); {
            year[i]; = (int)(Math.random() * 1101 + 2400);
        }

    }
//직원 10명이 있음
// 연봉 지정
// 인상률
//10년후 각 직원 연봉 출력


}

public class prac {

}

 */

class RandomSalary2 {
    final int MAX = 10;//회사직원 10명 상수값
    final float PERCENT = 0.01f;//퍼센트 상수값
    int[] yearSalary;

    public RandomSalary2 () { //메서드 만들어주기
        yearSalary = new int[MAX]; //해마다 연봉 10명 인덱스

        for (int i = 0; i < MAX; i++) {
            yearSalary[i] = (int)(Math.random() * 1101 + 2400); //10명의 랜덤 연봉
        }
    }

    public void calcRandomSalary (int year) { //연봉계산,아래에서 10년 입력값을 가져옴
        float randIncRate;

        for (int i = 0; i < year; i++) {  //10번반복
            randIncRate = (float)(Math.random() * 20 + 1); //랜덤으로 인상되는 값
            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));
            //총연봉은 연봉 * 1.0 + 랜덤값 * 0.01
        }
    }
    public void printSalary () { //출력
        for (int i = 0; i < MAX; i++) { //연봉 계산된걸 출력 yearSalary 인덱스에 저장된 10명 출력
            System.out.println("연봉을 출력합니다: " + yearSalary[i]);
        }
    }
}

public  class prac  {
    public static void main(String[] args) {
        RandomSalary2 rs = new RandomSalary2();//호출해줌

        rs.calcRandomSalary(10); //위의 year값 정해줌
        rs.printSalary();
    }
}


