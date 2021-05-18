import java.util.Scanner;

class Student {
    String name;
    int Class;
    int age;
    int IQ;

}

public class StudentTest {
    public static void main(String[] args) {
        //30번 문제

        Student student = new Student();
        Scanner scan=new Scanner(System.in);


        System.out.print("나이를 입력하세요");
        student.age= scan.nextInt();


        System.out.print("학년을 입력하세요");
        student.Class= scan.nextInt();


        System.out.print("IQ을 입력하세요");
        student.IQ= scan.nextInt();


        System.out.print("이름을 입력하세요");
        student.name = scan.nextLine();

        System.out.printf("이 학생의 나이는%d 세이며 %d학년이고 %d의 아이큐를 가졌다 이름은 %s라고한다\n.",
                student.age,student.Class, student.IQ, student.name);
    }
}