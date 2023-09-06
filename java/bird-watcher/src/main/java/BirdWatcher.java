import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] = birdsPerDay[6] + 1;
    }

    public boolean hasDayWithoutBirds() {

        for (int i = 0; i <= 6; i++) {
            if (birdsPerDay[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = 7;
        }
        int sum = 0;
        int j = 0;
        for (int i = 0; i < numberOfDays; i++) {
            sum = sum + birdsPerDay[i];
            j++;
            if (j == numberOfDays) {
                break;
            }
        }
        return sum;
    }

    public int getBusyDays() {
        int total = 0;
        for (int allBirdsPerDay : birdsPerDay) {
            if (allBirdsPerDay >= 5) {
                total++;
            }
        }
        return total;
    }
}
