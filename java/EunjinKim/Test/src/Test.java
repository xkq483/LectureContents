public class Test {
    public static void main(String[] args) {
        System.out.println("12345");

        int num1 = 6, num2 = 4;
        //float형 데이터를 저장할때는 반드시 뒤에 f를 붙여줘야 한다
        //f를 붙이지 않으면 기본적으로 double 타입으로 인식
        float fnum1 =3.3f, fnum2 = 4.2f, fnum3 = 5.2f;

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
        System.out.printf("%f %% %f = %f\n", fnum2, fnum1, fnum2 % fnum1);
    }
}
