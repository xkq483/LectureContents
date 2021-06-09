import java.math.BigInteger;

class LeeKunHee{
    private long assets;
    private String chairMan;

    public LeeKunHee(long assets, String chairMan) {
       this.assets = assets;
        this.chairMan = chairMan;
    }

    @Override
    public String toString() {
        return "LeeKunHee{" +
                " assets=" + assets +
                ", chairMan=" + chairMan +
                '}';
    }
}
class LeeJaeYong extends LeeKunHee{
private String vicechairman;

    public LeeJaeYong(long assets, String chairMan, String vicechairman) {
        super(assets, chairMan);
        this.vicechairman = vicechairman;
    }

    @Override
    public String toString() {
        return "LeeJaeYong{" +
                " ,super.LeeKunHee() = " + super.toString()+
                " ,vicechairman=" + vicechairman +
                '}';
    }
}






public class Samsung {

    public static void main(String[] args) {

    LeeJaeYong ljy = new LeeJaeYong(99999999,"회장","부회장");
        System.out.println(ljy);
    }
}
