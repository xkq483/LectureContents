import java.util.Scanner;

public class prob2907 {
    public static void main(String[] args) {
        System.out.println("1,3,9,27,81..........2187.........");
        System.out.println("몇번쨰 항을 구할까요?");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int numArr[] = new int [num] ;

        if(num <= 0){
            System.out.println("잘못 입력하셨습니다.");

        }
        else if(num <2 ){
            System.out.println("1입니다");


        }
        else{
        for(int i = 1; i <numArr.length; i++){

            numArr[i] = (int)Math.pow(3,i);

            // 그럼실제로, -------------------------------------
            //             0   3    9   27    81   273
            //----------  [0] [1]  [2]   [3]   [4]   [5]
            // -------------------------------------------------

        }
            System.out.println("당신이 구하고자하는답은"+numArr[num-1]+"입니다");
            System.out.println(numArr[0]);
        // -1 dex는를 해주는이유는 in 0부터 시작하기에 우리가할고있는범위는 1~30으로 30개 지만
            // 컴퓨터는 0~ 29로 알고있기에 그렇다
            // 즉  컴퓨터는 0칸에 1을넣고 1칸에 3이란값을 넣고있는중인것이다.
        }
    }
}
