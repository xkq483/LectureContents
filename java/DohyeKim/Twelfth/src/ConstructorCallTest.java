// Q: 생성자는 무조건 main()에서만 호출이 가능한가요 ?
// A: 어디서나 가능합니다.
class Students {
    String name;
    int score;

    public Students (String name) {
        score = (int)(Math.random() * 40 + 61);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}

class School {
    final int MAX = 3;
    final String[] names = {"아녀엉", "안녀엉", "안뇨옹"};
    Students[] arr;

    public School () {
        arr = new Students[MAX];

        for (int i = 0; i < MAX; i++) {
            arr[i] = new Students(names[i]);
        }
    }
    public void printStudentsInfo () {
        for (int i = 0; i < MAX; i++) {
            System.out.printf("학생 이름은 %s, 점수는 %d 입니다.\n",
                    arr[i].getName(), arr[i].getScore());
        }
    }
}

public class ConstructorCallTest {
    public static void main(String[] args) {
        School school = new School();

        school.printStudentsInfo();
    }
}