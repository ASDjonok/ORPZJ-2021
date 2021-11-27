package lab6;

public class RestaurantCarriage extends PassengerCarriage {
    public RestaurantCarriage(/*int luggageQuantity,*/ int passengersQuantity, int basicQualityLevel) {
        super(0, passengersQuantity, basicQualityLevel);
    }

    public int getComfortLevel() {
        return basicQualityLevel + 1;
    }
}
