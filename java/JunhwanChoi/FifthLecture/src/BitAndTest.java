public class BitAndTest {
    public static void main(String[] args) {
        int num1=10, num2=8;

        System.out.printf("%d AND %d= %d\n",num1,num2,num1&num2);
        //1010
        //1000 AND
        //---------------
        //1000 : 8

        num2= 138;

        System.out.printf("%d AND %d= %d\n",num1,num2,num1&num2);

        //10001010
        //    1010
        //---------------
        //00001010

    }
}
