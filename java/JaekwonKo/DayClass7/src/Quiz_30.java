import java.util.Scanner;

class Student {
    int age;
    String name;
    String major;
}

public class Quiz_30 {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("학생의 신상을 입력해 주세요.");

        Scanner scan = new Scanner(System.in);
        System.out.print("전공을 입력하세요 : ");
        student.major = scan.nextLine();

        System.out.print("이름을 입력하세요 : ");
        student.name = scan.nextLine();

        System.out.print("나이를 입력하세요 : ");
        student.age = scan.nextInt();

        // %s의 경우에는 printf에서 문자열을 출력하는데 사용한다.
        System.out.printf("이름: %s, 전공: %s, 나이: %d\n", student.name, student.major, student.age);
    }
}
