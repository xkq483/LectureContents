// 고양이 클래스 만들기 ( Getter / Setter )

import java.util.Scanner;

class Cat{
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

public class Quiz33 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scan = new Scanner(System.in);

        cat.setAge(5);
        cat.setName("냥이");
        cat.setGender('여');

        System.out.printf("고양이의 이름은 %s, 나이는 %d살, 성별은 '%c'입니다.\n",cat.getName(),cat.getAge(),cat.getGender());

    }

}
