class StudyStatic{

    public final int _FINAL = 5;
    public static int _static = 5;


    public static void printout_Static(){
        System.out.println("this is static");
    }
    public void printOut_NoneStatic(){
        System.out.println("this is not a static");
    }
}

public class _2nd_Static {
    public static void main(String[] args) {

        StudyStatic.printout_Static();
        //StudyStatic.printout_NoneStatic();

        StudyStatic instanceS = new StudyStatic();
        instanceS.printOut_NoneStatic();
    }
}
