public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public void print() {
        System.out.println("Cruise Ship Name: " + getName());
        System.out.println("Maximum Passengers: " + maxPassengers);
    }
}
