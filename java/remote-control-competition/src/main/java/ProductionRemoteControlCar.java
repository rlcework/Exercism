class ProductionRemoteControlCar implements RemoteControlCar {
    private int distance = 0;
    public void drive() {
      this.distance += 10;

    }

    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.getNumberOfVictories() method");
    }

    public void setNumberOfVictories(int numberOfVictories) {
        throw new UnsupportedOperationException("Please implement the ProductionRemoteControlCar.setNumberOfVictories() method");
    }
}
