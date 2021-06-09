import java.util.Scanner;

class Dog {
    int age;
    int weight;
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

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }
}

public class homework_0517 {
    public static void main(String[] args) {
        System.out.println("32. 멍멍이 클래스 만들기(Setter/Getter)");

        Dog dog = new Dog();

        Scanner scan = new Scanner(System.in);

        System.out.print("강아지 이름 입력 : ");
        dog.name = scan.nextLine();

        System.out.print("강아지 나이 입력 : ");
        dog.age = scan.nextInt();

        System.out.print("강아지 몸무게 입력 : ");
        dog.weight = scan.nextInt();

        System.out.print("강아지 종 입력: ");
        dog.species = scan.nextLine();

        System.out.printf("당신의 강아지 이름은 : %s, 나이 : %d, 몸무게 : %d, 종 : %s\n",
                dog.name, dog.age, dog.weight, dog.species);
    }
}
// 이름,나이,몸무게 까지만 입력받고, '종'입력은 아예 안받고 바로 출력돼버립니다.
// 어디서 문제인걸까요?ㅠㅠ