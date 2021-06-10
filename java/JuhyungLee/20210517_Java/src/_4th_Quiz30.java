class Student{
    int age;
    String name;
    int math_score;
    int eng_score;
}
public class _4th_Quiz30 {
    public static void main(String[] args) {
        // Student Class를 만들어라.
        Student student_a = new Student();
                student_a.age = 17;
                student_a.name = "주형";
                student_a.math_score = 95;
                student_a.eng_score = 100;

        Student student_b = new Student();
                student_b.age = 17;
                student_b.name = "동민";
                student_b.math_score = 70;
                student_b.eng_score = 74;

        if(student_a.math_score>student_b.math_score){
            System.out.println("주형 승");
        } else {
            System.out.println("동민 승");
        }
    }
}
