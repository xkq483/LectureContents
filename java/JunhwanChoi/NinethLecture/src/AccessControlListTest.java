import java.util.Calendar;

class ClassTest{
    // 내 소중한 프라이버시에는 private를 넣는다
    // 물론 여기서 프라이버시는 classTest
    private  int num;

    //public이 붙어 있는 것은 만천하에 공개하는 정보이기 때문
    //광고 , 배너 등등 여러 사람들이 볼 수 있는 정보
    public ClassTest(int num){
        this.num= num;
        System.out.println("생성자 내에서 num= "+ num);   // 아래 메인에서 5의 값을 주었기때문
    }

    public  int getNum()
    {
        return num;
    }
    public  void setNum(int num)
    {
        this.num= num;
    }

    // 결론 : private이 붙은 애들 호출하고 싶으면
    //        public이 붙은 애들을 사용해서 호출 하세요.

    public void iCanCallyou()
    {
        youCantCallMe();
    }

    private void youCantCallMe()
    {
        System.out.println("youCantCallMe 호출하려면!?");
        System.out.println("private이 붙은 애들을 호출하고 싶으면 public이 붙은 애들을 사용해서 호출!");
    }


}

public class AccessControlListTest {
    public static void main(String[] args) {
        ClassTest ct= new ClassTest(5);

        //System.out.println("입력된 정수: "+ ct.getNum);

        //이전까지만 해도 잘 되던 녀석이 갑자기 왜 안되는 것일가"?
        // ct.num=10;
        // 어라 이상하네? 위에건 안되고 아래건 되네?
        System.out.println("메인에서 setNum값 지정하기 전에 num값(입력값): "+ ct.getNum());

        ct.setNum(10);
        System.out.println("바뀐 정수: "+ ct.getNum());

        ct.iCanCallyou();
    }
}

