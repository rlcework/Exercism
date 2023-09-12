public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public  int remainingMinutesInOven(int x) {
        return expectedMinutesInOven()-x;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public  int preparationTimeInMinutes(int y) {
        return 2*y;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int y, int z) {
        return preparationTimeInMinutes(y) + z;
    }
}