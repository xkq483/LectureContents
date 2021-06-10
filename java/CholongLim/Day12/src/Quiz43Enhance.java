class Salary{
    final float PERCENT = 0.01f;
    String name;
    int yearSalary;

    public Salary(String name) {
        this.name = name;
        yearSalary = (int)(Math.random() * 1101 + 2400);
    }
    public void increSalary() {
        float increSalary;
        increSalary = (float) (Math.random() * 20 + 1);
        yearSalary = (int)(yearSalary + yearSalary * increSalary * PERCENT);
    }

    public void printSalary() {
        System.out.printf("%s의 현재 연봉은 = %d\n", name, yearSalary);
    }

    public int getYearSalary(){
        return yearSalary;
    }
}

//.. 가상설계 작성..//
//1. 메인에 10명분의 직원 이름을 정하여 코드를 작성한다.
//2. 생성자를 통하여 연봉(년)을 작성 2400 ~ 3500 만원 사이의 랜덤값 필요
//3. 메소드를 활용하여 10년치 연봉에 대한 인상율을 구하는 값을 설정, 1 ~ 20%
//4. 출력 메소드를 설정하고 출력을 받을 준비
//5. 메인을 통하여 10년치 연봉 인상 값 도출

public class Quiz43Enhance {
    public static void main(String[] args) {

        String name[] = {"나나","다다","라라","마마","바바",
                         "사사","차차","카카","파파","하하"};

        int len = name.length;
        Salary[] peopleName = new Salary[len];

        for(int i = 0 ; i < len ; i++) {
            peopleName[i] = new Salary(name[i]);
        }

        for (int i = 0; i < 10 ; i++){
            int sum = 0;
            for(int j = 0 ; j < len; j++){
                peopleName[i].increSalary();
                sum += peopleName[i].getYearSalary();
                peopleName[i].printSalary();
            }

            float mean = sum / (float)len;
            System.out.println("올해 연봉 평균 = " + mean);
        }


    }
}
