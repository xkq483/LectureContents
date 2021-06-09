//각 직원들의 10년차 연봉

class SalaryTest {
    final float PERCENT = 0.01f;

    String name;
    int salary;

    public SalaryTest (String name) {  //생성자 데이터 타입으로 String name을 지정해서 이름이 나올때 호출되게한다
        this.name = name;
        salary = (int)(Math.random() * 1101 + 2400);
    }
    public void calcRandomSalary (int year) {  //메소드 하나에 코드를 몰빵하는 것은 좋지않다
        float incRate;

        for (int i = 0; i < year; i++) {
            incRate = (int)(Math.random() * 20 + 1);  //연봉 인상률을 정하는 코드
            // 원가 + 증액분
            salary = (int)(salary + salary * incRate * PERCENT);  //인상된 연봉을 적용하는 코드
            // System.out.printf("%s의 %d년차 연봉은 = %d이며 올해 인상률 = %f\n", name, i + 1, salary, incRate);
        }
    }
    public void printRandomSalary () {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, salary);  //마지막으로 값을 출력하는 코드
    }
}

public class Prob43Enhance {
    public static void main(String[] args) {
        String[] nameArr = {  //String배열의 변수값들을 지정한다
                "강한별", "강한빛", "강경수", "임종수", "백종수",
                "최빛나", "최창수", "박창수", "김창수", "김명수"
        };

        int nameLen = nameArr.length;  //nameLen에 nameArr의 값들을 대입
        SalaryTest[] st = new SalaryTest[nameLen];  //객체를 만들고 nameLen배열을 넣는다

        for (int i = 0; i < nameLen; i++) {
            st[i] = new SalaryTest(nameArr[i]); //각 직원들의 첫번째 연봉을 정한다
            st[i].calcRandomSalary(10);  //직원들의 10년째 연봉을 적용한다
            st[i].printRandomSalary();  //10년차의 연봉을 출력한다  (만약 st[i].calcRandomSalary(6)을 입력했다면 6년차의 연봉이 나온다)
        }
    }
}