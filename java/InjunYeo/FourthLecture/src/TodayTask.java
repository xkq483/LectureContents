public class TodayTask {
    public static void main(String[] args) {
        //1.for + if 문제(1~100)숫자중 4의 배수만 출력해보자
        System.out.println("==============1번 문제====================");
        for(int i=1; i <101 ; i++){
            if(i%4==0){
                System.out.println("4의 배수 : "+i);
            }
        }
        System.out.println("==============2번 문제====================");
        //2.for + if 문제(1~100)숫자중 11의 배수들의 합을 구해보자!
        int sum=0;
        for(int i =1;i<101;i++){
            if(i%11==0){
                System.out.println(sum+=i);
            }
        }
        System.out.println("11의 배수 총합은 : "+sum);

        //3.Math.random() 응용 문제
        //컴퓨터와 주사위 게임을 해보자. 주사위를 2번굴려 합산 눈금 숫자가 큰 사람이 이기는것으로 한다.

        System.out.println("==============3번 문제====================");

        int dice1 = ((int)(Math.random() * 6 + 1) );
        System.out.println("컴퓨터 : "+dice1);
        int dice2 = ((int)(Math.random() * 6 + 1) );
        System.out.println("나 : "+dice2);

        if(dice1 == dice2){
            System.out.println("무승부");
        }

        else if(dice1< dice2){
            System.out.println("승자는 나");
        }
        else{
            System.out.println("승자는 컴퓨터");
        }
        System.out.println("==============시험 문제====================");
        // 두번씩 굴려서 합산하는 게임
        int total1= 0;
        int total2= 0;

        for(int i=1;i<3;i++){
            int dice3 = ((int)(Math.random() * 6 + 1) );
            System.out.println(i+"번째"+"나온숫자 : "+dice3);
            total1 +=dice3;

        }
        System.out.println("컴퓨터 : "+total1);

        for(int i =1;i<3;i++){
            int dice4 = ((int)(Math.random() * 6 + 1) );
            System.out.println(i+"번째"+"나온숫자 : "+dice4);
            total2 += dice4;

        }
        System.out.println("나 : "+total2);

        if(total1 == total2){
            System.out.println("무승부");
        }

        else if(total1>total2){
            System.out.println("승자는 컴퓨터");
        }
        else{
            System.out.println("승자는 나");
        }






    }




}
