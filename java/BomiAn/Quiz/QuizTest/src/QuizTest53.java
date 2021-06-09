class GunHeeLee {

    private int age;

   public String name;

    public GunHeeLee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "GunHeeLee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


class  JeaYongLee extends GunHeeLee {

    private float height;
    private String gender;

    public JeaYongLee(int age, String name, float height, String gender) {
        super(age, name);
        this.height = height;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "JeaYongLee{" +
                "super toString = " + super.toString() +
                "height=" + height +
                ", gender='" + gender + '\'' +
                '}';
    }
}

public class QuizTest53 {
    public static void main(String[] args) {
        GunHeeLee gh = new GunHeeLee(72, "이건희");
        System.out.println(gh);
        
        JeaYongLee jy = new JeaYongLee(52, "이재용", 175.5f, "male");
        System.out.println(jy);
    }
}
