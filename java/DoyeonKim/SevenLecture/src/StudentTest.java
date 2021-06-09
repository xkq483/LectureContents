import java.util.Scanner;

class Student {
    String major;
    String name;
    int age;
}

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("학생 본인의 신상을 입력해주세요.");

        Student stu = new Student();

        Scanner scan = new Scanner(System.in);
        System.out.print("전공을 입력하세요: ");
        stu.major = scan.nextLine();
        //이 major은 위에서 가져오고 그리고 입력하면 위애 저장되는 형식 맞나
        //아니다 그냥 stu.major에 저장되는건가

        System.out.print("이름을 입력하세요: ");
        stu.name = scan.nextLine();

        System.out.print("나이를 입력하세요: ");
        stu.age = scan.nextInt();

        // %s의 경우에는 printf에서 문자열을 출력하는데 사용한다.
        System.out.printf("이름: %s, 전공: %s, 나이: %d\n", stu.name, stu.major, stu.age);
    }
}
