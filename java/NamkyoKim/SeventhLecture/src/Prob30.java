import java.util.Scanner;

class Student { // 클래스 이름은 첫번째 글자 대문자 주의
    // 클래스 내부에 변수선언
    String schoolName;
    int totalStudent;
    String mator;
    String name;
    int age;
}
public class Prob30 {
    public static void main(String[] args) {

        // Student클래스를 Prob30클래스로 불러오는 개념?? 하여튼 생성!
        // Student-> 데이터타입같인개념 student -> 변수명  new Student(); --> 생성자? !
        Student student = new Student();
        // Student클래스에 있는 변수에 값 대입
        student.schoolName = "수원고등학교";
        student.totalStudent = 500;

        // 출력
        // 지금은 한개의 클래스를 가지고 하는데 나중에는 여러가지 클래스를 생성하고 사용하고 할거같다.
        System.out.println("학교이름은? " + student.schoolName);
        System.out.println("학교에 총 학생들은 몇명? " + student.totalStudent+ "명");

        System.out.println("학생 본인의 신상을 입력해주세요!!! ");

        Scanner sc = new Scanner(System.in);

        System.out.print("학생 본인의 전공을 입력해주세요 : ");
        student.mator = sc.nextLine();

        System.out.print("학생 본인의 이름을 입력해주세요 : ");
        student.name = sc.nextLine();

        System.out.print("학생 본인의 나이을 입력해주세요 : ");
        student.age = sc.nextInt();

        // %s의 경우에는 printf에서 !문자열!을 출력하는데 사용함
        System.out.printf("이름  %s, 전공 : %s, 나이 : %d\n", student.name, student.mator, student.age);
    }
}
