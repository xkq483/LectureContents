class 고양이 {
    int a;
    int p;
    String f;

    int getA() {
        return a;
    }
    void setA(int a) {
        this.a = a;
    }
    int getP() {
        return p;
    }
    void setP(int p) {
        this.p = p;
    }
    String getF() {
        return f;
    }
    void setF(String f) {
        this.f = f;
    }
}
public class i_Quiz33 {
    //고양이
    public static void main(String[] args) {
        고양이 cm = new 고양이();
        cm.setA(13);
        cm.setF("영희");
        cm.setP(3);
        System.out.printf("길고양이가 몇마리있나요? %d / 몇분이서 관리하시나요? %d / 누가 밥을주시나요? %s\n", cm.getA(), cm.getP(), cm.getF());
    }



}
