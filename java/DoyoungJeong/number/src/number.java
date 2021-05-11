import java.sql.SQLOutput;

public class number {
    public static void main(String[] args) {

        float fnum1 = 2.57f;
        float fnum2 = 4.33f;
        double num3 = 5.5;
        int num4 = 9;
        int num5 = 2;

        System.out.printf("%d + %d = %d\n", num4, num5, num4 + num5);
        System.out.println("num1 + num5 = " + fnum1 + num5);

        System.out.printf("%.3f %% %d = %.4f\n", fnum1, num5, fnum1 % num5);
        System.out.printf("%f - %f = %f\n", fnum2, fnum1, fnum2 - fnum1);
        System.out.printf("%f * %f = %f\n", fnum2, fnum1, fnum2 * fnum1);

        
    }
}
