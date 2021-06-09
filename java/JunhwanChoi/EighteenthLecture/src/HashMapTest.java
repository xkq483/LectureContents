import java.util.HashMap;
import java.util.Map;


class Student
{
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
        // Map의 특성중 하나가 key와 value가 분리됨
        // Map<key, Value>
        // 특별히 특정 데이터타입을 지켜줘야 하는 것은 없다.
        // 나는 "열쇠"를 키로 사용하고 "으아아앜을" 쓸거야! 하면 쓰면된다


        Map<Integer, Student> st= new HashMap<Integer, Student>();

        st.put(1, new Student(15,"홍길동")); //앞에 오는 1,2,3,은 인덱스를 뜻하는게 아님
        st.put(2, new Student(20,"이몽룡")); //단지 사물함을 여는데 필요한 열쇠일뿐
        st.put(3, new Student(30,"크리스"));
        System.out.println(st);

        st.remove(2); // 삭제하기
        System.out.println(st);

        st.put(3, new Student(77,"제임스")); // 덮어 씌우기
        System.out.println(st);


        // HashMap을 사용할 때는 이 방식이 변하지 않는다
        // 추상화의 연장선 관정에서 아래 사항을 준수하여 코딩하면 어떤 상황에서든 key, value 값을 얻을 수 있습니다.
        // Entry<키 데이어타입, 벨류 데이터타입> 형식은 지켜야함!!!@@@@
        for(Map.Entry<Integer, Student> s: st.entrySet())
        {
            Integer key= s.getKey();
            Student value = s.getValue();
            System.out.println("key= " +key + ", value= "+ value);
        }

        System.out.println("=========데이터타입은 뭐든 구현가능===========");

        Map<String, Student> strMap= new HashMap<String, Student>();

        strMap.put("열쇠",new Student(26,"최준환"));

        System.out.println(strMap);

        strMap.remove("열쇠");

        System.out.println(strMap);




    }
}
