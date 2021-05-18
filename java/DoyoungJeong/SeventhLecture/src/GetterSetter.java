class Person {
    String name;
    int age;
    char gender;

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

    char getGender() {
        return gender;
    }

    void setGender(char gender) {
        this.gender = gender;
    }
}

    public class GetterSetter {
        public static void main(String[] args) {
            Person ps = new Person();
            ps.setName("Jack");
            ps.setAge(26);
            ps.setGender('M');

            System.out.printf("%s는 %d세이고 성별은 %c이다.", ps.getName(), ps.getAge(), ps.getGender());


    }
}