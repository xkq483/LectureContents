public class c_final {
    public static void main(String[] args) {
        int sum = 0;
        // 뒤이을 수식에 영향을 미치지 않기 위해 0으로 값 초기설정

        final int Start = 1;
        final int End = 10;
        //start =1 , End = 10으로 값 설정


        for(int i = Start; i <= End; i++) {
            sum += i;
            System.out.println("sum = " + sum);

            // i = 1이고 i가 10이하일때 동작, i는 계속하여 1씩 증가됨
            //sum 은 i만큼 계속 증감됨. 즉 1씩 계속 증가됨
            //1~10까지 계속 더해지는것이 출력됨 (1+2, 3+3, 6+4 ....)

        }

        System.out.println("최종 합산 값 = " + sum);
        // 앞의 수식의 최종값이 출력됨
        // 위의 수식값은 보이지 않고 최종값만 출력하게 할 수 있을까?
    }
}
