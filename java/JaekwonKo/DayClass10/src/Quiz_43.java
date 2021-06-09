class Income {
    final String str [] = {"가", "나", "다", "라", "마", "바", "사", "아", "자", "차"};
    int income; //연봉
    float increase; //인상률


    public Income() {
        for(int i =0; i < str.length; i++) {

            income =(int)(Math.random() * 1100 + 2400); //연봉
            increase = (float)(Math.random() * (0.2f-0.01f))+0.01f; //최대값 0.2f 최소값 0.01f

            System.out.printf("%s의 연봉 : %d만원, 매년 %.2f%% 연봉인상\n"
                    ,str[i],income,increase);
        }

        // 이다음부터 어떻게 해야할지 감이 안잡히네요...




    }


}

public class Quiz_43 {
    public static void main(String[] args) {
       Income ic = new Income();



    }
}
