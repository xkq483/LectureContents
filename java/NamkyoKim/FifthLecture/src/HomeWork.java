public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
      /*  앞서서 22번의 경우엔 난수의 범위가 0 ~ 9 였다.
          이번에는 2개의 범위를 가지는 난수 2개를 중복없이 제어해보자!
          하나는 5 ~ 10의 범위를 가지고 다른 하나는 7 ~ 10의 범위를 가진다.
          22번 예제를 응용하여 풀 수 있는 문제고 다소 난이도가 높은 문제다.
          ex) 5, 6, 7, 8, 9, 10이 모두 출력되어야 하고 또한 7, 8, 9, 10이 출력되어야 한다.
            여기서 중복이 발생하면 안됨

       */


        final int BIN1 = 1;
        final int BIN2 = 1;


        int randNum1;
        int randNum2;
        int Bit1= 0, Bit2 = 0;


        for(int i = 1; i < 10;i++){

            // 5 ~ 10 까지 설정
            // (Math.random() * (10 - 5 + 1)+5)
            //                 (최대값 - 최소값 + 1)+5
            randNum1 = (int) (Math.random() * (10 - 5 + 1)+5);

            while ((Bit1 &  (BIN1 << randNum1)) != 0){
                randNum1 = (int) (Math.random() * (10 - 5 + 1)+5);
            }
            System.out.printf("ranNum1 = %d\n", randNum1);


            Bit1 |= (BIN1 << randNum1);

        }
       System.out.println(Bit1);

        Thread.sleep(500);

    }
}

// 일단 하나만 범위 정해서 풀어보려고 했는데 5~10 범위는 정해서 했습니다
// Bit1변수에 0 으로 초기화 해놓고 ((Bit1 &  (BIN1 << randNum1)) != 0) 이렇게 하면 되는건지 몰겠네요 ,..
// AND 랑 OR 쉬프트연산은 어느정도 이해하겠는데
//  결과값이 ranNum1 것들 5개 중복없는 애들만 나오고 마지막 Bite1 은 왜안나오는거죠?
// 1개라도 구하고싶어서 이것저것 찾아보고 복습도 하는겸 풀었는데 지금 런 했는데 중지되지않고 무한뤂도 돌고있어요
//