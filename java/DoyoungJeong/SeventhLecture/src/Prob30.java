import java.util.Scanner;

class Student {
    String name;
    char gender;
    int age;
    int grade;
    float averageScore;
}
public class Prob30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();

        System.out.print("학생 이름 입력 : ");
        st.name = sc.nextLine();
        st.gender = 'M';
        st.age = 21;
        st.grade = 2;
        st.averageScore = 88.45f;


        System.out.println(st.name);
    }
}
