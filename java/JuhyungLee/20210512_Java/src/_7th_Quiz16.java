public class _7th_Quiz16 {
    public static void main(String[] args) {

        //Quiz 16. for, if사용해서
        //1~100까지 숫자 중 11의 배수 합 출력

        int sum = 0;
        int i;

        for(i = 11; i <= 100; i+=11){
            if(i % 11 == 0){
                sum += i;
                System.out.println("11 배수들의 합 :" + sum);
            }
        }
        System.out.println("그냥 바로 합을 알고 싶을 때는 for문 밖에: " + sum);
    }
}
