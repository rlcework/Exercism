class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distance;
    private int vitories;

    public void drive() {
        this.distance += 10;

    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
     return vitories;
    }

    public void setNumberOfVictories(int vitories) {
        this.vitories = vitories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(o.getNumberOfVictories(), getNumberOfVictories());

    }
}
