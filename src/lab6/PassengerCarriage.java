package lab6;

public class PassengerCarriage extends RailwayCarriage {
    private int passengersQuantity;

    public PassengerCarriage(int luggageQuantity, int passengersQuantity) {
        super(luggageQuantity);
        this.passengersQuantity = passengersQuantity;
    }

    public int getPassengersQuantity() {
        return passengersQuantity;
    }
}
