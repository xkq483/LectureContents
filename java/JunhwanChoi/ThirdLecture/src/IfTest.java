//public class 오는 이름은 파일명에서 .java를 제외한 이름과 동일해야 한다.
//또한 한 파일 내에서 public class는 오직 하나

//public class number -> X
//public class Number -> O   :이런식으로 대문자가 들어가는 형식이 관습

public class IfTest {

    public static void main(String[] args) {
        int num1= 3, num2= 7;


        // if (소괄호) { 중괄호 };
        // 소괄호 안에는 조건식이 들어온다 ( >, <, >=, <=, ==, !=)
        // 동작할 식은 중괄호 내부에 작성한다.

        if (num1 < num2)    // num1 < num2 일 경우에 실행 ( 3<7 ) 이므로 if문이 실행된다.
        {
            System.out.printf("%d < %d\n",num1,num2);
        }
        else // num1 < num2 조건이 만족하지 않았을 경우 동작
        {
            System.out.printf("%d > %d\n",num1,num2);
        }


    }
}
