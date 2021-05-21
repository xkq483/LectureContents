package MiniGame1.Adventure;

//싱글톤 패턴으로 교체
public class Person_Charcter {

    String name;    //캐릭터이름
    String job;     //캐릭터직업
    int level = 1;      //캐릭터레벨

    /*status 캐릭터 기본능력치*/
    int hp = 50;     //hp값은 50으로 시작
    int mp = 50;     //mp값은 50으로 시작
    int str= 5;    //5로 시작
    int dex = 5;    //5로 시작
    int wis = 5;    //5로 시작
    int atk = 3;    //공격력 3으로 시작
    int def = 1;    //방어력 1로 시작


    Person_Charcter(String name){
        this.name = name;
        Dice dice = new Dice();
    }


    void character_Move(){

    }
    void charcter_Attack(){

    }



}
