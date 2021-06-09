class Dog {
    String name;
    String sex;
    String home;
    String species;
    int age;

    String getName() {
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getSex(){
        return sex;
    }
    void setSex(String sex){
        this.sex = sex;
    }
    String getHome(){
        return home;
    }
    void setHome(String home){
        this.home = home;
    }
    String getSpecies(){
        return species;
    }
    void setSpecies(String species){
        this.species = species;
    }
    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }

}

public class Pro32 {
    public static void main(String[] args) {
        //멍멍이 클래스 만들기 (Setter/Getter)
        Dog puppy = new Dog();

        puppy.setAge(3);
        puppy.setSex("여자");
        puppy.setHome("강원도");
        puppy.setSpecies("말티즈");
        puppy.setName("바우");

        System.out.printf("강아지의 이름은 %s이고, 사는곳은 %s이며, 나이는 %d살 %s입니다. 강아지의 종은 귀여운 %s이니, 사랑 많이 해주세요!!",
                puppy.getName(), puppy.getHome(), puppy.getAge(), puppy.getSex(), puppy.getSpecies());


    }
}
