public class TodayTest {
    public static void main(String[] args) {

        /*
        1번문제.
        1~100까지의 숫자중 2의 배수는 모두 곱한다.
        여기서 5의 배수는 모두 뺸다.
        11의 배수는 더한다.
        중복이 발생할 경우엔 무시한다.
        모든값을 처리한 이후 결과값은 무엇인지 프로그래밍 해보자!

        */
        int sum = 0;

        for(int i =1; i<=100;i++){
            if(i % 2 == 0){
                if(i % 5 == 0 || i % 11 == 0){
                    System.out.println(i+" 중복 스킵");
                    continue;
                }
                sum += i;
                System.out.println(sum);
            }

            else if( i % 5 == 0){
                if(i % 11 == 0){
                    System.out.println(i+" 중복 스킵");
                    continue;
                }
                System.out.println(sum);
                sum -= i;
            }
            else if(i % 11 == 0){
                sum += i;
                System.out.println(sum);
            }
        }
        System.out.println(sum);






    }

}
