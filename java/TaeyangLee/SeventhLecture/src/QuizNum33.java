class cat{
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

public class QuizNum33 {
    public static void main(String[] args) {
        cat c = new cat();
        c.setAge(2);
        c.setName("유미");
        c.setSex("여");
        c.setSpecies("페르시안");

        System.out.printf("고양이의 종은 %s 이고 성별은 %s 이며 나이는 %d 살이고 이름은 %s 입니다 \n",
                c.getSpecies(),c.getSex(),c.getAge(),c.getName());
    }
}
