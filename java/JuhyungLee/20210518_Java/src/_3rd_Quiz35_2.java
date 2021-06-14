import java.util.Scanner;

class DiceTest2{

int comDice;
int zuDice;

Scanner scan; // 한번에 Scanner scan = new Scanner(System.in); 으로 안 쓰고 나눠 쓴 이유는..?

DiceTest2(){
    comDice = throwDice();
    zuDice = throwDice();

     scan = new Scanner(System.in);
    }
    int throwDice(){
    return (int)(Math.random() * 6 + 1);
    }

    int whoWin(){
        if(comDice > zuDice){
            return 0;
        } else if(comDice == zuDice){
            return 1;
        } else {
            return 2;
        }
    }
    void announce(){
        switch(whoWin()){
            case 0:
                System.out.println("Com 승");
                System.out.printf("Com:%d\n zu:%d\n", comDice, zuDice);
                break;
            case 1:
                System.out.println("무승부");
                System.out.printf("Com:%d\n zu:%d\n", comDice, zuDice);
                break;
            case 2:
                System.out.println("zu 승");
                System.out.printf("Com:%d\n zu:%d\n", comDice, zuDice);
                break;
        }
    }

    Boolean reDice(){
        System.out.println("한 번더 해보겠습니까? Y(1)/N(0)");
         int choice = scan.nextInt();  // Y, N 같은 문자를 입력받고 싶을 때는 int 말고 뭘 써야 하는지...?

        Boolean isTrue= false; // 여기 이 코드가 왜 사용되어야 하는지..?
                        // false를 빼거나 case0 안 에서 Boolean isTrue = false;를 사용하면 되는거 아닌지..?
        switch(choice){
            case 0:
                isTrue = false;
                break;
            case 1:
                comDice = throwDice();
                zuDice = throwDice();
                isTrue = true;
                break;
        }
        return isTrue;
    }
}
public class _3rd_Quiz35_2 {
    public static void main(String[] args) {

        DiceTest2 dt2 = new DiceTest2();

        do{
            dt2.announce();
        } while(dt2.reDice());
    }
}
// do-while()
// >> 무조건 do는 실행하고 이후 조건에 따라 while을 실행 할지 말지 결정한다

