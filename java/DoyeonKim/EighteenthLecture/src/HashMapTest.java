/* import java.util.HashMap;
import java.util.Map;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String ToString() {
     return "Student{" +
     "age=" + age +
     ", name='" + name + '\'' +
     '}';
    }
}


public class HashMapTest {
    public static void main(String[] args) {


        //Map의 특성중 하나가 key와 value가 분리됨
        //Map<Key, Volue>
        //특별히 특정 데이터 타입을 지켜줘야 하는것은 없다.
        // 나는 "열쇠"를 키로 사용하고 " 으아아악"을 값으로 쓸거야! 하고 쓰면 된다
        Map<Integer, Student> st = new HashMap<Integer, Student>();
        //앞에 오는 숫자는 인덱스가 아니다.
        //단지 사물함으 여는데 필요한 열쇠일뿐뿐
       st.put(7, new Student(42, "bpb"));
        st.put(2, new Student(12, "Chris"));
        st.put(3, new Student(55, "David"));

        System.out.println(st);

        st.remove(2);

        System.out.println(st);

        st.put(3, new Student(77,"jacica"));

        System.out.println(st);

        //Entry는 한세트..?
        for (Map.Entry<Integer, Student> s : st.entrySet())  {
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ",value = " + value);

        }
    }
}


 */