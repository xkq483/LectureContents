import java.util.HashMap;
import java.util.Map;

class Student{
    int age;
    String name;
    public Student (int age, String name){
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
public class Review0602HashMap {
    public static void main(String[] args) {
        Map<Integer, Student> st = new HashMap<Integer, Student>();
        // Map : key<Integer>와 value<Student>가 분리됨
        // key는 인덱스가 아니라 순서 상관없이 그냥 사물함 열쇠일 뿐
        // value는 사물함에 들어있는 물건(value는 아무거나 넣을 수 있음(클래스, Map이나 아무거나))

        st.put(1, new Student(42, "Bob"));
        st.put(2, new Student(33, "Chris"));
        st.put(3, new Student(29, "David"));
        // Map에서 값을 넣을 떄 put을 사용

        System.out.println(st);

        st.remove(2);
        // key 2의  value를 삭제

        System.out.println(st);

        st.put(3, new Student(77, "Jesica"));
        // key 3의 value를 다시 덮어씌움

        System.out.println(st);

        // Entry<키 데이터타입, 밸류 데이터타입>
        for(Map.Entry<Integer, Student> s : st.entrySet()){
            // entry = key + value
            // st의 key와 value값을 s에 대입한다
            Integer key = s.getKey();
            Student value = s.getValue();
            System.out.println("key = " + key + ", value = " + value);
            // sout에서 key순서대로 정렬해서 출력해줌

        }













    }
}
