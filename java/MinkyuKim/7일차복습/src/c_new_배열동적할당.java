import java.util.Scanner;

public class c_new_배열동적할당 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("학급에 학생이 몇 명 있습니까 ? ");

        int studentNum = scan.nextInt();
        int studentArr[] = new int[studentNum];

        for(int i = 0; i < studentNum; i++) {
            studentArr[i] =(int)(Math.random()*21)+80;
            System.out.printf("studentArr[%d] = %d\n", i, studentArr[i]);
        }
    }
}
