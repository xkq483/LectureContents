import java.util.Scanner;

class cheese{
int age;
String name;
String  home;
String  color;

int getAge()
{
    return age;
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
public class Cat {
    public static void main(String[] args) {
       cheese d = new cheese();
       d.setAge(3);
       d.setColor("하얀");
       d.setHome("길바닥");
       d.setName("나비");

        System.out.printf("안녕하세요 제이름은%s구요저희집은%s입니다ㅠ저는%s색이구요나이는%d입니다 " +
                "잘부탁드립니다\n",d.getName(),d.getHome(),d.getColor(),d.getAge());



    }
}

