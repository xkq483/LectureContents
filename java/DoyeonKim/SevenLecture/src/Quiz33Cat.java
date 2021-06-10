class Cat {
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

public class Quiz33Cat {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.age = 6;

        cat.name = "꽁이";
        cat.color = "흰색과 검정색";

        System.out.printf("%s 나이는 %d살이고 털은 %s 입니다.\n",
                cat.getName(), cat.getAge(), cat.getColor());

    }
}


