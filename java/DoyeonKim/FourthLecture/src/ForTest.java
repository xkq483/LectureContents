public class ForTest {
    public static void main(String[] args) {

        //작거나 같다의 주의점: 작아도 참, 같아도 참,크면 거짓
        for(int i = 1; i <= 10; i++) { //2씩 증가하고 싶으면 i+=2
            //1로 초기화, 조건 참이다
           System.out.println("i = " + i);

        }
    }
}
