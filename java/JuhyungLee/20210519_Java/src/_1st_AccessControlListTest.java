class ClassTest{
    // 내 소중한 프라이버시에는 private를 붙임
    // 여기서 '소중한' 프라이버시는 ClassTest의 관점에서 생각.
    private int num;

    // public이 붙어 있는 것은 만천하에 공개되는 정보

    public ClassTest(int num) {
        this.num = num;
    }
    public int getNum(){
                return num;
        }
    public void setNum(int num){
        this.num = num;
        }

    private void youCantCallMe(){
        System.out.println("youCantCallMe method는 private이기 때문에 public method를 이용하지 않으면 실행 불가능");
    }
    public void iCanCallYou(){
        youCantCallMe();
    }
}
public class _1st_AccessControlListTest { //접근제어 (ACL)
    public static void main(String[] args) {

        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 = " + ct.getNum() );

        // 왜 아래 error가 되는가?? ClassTest Class에서 num은 private data이기 떄문.
        // ct.num = 10;
        ct.setNum(10); // public method인 setter를 사용해서 실행하는 방법도 있긴함.

        System.out.println("바뀐 정수는 = " + ct.getNum() );
      //  System.out.println(ct.num); // private으로 지정된 data는 수정 뿐만 아니라 sout으로 그 값을 알아보는 것도 안되는지..?

        // ct.youCantCallMe(); //error남
        ct.iCanCallYou(); //public method 사용해서 private method를 실행시킴.
    }
}
// public이나 private 안 붙은 놈들은 default인데 거의 public이랑 같은 친구지만 다름. 제약이 있음.
// 앵간하면 public을 붙여서 사용하도록 권장.