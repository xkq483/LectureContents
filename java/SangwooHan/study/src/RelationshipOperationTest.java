public class RelationshipOperationTest {
    //관계연산자 and (&&)
    public static void main(String[] args) {
        int num1 = 3 , num2 = 7 , num3 = 21;
                if((num1 / num3 == 0 )&& (num1 /num2 == 0 ))
                {
                    System.out.printf("%d는 %d의 배수이며 %d의 배수이다\n",num3,num1,num2);
                }
    }
}
//||