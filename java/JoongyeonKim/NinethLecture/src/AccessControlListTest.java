class ClassTest{
    //내 소중한 프라이버시에는 private을 붙인다.
    // 물론 여기서 '내 소중한' 프라이버시는 ClassTest 관점이다.
    private int num;

    //public이 붙어 있는 것은 만천하에 공개하는 정보이다
    //광고, 배너 등등 여러 사람들이 볼 수 있는 정보
    public ClassTest(int num) {
        this.num=num;
    }
    public void setnum(int num){
        this.num=num;  //private으로 설정된 num을 다시 public으로 설정해준다
                       //private으로 먼저 설정을 하는 이유는 다른 사람이 실수로 값을 변경하는 것을 막기 위해서다
    }

    public int getNum(){
        return num;
    }
}

public class AccessControlListTest {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 ="+ct.getNum());
        
        ct.setnum(10); //변수값 10으로 초기화

        System.out.println("바뀐 정수는="+ct.getNum());
    }
}
