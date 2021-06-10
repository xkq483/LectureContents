public class quiz {
    public static void main(String[] args) {
        int num1 = 5, num2 = 2 ,num3 = 10;
        float fnum1 = 3.3f, fnum2 = 1.1f;
        System.out.printf("%d + %d * %d = %d\n", num1, num2 , num3 , num1+num2*num3);

        System.out.printf("%.5f / %.2f = %.4f\n",fnum1 , fnum2, fnum1 / fnum2);

        System.out.printf("%.3f %% %.2f = % f", fnum2,fnum2,fnum2 % fnum1);

    }
}
