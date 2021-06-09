public class RelationshipOperationTest {
    public static void main(String[] args) {
        int num1 = 3, num2 = 7;
        int num3 = 21, num4 = 24;

        //관계연산자 AND(&&)
        //and 의 특성 ---> 양쪽 조건이 모두 참인 경우에만 참
        //                한쪽이라도 거짓이 있다면 거짓으로 판정
        if((num3%num1==0)&&(num3%num2==0)){
            System.out.printf("%d는 %d의 배수이며 %d의 배수이다.\n", num1, num2,num3);
        }

        //관계 연산자 OR(||)
        //or 의 특성 ---> 양쪽 중 하나라도 참이라면 참
        //               양쪽 모두가 거짓인 경우에만 거짓으로 판정
        if((num4% num1==0)||(num4%num2==0)){
            System.out.printf("%d는 %d의 배수 혹은 %d의 배수이다.\n", num4, num1,num2);
        }
    }
}
