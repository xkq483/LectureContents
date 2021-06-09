import java.util.Scanner;

class Dog {
    String name;
    int age;
    String brood;
    float height;
    float weight;
    char disease;

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
    String getBrood() {
        return brood;
    }
    void setBrood(String brood) {
        this.brood = brood;
    }
    float getHeight() {
        return height;
    }
    void setHeight(float height) {
        this.height = height;
    }
    float getWeight() {
        return weight;
    }
    void setWeight(float weight) {
        this.weight = weight;
    }
    char getDisease() {
        return disease;
    }
    void setDisease(char disease) {
        this.disease = disease;
    }
}

class Cat {
    String name;
    int age;
    String brood;
    float height;
    float weight;
    char allergy;

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
    String getBrood() {
        return brood;
    }
    void setBrood(String brood) {
        this.brood = brood;
    }
    float getHeight() {
        return height;
    }
    void setHeight(float height) {
        this.height = height;
    }
    float getWeight() {
        return weight;
    }
    void setWeight(float weight) {
        this.weight = weight;
    }
    char getAllergy() {
        return allergy;
    }
    void setAllergy(char allergy) {
        this.allergy = allergy;
    }
}
public class Prob32to33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog d1 = new Dog();
        d1.setName("다롱이");
        d1.setAge(11);
        d1.setBrood("시츄");
        d1.setHeight(30.22f);
        d1.setWeight(3.7f);
        d1.setDisease('N');

        System.out.printf("강아지 d1의 정보 : 이름 = %s, 종 = %s, 나이 = %d, 키 : %.2fcm, 몸무게 : %.2fkg, 질병 여부 = %c\n",
                d1.getName(), d1.getBrood(), d1.getAge(), d1.getHeight(), d1.getWeight(), d1.getDisease());

        Cat c1 = new Cat();

        System.out.print("고양이 c1의 이름 입력 : ");
        c1.name = sc.nextLine();
        System.out.print("고양이 c1의 나이 입력 : ");
        c1.age = sc.nextInt();
        System.out.print("고양이 c1의 종 입력 : ");
        sc.nextLine();
        c1.setBrood(sc.nextLine());
        System.out.print("고양이 c1의 몸무게 입력 : ");
        c1.setWeight(sc.nextFloat());
        System.out.print("고양이 c1의 키 입력 : ");
        c1.height = sc.nextFloat();
//        System.out.println("고양이 c1의 알러지 여부 : "); //char를 써서 문자를 입력해보고 싶은데 어떻게 넣어야 하나요?
//        c1.allergy = sc.next

        System.out.printf("고양이 c1의 정보 : 이름 = %s, 나이 = %d, 종 = %s, 키 = %.2fcm, 몸무게 = %.2fkg",
                c1.getName(), c1.age, c1.brood, c1.height, c1.weight);
                //* 일단 출력문에서 메소드 getName으로 불러오든 그냥 변수 name으로 불러오든 불러오기가 가능하다. *


    }
}
