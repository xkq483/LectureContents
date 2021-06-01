public class ThirdLecture {
    public static void main(String[] args) {


        // 증감 연산자 연습하기
        int a = 5;
        int b = 10;
        int c = (++a) + b;
        int d = c / a;
        int e = c % a;
        int f = e++;
        int g = (--b) + (d--);
        int h = 2;
        h *= e;

        System.out.println("a = " + a); //6
        System.out.println("b = " + b); //9
        System.out.println("c = " + c);//16
        System.out.println("d = " + d);//1
        System.out.println("e = " + e);//5
        System.out.println("f = " + f);//4
        System.out.println("g = " + g);//11
        System.out.println("h = " + h);//10




        /*
        // 연산자 (Operator)

        int a = 10;
        int b = a++;
        System.out.println(a + "," + b);

        */
    }
}
