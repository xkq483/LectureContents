class LeeKunHee{
    private String company;
    private String lastName;
    private int money;
public LeeKunHee(String company, String lastName, int money){
    this.company = company;
    this.lastName = lastName;
    this.money = money;

  }

    @Override
    public String toString() {
        return "LeeKunHee{" +
                "company='" + company + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                '}';
    }
}
class LeeJaeYong extends LeeKunHee{
    private int age;
    private int height;

    public LeeJaeYong(String company, String lastName, int money, int age, int height) {
        super(company, lastName, money);
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "LeeJaeYong{" +
                "age=" + age +
                ", height=" + height +
                '}';
    }
}


public class Prob53 {
    public static void main(String[] args) {
        LeeKunHee lkh = new LeeKunHee("samSung", "Lee", 1000000000 );
        System.out.println(lkh);

        LeeJaeYong ljy = new LeeJaeYong("삼성", "이", 10101010,50,180);
        System.out.println(ljy);

    }
}
