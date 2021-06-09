public class infinityloop {
    public static void main(String[] args) {
        //while(true)와 다르게 for의 경우엔 무조건이라는 식을 만들 수 있다
        // 조건부에 아무런 조건이 없다는 것은 ??? 무조건







        for(int i = 1, j = 0; ; i++, j--) {

            System.out.println("i = " + i + ", j = " + j);
        }
    }
}
