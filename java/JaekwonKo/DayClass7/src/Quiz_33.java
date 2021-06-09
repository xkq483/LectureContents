class Cat1 {
    int age;
    float w;
    String name;
    String breed;


    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    float getW() {
        return w;
    }

    void setW(float w) {
        this.w = w;
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

public class Quiz_33 {
    public static void main(String[] args) {

        Cat1 cat = new Cat1();

        cat.setAge(2);
        cat.setName("아토");
        cat.setBreed("러시안블루");
        cat.setW(4.7f);

        System.out.printf("%s는 %d살된 고양이 입니다. 품종은 %s 이며, %.1f Kg 입니다\n", cat.getName(), cat.getAge(), cat.getBreed(), cat.getW());
    }
}
