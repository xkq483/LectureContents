import java.math.BigInteger;

class 이건희 {
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

class 이재용 extends 이건희 {
    String recentInvest;

    public 이재용(BigInteger money, String company, String recentInvest) {
        super(money, company); // 부모 호출, 상속자 호출, 상속을 해준사람을 의미. 여기서는 이건희
        this.recentInvest = recentInvest;
    }

    @Override
    public String toString() {
        return "이재용{" +
                "money=" + money +
                ", company='" + company + '\'' +
                ", recentInvest='" + recentInvest + '\'' +
                '}';
        // private가 붙었다면 getter super로 가져와야함.
    }
}

public class e_quiz54 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("100000000000000");
        이건희 samsung = new 이건희(bigNum, "삼성그룹");

        이재용 newSamsung = new 이재용(bigNum.multiply(BigInteger.TEN),
                "삼성전자", "바이오 사업");

        System.out.println(samsung);
        System.out.println(newSamsung);
    }
}