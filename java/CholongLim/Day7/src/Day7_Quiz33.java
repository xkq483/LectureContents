class Cat {
    String name;
    int age;
    String gender;
    String eyecolor;

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
    String getEyecolor() {
        return eyecolor;
    }
    void setEyecolor(String eyecolor){
        this.eyecolor = eyecolor;
    }

}
public class Day7_Quiz33 {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("고양이");
        cat.setAge(10);
        cat.setGender("male");
        cat.setEyecolor("green");

        System.out.printf("%s는 %d살이고, 성별은 %s이다. 또한 %s색의 눈을 갖고있다.\n",
                cat.getName(),cat.getAge(),cat.getGender(),cat.getEyecolor());

    }
}
