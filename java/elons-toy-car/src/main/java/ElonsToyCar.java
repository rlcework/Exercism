public class ElonsToyCar {

    private int totalDistance;
    private int batteryLeft = 100;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
       return String.format("Driven %d meters",totalDistance);
    }

    public String batteryDisplay() {
        if (this.batteryLeft == 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", batteryLeft);
    }
    public void drive() {
        if (this.batteryLeft != 0) {
            this.totalDistance += 20;
            this.batteryLeft -= 1;

        }
    }
}
