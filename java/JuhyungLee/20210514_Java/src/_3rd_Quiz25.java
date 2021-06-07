public class _3rd_Quiz25 {
    public static void main(String[] args) {
        // 1 ~ 100 까지의 숫자 중,
        // 2의 배수와 11의 배수는 더하고 5와 배수는 뺀다.
        //단, 상위 조건 중 중복으로 적용되는 수는 무시한다.
        //      ex) 22는 제외
        //모든 값을 처리한 이후 결과값은 무엇인지 프로그래밍 한다.
        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0 && i % 5 == 0 && i % 11 == 0){
                ;
            } else if(i % 2 == 0 && i % 5 == 0){
                ;
            } else if(i % 5 == 0 && i % 11 == 0){
                ;
            } else if(i % 2 == 0 && i % 11 == 0){
                ;
            } else if(i % 2 == 0){
                sum+=i;
            } else if(i % 5 == 0){
                sum-=i;
            } else if(i % 11 == 0){
                sum+=i;
            }
        }
        System.out.println("최종 합산: " + sum);
    }
}
