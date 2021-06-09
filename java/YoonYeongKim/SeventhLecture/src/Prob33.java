class Cat {
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

public class Prob33 {
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.name = "나비";

        cat.age = 6;

        cat.coat = "검정";

        System.out.println("고양이의 이름은 " + cat.name + "입니다.");
        System.out.println("고양이의 나이는 " + cat.age + "살입니다.");
        System.out.println("고양이의 털색은 " + cat.coat + "입니다.");

        cat.setAge(6);
        cat.setName("깜냥이");

        System.out.printf("%s의 나이는 %d살이며, 털색은 %s입니다.\n",
                cat.getName(), cat.getAge(), cat.getCoat());
    }
}