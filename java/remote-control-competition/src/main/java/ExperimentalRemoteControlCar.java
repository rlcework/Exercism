public class ExperimentalRemoteControlCar implements RemoteControlCar, Cloneable {
    private int distance;
    public void drive() {
        this.distance += 20;

    }

    public int getDistanceTravelled() {
        return distance;
    }
}
