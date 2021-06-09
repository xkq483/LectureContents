import java.util.Scanner;

class Person {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int age;
    String name;
}

class Student   {
    int age;
    String name;
    String clas;
}

class Teacher   {
    int age;
    String name;
    String major;

    //값을  얻는 목적으로 사용하는 게 Getter
    int getAge()    {
        return age;
    }

    //값을 설정하는 목적 Setter
    void  setAge(int age)   {
        this.age = age;
    }

    String getName()    {
        return name;
    }
    void setName(String name)   {
        this.name = name;
    }

    String getMajor()   {
        return major;
    }
    void setMajor(String major) {
        this.major = major;
    }



public class Review7_1 {
    public static void main(String[] args) {
        // 동적할당 되는 데이터를 관리하는 메모리 - Heap
        // new
        // 기존에 우리가

        Scanner scan = new Scanner(System.in);
        System.out.println("학급에 학생이 몇 명 있습니까 ? ");

        int studentNum = scan.nextInt();

        int studentArr[] = new int[studentNum];

        for (int i = 0; i < studentNum; i++)    {
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n", i, studentArr[i]);
        }


        int arr[] = { 2, 3, 4, 5, 6, 7 };

        System.out.println("arr의 길이 = " +arr.length);

        int dynamicArr[] = new int[30];

        System.out.println("dynamicArr의 길이 = " + dynamicArr.length);


        //28. 배열 문제
        //아래와 같은 형태의 숫자들이 있다.
        //1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, ...
        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!

        Scanner scanner = new Scanner(System.in);

        System.out.print("원하시는 n번째 값을 입력해주세요 : ");
        int num = scanner.nextInt();

        int numArr[] = new int[num];
        numArr[0] = 1;

        for (int i = 1; i < num; i++) {
            numArr[i] = numArr[i - 1] * 2;
        }
        System.out.printf("%d번째 값은 : %d" , num, numArr[num-1]);

        Scanner scanner = new Scanner(System.in);

        System.out.print("원하시는 n번째 값을 입력해주세요 : ");
        int num = scanner.nextInt();

        int numArr[] = new int[num];
        numArr[0] = 1;

        for (int i = 1; i < num; i++) {
            numArr[i] = (int) Math.pow(2, i);
        }
        System.out.printf("%d번째 값은 : %d" , num, numArr[num-1]);


        Person person = new Person();

        person.setAge(40);
        person.setName("홍길동");

        System.out.printf("%s는 %s세다", person.getName(), person.getAge());

        Student student = new Student();

        student.age = 22;
        student.name = "홍길동";
        student.clas = "1반";

        System.out.println("이름 : " + student.name);
        System.out.println("나이 : " + student.age);
        System.out.println("반   : " + student.clas);

        Teacher t = new Teacher();

        t.setAge(40);
        //여기서 getage로 가고 class 안의 age 가 여기서 들어온 age의 값으로 바뀜
        t.setMajor("Physics");
        t.setName("GetOut");

        System.out.printf("%s는 %s를 전공하였고 %d세다.\n", t.getName(), t.getMajor(), t.getAge());

    }
}
