import java.math.BigInteger;

class LeeKunhee {
    BigInteger money;
    String company;

    public LeeKunhee(BigInteger money, String company){
        this.money = money;
        this.company = company;
    }

    @Override
    public String toString() {
        return "LeeKunhee{" +
                "money=" + money +
                ", company='" + company + '\'' +
                '}';
    }
}
class LeeJaeyong extends LeeKunhee{
    String recentInvest;


    public LeeJaeyong(BigInteger money, String company, String recentInvest) {
        super(money, company);
        this.recentInvest = recentInvest;



    }
    @Override
    public String toString() {
        return "LeeJaeyong{" +
                "money=" + money +
                ", company='" + company + '\'' +
                ", recentInvest='" + recentInvest + '\'' +
                '}';
    }
}

public class Quiz0601Prob53 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("100000000000000");
        LeeKunhee samsung = new LeeKunhee(bigNum, "삼성그룹");

        LeeJaeyong newSamsung = new LeeJaeyong(bigNum.multiply(BigInteger.TEN),
                "삼성전자", "바이오사업");

        System.out.println(samsung);
        System.out.println(newSamsung);















    }
}
