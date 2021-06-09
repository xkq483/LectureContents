// 43번 문제 다시 풀어보기

class Company1 {
    int salary;
    float increase;
    String name;


    public Company1(String name) {
        this.name = name;
        salary = (int) (Math.random() * 1101 + 2400);
         }

    public void incSalary(int yearSalary){
        for(int i = 0; i < 10; i++){
            salary = (int) (salary + salary * increase);
            randomIncrease();}
    }

    public void incSalary(){
        salary = (int) (salary + salary * increase);
        randomIncrease();
    }

    public void randomIncrease(){
        increase = (float) ((int) (Math.random() * 20 + 1))* 0.01f;

    }

    public void printSalary(){
        System.out.printf("%s의 연봉: %d\n", name, salary);
    }

    public int getSalary() { return salary;}
}


public class Homework0524Prob43 {
    public static void main(String[] args) {

        String name[] = {"A","B","C","D","E","F","G","H","I","J"};
        Company1 c[] = new Company1[name.length];


        for (int i = 0; i < name.length; i++){
            c[i] = new Company1(name[i]);
        }

        for (int i= 0; i <10; i++){

            int sum = 0;

            for(int j = 0; j < name.length; j++){
                c[i].incSalary();
                sum += c[j].getSalary();
                c[i].printSalary(); }

            System.out.printf("%d년차 평균 연봉: %d\n", (i+1), (sum/ name.length));
        }












    }
}
