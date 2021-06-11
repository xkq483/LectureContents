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
        //Map의 특성중 하나가 key와 value 가 분리됨
        //Map<Key, Value>
        Map<Integer, Student>st = new HashMap<Integer, Student>();

        // 앞에 오는 숫자는 인덱스가 아니다.
        // 단지 사물함을 여는데 필요한 열쇠일 뿐
        st.put(1, new Student(42,"Bob"));
        st.put(2, new Student(33,"Chris"));
        st.put(3, new Student(29,"David"));

        System.out.println(st);

        st.remove(2);

        System.out.println(st);

        st.put(3,new Student(77,"Jesica"));

        System.out.println(st);

        for(Map.Entry<Integer, Student> s : st.entrySet()){
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ",value = " + value);
        }
    }
}
