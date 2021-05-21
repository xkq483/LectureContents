import java.util.Scanner;

class ScanTest {
    String name;
    Scanner scan;
    ScanTest () {

        scan = new Scanner(System.in);

    }

    void enterName () {
        System.out.print("이름은 입력하세요 : ");
        String a = scan.nextLine();`
        System.out.println("당신의 이름은 : " + a + "입니다. ");
    }
}


public class PracticeTest {
    public static void main(String[] args) {
        ScanTest st = new ScanTest();

        st.enterName();

    }

}
