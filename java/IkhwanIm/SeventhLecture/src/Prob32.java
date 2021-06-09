import java.util.Scanner;

class Dog{
    String name;
    int age;
    int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



}

public class Prob32 {
    public static void main(String[] args) {
        System.out.println("멍멍이의 정보를 입력하시오.");
        Dog dog = new Dog();

        Scanner scan = new Scanner(System.in);
        System.out.print("멍멍이 나이는: ");
        dog.setAge(scan.nextInt());
        //세터안에 scan.nextInt를 해도
        //값을 설정할 수 있다는 것을 알게되었다.

        System.out.print("멍멍이 이름은: "); //여기서 멍멍이 이름은, 무게는
        dog.setName(scan.nextLine()); //동시 출력됨... 왜지??

        System.out.print("멍멍이 무게는: ");
        dog.setWeight(scan.nextInt());

        System.out.printf("%s의 나이는 %d, 무게는 %dkg 입니다.\n"
                , dog.getName(), dog.getAge(), dog.getWeight());


    }
}
