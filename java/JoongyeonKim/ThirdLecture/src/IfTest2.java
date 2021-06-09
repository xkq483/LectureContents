public class IfTest2 {
    public static void main(String[] args) {
        int num1 = 8, num2 = 3;

        //IfTest의 문제점을 수정한 코드
        //else if를 한번 더 붙여서 더 자세한 결과가 나오게 해준다
        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        } else if (num1 > num2){
            System.out.printf("%d > %d\n", num1, num2);
        } else{
            System.out.printf("%d와%d의 값은 같다!", num1, num2);
        }
    }
}