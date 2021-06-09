class LeeGunHee {
    int money;
    int stock;


    public LeeGunHee(int money, int stock) {
        this.money = money;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "LeeGunHee{" +
                "money=" + money +
                ", stock=" + stock +
                '}';
    }
}

    class LeeJaeYoug extends LeeGunHee {
        private int sentences;

        public LeeJaeYoug(int money, int stock, int sentences){
            super(money,stock);
            this.sentences = sentences;
        }


        @Override
        public String toString() {
            return "LeeJaeYoug{" +
                    "money=" + money +
                    ", stock=" + stock +
                    ", sentences=" + sentences +
                    '}';
        }
    }


public class Quiz_53 {
    public static void main(String[] args) {
        LeeGunHee lee = new LeeGunHee(10000,100000);

        System.out.println(lee);

        LeeJaeYoug j = new LeeJaeYoug(5000,50000,500);

        System.out.println(j);

    }
}
