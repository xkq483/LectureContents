public class Student07 {
    int age ;
    String name ;
    String major;




    public static void main(String[] args)
    {
            Student07 student = new Student07();
            student.age = 15;
            student.name = "나천재";
            student.major = "컴퓨따 공학과";


        System.out.println("그학생의 나이는"+student.age);
        System.out.println("그학생의  이름은 "+student.name);
        System.out.println("그학생의 전공은"+student.major);
    }
}

