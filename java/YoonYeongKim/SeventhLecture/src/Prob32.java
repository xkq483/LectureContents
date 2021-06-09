class Dog {
    String name;
    int age;
    String coat;

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

    String getCoat() {
        return coat;
    }
    void setCoat(String coat) {
        this.coat = coat;
    }

}

public class Prob32 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "바둑이";

        dog.age = 2;

        dog.coat = "흰검";

        System.out.println("강아지의 이름은 " + dog.name + "입니다.");
        System.out.println("강아지의 나이는 " + dog.age + "살입니다.");
        System.out.println("강아지의 털색은 " + dog.coat + "입니다.");

        dog.setAge(2);
        dog.setName("바둑바둑");

        System.out.printf("%s의 나이는 %d살이며, 털색은 %s입니다.\n",
                dog.getName(), dog.getAge(), dog.getCoat());
    }
}