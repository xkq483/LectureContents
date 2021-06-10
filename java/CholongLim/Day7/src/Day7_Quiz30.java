class Student {
    int age;
    int grade;
    String name;
    String schoolname;
}

public class Day7_Quiz30 {
    public static void main(String[] args) {

        Student student = new Student();
        student.age = 17;
        student.grade = 1;
        student.name = "헬로우";
        student.schoolname = "k고등학교";

        System.out.println("이 학생의 나이는? " + student.age);
        System.out.println("이 학생의 학년은? " + student.grade);
        System.out.println("이 학생은 이름은? " + student.name);
        System.out.println("이 학생이 다니는 학교의 이름은? " + student.schoolname);
    }
}
