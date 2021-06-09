import java.math.BigInteger;

/*
//상속문제
// 클래스 이건희를 만들고, 클래스 이재용을 만들어보자

class GunheeLee
{
    private String company;

    public GunheeLee(String company)
    {
        this.company= company;
    }

    @Override
    public String toString() {
        return "GunheeLee{" +
                "company='" + company + '\'' +
                '}';
    }
}
class JaeyongLee extends GunheeLee
{
    private String position;

    public JaeyongLee(String company, String position)
    {
        super(company);
        this.position= position;
    }

    @Override
    public String toString() {
        return "JaeyongLee{" +
                "super.GunheeLee=" + super.toString()+
                "position='" + position + '\'' +
                '}';
    }
}
public class Quiz53 {
    public static void main(String[] args) {

        GunheeLee g= new GunheeLee("삼성");
        System.out.println(g);

        JaeyongLee j= new JaeyongLee("삼성","사장");
        System.out.println(j);

    }
}
*/
class 이건희{
    BigInteger money;
    String company;

    public 이건희(BigInteger money, String company) {
        this.money = money;
        this.company = company;
    }

    @Override
    public String toString() {
        return "이건희{" +
                "money=" + money +
                ", company='" + company + '\'' +
                '}';
    }
}
class 이재용 extends 이건희
{
    String recentInvest;

    public 이재용(BigInteger money, String company, String recentInvest) {
        super(money, company);
        this.recentInvest = recentInvest;
    }

    @Override
    public String toString() {
        return "이재용{" +
                "money=" + money +
                ", company='" + company + '\'' +
                ", recentInvest='" + recentInvest + '\'' +
                '}';
    }
}

public class Quiz53 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("100000000000000");
        이건희 samsung= new 이건희(bigNum,"삼성그룹");

        이재용 newSamsung= new 이재용(bigNum.multiply(BigInteger.TEN),"삼성전자","바이오사업");
        System.out.println(samsung);
        System.out.println(newSamsung);
    }
}
