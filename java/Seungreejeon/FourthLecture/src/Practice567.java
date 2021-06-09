public class Practice567 {
    public static void main(String[] args) {

      //===========15번 문제===========
        System.out.println("1~100까지 숫자 중 4의 배수만 출력해보자");
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0) {
                System.out.println(i+": 4의 배수");
            }
        }


        //===========16번 문제===========
        int sum = 0;
        System.out.println("1의 100까지의 숫자중 11의 배수들의 합을 구해보자!");

        for (int i = 0; i <= 100; i++) {
            if (i % 11 == 0) {
                sum += i;
            }
        }
        System.out.println("11 배수의 합 : "+ sum);


        //===========17번 문제===========
        System.out.println("컴퓨터와 주사위게임을 해보자!");
        System.out.println("조건 : 주사위를 2번 굴려서 합산 눈금 숫자가 큰 사람이 이기기는 것으로 한다.");
        int num1 = 0 , num2 = 0 , sum1 = 0, sum2 = 0;
        for (int i = 1; i <= 2; i++) {
            num1 = (int)(Math.random()*6)+1;
            System.out.println( i +" 번째 주사위 숫자 : " + num1);
            sum1 +=  num1;
            num1 = 0;
        }
        System.out.println("사용자 숫자의 합입니다 : " + sum1);

        for (int i = 1; i <= 2; i++) {
            num2 = (int)(Math.random()*6)+1;
            System.out.println( i +" 번째 주사위 숫자 : " + num2);
            sum2 += num2;
            num2 = 0;
        }
        System.out.println("컴퓨터 숫자의 합 입니다 : " + sum2);
        if (sum1 == sum2) {
            System.out.println("비겼습니다");
        }  else  if (sum1 > sum2){
            System.out.println("사용자가 이겼습니다");
        } else {
            System.out.println("컴퓨터가 이겼습니다");
        }
    }
}
