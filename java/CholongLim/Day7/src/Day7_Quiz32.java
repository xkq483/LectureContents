class Dog {
    String name;
    int age;
    String gender;
    int weight;

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
    String getGender() {
        return gender;
    }
    void setGender(String gender) {
        this.gender = gender;
    }
    int getWeight() {
        return weight;
    }
    void setWeight(int weight) {
        this.weight = weight;
    }
}

public class Day7_Quiz32 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.setName("강아지");
        dog.setAge(3);
        dog.setGender("female");
        dog.setWeight(15);

        System.out.printf("%s는 %d살이고, 성별은 %s이다. 또한 몸무게는 %d Kg이다.\n",
                dog.getName(), dog.getAge(), dog.getGender(),dog.getWeight() );



    }
}
