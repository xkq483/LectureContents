class Student {
    String name;
    char gender;
    int age;
    int grade;
    float score;

    String getName() {
        return name;
    }
    char getGender() {
        return gender;
    }

    Student() {}

    Student(String n1, int a2) { // ()안의 연결되는 각 변수 이름은 일치해야 한다.
        System.out.printf("학생의 이름은 %s이고 나이는 %d이다.\n", n1, a2);
        name = n1;
        age = a2;
    }
//    Student(String name, int grade) { // 다른 변수라도 이미 String, int를 받는 생성자가 있기 때문에 유효한 생성자가 아니다.
//        System.out.printf("학생의 이름은 %s이고 성적은 %d이다.\n", name, grade);
//    }
    Student(String name, float score) {
        System.out.printf("학생의 이름은 %s이고 성적은 %.1f점이다.\n", name, score);
    }
    Student(int age, int grade) {
        System.out.printf("학생들의 평균 나이는 %d세 이고 %d학년이 가장 많다.\n", age, grade);
    }
    Student(String name, char gender) {
        System.out.printf("학생의 이름은 %s이고 성별은 %c이다.\n", name, gender);
    }
}
public class ConstructorPractice {
    public static void main(String[] args) {
        Student st0 = new Student();
        Student st1 = new Student("정도영", 28);
        Student st2 = new Student("김민화", 88.2f);
        Student st3 = new Student(27,3);
        Student st4 = new Student("정민우", 'M');

        System.out.printf("학생의 이름은 %s이고 성별은 %c이다.\n", st4.name, st4.getGender());
        //마지막 부분 출력이 null이 되는 이유가 뭔지 잘 모르겠습니다. 객체 st4에서 값을 넣었는데 왜 출력이 안될까요?

    }
}
