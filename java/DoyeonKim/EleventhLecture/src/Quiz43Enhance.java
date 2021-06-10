class SalayTest {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public  SalayTest (String name) {
        this.name = name; //이름
        salary = (int)(Math.random() * 1101 + 2400); //연봉

    }
    public void calcRandomSalary (int year) { //10년
        float incRate; //인상연봉

        for (int i = 0; i < year; i++) {
            incRate = (float)(Math.random() * 20 + 1); // 원가 + 증액분
            salary = (int)(salary + salary * incRate * PERCENT);
            //System.out.println("%s의 %d년차 연봉은 = %d이며 올해 인상률은은 = %f\n", name
            //, i + 1, salary, incRate);
        }
    }
    public void printRandomSalary () {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary); //10명 연봉 출력
    }

    public int getSalary() { //외부로 꺼내준다
        return salary;
    }
}

public class Quiz43Enhance {
    public static void main(String[] args) {
        String[] nameArr = {
                "강한병", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수",
        };
        int nameLen = nameArr.length;

        SalayTest[] st = new SalayTest[nameLen];

        for (int i = 0; i < nameLen; i++) { //이름 갯수만큼 10번 출력
            st[i] = new SalayTest(nameArr[i]);//한 인덱스마다 연봉이 들어감
            st[i].calcRandomSalary(10); //그리고 그걸 랜덤 인상연봉한걸 10번 힌걸 총 인상한걸 합히고
            st[i].printRandomSalary();//아래에 출력

        }
    }
}