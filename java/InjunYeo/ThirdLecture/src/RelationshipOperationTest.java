public class RelationshipOperationTest {
    public static void main(String[] args) {
        // 관계 연산자를 살펴보는 예제
        int num1 =3 , num2 =7;
        int num3 = 21;
        int num4 = 24;

        //관계 연산자AND(&&)
        // AND의 특성 ==> 양쪽조건이 모두 참인경우에만 참
        //               한쪽이라도 거짓이 있다면 거짓으로 판정
        if((num3 % num1 == 0)&&(num3 % num2 ==0)){
            System.out.printf("%d 는 %d의 배수이며 %d의 배수이다\n",num3,num1,num2);
        }

        /*
        관계연산자 OR(||)
        OR의 특성 ==>양쪽중 하나라도 참이라면 참
                    양쪽모두 거짓인경우에만 거짓
         */
        if((num4 % num1 == 0)||(num4 %num2 == 0)){
            System.out.printf("%d 는 %d의 배수혹은 %d의 배수이다\n",num4,num1,num2);
        }
        /*
        관계 연산자 NOT(!)
        어떤 상황이던 어떤 조건이던 무조건 그 반대의 역할을 수행함
        부정의 부정은 긍정, 긍정의 부정은 부정
         */
        if(!(num4 % num1 == 0)||(num4 %num2 == 0)){
            System.out.printf("%d 는 %d의 배수혹은 %d의 배수이다\n",num4,num1,num2);
        }
        else{
            System.out.println("출력이 안대");
        }
    }
}
