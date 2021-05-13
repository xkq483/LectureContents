public class Quiz2 {
    public static void main(String[] args) {
//        15. for + if 문제 : 1 ~ 100까지 숫자중 4의 배수만 출력해보자

        for (int i = 1 ; i <= 100 ; i++) {
            if(i % 4 == 0) {
                System.out.printf("%4d", i);
            }
        }

        System.out.println();

//        16. for + if 문제 : 1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!


        int sum = 0;
        for(int i1 = 11 ; i1 <= 100 ; i1 += 11) {
            sum += i1;
            System.out.println("합계 = " + sum);
            }
        System.out.println("1부터 100까지 숫자중 11의 배수들의 합은 " + sum );



        System.out.println();



//        17. Math.random() 응용문제 :
//        1. 주사위를 2번 굴려서
//        2. 합산 눈금 숫자가 큰 사람이 이기는 것으로 한다.
//        주사위에서 나올 수 있는 숫자는 1~6, 두번의 기회가 있다.
//        무제한이 아닌, 두번만 랜덤
//        첫 번째 주사위 값 + 두 번째 주사위 값

        int dice1 = (int)(Math.random()* 6 + 1);
        int dice2 = (int)(Math.random()* 6 + 1);
        System.out.println("첫 번째 주사위 값은 = " + dice1);
        System.out.println("두 번째 주사위 값은 = " + dice2);

        System.out.printf(" %d + %d = %d\n", dice1, dice2, dice1 + dice2);





        }

    }
