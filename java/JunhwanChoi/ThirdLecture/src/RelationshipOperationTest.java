public class RelationshipOperationTest {

    public static void main(String[] args) {
        //이 예제는 관계 연산자를 살펴보는 예

            int num1 = 3, num2 = 7, num3 = 21, num4=24;


        //관계 연산자 AND : $$ -> 모두 참이여야 참
        if ((num3 % num1 == 0) && (num3 % num2 == 0)) {
            System.out.printf("%d= %d의 배수이며 %d의 배수이다.\n", num3, num1, num2);
        }

        //관계 연산자 OR : || -> 둘 중 하나라도 참이면 참
        if ((num4 % num1 == 0) || (num4 % num2 == 0))
        {
            System.out.printf("%d= %d의 배수 혹은 %d의 배수이다.\n",num4,num1,num2);
        }


        //관계 연산자 NOT : ! -> 어떤상황이던 반대역할
        // !연산자가 없으면 if문이 실행되어야하는데 not이있으므로 else문 출력
        if (!(num4 % num1 == 0) || (num4 % num2 == 0))
        {
            System.out.printf("%d= %d의 배수 혹은 %d의 배수이다.\n",num4,num1,num2);
        }
        else
        {
            System.out.println("NOT관계연산자 연습");
        }

    }
}
