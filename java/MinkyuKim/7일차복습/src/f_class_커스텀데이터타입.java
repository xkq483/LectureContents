class Person {
    int age;
    String name;
}
public class f_class_커스텀데이터타입 {
    public static void main(String[] args) {
        Person person = new Person();

        person.age = 21;
        person.name = "태식이";

        System.out.println("몇살?" + person.age);
        System.out.println("이름은?" + person.name);

    }
}
