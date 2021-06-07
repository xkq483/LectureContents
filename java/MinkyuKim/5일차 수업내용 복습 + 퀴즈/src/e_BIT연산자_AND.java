public class e_BIT연산자_AND {
    public static void main(String[] args) {
        int num1 = 10, num2 = 8;
        System.out.printf("%d and %d = %d\n", num1, num2, num1 & num2);
        // 10&8을 2진법으로 표현하면 8과 동일

        num2 = 138;
        //여기서부터 num2는 위의 8이아닌 138을 의미하는것?, 똑같은 명칭임에도 변수의 값을 계속 바꿀수있는것 같음.

        System.out.printf("%d And  %d = %d\n", num1, num2, num1 & num2);

    }
}
