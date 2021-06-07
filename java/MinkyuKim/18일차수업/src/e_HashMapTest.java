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


public class e_HashMapTest {
    public static void main(String[] args) {

        // Map의 특성중 하나가 key와 value가 분리됨
        // Map<Key, Value>
        // 특별히 특정 데이터타입을 지켜줘야 하는 것은 없다.
        // 나는 "열쇠"를 키로 사용하고 "으아아앜!"을 값으로 쓸거야. 하면 쓰면 된다.
        Map<Integer, Student> st = new HashMap<Integer, Student>();

        //++ HashMap에 값을 집어넣는 방법 객체명.put()
        //++ st.put()
        // 앞에오는 1, 2, 3은 인덱스가 아니다.
        // 단지 사물함을 여는데 필요한 열쇠일 뿐이다.
        st.put(1, new Student(42, "Bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(3, new Student(29, "David"));

        System.out.println(st);

        //++ 2번항목이 지워짐
        st.remove(2);
        System.out.println(st);

        //++ ArrayList에서는 set으로 설정하는데 HashMap에서는 다시 지정 가능
        st.put(3, new Student(77, "Jesica"));
        System.out.println(st);

        //++ key 값과 student라는 벨류값이 한 묶음
        //++ Entrey => key와 value
        for(Map.Entry<Integer, Student> s : st.entrySet()) {
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        // 나는 "열쇠"를 키로 사용하고 "으아아앜!"을 값으로 쓸거야. 하면 쓰면 된다.
        Map<String, String> strMap = new HashMap<String, String>();

        strMap.put("열쇠", "으아아앜!");

        // HashMap 을 사용할때는 이 방식이 변하지 않습니다.
        // 추상화의 연장성 관점에서 아래 사항을 준수하여 코딩하면 어떤 상황에서든 key, valye 값을 얻을 수 있습니다.
        // Etnry<키 데이터타입, 벨류 데이터타입> 형식은 지켜주세요.
        for(Map.Entry<String, String> map : strMap.entrySet()) {
            //++ key값을 얻겠다. Value값을 얻겠다.
            String key = map.getKey();
            String value = map.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
        //++ Map<> HashMap<>은? Map.Entry<>의 String들은?
        //++ entryset은 put(열쇠, 으아아앜) 값을 가져오기?



    }
}
