/*
클래스 이건희를 만들고 클래스 이재용을 만들어보자
 */
class Leegunhee{

    int age;
    String name;

    String asset = "삼성";
    int money = 10;

    Leegunhee(int age,String name){
        this.age = age;
        this.name = name;
    }


    public void samsung(){
        System.out.println("이건희의 삼성");
    }

    public void smartPhone(){
        System.out.println("삼성 스마트폰");
    }


}

class Leejaeyong extends Leegunhee{

    String car;
    Leejaeyong(int age, String name,String car){
        super(age,name);
        this.car = car;
    }

    public void samsung() {
        System.out.println("이재용의 삼성");
    }

    public void twoSamsung(){
        System.out.println("두번째 삼성");
    }

}


public class TodayTest {
    public static void main(String[] args) {

        Leegunhee Lee = new Leejaeyong(35,"이재용","페라리");
        System.out.println(Lee.money);
        System.out.println(Lee.asset);
        Lee.samsung();
        Lee.smartPhone();
        System.out.println();
        //Lee.twoSamsung();

    }
}
