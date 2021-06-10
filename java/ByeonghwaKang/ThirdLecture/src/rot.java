public class rot {
    public static void main(String[] args) {
        // 이예제는 관계 연산자를 살펴보는 예입니다.
        int num1 = 3, num2 = 7;
        int num3 = 21, num4 = 24;

        // 관계 연산자 AND (&&)
        // AND  의 특성 ===> 양쪽 조건이 모두 참인 경우에만 참
        //                  한쪽이라도 거짓이 있다면 거짓으로 판정
        if((num3 % num1 == 0) && (num3 % num2 == 0))  {
            System.out.printf("%d는 %d의 배수이며 %d의 배수이다.\n", num3, num1, num2);

            if((num4 % num1 == 0)||(num4 % num2 == 0)) {
                System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다\n");
            }

        }
     }
}
