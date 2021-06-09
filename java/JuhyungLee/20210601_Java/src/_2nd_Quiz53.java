class LeeGunHee{
    int age;
    String sex;
    String residence;
    String belong_to;

    public LeeGunHee(int age, String sex, String residence, String belong_to) {
        this.age = age;
        this.sex = sex;
        this.residence = residence;
        this.belong_to = belong_to;
    }
    @Override
    public String toString() {
        return "LeeGunHee{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", residence='" + residence + '\'' +
                ", belong_to='" + belong_to + '\'' +
                '}';
    }
}
class LeeJaeYong extends LeeGunHee{
    String spouse;
    String position;
    // alt + insert > constructor
    public LeeJaeYong(int age, String sex, String residence, String belong_to,
                      String spouse, String position) {
        super(age, sex, residence, belong_to);
        this.spouse = spouse;
        this.position = position;
    }

    @Override
    public String toString() {
        return "LeeJaeYong{" +
                "age=" + age +
                ", sex='" + sex + '\'' +
                ", residence='" + residence + '\'' +
                ", belong_to='" + belong_to + '\'' +
                ", spouse='" + spouse + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
public class _2nd_Quiz53 {
    public static void main(String[] args) {
        // 클래스 이건희를 만들고 클래스 이재용을 만든다

        LeeGunHee lee1 = new LeeGunHee(87,"male", "용산","삼성");

        LeeJaeYong lee2 = new LeeJaeYong(55, "male", "용산",
                "삼성", "임세령(이혼)", "부사장");

        System.out.println(lee1);
        System.out.println(lee2);
    }
}
