package lab6;

import java.util.Arrays;
import java.util.Comparator;

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

    public void sortByComfortLevel() {
        Arrays.sort(passengerCarriages, Comparator.comparing(PassengerCarriage::getComfortLevel));
    }

    @Override
    public String toString() {
        return "PassengerTrain{" +
                "passengerCarriages=" + Arrays.toString(passengerCarriages) +
                '}';
    }
}
