class GunHee {
    private String name;
    private int age;
    private String rank;

    public GunHee(String name, int age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return "GunHee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}';
    }
}
class JaeYong extends GunHee {

    public JaeYong(String name, int age, String rank) {
        super(name, age, rank);
    }
}
public class Samsung {
    public static void main(String[] args) {
        GunHee g = new GunHee("이건희",88,"회장");
        System.out.println(g);
        JaeYong j = new JaeYong("이재용",50,"부회장");
        System.out.println(j);


    }
}
