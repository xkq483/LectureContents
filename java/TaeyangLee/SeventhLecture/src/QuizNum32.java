class dog{
    int age;
    String name;
    String sex;
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

    String getSex() {
        return sex;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    String getSpecies() {
        return species;
    }

    void setSpecies(String species) {
        this.species = species;
    }
}

public class QuizNum32 {

    public static void main(String[] args) {
        dog d = new dog();
        d.setAge(3);
        d.setName("뽀이");
        d.setSex("여");
        d.setSpecies("말티즈");

        System.out.printf("강아지의 종은 %s 이고 성별은 %s 이며 나이는 %d 살이고 이름은 %s 입니다 \n",
                d.getSpecies(),d.getSex(),d.getAge(),d.getName());
    }
}
