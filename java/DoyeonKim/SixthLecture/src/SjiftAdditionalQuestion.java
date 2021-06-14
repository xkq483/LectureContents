public class SjiftAdditionalQuestion {
    public static void main(String[] args) {
        System.out.println("쉬프트 연산에 사용되는 int 데이터 타입은 32비트임을 잊지맙시다!");

        int num = 14;
        int shiftBit = 4;
        System.out.printf("%d << %d = %d\n", num, shiftBit, num << shiftBit);


    }
}
