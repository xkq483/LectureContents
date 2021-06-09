class Dog{
    // 클래스 생성
    int age;
    String name;
    String dogType;
    // 변수선언

    //------------ Gatter , Setter 입력 ----------
    int getAge (){
        return age;
    }
    String getName(){
        return name;
    }
    String getDogType(){
        return dogType;
    }
    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
    void  setDogType(String dogType){
        this.dogType = dogType;
    }
}
// --------------------------------------


public class HomeWorkDog {
    public static void main(String[] args) {

        System.out.println("강아지 신상정보좀 알려주세요~~");
        // 클래스의 텅빈 공간을 불러낸다 new 생성자??
        Dog d = new Dog();

        // 설정은 Setter!!
        d.setAge(11);
        d.setDogType("믹스");
        d.setName("보리");

        // 값을 얻는 목적인 Getter 로  출력 ~
        System.out.printf("이름은 %s이고, 나이는 %d, 강아지종은 %s에요~\n",
                d.getName(),d.getAge(),d.getDogType());

    }
}
