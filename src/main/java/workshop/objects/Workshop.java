package workshop.objects;

public class Workshop {

    private Car car;

    public Workshop(Car car) {
        this.car = car;
    }

    public static void checkWheels(Workshop workshop) {
        int counter = 0;
        int counter2 = 0;

        CarWheel[] wheels = workshop.car.getWheels();
        for(CarWheel wheel:wheels) {
            boolean punctured = wheel.isPunctured();
            if (punctured) {
                ++counter;
                wheel.setPunctured(false);
                wheel.setPressure(2.5F);
                continue;
            }

            float pressure = wheel.getPressure();
            if (pressure < 2) {
                ++counter2;
                wheel.setPressure(2.5F);
            }
        }
        int cost = theBill(counter, counter2);

        if (cost != 0) {
            System.out.println("The price for fix is: " + cost + "\n" + "Tires replaced: " + counter + "\tTires repressured: " + counter2);
        } else {
            System.out.println("Nothing happened Sir, have a nice day.");
        }
    }

    public static int theBill (int counter, int counter2) {
        return counter * 60 + counter2 * 15;
    }

    public Car getCarBack() {
        return car;
    }

}
