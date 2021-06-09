class ClassTest{
    private int num;
    //클래스테스트의 프라이버시
    //private 가 붙은 애들을 호출하고 싶다면 public을 사용해서 호출해야한다!

    //누구든지 볼 수있는 사용할수 있는 그런 느낌
    public ClassTest(int num){
        this.num = num;
    }
    public void setNum(int num){
        this.num = num;
    }
    public  int getNum() {
        return num;
    }
}




public class AccessControlListTest {
    public static void main(String[] args) {

        ClassTest ct = new ClassTest(5);
        System.out.println("입력된 정수는 = "+ct.getNum());
        //ct.num 은 private로 지정되있기에 문법상 맞지않는다.
        //고의로 코드를 집어넣는것은 방어가 불가능하지만 실수에 의햔 사고는 방지
        ct.setNum(10);
        System.out.println("바뀐 정수는 = "+ct.getNum());
    }

}
