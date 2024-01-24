class Avtomobil extends Vozilo {
	private int numberOfDoors;
    public Avtomobil(int speed, double fuelCapacity, int numberOfDoors) {
        super(speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void start() {
        System.out.println("Avtomobilot se zapali");
    }
}