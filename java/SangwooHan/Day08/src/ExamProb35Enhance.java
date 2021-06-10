import java.util.Scanner;
//질문 사항 없습니다.
class TestDice4{
   int comDice;
   int yourDice;
    Scanner scan;

    TestDice4(){

       comDice = RandomN();
       yourDice = RandomN();
        System.out.printf("컴[%d]당신[%d]",comDice,yourDice);
       scan = new Scanner(System.in);
   }


   int RandomN(){
       return  (int)(Math.random()*6+1);
   }

   void checkwin() {
        switch(whowin()){
            case 1 :
                System.out.println(" 너의 승리!");
                break;
            case 2 :
                System.out.println("컴의 승리!");
                break;
            case 3 :
                System.out.println("무승부!");
                break;

        }

   }
   int whowin(){
        if(yourDice>comDice){
            return  1;
        }
        else if(comDice>yourDice){
            return 2;

        }
        else{
            return  3;
        }
   }
   boolean Regame(){
       System.out.println("게임을 다시 하겠습니까? 긍정1 부정1를 제외 아무숫자.");
       int num = scan.nextInt();

       if(num == 1){

           comDice = RandomN();
           yourDice = RandomN();
           return true;
       }
       else{
           System.out.println("끝");
          return false;

       }
       //선생님은 리겜 로직할때, 다시 스위치문을 사용하셔서
       // 저는 이프문으로 한번 만들어봤습니다.



   }

}
public class ExamProb35Enhance {
    public static void main(String[] args) {
        TestDice4 gg = new TestDice4();
        System.out.println("컴과당신의주사위를 굴리겠습니다.");

        do{
            gg.checkwin();
        }
        while(gg.Regame());





    }
}
