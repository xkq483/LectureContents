class daeng{
    int age;
    String name;
    String  home;
    String  color;

   int getAge()
    {
        return  age;
    }


    void setAge(int age)
    {
      this.age = age;
    }

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getHome()
    {
        return home;
    }
    void setHome(String home){
        this.home = home;
    }

    String getColor(){
        return  color;
    }

    void setColor(String color){
        this.color= color;
    }
}
public class Dog {
    public static void main(String[] args) {
        daeng d = new daeng();
        int age = 6;
        d.setAge(age);
        d.setColor("얼룩");
        d.setHome("길거리");
        d.setName("바둑이");

        System.out.printf("제이름은 %s입니다\n저는항상%s에있습니다\n색깔은 %s이고요\n나이는%s입니다",d.getName(),d.getHome(),d.getColor(),d.getAge());
    }

}

