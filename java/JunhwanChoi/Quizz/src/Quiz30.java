// Person은 사람 Student는 학생이다.
//앞서 풀어봤던 예제인 Person을 참고하여 Student 클래스를 만들어보자!

import java.util.Scanner;

class Student{
    char grade;
    String name;
    int score;
    String major;


}

public class Quiz30 {
    public static void main(String[] args) {

        Student st= new Student();
        Scanner scan= new Scanner(System.in);

        st.grade='A';
        st.name="홍길동";
        st.score=90;

        System.out.println(st.name+"의 점수는 "+st.score +", 학점은 "+st.grade+"입니다.");

        System.out.print("전공은 무엇인가요? ");
        st.major= scan.nextLine();

        System.out.println(st.major+"입니다.");



    }
}
