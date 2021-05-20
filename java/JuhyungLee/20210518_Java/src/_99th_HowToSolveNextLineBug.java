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

public class _99th_HowToSolveNextLineBug {
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

        //  nextLine에서의 버그.
        // Java 내부의 버퍼에 Enter가 남아있어서 아래가 실행이 안됨.
        // 강제로 Enter를 빼주는 작업을 해야함.
        System.out.print("강아지 종 입력: ");
        scan.nextLine();
        dog.species = scan.nextLine();

        System.out.printf("당신의 강아지 이름은 : %s, 나이 : %d, 몸무게 : %d, 종 : %s\n",
                dog.name, dog.age, dog.weight, dog.species);
    }
}
