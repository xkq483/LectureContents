import java.sql.SQLOutput;
import java.util.Scanner;

public class AllocHeapArray07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("학급에 학생이 몇명 있습니까?");

        int studenNum = scan.nextInt();

        int studentArr[] = new int[studenNum];

        for(int i = 0; i<=studenNum-1;i++){
        // 이포문에 ,  조건식에서 studenNum에 -1 를 하지 않는다면, 에러가 뜬다.
        // 왜냐하면, 배열의 인덱스는 0번칸부터 시작하고, 입력값은 1부터 시작하기떄문이다.
        //ex) 현재 스캔에다가 5명의 평균을 구하고싶어서 5를적는다.
        // int studentArr[] = new int[studenNum]; 이식으로 인해 배열의 방은 현재 [0,1,2,3,4,] (5개의방생성)
        // for(int i = 0; i<=studenNum;i++) 이포문이 i 가 0부터 시작하는이유.(왜냐하면 인덱스는0칸부터시작.)
        // 하지만0부터 시작하면 내가 5번을 기입햇을때, 포문은 6번이 돌게된다.즉,
        // 현재배열 [4]칸은 까지지만, 포문은 그 범주를 벗어났기때문에, 그포문에 벗어난범주 만큼 줄여주는것이 필요하다

        //      현재 배열의 모습 [0]   [1]    [2]    [3]   [4]     X
        // 현재 랜덤하게 뽑힌평균  23    45     32     36    78    34   여기서 6번째 평균이 더뽑힌걸 알수가있다.
        // 그러므로 studenNum에 벗어난범주 1 만큼 뺴주면
        // 식은    for(int i = 0; i<=studenNum-1;i++) 되어 정상적인 로직이 된다.


        // 5번돌
       studentArr[i] =((int)(Math.random()*100+1));
            System.out.println("당신 학교 학생들의 평균점수은 다음과 같다["+studentArr[i]+"]");
        }

    }
}
