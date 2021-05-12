//for + if 문제
//1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!

public class Quiz16 {
    public static void main(String[] args) {

        System.out.println("1 ~ 100까지 숫자중 11의 배수들의 합을 구해보자!");

        int sum=0;

        for(int i=11; i<=100; i+=11)
        {
            sum+=i;

        }
        System.out.println("sum= "+ sum);

    }
}
