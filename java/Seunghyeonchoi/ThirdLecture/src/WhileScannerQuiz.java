import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;


public class WhileScannerQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("아무 숫자나 입력해주세요 : ");
        int num = scan.nextInt();
        int a=1;

        while(a <= num){
            if(a%3==0) {
                System.out.println(a);
                a+=1;
            }
                a+=1;
        }

    }
}
