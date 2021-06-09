class ClassTest{
    private int num;
    // private가 붙은 객체는 class 밖에서 값을 바꿀 수 없다.
    // 값을 바꾸려면 Setter가 필요함

    public ClassTest(int num) {
        this.num = num; }
    // public이 붙어 있는 것은 공개하는 정보

    public int getNum(){
        return num; }
    public void setNum(int num){
        this.num = num; }

    public void iCanCallYou(){
        youCantCallYou(); }

    private void youCantCallYou(){
        System.out.println("넌 날 부를 수 없어"); }
    // private이 붙은 것을 호출하고 싶다면 public을 통해 호출해야 한다
}

public class Review0520 {
    public static void main(String[] args) {
        ClassTest ct = new ClassTest(5);

        System.out.println("입력된 정수= " + ct.getNum());

        // ct.num = 10; <-를 입력해서 num값을 변경할 수 없음
        ct.setNum(8);
        System.out.println("바뀐 정수= " + ct.getNum());

        ct.iCanCallYou();


        // Foreach -------------------------------------------------------------------------
        int randArr[] = new int[7];

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = (int)(Math.random() * 6 + 1); }

        // randArr 배열에 있는 값을 순차적으로 하나씩 꺼내와서 arr에 설정
        // 배열이 끝날때까지 계속 순회하고 마지막에 가져 올 값이 없으면 끝남
        for (int arr : randArr) {
            System.out.println("주사위 눈금: " + arr);
        }













    }
}
