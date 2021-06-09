class Person{
    int age;
    String name;
    String major;

    int getAge(){
        return  age;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name= name;
    }

    String getMajor(){
        return  major;
    }
    void setMajor(String major){
        this.major= major;
    }
}
public class classclass {
    public static void main(String[] args) {
        Person d = new Person();
        d.setAge(26);
        d.setName("한댕댕이");
        d.setMajor("학생");

        System.out.printf("%s은 %s이고, 그의나이%d이였다\n",d.getName(),d.getMajor(),d.getAge());


    }
}
