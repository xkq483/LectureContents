import java.math.BigInteger;

class SeniorLee {
    private BigInteger property;
    private float shares;
    private String position;

    public SeniorLee() {
        property = new BigInteger("1000000000000");
        shares = 17.53f;
        position = "ChairMan";
    }
    public BigInteger getProperty() {
        return property;
    }
    public float getShares() {
        return shares;
    }
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "SeniorLee's property : " + property + ", shares : " + shares + ", position : " + position;
    }

}
class JuniorLee extends SeniorLee{
    private BigInteger inheritanceTax;
    private float sharesTax;
    private String position;

     public JuniorLee(String position) {
         inheritanceTax = new BigInteger("500000000");
         sharesTax = 5.4f;
         this.position = position;

     }

    @Override
    public String toString() {
        return "JuniorLee's property : " + getProperty().min(inheritanceTax) +
                ", shares : " + (getShares()-sharesTax) +
                ", position : " + position;
                //상속받은 클래스의 get메소드를 사용해 값을 넣을 수 있다!
     }

}


public class Prob53 {
    public static void main(String[] args) {
        SeniorLee sl = new SeniorLee();
        System.out.println(sl);

        JuniorLee jl = new JuniorLee("viceChairMan");
        System.out.println(jl);

    }
}
