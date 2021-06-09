public class Prob16 {
    public static void main(String[] args) {
        //16
        //for+if 문제
        //1~`100까지 숫자중 11의 배수들의 합을 구해보자
        int sum = 0;
        for(int i = 1; i <= 100; i++) {
            if(i%11 == 0) {
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
