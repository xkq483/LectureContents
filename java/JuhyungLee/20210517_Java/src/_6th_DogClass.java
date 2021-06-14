class Dog{
    int age;
    int cnt_vaccination;
    String name;
    String breed;

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }

    int getCnt_vaccination(){
        return cnt_vaccination;
    }
    void setCnt_vaccination(int cnt_vaccination){
        this.cnt_vaccination = cnt_vaccination;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    String getBreed(){
        return breed;
    }
    void setBreed(String breed){
        this.breed = breed;
    }
}

public class _6th_DogClass {
    public static void main(String[] args) {

        Dog dd = new Dog();

        dd.setAge(7);
        dd.setName("삐삐");
        dd.setBreed("Bulldog");
        dd.setCnt_vaccination(2);

        System.out.printf("내 강아지 %s는 %s이고 %d살이며 접종은 %d회 했다",
                dd.getName(), dd.getBreed(), dd.getAge(), dd.getCnt_vaccination());
    }
}
