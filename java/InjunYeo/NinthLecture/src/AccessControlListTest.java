class ClassTest{
    /*
    소중한 프라이버시에는 private를 붙인다.
    여기서 주체는 ClassTest이다.
     */
    private int num;

    /*
    public이 붙어있는것은 만천하에 공개하는 정보기때문
    여러 사람들이 접근할수 있는 정보보
    */

    public ClassTest(int num){
        this.num = num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }


    //결론:private이 붙은 애들을 호출하고 싶다면 public이 붙은 애들을 불러 사용하세요
    public void iCanCallyou() {
        youCantCallMe();
    }

    private void youCantCallMe(){
        System.out.println("넌 나를 부를수 없다.");
    }


}



public class AccessControlListTest {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수는 = "+ ct.getNum());

        /*
        이전까지만 해도 잘 되던 녀석이 갑자기 왜 안되는 것인가?
        private의 특성
        고의로 코드가 집어넣는것은 방어가 불가능하지만 최소한 실수로 인한 사고를 방어해줄수있다.
         */
        ct.setNum(10);
        System.out.println("바뀐 정수는 = " + ct.getNum());


        ct.iCanCallyou();
    }

}
