class Leekeonhee {
    private String name;
    private int age;
    private float height;
    private int property;

    public Leekeonhee(String name, int age, float height, int property) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.property = property;
    }

    @Override
    public String toString() {
        return "Leekeonhee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", property=" + property +
                '}';
    }
}
    class Leejaeyong extends Leekeonhee{

       private String company;

        public Leejaeyong(String name, int age, float height, int property, String company) {
            super(name, age, height, property);
            this.company = company;
        }

        @Override
        public String toString() {
            return "Leejaeyong{" + super.toString() +
                    "company='" + company + '\'' +
                    '}';
        }
    }



public class Quiz53 {
    public static void main(String[] args) {
Leekeonhee lkh = new Leekeonhee("이건희", 80, 170.7f, 100000000);
        System.out.println(lkh);
        System.out.println();
  Leejaeyong ljy = new Leejaeyong("이재용", 50, 175.5f, 1000, "삼성");
        System.out.println(ljy);
    }

}
