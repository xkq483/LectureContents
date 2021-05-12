public class Assignment_20210510 {
    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        //float c = 2.2;  <<error
        float c = 2.2f;

        System.out.println(a+b);
        System.out.printf("%d + %d = %d\n", a, b, a+b);
        System.out.printf("%d + %f = %f\n", a, c, a+c);
        System.out.printf("%d %% %f = %.2f\n", a, c, a%c);
    }
}
