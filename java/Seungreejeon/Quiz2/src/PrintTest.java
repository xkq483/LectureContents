public class PrintTest {
    public static void main(String[] args){

    byte number2;
    int number1 = 1;


    System.out.println("number2 = "+ number1);

    int num1 = 3, num2 =2;
    double num3 = 3.4 , num4 = 4.4;
    float fnum1 = 4.2f;
    System.out.println(fnum1);
    System.out.printf("%d + %d = %d\n", num1, num2, num1 +num2);
    System.out.printf("%d - %d = %d\n", num1, num2, num1 -num2);
    System.out.printf("%d / %d = %d\n", num1, num2, num1 /num2);
    System.out.printf("%d * %d = %d\n", num1, num2, num1 *num2);
    /* prinf()는 print format의 약자이다.
    f = format (양식)
    %d는 decimal로 정수형 숫자 의미
    %f는 float는 소수점 의미 %.2f %.3f
     간격 조정  \t,\n

     */

    System.out.printf("%d * %d = %d\n", num1, num2, num1 *num2);
    int num33 = 128;
    System.out.println((byte)num33);

}

}