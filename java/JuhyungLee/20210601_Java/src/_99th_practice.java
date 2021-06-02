class father{
    public father(int a, int b){
        System.out.println(a + b);
    }
}
class son extends father{
    public son(int a, int b){
        super(a, b);
        System.out.println(a - b);
    }
}
public class _99th_practice {
    public static void main(String[] args) {
        son lee = new son(5,10);
    }
}
