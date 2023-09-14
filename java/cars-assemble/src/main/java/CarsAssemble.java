public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double s = 0;
        if (speed == 0) {
            s = 0;
        } else if (speed <= 4) {
            s = speed * 221;
        } else if (speed > 4 && speed <= 8) {
            s = (speed * 221) * 0.9;
        } else if (speed == 9) {
            s = (speed * 221) * 0.8;
        } else if (speed == 10) {
            s = (speed * 221) * 0.77;
        }
        return s;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }

}