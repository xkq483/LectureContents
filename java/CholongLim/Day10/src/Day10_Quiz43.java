//직원 10명에게 각각 이름을 부여함
//랜덤연봉 2400 ~3500 , 연봉 인상률 1% ~20% 랜덤
//10년 후 각 직원들의 연봉은?
//연별로 평균 연봉값은?

class AnnualIncome {
//    직원 10명에게 알파벳 이름을 부여함
    final String peopleName [] = {"A","B","C","D","E","F","G","H","I","J"};
    final int MAX = 10;
    int income;
    int increase;
    float sum;
    float mean;

    public void peopleIncome() {
        for(int i =0; i < peopleName.length; i++) {
//            랜덤연봉 2400 ~ 3500
            income = (int)(Math.random() * 1100 + 2400);
//            직원에 따른 랜덤 연봉 및 랜덤 연봉 인상률 출력은 가능하나,
//            그 값을 활용하여 평균갑스 10년후 연봉들에
//            income, increase를 사용하여 코드를 만들어내기 어렵습니다.
//
//            income을 단순 int형으로 사용하여 재활용이 불가능한 것일까요?
//            income[i]로 배열로서 income[0] = (int)(Math.random() * 1100 + 2400);
//            출력하여 재활용 하려 했으나
//            클래스에서 int income []; 선언 후,
//            incomep[] = (int)(Math.random() * 1100 + 2400);를 사용해도 오류가 뜨는게
//            배열을 잘 적용하지 못하고, 내용에 따라 코드 작성을 하는데 어려움을 느낍니다.

//            연봉 인상률
            increase = (int)(Math.random() * 20 + 1 );
            System.out.printf("%s의 연봉은 %d만원이고, 매년 %d퍼센트 연봉이 인상된다.\n"
                    ,peopleName[i],income,increase);


        }
    }
    public void tenYearIncome(){
//        10년 후 각 직원들의 연봉 :
//        [0] = 랜덤초봉
//        [1] = 랜덤 초봉 + (랜덤초봉  * 랜덤 연봉 인상률)
//        [2] = [1] + ([1]  * 랜덤 연봉 인상률)
//        [3] = [2] + ([2]  * 랜덤 연봉 인상률) ...
//        [i] 가 9가 되었을때 각 직원들의 연봉

        for(int  i =0; i < MAX; i++ ) {
        }
    }


//    연별로 평균 연봉값
    public  void annualIncomeMean(){
        for(int i = 0; i < MAX; i++  ) {
            ;
        }
        mean = sum / (float) MAX;
    }

}
public class Day10_Quiz43 {
    public static void main(String[] args) {
        AnnualIncome pi = new AnnualIncome();
        pi.peopleIncome();

//        pi.annualIncomeMean();
    }

}
