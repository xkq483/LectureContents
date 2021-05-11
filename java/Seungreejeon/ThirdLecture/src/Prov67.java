import java.util.Scanner;

public class Prov67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int select = 1;
//
//        while (select != 0) {
//            System.out.print("짝수인지 홀수인지 판별해보자 : ");
//            select = sc.nextInt();
//            if (select % 2 == 0) {
//                System.out.println(select + "는 짝수!");
//            } else {
//                System.out.println(select + "는 홀수!");
//
//        }



        System.out.println("아무 숫자나 입력하시오 11의 배수를 판정 하시오");
        int num = sc.nextInt();

        if(num % 11 == 0 && num > 0){
            System.out.println(num + "은 11의 배수입니다.");
        } else {
            System.out.println(num + "은 11의 배수가 아닙니다.");
        }

        System.out.print("1~의 11배수를 판정합니다. 범위를 입력하시오 : ");
        int loop = sc.nextInt();

        int i = 1;

        while (i <= loop) {
            if (i % 11== 0) {
                System.out.println("1 ~"+ loop + "까지의 3의 배수를 출력합니다."+ i);
            }
            i++;
        }

    }
}
