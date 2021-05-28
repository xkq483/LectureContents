class Animal{
//     2. 클래스란 ?
//    클래스에서 선언된 데이터들은 객체가 사용할 데이터이다.
//    클래스는 객체를 만드는 기능을 가진다.

    String name;
//    name이라는 String 변수,
//    클래스에 의해 생성되는 것 = 객체,
//    클래스에서 선언된 변수는 객체변수

    public void setName(String name) {
        this.name = name;
//        3. 메소드란 ?
//        메소드는 클래스 내에 구현된 함수
//        setName 메소드는 다음과 같다.
//        입력으로 name이라는 문자열을 받고 출력이 없는 형태의 메소드다.
//        메소드가 하는 일은 입력을 가지고 어떠 일을 수행한 다음 결과물을 내놓는 것.
   }
}

public class OOP {
    public static void main(String[] args) {
//        객체는 사용하려고 메모리에 올리는 것으로 아래와 같이 만들며,
//        new는 객체를 생성할 때 사용하는 키워드이다.
//        이는 Animal 클래스의 인스턴스인 cat,즉 Animal의 객체가 만들어진다.
        Animal cat = new Animal();

//        객체와 인스턴스의 차이 ?
//        위 예제에서 cat은 객체이고, cat이라는 객체는 Animal의 인스턴스이다.
//        인스턴스는 특정 객체(cat)이 어떤 클래스(Animal)의 객체인지를 관계 위주로 설명할 때 사용된다.
//        즉, cat은 Animal의 인스턴스이다.


//         1. 변수란 ?
//        아래와 같은 예에서는 a,b를 변수라고 한다.
        int a;   // int(정수) 자료값을 담을 수 있는 변수 a
        String b;   //String(문자열) 자료값을 담을 수 있는 변수 b

//        변수의 이름은 마음대로 지을 수 있지만, 숫자, 특수문자, 자바의 키워드는 변수명으로 사용될 수 없다.
//        ex_ int 2nd (X)  ,  int c@ (X),  int boolean (X) 등


    }
}
