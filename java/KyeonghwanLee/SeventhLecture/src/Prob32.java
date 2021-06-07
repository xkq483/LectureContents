import java.util.Scanner;

class Dog {

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


public class Prob32 {
    public static void main(String[] args) {

        System.out.println("개의 정보를 입력해주세요.");
        Dog d = new Dog ();

        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        d.name = scan.nextLine();

        System.out.print("개의 종을 입력하세요: ");
        d.species = scan.nextLine();

        System.out.print("나이를 입력하세요: ");
        d.age = scan.nextInt();

        System.out.print("몸무게를 입력하세요:  " );
        d.weight = scan.nextLine();





        System.out.printf("이름: %s, 종: %s, 나이: %d,몸무게: %s\n", d.name,d.species, d.age, d.weight);







    }
}
