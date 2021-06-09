package pk1;


import pk2.Parents;

public class Child extends Parents {
    public void Print() {
//        System.out.println(pr.prv); // 불가능
        System.out.println(pub); //가능
//        System.out.println(pr.def); // 불가능
        System.out.println(prt); //자손 패키지 가능
    }
}
