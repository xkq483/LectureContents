import javafx.print.Collation;

import java.util.*;
import java.util.stream.Collectors;

interface LampMethod {
    public void lightOn();
    public void lightOff();
}
class Lamp implements LampMethod {
    @Override
    public void lightOn() {
        System.out.println("Lamp를 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("Lamp를 끕니다.");
    }
}
class StreetLamp implements LampMethod {
    @Override
    public void lightOn() {
        System.out.println("가로등을 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("가로등을 끕니다.");
    }
}
class Led implements LampMethod {
    @Override
    public void lightOn() {
        System.out.println("LED등을 킵니다.");
    }
    @Override
    public void lightOff() {
        System.out.println("LED등을 끕니다.");
    }
}

class LampMethod2 {
    public void lightOn() {
        System.out.println("독립은 무슨 종속이다!");
    }
    public void lightOff() {
        System.out.println("무조건 우리말에 따르라 ~~!!~!");
    }
}

// 저번에는 클래스 내부에 인터페이스에 대한 객체를 생성한 반면
// 이번에는 implements 를 사용하여 해당 클래스에서
// 인터페이스 내부의 미구현 매서드를 구현해줌으로서 동작하게 된다.
class Lamp2 extends LampMethod2 {

}

class StreetLamp2 extends LampMethod2 {

}

class Led2 extends LampMethod2 {

}

class Student   {
    int age;
    String name;

    public Student (int age, String name)   {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


public class Review18_1 {
    public static void main(String[] args) {
        int[] num = {3, 7};

        Integer[] numAttray = {3, 7, 33, 77, 333};

        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(numAttray));

        System.out.println(numList);

        System.out.println("근데 나는 int[] 키워드 ㅂ형식의 배열도 ArrayList에 저장하고 싶은데?");

        ArrayList<Integer> numList2 = new ArrayList<Integer>(
                // num에 있는 특정 데이터 타입들을 쭉 가져와서 박스에 넣어놓고
                // 전부 수집한 다음에 List를 바꾸세요 라는 의미를 가진다. //?
                Arrays.stream(num).boxed().collect(Collectors.toList())
        );

        Float[] floatArray = { 3.3f, 4.4f, 5.5f, 6.6f, 7.7f };

        ArrayList<Float> floatList = new ArrayList<Float>(Arrays.asList(floatArray));

        System.out.println(floatList);

            Lamp lamp = new Lamp();
            lamp.lightOn();
            lamp.lightOff();
            StreetLamp streetLamp = new StreetLamp();
            streetLamp.lightOn();
            streetLamp.lightOff();
            Led led = new Led();
            led.lightOn();
            led.lightOff();

        Set<String> s = new HashSet<String >();

        String[] sample = {"안녕", "하이", "헬로", "안녕", "안녕"};

        for (String str : sample)   {
            if (!s.add(str))    {
                System.out.println("중복되었습니다 " +str);
            }
        }

        System.out.println(s.size() + "중복을 제외한 단어: " +s);

        //
        //HashSet의 핵심 특성중 하나 Java내에 존재하는 Collection중 가장 빠른속도를 자랑한다
        // 또한 HashSet의 집합(Set)의 특성을 가지고 있어 중복을 허용하지 않는다.
        // 중요 : 순서가 중요하다면 ArrayList를 사용
        //       순서가 별로 중요하지 않고 빠른 처리를 원한다면 HashSet 사용



        Lamp2 lamp = new Lamp2();

        lamp.lightOn();
        lamp.lightOff();

        StreetLamp2 streetLamp = new StreetLamp2();

        streetLamp.lightOn();
        streetLamp.lightOff();

        Led2 led = new Led2();

        led.lightOn();
        led.lightOff();

        //얘네들은 spring 가서도 많이 쓰게 될 거야
        //Map의 특성 중 하나가 key와 value가 분리됨
        Map<Integer, Student> st = new HashMap<Integer, Student>();


        //앞에 오는 숫자는 인덱스가 아니다.
        // 단지 사물함을 여는데 필요한 열쇠일 뿐
        // -> 즉 앞의 숫자는 막 써도 된다고 123 이런 순서대로가 아니라 7 3 6 이 따위로

        st.put(7, new Student(42,"bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(4, new Student(29, "David"));

        System.out.println(st);

        st.remove(2);

        System.out.println(st);

        st.put(3, new Student(77, "Sam"));

        System.out.println(st); //덮어 씌워졌지?

        for (Map.Entry<Integer, Student> s : st.entrySet()) {
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ", vaule = " + value);
        }

        Map<String, String> strMap = new HashMap<String ,String >();

        strMap.put("열쇠", "으아아아아아아악");


        //HashMap을 사용할 때는 이 방식이 변하지 않는다
        //추상화의 연장선 관점에서 아래 사항을 준수하여 코딩하면 어떤 상황에서든 key, value 값을 얻을 수 있다.

        // ** Entry<키 데이터타입, 밸류 데이터타입> 형식은 지켜줘

        for (Map.Entry<String, String> map : strMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("key = " + key + ", vaule = " + value);
        }


    }
}