import java.util.HashMap;
import java.util.Map;

class Car {
    private int speed;
    private String color;
    private String brand;
    Map<Integer, Car> carMap;

    public Car() {}

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand : " + brand +
                ", color : " + color +
                ", speed : " + speed +
                "}";
    }

}

public class HashMapPrac {
    public static void main(String[] args) {
        Car cr = new Car();
        cr.carMap = new HashMap<Integer, Car>();

        cr.carMap.put(1, new Car("Ford", "Yellow", 100));
        cr.carMap.put(2, new Car("Lambo", "Red", 250));

        //cr.carMap.put(2, new Car("Rerarri", "Red", 250));
        //덮어쓰기가 된다.

        System.out.println(cr.carMap);

        for(Map.Entry<Integer, Car> set : cr.carMap.entrySet()) {
            Integer key = set.getKey();
            Car value = set.getValue();
            System.out.println("key" + key + ", value : " + value);
        }
        //이렇게 for문으로도 출력이 가능하다.





    }
}
