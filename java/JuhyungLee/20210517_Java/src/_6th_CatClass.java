class Cat{
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
public class _6th_CatClass {
    public static void main(String[] args) {

        Cat cc = new Cat();

        cc.setAge(2);
        cc.setName("나비");
        cc.setBreed("길냥이");
        cc.setCnt_vaccination(1);

        System.out.printf("내 고양이 %s는 %s이고 %d살이며 접종은 %d회 했다",
                cc.getName(), cc.getBreed(), cc.getAge(), cc.getCnt_vaccination());
    }
}
