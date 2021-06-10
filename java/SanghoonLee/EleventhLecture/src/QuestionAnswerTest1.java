class Income {
    private int salary; // 연봉
    private float randomIncrease; // 랜덤인상률

    // 클래스의 생성자
    public Income() {
        // 계속해서 자기 자신을 호출하는 재귀 호출 형태가 되어버림
        // 끝나지 않는 무한의 루프를 타버림
        // Income salary = new Income();
        // 2400 ~ 3500
        int salary = getRandomValue(1101, 2400);
        // 0.01 ~ 0.2는 소수점 (float, double)
        float randomIncrease = getRandomValue(20, 1);
    }

    // 매서드 작성시 클래스 내부 변수와 이름이 완전 동일하게 만들지 않는 것을 권장한다.
    // calcSalary(연봉 계산), printSalary(연봉 출력)
    public int getRandomValue(int range, int offset) {
        return (int)(Math.random() * range + offset);
    }
}

public class QuestionAnswerTest1 {
    public static void main(String[] args) {
        System.out.println("지옥의 무한 루프 시작!");

        // new Income()은 뭘 할까요 ? 생성자 호출
        Income ic = new Income();
    }
}
