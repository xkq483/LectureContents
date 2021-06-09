class Pet {

    int age;
    String name;
    String type;
    String gender;

    int getAge(){
        return age = age;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name = name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getType() {
        return type = type;
    }
    void setType(String type) {
        this.type = type;
    }
    String getGender() {
        return gender = gender;
    }
    void setGender(String gender) {
        this.gender = gender;
    }
}

    public class Quiz32And33 {
        public static void main(String[] args) {
            Pet p = new Pet();

            System.out.println("강아지의 정보");

            p.setAge(5);
            p.setName("루키");
            p.setGender("남");
            p.setType("보더콜리");

            System.out.printf("이름은 %s(%s) %s이며 나이는 %d살 입니다.\n",
                    p.getName(), p.getGender(), p.getType(), p.getAge());

            System.out.println("고양이의 정보");
            p.setAge(5);
            p.setName("루시");
            p.setGender("여");
            p.setType("러시안블루");
            System.out.printf("이름은 %s(%s) %s이며 나이는 %d살 입니다.\n",
                    p.getName(), p.getGender(), p.getType(), p.getAge());
        }
    }


