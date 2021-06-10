public class BitORtest {
    public static void main(String[] args) {

        int num1=10, num2=5;

        System.out.printf("%d OR %d= %d\n",num1,num2,num1|num2);
//        1010
//        0101    OR
//----------------------
//        1111      -> 15

        num2=138;

        System.out.printf("%d OR %d= %d\n",num1,num2,num1|num2);
        /**
         00001010
         10001000   OR
         ------------------
         10001010 -> 138

         */



    }
}
