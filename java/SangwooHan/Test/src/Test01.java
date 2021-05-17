public class Test01 {
    public static void main(String[] args) {
        System.out.println("25분까지");

        //데이터 타입은 int고
        // 변수의 이름은 num1 이며,
        // 또한 콤마에 의해 동일한 데이터타입을 가지고
        // 변수 이름은 num2 이며,
        // num2에 저장된 값은 4 이다
        int num1 = 2, num2 = 4;

        float fmum1 = 3.3f, fmum2 = 4.4f, fnum3 = 5.5f;
        // \n 같은경우는 엔터키와 동일 하다 ln과 같음
        // printf("%d + %d = %d\n")의 경우
        // 첫번째 %d 에는 num1
        // 두번째 %d 에는 num2
        // 마지막(세번째) %d 에는 num1 + num 2
        System.out.printf("%d + %d = %d", num1,num2,num1+num2);
    }

}
