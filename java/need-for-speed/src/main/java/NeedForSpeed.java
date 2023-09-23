class NeedForSpeed {

    public final int speed;
    public final int batteryDrain;
    public int batteryLeft = 100;
    private int totalDistance;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }

    public boolean batteryDrained() {
        return batteryLeft == 0;
    }

    public int distanceDriven() {
        return totalDistance;
    }

    public void drive() {
        batteryLeft -= batteryDrain;
        if (batteryLeft != 0) {
            totalDistance += speed;
        }
    }
}

class RaceTrack {

    private final int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        NeedForSpeed total = new NeedForSpeed(car.speed, car.batteryDrain);

        int x = (total.batteryLeft / total.batteryDrain) * total.speed;
        return distance <= x;
    }
}
