public class Quiz1 {

    public static void main(String[] args) {



        int num1= 15, num2=10;

        float fnum1=1.1f, fnum2=2.2f;


        System.out.println("num1= "+num1 + "  num2= " +num2);
        System.out.println("fnum1= "+fnum1 + "  fnum2= " +fnum2);

        System.out.println("---------정수 사칙연산---------");
        System.out.println("num1 + num2 = "+ (num1 + num2));
        System.out.println("num1 - num2 = "+ (num1 - num2));
        System.out.println("num1 * num2 = "+ (num1 * num2));
        System.out.println("num1 / num2 = "+ (num1 / num2));
        System.out.println("num1 % num2 = "+ (num1 % num2));
        System.out.println("---------실수 사칙연산----------");
        System.out.println("fnum1 + fnum2= " + (fnum1 + fnum2));
        System.out.println("fnum1 - fnum2= " + (fnum1 - fnum2));
        System.out.println("fnum1 * fnum2= " + (fnum1 * fnum2));
        System.out.println("fnum1 / fnum2= " + (fnum1 / fnum2));
        System.out.println("fnum1 % fnum2= " + (fnum1 % fnum2));



        System.out.println("---------printf() 연습---------");
        System.out.printf("%d + %d= %d\n",num1, num2, num1+num2);
        System.out.printf("%d - %d= %d\n",num1, num2, num1-num2);

        System.out.printf("%.1f * %.1f= %.1f\n",fnum1,fnum2,(fnum1 * fnum2)); // %.1f : 소숫점 1자리로 제한 / 기본 : 소숫점 6자리
        System.out.printf("%.2f / %.2f= %.2f\n",fnum1,fnum2,(fnum1 / fnum2));

        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2 );





    }

}


