import java.util.HashMap;
import java.util.Map;

class Student {
    int age;
    String name;

    public Student (int age, String name) {

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
        Map<Integer, Student> st = new HashMap<Integer, Student>();

        st.put(1, new Student(41, "Bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(3, new Student(29,"David"));

        System.out.println(st);

        st.remove(2);
        System.out.println(st);

        st.put(3, new Student(77, "Jessica"));
        System.out.println(st);

        for (Map.Entry<Integer, Student> s : st.entrySet()) {
            Integer key = s.getKey();
            Student value = s.getValue();

            System.out.println("key = " + key + "value = " + value);
        }

        Map<String, String> strMap = new HashMap<String, String>();
        strMap.put("열쇠", "으아아악");
        for (Map.Entry<String, String> map : strMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("key = " + key + "value = " + value);
        }




    }
}
