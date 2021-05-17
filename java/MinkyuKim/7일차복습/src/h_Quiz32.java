class 멍멍이 {

int age;
String name;
String species;

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
String getSpecies() {
    return species;
}
void setSpecies(String species) {
    this.species = species;
}
}
public class h_Quiz32 {
    //멍멍이 클래스

    public static void main(String[] args) {
        멍멍이 dog = new 멍멍이();

        dog.setAge(3);
        dog.setName("가루");
        dog.setSpecies("치와와");

        System.out.printf("나이 : %d / 이름 : %s / 견종 : %s\n", dog.getAge(), dog.getName(), dog.getSpecies());

    }
}
