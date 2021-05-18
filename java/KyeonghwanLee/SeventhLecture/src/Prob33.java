import javax.xml.bind.SchemaOutputResolver;

class Cat {

    int age;
    String weight;
    String name;
    String species;

    int getAge(){
        return  age;
    }
    void setAge(int age){
        this.age = age;
    }
    String getWeight(){
        return  weight;
    }
    void setWeight(String weight){
        this.weight = weight;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    String getSpecies(){
        return species;
    }
    void setSpecies(String species){
        this.species = species;
    }


}


public class Prob33 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setAge(1);
        c.setWeight("1.2kg");
        c.setName("스핑크스");
        c.setSpecies("페르시안");

        System.out.printf("고양이의 이름은 %s 입니다. 종은 %s 이고, 나이는 1살이며 몸무게는 %s 입니다.\n",
                c.name, c.species, c.age, c.weight);
    }
}
