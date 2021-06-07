import java.util.Scanner;

class Student {
    String major;
    String name;
    int age;
}

    // 이해 안가는 부분 없음.


public class StudentTest {
    public static void main(String[] args) {
        System.out.println("학생 본인의 신상을 입력해주세요.");

        Student stu = new Student();

        Scanner scan = new Scanner(System.in);
        System.out.print("전공을 입력하세요: ");
        stu.major = scan.nextLine();

        System.out.print("이름을 입력하세요: ");
        stu.name = scan.nextLine();

        System.out.print("나이를 입력하세요: ");
        stu.age = scan.nextInt();


        System.out.printf("이름: %s, 전공: %s, 나이: %d\n", stu.name, stu.major, stu.age);
    }
}