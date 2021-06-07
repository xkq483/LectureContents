import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
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
        //Map의 특성중 하나가 key와 value가 분리됨
        //Map<key, value>
        Map<Integer, Student> st = new HashMap<Integer, Student>();

        Map<Integer, String> std = new HashMap<Integer, String>();

        st.put(1, new Student(42, "Bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(3, new Student(37, "David"));

        System.out.println(st);

        st.remove(2);

        System.out.println(st);

        st.put(3, new Student(37, "Jesica"));

        System.out.println(st);

        for (Map.Entry<Integer, Student> s : st.entrySet()) {
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ",value = " + value);

        }

        //나는 "열쇠를 키로 사용하고 으아악 값을 쓴다면?
        Map<String, String> strMap = new HashMap<String, String>();

        strMap.put("열쇠", "으아악");

        //HashMap을 사용할때는 이방식이 변하지 않는다.
        //추상화의 연장장
       for (Map.Entry<String, String> mp : strMap.entrySet()) {
            String key = mp.getKey();
            String value = mp.getValue();
            System.out.println("key = " + key + ",value = " + value);

        }

    }
}
