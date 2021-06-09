public class RelationshipOperationTest {
    public static void main(String[] args) {
        // 이 예제는 관계 연산자를 살펴보는 예입니다.
        int num1 = 3, num2 = 7;
        int num3 = 21, num4 = 24;

        // shift + 7
        // 관계 연산자 AND (&&)
        // AND 의 특성 ===> 양쪽 조건이 모두 참인 경우에만 참
        //                 한쪽이라도 거짓이 있다면 거짓으로 판정
        if ((num3 % num1 == 0) && (num3 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수이며 %d의 배수이다.\n", num3, num1, num2);
        }

        // 표기법 ===> 앤터 위에 원 표시가 있다.
        //            Shift + 원 표시를 누르면 파이프 기호가 생성된다.
        // 관계 연산자 OR (||)
        // OR 의 특성 ===> 양쪽 중 하나라도 참이라면 참
        //                양쪽 모두가 거짓인 경우에만 거짓으로 판정
        if ((num4 % num1 == 0) || (num4 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1, num2);
        }

        // 관계 연산자 NOT (!)
        // 어떤 상황이던 어떤 조건이던 무조건 그 반대의 역할을 수행함
        // 부정의 부정은 긍정, 긍정의 부정은 부정
        if (!(num4 % num1 == 0) || (num4 % num2 == 0)) {
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1, num2);
        } else {
            System.out.println("출력이 안되네 ;;;");
        }
    }
}