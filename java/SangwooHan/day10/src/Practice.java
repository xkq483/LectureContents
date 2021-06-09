class hi{

    hi(){
        System.out.println("안녕");
    }

    public void nicetomeetyou(){
        System.out.println("반갑다.");
    }
    public void howareyou(){
        System.out.println("어떻게지내?");
    }

}
public class Practice {
    public static void main(String[] args) {
        hi td = new hi();
        td.nicetomeetyou();
        td.howareyou();
    }
}
