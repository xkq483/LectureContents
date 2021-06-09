public class RelationshipOperationTest {
    public static void main(String[] args) {
        // 연산자 예제
        int num1 = 3, num2 = 7;
        int num3 = 21, num4 = 24;

        // 관계 연산자 && (and)
        // 양쪽 조건이 참인 경우에만 true, 한쪽이라도 거짓이 있다면 false
        if ((num3 % num1 ==0) && (num3 % num2 ==0)) {
            System.out.printf("%d는 %d의 배수이며 %d의 배수이다.\n", num3, num1, num2);
        }

        // 관계 연산자 || (or)
        // 양쪽 중 하나라도 true일 경우 true, 양쪽 모두가 거짓인 경우에만 false
        if ((num4 % num1 == 0) || (num4 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1, num2);
        }

        // 관계 연산자 ! (not)
        // 어떤 조건이든지 반대의 결과를 냄 (true + true = false , false + false = true)
        if(!(num4 % num1 == 0) || (num4 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1, num2);
        } else {
            System.out.println("nope");
        }
    }
}
