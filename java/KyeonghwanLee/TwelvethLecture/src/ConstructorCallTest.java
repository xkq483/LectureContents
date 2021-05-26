// 랜덤 연봉 적용을 해보자
// 어떤 회사에 직원이 10명 있다.
// 10명의 이름은 적당히 지어주도록 한다.
// 이들의 시작 연봉은 2400 ~ 3500 으로 랜덤하게 지정한다.
// 또한 연봉 인상률은 1% ~ 20% 사이의 랜덤값을 가지게 한다.
// 10 년후의 각 직원들의 연봉을 출력하도록 프로그래밍해보자!
// 또한 연별로 평균 연봉값을 계산해보도록 한다.

// 데이터: 직원명, 직원페이, 각각의 인상률
// 기능(매서드): 초기값 설정(생성자), 연별 페이 적용, 연별 평균 페이
//             필요하다면 각각의 값을 얻을 수 있는 getter

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