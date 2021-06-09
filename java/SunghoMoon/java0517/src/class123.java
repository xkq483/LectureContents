class Teacher {
    int age;
    String name;
    String major;


    int getAge() {
        return age;
    }

    void setAge(int age) {

        this.age = age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getMajor() {
        return major;
    }
    void setMajor(String major) {
        this.major = major;
    }
}

public class ClassMethodTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.setAge(40);
        t.setMajor("Physics");
        t.setName("GAORICK");

        System.out.printf("%s 는 %s를 전공하였고 %d 세다.\n",
                t.getName(), t.getMajor(), t.getAge());

    }
    public class NonDuplicateQuestionAnswer {
        public static void main(String[] args) {
            final int BIN = 1;
            int testBit = 0;
            int randNum;

            for (int i = 0; i < 10; i++) {
                randNum = (int)(Math.random() * 10);

                while ((testBit & (BIN << randNum)) != 0) {
                    randNum = (int)(Math.random() * 10);
                }

                System.out.printf("randNum = %d\n", randNum);

                testBit |= (BIN << randNum);
            }
        }
    }
}
