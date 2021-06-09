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
public class _7th_HashMapEdu {
    public static void main(String[] args) {
        // Map의 특성중 하나가 key와 value가 분리됨
        // Map<Key, Value> > 특별히 특정 데이터타입을 지켜줄 필요가 없다.
        //                 > 배열, ArrayList, Integer, String.. 다 가능.
        Map<Integer, Student> st = new HashMap<Integer, Student>();
        // 앞에 오는 숫자는 인덱스가 아니다. 단지 사물함을 여는데 필요한 열쇠일 뿐.
        st.put(7, new Student(42, "Bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(44, new Student(27, "Denis"));
        st.put(3, new Student(29, "David"));
        System.out.println(st);

        st.remove(2);
        System.out.println(st); // Christ 사라짐

        st.put(3, new Student(77, "Jesica"));
        System.out.println(st); // David이 Jessica로 대체

        for (Map.Entry<Integer, Student> s : st.entrySet()) {
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
        System.out.println(st.entrySet());
        System.out.println(st);

        Map<String, String> strMap = new HashMap<String, String>();
        strMap.put("열쇠", "아무거나 다 된다");
        // 추상화의 연장선 관점에서 아래 사항을 준수하여 코딩하면
        // HashMap에서 어떤 상황에서든 이 방식으로 key, value값을 얻을 수 있다.
        // Entry<키 데이터타입, 밸류 데이터타입> 형식은 지켜야 한다.
        for (Map.Entry<String, String> map : strMap.entrySet()) {
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
