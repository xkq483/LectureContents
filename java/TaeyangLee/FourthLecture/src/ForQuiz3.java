public class ForQuiz3 {
    public static void main(String[] args) {

        //1 ~ 30 까지 숫자중 짝수와 홀수를 각각 모두 판정하도록 프로그래밍 해보자!
        for(int i = 1; i <= 30; i++){
            if(i%2==0){
                System.out.println(i + " 는 짝수");
            }
            else{
                System.out.println(i + " 는 홀수");
            }
        }
    }
}
