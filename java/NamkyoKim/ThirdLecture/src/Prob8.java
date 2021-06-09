import java.util.Scanner;

public class Prob8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;

        while (num != 0 ){
            System.out.print("짝수인지 홀수인지 판별 해보자 : ");
            num = scan.nextInt();
            // 아직 % 개념이 정확히 이해가 안되서그러는데요 ..
            // 수학적인 머리가 없어서 홀수 짝수 구하는것이 헷갈립니다.!!
            if (num % 2 == 0){
                System.out.println(num + " 는 짝수 !");
            }else {
                System.out.println(num + " 는 홀수 !");
            }
        }
    }
}
