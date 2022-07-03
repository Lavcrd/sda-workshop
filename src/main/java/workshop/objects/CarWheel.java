package workshop.objects;

import java.util.Random;

public class CarWheel {

    private float pressure;
    private boolean punctured;

    public CarWheel() {
        this.pressure = 2.5F;
        this.punctured = false;
    }

    public void wearingOutTheTire() {
        Random rd = new Random();
        for (int i = 0; i < 20; i++) {
            if (pressure == 0) break;

            int rng = rd.nextInt(10);
            int rng2 = rd.nextInt(4);

            if (rng < 3) {
                pressure -= 0.1;
            } else if (rng == 8) {
                pressure -= 0.2;
            }

            if (pressure < 1.5) {
                if (rng2 < 1) {
                    punctured = true;
                    pressure = 0;
                }
            }
        }
    }

    //getter
    public float getPressure() {
        return pressure;
    }

    public boolean isPunctured() {
        return punctured;
    }

    //setter
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setPunctured(boolean punctured) {
        this.punctured = punctured;
    }

    //tostring


    @Override
    public String toString() {
        return "CarWheel{" +
                "pressure=" + pressure +
                ", punctured=" + punctured +
                '}';
    }
}
