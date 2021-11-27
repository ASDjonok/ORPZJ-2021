package lab6;

public class PassengerCarriage extends RailwayCarriage {
    private int passengersQuantity;
    /*private*/protected int basicQualityLevel;

    public PassengerCarriage(int luggageQuantity, int passengersQuantity, int basicQualityLevel) {
        super(luggageQuantity);
        this.passengersQuantity = passengersQuantity;
        this.basicQualityLevel = basicQualityLevel;
    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }

    public int getComfortLevel() {
        return basicQualityLevel;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                super.toString() +
                ", passengersQuantity=" + passengersQuantity +
                ", comfortLevel=" + getComfortLevel() +
                '}';
    }
}
