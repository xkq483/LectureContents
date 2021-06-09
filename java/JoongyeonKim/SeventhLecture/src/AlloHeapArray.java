import java.util.Scanner;

public class AlloHeapArray {
    public static void main(String[] args) {
        //동적할당 되는 데이터를 관리하는 메모리 - Heap

        Scanner scan=new Scanner(System.in);
        System.out.println("학급에 학생이 몇 명 있습니까");


        int studentNum = scan.nextInt();

        int studentArr[] =new int[studentNum];

        for (int i =0; i< studentNum; i++){
            studentArr[i]=(int)(Math.random()*21)+80;
            System.out.println();
        }
    }
}
