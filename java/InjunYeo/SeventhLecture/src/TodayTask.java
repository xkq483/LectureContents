class Dog{
    String name;
    String person;
    String sound;
    int age;

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    String getPerson(){
        return person;
    }

    void setPerson(String person){
        this.person = person;
    }

    String getSound(){
        return sound;
    }

    void setSound(String sound){
        this.sound = sound;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age = age;
    }

}

class Cat{
    String name;
    String person;
    String sound;
    int age;

    String getName(){
        return name;
    }

    void setName(String name){
        this.name = name;
    }

    String getPerson(){
        return person;
    }

    void setPerson(String person){
        this.person = person;
    }

    String getSound(){
        return sound;
    }

    void setSound(String sound){
        this.sound = sound;
    }

    int getAge(){
        return age;
    }

    void setAge(int age){
        this.age = age;
    }

}

public class TodayTask {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setAge(3);
        cat1.setName("냐옹이");
        cat1.setPerson("냐옹이 주인");
        cat1.setSound("냐옹냐옹");

        Dog dog1 = new Dog();
        dog1.setAge(2);
        dog1.setName("멍멍이");
        dog1.setPerson("멍멍이 주인");
        dog1.setSound("망망");



    }

}
