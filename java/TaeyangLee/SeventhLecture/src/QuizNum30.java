import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

class Student {
    int age;
    String name;
    String school;
}


public class QuizNum30 {

    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
/*        student.s_num = 30111;
        student.school="동고";
        student.name = "이태양";
        System.out.println("학생의 이름은 : "+ student.name);
        System.out.println("학생의 학교는 : "+ student.school);
        System.out.println("학생의 학번은 : "+ student.s_num);
        System.out.println("학생의 나이는 : "+ student.age);   */
        System.out.printf("학교를 입력하세요 :");
        student.school = sc.nextLine();

        System.out.printf("이름을 입력하세요 :");
        student.name = sc.nextLine();

        System.out.printf("나이를 입력하세요 :");
        student.age = sc.nextInt();
        System.out.printf(" 학교 : %s , 이름 : %s , 나이 : %d \n ",student.school,student.name,student.age);
    }

}
