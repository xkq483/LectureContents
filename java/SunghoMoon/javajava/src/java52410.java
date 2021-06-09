class RSalary {
    final int MAX = 10; // 직원이 10명
    final float PERCENT = 0.01f; //??
    int[] yearSalary; // 2400~3500의 랜덤값


    public RSalary () {//1100 ~ 3500 연봉 구하기
        yearSalary = new int[MAX];//MAX=10

        for (int i = 0; i < MAX; i++) { // i값이 10보다 작을때 0부터 1씩 증가
            yearSalary[i] = (int)(Math.random() * 1101 + 2400);
            //1100 ~ 3500(1100+2400) + 1101이유는 0부터 시작이기 때문(1100만 입력시 3499로 끝남)
        }
    }
    public void calcRandomSalary (int year) { //1 ~ 10년 구하기 year은 년차를 대입하기 위해 사용하는건가?
        float randIncRate; // 0.01 ~ 0.2 이라서 float 사용?

        for (int i = 0; i < year; i++) { // i값(년차)가 year

            randIncRate = (float)(Math.random() * 20 + 1); // 연봉 인상률률 1 ~ 20%

            yearSalary[i] = (int)(yearSalary[i] * (1.0f + randIncRate * PERCENT));
            // PERCENT=0.01f인것을 알겠는데 10% 는 ? (10 / 100) <<<=== 0.01을 곱하는것과 같고 여기까지 이해함
            // 인상률이 0.01(1퍼센트) ~ 0.2(2퍼센트) 라서 0.05(5퍼센트)등으로 표현하기 위해서 0.01을 곱한걸까
            //==yearSalary[i] = (int)(yearSalary[i] + yearSalary[i] * randIncRate * PERCENT);

        }
    }
    public void printSalary () {
        for (int i = 0; i < MAX; i++) { // 입력값이 10 미만일때 1씩 증가
            System.out.println("연봉을 출력합니다: " + yearSalary[i]); //yearSalary = 인상된 연봉
        }
    }
}



public class java52410 {
    public static void main(String[] args) {
        RSalary rs = new RSalary();
        //Class 타입변수명 = new RSalary(생성자)
        //RSalary라는 타입으로 rs라는 객체를 선언
        //new를 통해 RSalary를 heap 영역에 할당
        //이후 rs에게 반환


            rs.calcRandomSalary(10); // for문을 통해 10번 반복(MAX값이 10이기 때문)
            rs.printSalary();
    }

}


// 공통점 : 한번에 계산하지 않고 여러번에 나눠서 계산함
// -> 연봉 + 연봉 인상률을 한꺼번에 구하지 않고
// ex)float mean = sum / num; */
// -> 연봉을 먼저 구하고(메소드1) + 인상률(메소드2)를 구함
// -> 그리고 최종 종합을 구함(메소드3)

