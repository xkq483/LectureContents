import java.util.HashMap;
import java.util.Map;

class Student{
    int age;
    String name;

    public Student(int age, String name){
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


public class HashMapTest {
    public static void main(String[] args) {
        /*
        Map의 특성중 하나가 key와 value가 분리됨
        특별히 특정데이터타입을 지켜줘야 하는 것은 없다.
        key,value 데이터타입에 제약이 없다는 말
         */
        Map<Integer,Student> st = new HashMap<Integer,Student>();

        //키와 밸류를 설정할때 put()을 사용한다.
        st.put(1,new Student(26,"여인준"));
        st.put(2,new Student(25,"제임스"));
        st.put(3,new Student(42,"홀딩"));

        System.out.println(st);
        //remove()를 사용해서 key값을 매개변수로 value값을 지울수있다.
        st.remove(2);

        System.out.println(st);

        //put()을 통해 덮어쓰기 또한가능하다.
        st.put(3,new Student(30,"데이빗"));

        System.out.println(st);

        //HashMap for-each문
        //추상화의 연장선 관점에서 아래 사항을 준수하여 코딩하면 어떤상황에서든 key,value값을 얻을수 있음
        //Entry<키 데이터타입, 밸류 데이터타입> 형식을 지켜야한다.
        for(Map.Entry<Integer,Student> s: st.entrySet()){
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = "+key+" value = "+value);
        }

    }
}
