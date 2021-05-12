public class Quiz2 {
    public static void main(String[] args) {
        System.out.println("안녕하세요 사칙 연사하기");


        int num1 = 3, num2 = 9;
        float fnum1 = 5.2f, fnum2 = 6.1f, fnum3 = 4.3f;
        double a1 = 5.2, a2 = 5.7;


        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.printf("%.2f %% %.5f = %.3f\n", fnum1, fnum2, fnum1 % fnum2);
        System.out.printf("%.2f %% %.5f = %.3f\n", a1, a2, a1 % a2);








    }
}
