import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class soccerGame{
    int year;
    int goal;
    final int randomgoalvalue1 = 35;
    final int randomgoalvalue2 = 10;
    int grade = 1;
    String name;
    boolean istrue;

    Scanner sc;

    public void setrandomgoal() {

    }
    public int seasongoal(int random1,int radom2){
        return (int)(Math.random()*random1+radom2);
    }
    soccerGame(){
        System.out.println("축구선수가있다 그는 매시즌 25골이상넣으면 1등급업 20이하로 넣으면 1등급하락이된다." +
                "7등급이 마지막이다 ");
        System.out.println("선수이름은?");
        sc =new Scanner(System.in);
        name = sc.next();


    }


    public void firstlogic() {
    }




    public  void uPgrade (){



        goal = seasongoal( (int)  randomgoalvalue1,(int)  randomgoalvalue2);
        if(goal>25){
            grade ++;
            System.out.println();
        }
        else if(goal<20){
            grade--;

        }else{
            grade+=0;
        }
    }

    public void circulation(){
        if(grade == 7){
            istrue= false;
        }
        else if(grade == 0){
            istrue= true;
        }
        else{
            istrue=true;
        }
    }
    public void gamestart(){
        do {

            uPgrade();
            circulation();
            print();

        }while(istrue);
    }


    public  void print(){

        System.out.printf("%s는%d골을넣고%d등급으로갔다.\n",name,goal,grade);
    }


}
public class soccer {
    public static void main(String[] args) {
        soccerGame GG = new soccerGame();
        GG.gamestart();

// 아직까지 미구현된 로직이있지만, 기본적인 뼈대구성과 내가 생각한 기본적인 로직은 오류가 안나고 정상적으로 돌아갔다.
        // 어제 와같이 ,선생님의 코드를보면서  GG.gamestart가 중재를 해줘 인스턴스화후

    }
}
