class Pay{
    /* 직원 10명의 연봉을 랜덤으로 설정하고, 인상률을 랜덤으로 가지고 10년후의 연봉을 출력하자.
    일단 생성자를 만들어서 랜덤 연봉을 인자가 10개인 배열안에
    초기화 시키는것부터 만들어야겠군... 그리고 연봉인상률을 계산하는 매소드를 하나 만들고,
    그걸 출력하는 메소드를 하나 만들어야겠다.
     */
    int yearSalary[]; //연봉을 저장할 배열
    final int MAX = 10; // 10명을 고정하기위한 max
    float PERCENT = 0.01f; // %제거를 위한 0.01

    public Pay(){
        yearSalary = new int[MAX]; //배열 갯수 지정
        for(int i = 0; i < MAX ; i++ ){ //연봉 10번 돌리기
            yearSalary[i] = (int)(Math.random()*1101+2400);
        }
    }
    public void calPay(int year){// 몇년을 대입하기위한 int year
        float ranIncPay; //랜덤 상승률 플로트
        for(int i = 0; i < year ; i++ ){
            ranIncPay = (float) (Math.random()*20+1); //1~20
            yearSalary[i] = (int)(yearSalary[i] *(1.0f + ranIncPay * PERCENT));
                             //PERCENT를 곱하면 0.01~0.2가되고 1을 더해야 상승률이됨
        }


    }
    public void printPay(){ //출력용 매소드
        for(int i = 0 ; i < MAX ; i++){
            System.out.println("연봉을 출력합니다."+ yearSalary[i]);
        }

    }

}

public class MyProb43 {
    public static void main(String[] args) {
        Pay pay = new Pay();
        pay.calPay(10);//calpay 소환하고 10넣으면 year에 10이 들어감
        pay.printPay(); // 출력하기

    }
}
