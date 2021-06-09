// 문제 53 )
// 클래스 이건희를 만들고 클래스 이재용을 만들어보자!

class LeeKunHee{
    private String company;
    private int money;
    private String firstName;


    public LeeKunHee(String company, int money, String firstName) {
        this.company = company;
        this.money = money;
        this.firstName = firstName;

    }

    @Override
    public String toString() {
        return "LeeKunHee{" +
                "company='" + company + '\'' +
                ", money=" + money +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

class LeeJaeyong extends LeeKunHee{
    private String achievement;
    private String ability;

    public LeeJaeyong(String company, int money, String firstName, String achievement, String ability) {
        super(company, money, firstName);
        // 부모 생성자를 호출하는것
        // 아빠 부른것
        // 나에게 상속을 해준 사람 부르는것

        this.achievement = achievement;
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "LeeJaeyong{" +
                "super.LeeKunHee = " + super.toString() +
                ", achievement='" + achievement + '\'' +
                ", ability='" + ability + '\'' +
                '}';
    }
}

public class Quiz53 {
    public static void main(String[] args) {
        LeeKunHee lgh = new LeeKunHee("삼성",300,"Lee");
        System.out.println(lgh);

        LeeJaeyong ljy = new LeeJaeyong("삼성",300,"Lee",
                "Harvard University","스마트폰");
        System.out.println(ljy);


    }
}

// Q.상속의 항목을 선택해서 받을 수 있나요?
// A.아니요. 빚이 선택이 아닌것처럼 전부 상속받아야합니다.