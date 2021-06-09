interface  Button {
    public void turnON ();
    public void turnOFF ();
}

    class right{
        Button LED = new Button() {
            @Override
            public void turnON() {
                System.out.println("LED불을킨다.");
            }
            @Override
            public void turnOFF() {
                System.out.println("LED 불을끈다.");
            }
        };
        Button lamp = new Button() {
            @Override
            public void turnON() {
                System.out.println("램프를킨다");
            }

            @Override
            public void turnOFF() {
                System.out.println("램프를끈다.");
            }
        };
        public  void Test(){
            Button  sun = new Button() {
                @Override
                public void turnON() {
                    System.out.println("해가 뜬다");
                }

                @Override
                public void turnOFF() {
                    System.out.println("해가진다.");
                }
            };
            LED.turnON();
            LED.turnOFF();
           sun.turnON();
            sun.turnOFF();
        }
        public  void Test2(){
            lamp.turnON();

        }

        }





public class Prob54 {
    public static void main(String[] args) {
     right at = new right();
     at.Test();
    }
}
