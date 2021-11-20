package lab6;

public class PassengerTrain {
    private PassengerCarriage[] passengerCarriages;

    public PassengerTrain(PassengerCarriage[] passengerCarriages) {
        this.passengerCarriages = passengerCarriages;
    }

    public int getPassengersQuantity() {
        int passengersQuantity = 0;
        for (PassengerCarriage passengerCarriage : passengerCarriages) {
            passengersQuantity += passengerCarriage.getPassengersQuantity();
        }
        return passengersQuantity;
    }

    public int getLuggageQuantity() {
        int luggageQuantity = 0;
        for (PassengerCarriage passengerCarriage : passengerCarriages) {
            luggageQuantity += passengerCarriage.getLuggageQuantity();
        }
        return luggageQuantity;
    }
}
