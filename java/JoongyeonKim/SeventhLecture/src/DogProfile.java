import java.util.Scanner;

class Dog{
    int age;
    String name;
    String breed;

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;     //여기서 값을 반환함
    }
    void setName(String name){
        this.name=name;      //여기서 값을 설정함
    }
    String getBreed(){
        return breed;
    }
    void setBreed(String breed){
        this.breed=breed;
    }
}
public class DogProfile {
    public static void main(String[] args) {
        Dog d=new Dog();
        Scanner scan =new Scanner(System.in);

        d.setName("멍멍이");    //이름 설정
        d.setAge(13);          //나이 설정
        d.setBreed("허스키");   //품종 설정

        System.out.printf("이름: %s 품종: %s, 나이: %d\n", d.name, d.breed, d.age);
    }
}
