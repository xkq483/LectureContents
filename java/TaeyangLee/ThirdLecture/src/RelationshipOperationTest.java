public class RelationshipOperationTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        int num3 = 21, num4 = 24;
        if ((num3 % num1 == 0) && (num3 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수이며 %d의 배수이다 \n", num3, num1, num2);
        }


        if ((num4 % num1 == 0) || (num4 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다 \n", num4, num1, num2);

        }
    }
}
