class Dog {
    int age;
    String name;
    String color;


    int getAge()  {
     return age;
    }
    void setAge(int age)    {
    this.age = age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
}

public class Quiz32dog {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.age = 8;

        dog.name = "감자";
        dog.color = "흰색";

        System.out.printf("%s 나이는 %d살이고 털은 %s 입니다.\n",
                dog.getName(), dog.getAge(), dog.getColor());

    }
}
