public class TrickTest {
    public static void main(String[] args) {
        //and와 or을 사용할 때 특성에 따른 오류
        int num1 =3,num2=4;

        if((num1 % 3 == 1) && (num2++ % 5==0)){
            System.out.println("이조건은 실행되지 않습니다");
        }
        if((num1 % 3 == 0) || (num2++ %6 == 0)){
            System.out.println("이 조건은 실행합니다");
        }
        System.out.printf("num1 = %d, num2 = %d\n",num1, num2);
    }
}
