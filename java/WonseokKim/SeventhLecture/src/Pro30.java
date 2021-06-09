class Students{
    int age;
    String name;
    String major;
    String address;

}

public class Pro30 {
    public static void main(String[] args) {
        //Person은 사람 Student는 학생이다.
        //앞서 풀어봤던 예제인 Person을 참고하여 Student 클래스를 만들어보자!

        Students a = new Students();
        a.age = 21;
        a.address = "경기도 성남시";
        a.major = "피아노과";
        a.name = "김원석";

        System.out.println("이 학생의 이름은.. " + a.name);
        System.out.println("이 학생의 나이는.. " + a.age +"살");
        System.out.println("이 학생의 사는곳은.. " + a.address);
        System.out.println("이 학생의 전공은.. " + a.major);
    }
}
