import java.util.ArrayList;

public class Exam {
    public static void main(String[] args) {
        ArrayList<String> shopping= new ArrayList<String>();

        shopping.add("톰");
        shopping.add("로날드덕");
        shopping.add("제리");
        shopping.add("피트");

        for(String name :shopping){
            System.out.println(name);
        }

    }
}
