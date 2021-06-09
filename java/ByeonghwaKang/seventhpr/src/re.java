import java.util.Scanner;
class Dog {
    int age;
    String name;
    String puppytype;

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    public String getPuppytype() {
        return puppytype;
    }

    public void setPuppytype(String puppytype) {
        this.puppytype = puppytype;
    }
}

public class re {
    public static void main(String[] args) {
        Dog dog = new Dog();


       dog.age = 12;

        dog.name = "마린";
        dog.puppytype = "말티즈";

        System.out.println("강아지의 나이는? " + dog.age);
        System.out.println("강아지의 이름은? " + dog.name);
        System.out.println("강아지의 품종은?" + dog.puppytype);

        dog.setAge(12);
        dog.setName("마린");
        dog.setPuppytype("말티즈");

        System.out.printf("%s의 나이는 %d이고 품종은 %s이다.\n",
                dog.getName(), dog.getAge(), dog.getPuppytype());
    }
}
