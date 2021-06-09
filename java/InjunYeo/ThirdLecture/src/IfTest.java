//public class에 오는 이름은 파일명에서 .java를 제외한 이름과 동일해야 한다.
//또한 한 파일 내에서 pulbilc class는 오직 하나뿐이다!

public class IfTest {
    public static void main(String[] args) {
        int num1 =7, num2=3;

        //if문 작성방법
        //1.if를 적고 소괄호를 열고 닫는다.
        //2.소괄호 내부에 조건을 적는다.
        //  2-1. 조건에는 다음과 같은 케이스들이 존재
        //      <,>,<=,>=,==,!=
        //      A<B: A가 B보다 작으면 참(1) 아니면 거짓(0)
        //      A>B: A가 B보다 크면 참(1) 아니면 거짓(0)
        //3.조건이 만족하였을 경우 동작시킬 코드를 중괄호 내부에 작성한다.

        if(num1<num2){
            System.out.printf("%d < %d\n",num1,num2);
        }
        else{
            System.out.printf("%d > %d\n",num1,num2);
        }
    }

}
