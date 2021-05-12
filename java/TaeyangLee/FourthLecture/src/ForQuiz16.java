public class ForQuiz16 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i%11==0){
                sum += i;
            }
        }
        System.out.println("11의 배수들의 합은 :" + sum);
    }
}
