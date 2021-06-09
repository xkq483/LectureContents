public class TodayTask {
    public static void main(String[] args) {
        /*중복 방지 문제
        하나는 난수의 범위 5~10으로 잡아서 중복이 발생하지 않게 만들어보자!
        하나는 7~10의 범위를 가진다. 중복이 발생하지 않게 만들어보자!
         */

        final int BIN = 1;

        System.out.println("======================난수범위 5~10======================");
        int marker = 0;

        // 난수범위 5~10
        for(int i = 0;i < 6;i++){
            int randI= (int)(Math.random()*6 +5);


            /*
            bit AND연산자를 사용한 중복체크 알고리즘
            int 형을 사용했기에 32개숫자내에서 중복체크가능
            BIN이 (~ 0001) 이기때문에 시프트 연산자를 통해 randI로 나오는 n의 값을 2^n 해당하는 자리에 1을 할당가능
            AND 연산자 이기때문에 중복된 randI 가 나오게 된다면 0이 아니게되어 while루프를 실행
             */

            while((marker & (BIN << randI))!= 0){
                System.out.println("중복검사 : "+ randI+" 중복 !");
                randI = (int)(Math.random()*6 + 5);
            }

            System.out.println("숫자 : "+ randI);


            /*
            marker |= (BIN << randI) ===> marker = marker | (BIN << randI)
            bit OR 연산자를 사용해서 marker에 2^n해당 하는자리에 1을할당
            점점 자리가 0->1 로 바뀌면서 숫자가 증가함.
             */
            marker |= (BIN << randI);

        }


        //난수범위  7~10
        System.out.println("======================난수 범위 7~10======================");
        marker = 0;
        for(int i=0;i<4;i++){
            int randI =(int)(Math.random() * 4 +7);

            while((marker&(BIN << randI)) !=0){
                System.out.println("중복검사 : "+ randI+" 중복 !");
                randI = (int)(Math.random()* 4 + 7);
            }
            System.out.println("숫자 : "+randI);

            marker |= (BIN << randI);
        }

    }
}
