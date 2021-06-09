import java.util.Scanner;

class Fibo {
    private int num;
    private Scanner scan;
    private int sum = 0;
    private int a=1, b=1;

    public Fibo() {
        System.out.print("피보나치수열 n번째 항의 숫자를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
    }

    public boolean fiboNum() {

        if (num <= 0) {
            System.out.println("0 혹은 음수항은 없다.");
            return false;
        } else if (num < 3) {
            System.out.println("당신이 찾고자 하는 피보나치 수열의 항은 1이다.");
            return false;
        } else {

            for (int i = 2; i < num; i++) {

                sum = a + b;
                a = b;
                b = sum;
            }
        }
        System.out.printf("피보나치수열 %d번째 항의 값은 = %d", num, sum);
        return true;
    }
    public int getNum() {
        return num;
    }
    public int getSum() {
        return sum;
    }
}
    public class Quiz40 {
        public static void main(String[] args) {
//1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
//피보나치 수열의 n 번째 항을 구하는 프로그램을 클래스를 적용하여 풀이해보자!
            Fibo fi = new Fibo();

           fi.fiboNum();

        }
    }
