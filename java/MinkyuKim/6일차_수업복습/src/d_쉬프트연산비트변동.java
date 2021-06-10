public class d_쉬프트연산비트변동 {
        public static void main(String[] args) {
            System.out.println("쉬프트 연산에 사용되는 int 데이터 타입은 32비트임을 잊지맙시다!");

            int num = 14;
            int shiftBit = 4;

            System.out.printf("%d << %d = %d\n", num, shiftBit, num << shiftBit);

            // 14 ===> 1110
            // 14 << 4
            // 0000 1110
            // 1110 0000 ===> 224
            // 4칸 이동( 14를 2진법으로 바꾼 후 왼쪽으로 4칸 이동 shiftBit)
        }
    }