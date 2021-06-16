class Person{

    public boolean getName() {

        return false;
    }
}
public class Testsub {
    public static void main(String[] args) {

        Person[] pArr = new Person[3];
        pArr[3].getName();
        for (int i = 0; i < pArr.length; i++) {
            System.out.println(pArr[i].getName());

        }
    }
}
