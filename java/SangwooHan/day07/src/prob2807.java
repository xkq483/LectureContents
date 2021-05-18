import java.util.Scanner;

public class prob2807 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.println("1,2,4,8,,,......1024,,,,,,.....");
        System.out.println("몇번쨰항을 구할까요");
        int num = scan.nextInt();

        int numArr[]= new int[num];
        numArr[0] = 1;

        if(num <= 0){
            System.out.println("그값은 음수거나 0입니다 ");
        }
        else if (num <2 ){
            System.out.println(" 1 ");

        }
        for(int i =1; i < numArr.length ;  i ++){
           numArr[i] = (int)(Math.pow(2,i));
        }
        System.out.printf(" 해당%d의 값은 %d입니다\n",num,numArr[num-1]);
    }
}




