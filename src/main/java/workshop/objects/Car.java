package workshop.objects;

import java.util.Arrays;

public class Car {
    private final CarWheel[] wheels;

    public Car () {
        this.wheels = new CarWheel[] {
                new CarWheel(),
                new CarWheel(),
                new CarWheel(),
                new CarWheel()
        };
    }

    public CarWheel[] getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + Arrays.toString(wheels) +
                '}';
    }


}
