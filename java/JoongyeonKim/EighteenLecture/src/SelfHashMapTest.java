import java.util.HashMap;
import java.util.Map;

class Student1 {
    int age;
    String name;

    public Student1 (int age, String name){
        this.age=age;
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

public class SelfHashMapTest {
    public static void main(String[] args) {
        Map<Integer, Student1> st = new HashMap<Integer, Student1>();

        st.put(7, new Student1(42, "Bob"));
        st.put(2, new Student1(33, "Chris"));
        st.put(44, new Student1(27, "Denis"));
        st.put(3, new Student1(29, "David"));

        System.out.println(st);

        st.remove(2);

        System.out.println(st);

        st.put(3, new Student1(77, "Jesica"));

        System.out.println(st);

        for (Map.Entry<Integer, Student1> s : st.entrySet()){
            Integer key = s.getKey();
            Student1 value = s.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        Map<String, String> strMap = new HashMap<String, String>();

        strMap.put("열쇠", "으아아아악");

        for(Map.Entry<String, String> map : strMap.entrySet()){
            String key = map.getKey();
            String value =map.getValue();

            System.out.println("key = " + key + ", value = " + value);
        }


    }
}
