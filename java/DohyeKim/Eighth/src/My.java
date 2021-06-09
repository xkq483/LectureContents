class Cat{
    String name;
    String type;
    int level;

    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    String getType(){
        return type;
    }
    void setType(String type){
        this.type = type;
    }

    int getLevel(){
        return level;
    }
    void setLevel(int level){
        this.level = level;
    }
}

public class My {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("부케");
        c.setType("큐트");
        c.setLevel(12);

        System.out.printf("%s은 %s타입이고 %d레벨이다.\n",c.getName(),c.getType(),c.getLevel());
    }
}
//해결!
//객체는 메모리에 상태가 올라가있는 애들이다.
//메모리의 코드영역은 실행할 프로그램을 코드가 저장되는 영역
//
