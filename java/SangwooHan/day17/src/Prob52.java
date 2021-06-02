import java.math.BigInteger;

class 이건희 {
    BigInteger money;
    String company;

    public 이건희(BigInteger money, String company) {
        this.money = money;  //매개변수받은 10조와 삼성그룹을 여기에 집어넣는다.
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
    String recentInvest; //Class 이재용 extends 이건희 라는건 이재용 클래스가 이건희 클래스의정보를 상속받는다. 라는뜻이다.

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

public class Prob52 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("10000000000000");
        // 빅넘클래스안에 10조를 넣었다.
        이건희 samsung = new 이건희(bigNum,"삼성그룹");
        //이건희를 객체화 시킬때, 10조와 삼성그룹을 인자값으로 넘겨준다.

        이재용 newSamsung = new 이재용(bigNum.multiply(BigInteger.TEN),
                "삼성전자", "바이오 사업");

        System.out.println(samsung);
        System.out.println(newSamsung);
    }
}
