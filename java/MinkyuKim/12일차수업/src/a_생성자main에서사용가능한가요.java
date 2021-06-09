class Students {
    String name;
    int score;

    public Students (String name) {
        // 문자열을 갖고와라. 즉 다른곳에서 대입해줘야 한다는 의미?
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
    final String[] names = {"아녀엉", "`안녀엉`", "안뇨옹"};
    Students[] arr;

    public School () {
        arr = new Students[MAX];
        // 0, 1, 2 인덱스만 생성

        for (int i = 0; i < MAX; i++) {
            arr[i] = new Students(names[i]);
            // arr인덱스에 내용 넣는것.

            // arr[i] = new Students("김치") 입력시 학생은 모두 김치로 입력되어 점수가 출력됨.
            // 즉 arr[i] = new Students 에서의 Students는 위의 생성자 Students이며
            // arr[i] = new Students() 에서 Students()의 괄호값을 입력받게 된다.

            // 즉 생성자 Students를 호출한다는 의미이며, 호출된 생성자에 arr의 배열(MAX값)만큼의 변수 names가 입력된다.
        }
    }
    public void printStudentsInfo () {
        for (int i = 0; i < MAX; i++) {
            System.out.printf("학생 이름은 %s, 점수는 %d 입니다.\n",
                    arr[i].getName(), arr[i].getScore());

            // getName이 위의 getname의 name값이 리턴되고 this.name에 의해 string name값이 입력된다.
            // 즉 getName은 arr[i]의 정보를 받아간다. getScore또한 마찬가지.
            // 생성된 배열(getName만큼의 getScore를 산출하게되며,
            // prinf에 의하여 출력된다.
        }
    }
}

public class a_생성자main에서사용가능한가요 {
    public static void main(String[] args) {
        School school = new School();

        school.printStudentsInfo();
    }
}