import jdk.swing.interop.SwingInterOpUtils;

import java.util.Random;

public class Randomtest {
    public static void main(String[] args) {

        for(;;) {
            //Math.random()은 [0~1]에 해당하는 소수점 데이터를 출력합니다
            //여기에 10을 곱하기 때문에

            System.out.println((int)(Math.random() * 10));
        }

    }
}
