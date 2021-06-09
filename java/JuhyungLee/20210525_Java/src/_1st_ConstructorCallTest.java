class Students {
    String name;
    int score;

    public Students (String name) {
        score = (int)(Math.random() * 40 + 61);
        this.name = name;
        //School class에서 받은 매개변수로
        //이름: 이주형 점수: xx을 각각 Students의 data field에 저장.
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
    final String[] names = {"이주형", "이새연", "박동민"};
    Students[] arr;

    public School () {
        arr = new Students[MAX]; // arr[]의 index 생성하고
        for (int i = 0; i < MAX; i++) {
            arr[i] = new Students(names[i]);
            // Students class의 생성자를 이용해서 arr[]의 값들을 설정
            // names[]의 값들은 이름으로 String
            // 즉 Students Class의 생성자의 인자 값으로 활용 할 수 있음.
        }
    }
    public void printStudentsInfo () {
        for (int i = 0; i < MAX; i++) {
            System.out.printf("학생 이름은 %s, 점수는 %d 입니다.\n",
                    arr[i].getName(), arr[i].getScore());
        }
    }
}
public class _1st_ConstructorCallTest {
    public static void main(String[] args) {
        // Q: 생성자는 무조건 main()에서만 호출이 가능한가요 ?
        // A: 어디서나 가능합니다.
        School school = new School();
        school.printStudentsInfo();
    }
}