class Cat{
    int age;
    String name;
    String breed;

    int getAge() {
        return age;
    }
    void setAge(int age){
        this.age=age;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

    String getBreed(){
        return breed;
    }
    void setBreed(String breed){
        this.breed=breed;
    }
}

public class CatProfile {
    public static void main(String[] args) {
        Cat cat = new Cat();
        
        cat.setName("야통이");
        cat.setAge(11);
        cat.setBreed("코숏");

        System.out.printf("이름 : %s, 나이 : %d, 품종 : %s\n", cat.getName(), cat.getAge(), cat.getBreed() );


    }

}
