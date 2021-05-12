public class hw01 {
    public static void main(String[] args) {
        System.out.println("5월 10일 숙제1 작성");

        //주석 테스트

        /*주석 테스트2345
        print  aaa a bb b
        dsa
                 */

        /* data 종류는
        byte 1바이트
        int 4바이트
        long 4바이트
        float 4바이트
        double 8바이트

        8비트(bit) = 1바이트(byte)

        2^n비트 = n비트 데이터가 표현할 수 있는 개수

        float double 차이? float가 double에 비해 빠르고 오차가 큼

                                                               */

        int ia=1, ib=2, ic=3;
        float fa=1.1f, fb=2.2f, fc=3.3f;

        System.out.printf("%d + %d = %d\n", ia, ib, ia + ib);
        System.out.printf("%d / %d = %d\n", ia, ib, ia / ib);

        System.out.printf("%d %% %d = %d\n", ia, ib, ia / ib);
        System.out.printf("%.2f %% %.8f = %.4f\n", fa, fb, fa % fb);
    }
}
