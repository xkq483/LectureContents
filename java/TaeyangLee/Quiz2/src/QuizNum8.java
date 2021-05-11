import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

public class QuizNum8 {
    public static void main(String[] args) {
        int num1;
        int i = 1;
        Scanner sc = new Scanner(System.in);




        while(i!=0){
            System.out.print("짝수냐 홀수냐?");
            num1 = sc.nextInt();

            if(num1 % 2 != 0) {
                System.out.println("홀수");

            } else if(num1 % 2 == 0) {
                System.out.println("짝수");

            }
            if(num1 ==0)
                break;


        }
    }
}
