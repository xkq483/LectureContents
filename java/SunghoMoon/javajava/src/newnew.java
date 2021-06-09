import java.util.Scanner;

public class newnew {
    public static void main(String[] args) {
        double radius;
        final double PI=3.141592;  //PI를 상수로 선언
        Scanner input = new Scanner(System.in);
        System.out.print("반지름을 입력하시오 : ");
        radius = input.nextInt();
        System.out.printf("원의 면적 : %.1f",PI*radius*radius); //소수 첫째 자리까지만 출력 
    }
}