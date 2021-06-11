class Pay{//배열을 10개로 지정하고
    // 그 안에 각각 랜덤한 월급을 집어 넣어야하나?
    int[] payment;


    public Pay(int employeePayarr[]){//월급 배열

        int payment[] = new int[10];
        payment = new int[employeePayarr.length];
        for(int i =0; i<employeePayarr.length;i++){
            payment[i] = (int)(Math.random()*1100+2400);
            //payment배열에 2400~3500까지 저장을 이런식으로 하면될라나?
            System.out.println(payment[i]);
            // 불러와보니 저장은 잘 된것같다.
        }

    }
    public void employee1(){
         //인상율은 101~120 랜덤??
        //근대 랜덤에 왜 빨간줄이뜨지??
    }

    public int[] getPayment() {
        return payment;
    }
}

    /*랜덤 연봉 적용을 해보자
    어떤 회사에 직원이 10명 있다.
        10명의 이름은 적당히 지어주도록 한다.
        이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
        또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
        10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
        또한 연별로 평균 연봉값을 계산해보도록 한다.
     */
public class Prob43 {
    public static void main(String[] args) {
        int[] A = new int[10];
        Pay pay = new Pay(A);
        System.out.println(pay.getPayment());
        //그런데 아래쪽에서 getpayment로 불러오니 null이 뜬다. why?

    }
}
