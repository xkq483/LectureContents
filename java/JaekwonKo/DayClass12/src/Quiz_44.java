class Income {
    final float MAX = 0.01f;

    private String name;
    private int salary;

    public Income(String name) {
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);

        }
        public void calcRnadomincrease() {
            float incRate = (int)(Math.random() * 20 + 1);
            salary = (int)(salary + salary * incRate * MAX);
        }

    public void printsalary () {
        System.out.printf("%s의 연봉은 %d 입니다.\n", name,salary);
    }

    public int getSalary() {
        return salary;
    }


}

// 1. 랜덤 연봉 범위 2400 ~ 3500 : 범위 설정 완료
// 2. 직원은 10명   :  메인메소드에 사용
// 3. 인상률 1 ~ 20% ( 랜덤 인상률 0.01 ~ 0.2) : 적용완료
// 4. 10년간 반복하여 결과 계산
// 5. 출력기능
// 6. 퍼센트 계산이므로 고정된 소수점 (0.01 사용) : 사용완료
// 7. 각 연도별 평균값에 대한 정보가 필요함



public class Quiz_44 {
    public static void main(String[] args) {
        String strArr [] = {"직스", "제이스", "이즈리얼", "징크스", "모르가나", "누누", "룰루", "카직스", "제라스", "애쉬"};

        int strLen = strArr.length;
        Income[] st = new Income[strLen];

        // 이아래부터터

       for (int i = 0; i < strLen; i++) {
            st[i] = new Income(strArr[i]);
        }

        for (int i = 0; i < 10; i++) {
            float sum = 0;
            for (int j = 0; j < 10; j++){
                st[j].calcRnadomincrease();
                sum += st[j].getSalary();
                st[j].printsalary();

            }

            System.out.println("올해 평균 연봉 = " + (sum / 10.f));
        }




    }
}
