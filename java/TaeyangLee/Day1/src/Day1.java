import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int num1 =3 ,num2 =6;
        float fnum1 = 3.4f,fnum2=4.2f;



        System.out.printf("%d + %d = %d \n",num1,num2,num1+num2);
        System.out.printf("%d - %d = %d \n",num1,num2,num1-num2);
        System.out.printf("%d * %d = %d \n",num1,num2,num1*num2);
        System.out.printf("%d %% %d = %d \n",num1,num2,num1%num2);
        System.out.printf("%f + %f = %f \n",fnum1,fnum2,fnum1+fnum2);
        System.out.printf("%f - %f = %f \n",fnum1,fnum2,fnum1-fnum2);
        System.out.printf("%f * %f = %.3f \n",fnum1,fnum2,fnum1*fnum2);
        System.out.printf("%f %% %f = %.2f \n",fnum1,fnum2,fnum1%fnum2);



    }
}
