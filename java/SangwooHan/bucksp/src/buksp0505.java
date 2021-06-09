import java.util.Scanner;

public class buksp0505 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 이번주로또 번호를 뽑으시겠습니까?? 1번 [예]2번[아니오]");
        int i = scan.nextInt();
        final  int BIT =1;
        int  randNum;
        int  testBit = 0;
        if(i ==1)
        {
            for(int j = 1; j <10; j++)
            {
                Thread.sleep(250);
            randNum = ((int)(Math.random()*45+1));
            while ((testBit & (BIT <<randNum))!=0)
            {
                randNum = ((int)(Math.random()*46-1));
            }
                System.out.println("이번주 행운의로또번호는["+randNum+"]입니다..!");
            testBit |= (BIT<<randNum);
            }
        }
        else{
            System.out.println("다음주엔꼭 로또합시다..");
        }


    }
}
