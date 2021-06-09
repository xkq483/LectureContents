import java.util.Scanner;

class Cat{
    int age;
    int weight;
    String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Prob33 {
    public static void main(String[] args) {
        System.out.println("고양이의 정보를 입력하시오.");
        Cat cat = new Cat();

        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하시오: ");
        cat.setAge(sc.nextInt());

        System.out.println("무게를 입력하시오: ");
        cat.setWeight(sc.nextInt());

        System.out.println("이름을 입력하시오: ");// 이번에는 이 부분을 그냥 지나간다.
        cat.setName(sc.nextLine());

        System.out.printf("%s 고양이는 %d살이고 %d kg이다.\n",
                cat.getName(), cat.getAge(), cat.getWeight());
        //고양이는 xx살이고 xxkg이다 만 출력된다..
    }
}
