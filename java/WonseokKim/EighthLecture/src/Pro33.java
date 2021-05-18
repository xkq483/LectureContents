import java.util.Scanner;

class Cat{
    int age;
    String name;
    String sex;
    String species;

    int getAge(){
        return age;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
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
    String getSpecies(){
        return species;
    }
    void setSpecies(String species){
        this.species = species;
    }
}

public class Pro33 {
    public static void main(String[] args) throws InterruptedException {
        Cat kitty = new Cat();

        Scanner scan = new Scanner(System.in);

        System.out.println("당신의 고양이의 정보를 입력하세요 ! ");
        //Thread.sleep(2000);

        System.out.println("고양이의 이름은 무엇인가요 ?");
        kitty.setName(scan.nextLine());

        System.out.println("고양이의 나이는 ? ");
        kitty.setAge(scan.nextInt());

        System.out.println("고양이의 성별은 ? ");
        kitty.setSex(scan.nextLine());

        System.out.println("고양이의 품종은 ? ");
        kitty.setSpecies(scan.nextLine());



        System.out.println("완료 되었습니다. 당신이 적으신 고양이의 정보 입니다.");
        //Thread.sleep(1000);
        System.out.printf("이름: %s, 나이: %d, 성별: %s, 품종: %s\n",
                kitty.getName(), kitty.getAge(), kitty.getSex(), kitty.getSpecies());



    }
}
