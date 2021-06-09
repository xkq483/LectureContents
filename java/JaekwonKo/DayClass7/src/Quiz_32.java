class Dog {
    int age;
    String name;
    String breed;

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

    String getBreed() {
        return breed;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }
}

public class Quiz_32 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setAge(2);
        dog.setBreed("말티푸");
        dog.setName("누누");

        System.out.printf("%s는 %d개월 된 아기 %s 입니다.\n", dog.getName(),dog.getAge(),dog.getBreed());




    }
}
