class A {
    int a = 10;

    void b ()   {
        System.out.println("A");
    }
}

class AA extends A  {
    int a = 20;

    void b ()   {
        System.out.println("AA");
    }
    void c ()   {
        System.out.println("C");
    }
}


class Car   {
    private float rpm;
    private float fuel;
    private float pressure;
    private String color;


    public float getRpm() {
        return rpm;
    }
    public void setRpm(float rpm) {
        this.rpm = rpm;
    }
    public float getFuel() {
        return fuel;
    }
    public void setFuel(float fuel) {
        this.fuel = fuel;
    }
    public float getPressure() {
        return pressure;
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class SportsCar extends Car{
    public Boolean getBooster() {
        return booster;
    }

    public void setBooster(Boolean booster) {
        this.booster = booster;
    }

    private Boolean booster;

}


class Vehicle   {
    private float rpm;
    private float fuel;
    private float pressure;
    private String color;



    public Vehicle(float rpm, float fuel, float pressure, String color) {
        this.rpm = rpm;
        this.fuel = fuel;
        this.pressure = pressure;
        this.color = color;
    }//생성자

    @Override
    public String toString() {
        return "Vehicle{" +
                "rpm=" + rpm +
                ", fuel=" + fuel +
                ", pressure=" + pressure +
                ", color='" + color + '\'' +
                '}';
    }
}

class Airplane extends Vehicle  {
    private float aileron;
    private float pitch;
    private float rudder;

    public Airplane (float rpm, float fuel, float pressure, String color,
                     float aileron, float pitch, float rudder) {
        super(rpm, fuel, pressure, color);
        //super()는 무엇이 되었든 상속자인 부모를 호출한다.
        //super()만 적혀 있으니 생성자를 호출하게 된다

        this.aileron = aileron;
        this.pitch = pitch;
        this.rudder = rudder;


    }
    @Override
    public String toString() {
        return "Airplane{" +
                "super.Vehicle()=" + super.toString() +
                "aileron=" + aileron +
                ", pitch=" + pitch +
                ", rudder=" + rudder +
                '}';
    }
}


interface Remocon   {
    public void turnOn();
    public void turnOff();

}


class AbstractTest  {
    Remocon rc = new Remocon() {
        @Override
        public void turnOn() {
            System.out.println("나는 rc 자동차용 리모콘이야! rf 송수신기가 지금 활성화됐어");
        }

        @Override
        public void turnOff() {
            System.out.println("its time to goodbye! rf 송수신기 off");
        }
    };
    public void testMethod()  {
        Remocon tv = new Remocon() {
            @Override
            public void turnOn() {
                System.out.println("난 tv다 am/fm 신호 수신 중 방송 보자");
            }

            @Override
            public void turnOff() {
                System.out.println("AM/FM 신호 차단 ㅂㅂ");
            }
        };
    }
    public void testMethod2() {
        rc.turnOn();
    }
}


interface LampMethod {
    public void lightOn();
    public void lightOff();
}

class Lamp {
    LampMethod lamp = new LampMethod() {
        @Override
        public void lightOn() {
            System.out.println("Lamp를 킵니다.");
        }

        @Override
        public void lightOff() {
            System.out.println("Lamp를 끕니다.");
        }
    };
}

class StreetLamp {
    LampMethod streetLamp = new LampMethod() {
        @Override
        public void lightOn() {
            System.out.println("가로등을 킵니다.");
        }

        @Override
        public void lightOff() {
            System.out.println("가로등을 끕니다.");
        }
    };
}

class Led {
    LampMethod led = new LampMethod() {
        @Override
        public void lightOn() {
            System.out.println("LED등을 킵니다.");
        }

        @Override
        public void lightOff() {
            System.out.println("LED등을 끕니다.");
        }
    };
}



public class Review17_1 {
    public static void main(String[] args) {
        ////55. 복습
        //오늘 숙제에 있어서 제일 중요한 부분은 추상화라는 용어입니다.
        //interface를 사용하는 근본적인 이유는 추상화이며
        //많은 소프트웨어 개발자들이 추상화를 위해 목숨을 걸고 있습니다.
        //과연 추상화란 무엇인지 왜 interface가 추상화와 밀접하게 연관되는지
        //어째서 수 많은 개발자들이 추상화에 목숨을 거는지에 대해 고민해봅시다.



        A a = new A();
        a.b();
        System.out.println("A a:  " +a.a);

        AA aa = new AA();
        aa.b();

        SportsCar sc = new SportsCar();

        sc.setRpm(100);
        sc.setFuel(2.5f);
        sc.setPressure(1.0f);
        sc.setColor("Dark Gray");
        sc.setBooster(false);

        System.out.println(sc);

        Vehicle v = new Vehicle(200,1.2f, 1.0f, "Red");

        System.out.println(v);

        Airplane a = new Airplane(1000, 112.5f, 12.3f, "White",
                77.3f, 0.02f, 33.9f);

        System.out.println(a);




        AbstractTest at = new AbstractTest();

        at.testMethod();

        at.testMethod2();



        Lamp lamp = new Lamp();

        lamp.lamp.lightOn();
        lamp.lamp.lightOff();

        StreetLamp streetLamp = new StreetLamp();

        streetLamp.streetLamp.lightOn();
        streetLamp.streetLamp.lightOff();

        Led led = new Led();

        led.led.lightOn();
        led.led.lightOff();



    }
}
