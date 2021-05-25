class Salary {
    private final int MAX = 10;
    private final float PERCENT = 0.01f;
    private int[] yearSalary;
    private float incSalary;

    public Salary() {
        yearSalary = new int[MAX];  // <= 여기서 new int[]를 쓴이유가 궁금합니다.
                                    // new 라는건 무엇에 대한 호출인가요? 혹시 10명분의 배열을 만든다는 뜻인가요?
        for (int i = 0; i < MAX; i++) {
            yearSalary [i] = (int)(Math.random() * 1101 + 2400);
            // System.out.println(yearSalary [i]); //한번 되는지 출력해보자.
        }
    }
    public void incSalary(int year) {
        //float incSalary;
        for (int i = 0; i < year; i++) {
           incSalary = (float)(Math.random() * 20 + 1);
            yearSalary [i] = (int)(yearSalary[i] + yearSalary[i] * incSalary * PERCENT);
            //yearSalary[i] = (int)(yearSalary[i] * (1.0f + incSalary * PERCENT)); //그 외 공식
            System.out.println(yearSalary[i]); // 중간 출력 점검
        }
    }
    public void printSalary() {
        for (int i = 0; i < MAX; i++) {
            System.out.println("10년치 연봉 인상 값을 출력합니다 = " + yearSalary[i]);
        }
    }
}

//.. 가상설계 작성.. //
// 1. 10명 직원의 숫자를 (final)로 값을 지정
// 2. 1년 월급은 2400만원 ~ 3500만원 랜덤값으로 할당
// 3. 10년치 월급 인상률 관련 로직 필요 1% ~ 20%
// 4. 출력 메소드를 만들어 10년후 직원들의 각 연봉을 산출

public class Prob43Practice {
    public static void main(String[] args) {
        Salary sa = new Salary();
        sa.incSalary(10);
        sa.printSalary();
    }
}
