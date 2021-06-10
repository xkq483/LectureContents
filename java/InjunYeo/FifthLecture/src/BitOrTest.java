public class BitOrTest {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        /*
        | 이 비트연산자 OR
        관계연산자에서는 || 형태로  존재하였음
        10 ===> 1010
        5  ===> 0101
        15 ===> 1111
         */

        System.out.printf("%d OR %d = %d\n", num1, num2, num1 | num2);

        num2 = 136;
        System.out.printf("%d AND %d = %d\n", num1, num2, num1 | num2);

        //OR연산은 비트의 합집합개념 ,AND 연산은 교집합 개념념
    }
}

