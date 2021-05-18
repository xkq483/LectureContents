// 멍멍이 클래스 만들기 ( Getter / Setter )

import java.util.Scanner;

class Dog{
    String name;
    int age;
    char gender;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    char getGender() {
        return gender;
    }
    void setGender(char gender) {
        this.gender = gender;
    }

}

public class Quiz32 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Scanner scan = new Scanner(System.in);

        dog.setAge(3);
        dog.setName("멍뭉이");
        dog.setGender('남');

        System.out.printf("강아지의 이름은 %s, 나이는 %d살, 성별은 '%c'입니다.\n",dog.getName(),dog.getAge(),dog.getGender());

    }

}
