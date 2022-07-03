package workshop;

import workshop.objects.Car;
import workshop.objects.CarWheel;
import workshop.objects.Workshop;

import static workshop.objects.Workshop.checkWheels;

public class CarDrivingDemo {
    public static void main(String[] args) {
        Car car = new Car();
        CarWheel[] wheels = car.getWheels();

        for (CarWheel wheel : wheels) {
            wheel.wearingOutTheTire();
        }

        System.out.println("\n" + car + "\n");

        Workshop workshop = new Workshop(car);
        checkWheels(workshop);

        Car carAfter = workshop.getCarBack();
        System.out.println("\n" + carAfter);
    }
}
