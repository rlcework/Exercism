class NeedForSpeed {

    public int speed;
    public int batteryDrain;
    public int batteryLeft = 100;
    public int totalDistance;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
    if (batteryLeft ==0){
        return true;
    }
    return false;
    }

    public int distanceDriven() {
        return totalDistance;
    }

    public void drive() {
       batteryLeft -= batteryDrain;
       if (batteryLeft != 0){
            totalDistance += speed;
        }
    }

    public static NeedForSpeed nitro() {
      return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;

    RaceTrack(int distance) {
        this.distance=distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        NeedForSpeed total = new NeedForSpeed(car.speed, car.batteryDrain);

        int x = (total.batteryLeft/total.batteryDrain)*total.speed;
        if (distance <= x) {
            return true;
        }
        return false;
    }
}
