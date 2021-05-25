
//1. 직원 10명
//2. 시작 연봉 2400 ~ 3500 사이의 랜덤값
//3. 연봉 인상률 1% ~ 20% 사이의 랜덤값
//4. 10년 후 각 직원들 연봉
//5. 연 별 평균 연봉값
class AnnualIncome {

    int income;
    String name;
    float increase;
    final float PERCENT = 0.01f;

    public AnnualIncome(String name) {
//        생성자 : 초기값 설정
// 2. 시작 연봉 2400 ~ 3500 사이의 랜덤값
        this.name = name;
        income = (int) (Math.random() * 1101 + 2400);
    }

//    1명의 직원 연봉 변화
// 3. 연봉 인상률 1% ~ 20% 사이의 랜덤값
    public void clacIncIncome(){
        increase = (int) (Math.random() * 20 + 1);
        income = (int) (income + income * increase * PERCENT);
    }

    public void printIncome() {
//        "%s의 연봉은 = %d\n" 이 아닌
//        "%s의 %d년차 연봉은 = %d\n"이라고 출력해보고 싶어서
//        for(int i = 0; i < 10; i++) {
//             System.out.printf("%s의 %d년차 연봉은 = %d\n", name,i, income);
//        } 으로 시도했다가 값이 중복되면서 실패


            System.out.printf("%s의 연봉은 = %d\n", name, income);
    }

    public int getIncome() {
        return income;
    }
}
public class Quiz43Re {
    public static void main(String[] args) {
//        1. 직원 10명
        String name[] = {"가가", "나나", "다다", "라라", "마마",
                "바바", "사사", "아아", "자자", "차차"};

        int len = name.length;
        AnnualIncome[] ai = new AnnualIncome[len];
//        클래스의 배열화


        for (int i = 0; i < len; i++) {
            ai[i] = new AnnualIncome(name[i]);
        }

        int year = 10;
//        4. 10년 후 각 직원들 연봉
        for (int i = 0; i < year; i++) {
            float sum = 0;
            for (int j = 0; j < len; j++) {
                ai[j].clacIncIncome();
                // 5. 연 별 평균 연봉값
                sum += ai[j].getIncome();
                ai[j].printIncome();
            }
            System.out.println("올해 평균 연봉 = " + sum / 10.0f );
        }


    }
}
