import java.util.Scanner;

public class StudentTest {
    int age;
    String name;
    String major;

    public static void main(String[] args) {
        StudentTest s = new StudentTest();


        Scanner scan = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        s.name = scan.nextLine();
        System.out.println("전공을 입력해주세요");
        s.major = scan.nextLine();
        System.out.println("나이 입력해주세요");
        s.age = scan.nextInt();

        System.out.printf("이름  :%s,전공 : %s,나이 : %d\n", s.name,s.major,s.age);


    }
}
