package pk2;

class Print { //접근제어자가 default이다.
    public static void main(String[] args) {
        Parents pr = new Parents();
//        System.out.println(pr.prv); //불가능
        System.out.println(pr.pub);
        System.out.println(pr.def);
        System.out.println(pr.prt);
    }
}
public class Parents { //한클래스 내에는 public 클래스는 하나만 지정가능
    private int prv; //같은클래스
    protected int prt; //같은 패키지 + 자손(다른패키지)
    int def; //같은패키지
    public int pub; //접근제한 없음
    public void ParentsPrint() {
        System.out.println(prv);
        System.out.println(pub);
        System.out.println(def);
        System.out.println(prt);

    }
}
