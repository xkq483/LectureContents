import java.util.Scanner;

class Student {
    int grade;
    String name;
    String major;

}

public class QuizTest30 {
    public static void main(String[] args) {
        System.out.println("학생 본인의 신상을 입력하세요.");

        Student student = new Student();

        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        student.name = scan.nextLine();
        System.out.print("학년을 입력하세요 : ");
        student.grade = scan.nextInt();
        System.out.print("전공을 입력하세요 : ");
        student.major = scan.nextLine();

        System.out.println("이름 : " + student.name + " 전공 : " +  student.major + " 학년 : " + student.grade);


    }
}
