public class homework01 {
    public static void main(String[] args)
    {
        System.out.println("2021년 5월10일 숙제를 시작하겠습니다.");

        int a = 4, b =56;
        float c = 123.4f, d = 5.3f;
        System.out.printf("%d + %d = %d\n",a,b,a+b);
        System.out.printf("%d %% %d = %d\n",a,b,a%b);
        System.out.printf("%d X %d = %d\n", a,b,a*b);
        System.out.printf("%d - %d = %d\n", a,b,a-b);

        System.out.printf("%.10f + %.10f=%.10f\n",c,d,c+d);
        System.out.printf("%.3f-%.3f=%.3f",c,d,c-d);
    }
}
