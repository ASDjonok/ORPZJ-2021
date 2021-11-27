package lab6;
// 7. Визначити ієрархію рухомого складу залізничного транспорту.
// Створити пасажирський потяг.
// Порахувати загальну чисельність пасажирів і багажу в потязі.
// Провести сортування вагонів потягу за рівнем комфортності.
// Знайти вагон в потязі, що відповідає заданому діапазону кількості пасажирів.
public class Main {
    public static void main(String[] args) {
        final PassengerCarriage[] passengerCarriages = {
                new RestaurantCarriage(3, 1),
                new PassengerCarriage(10, 10, 1)
        };
        PassengerTrain passengerTrain = new PassengerTrain(passengerCarriages);
//        System.out.println(new RestaurantCarriage(3) instanceof PassengerCarriage);
        System.out.println("Passengers quantity = " + passengerTrain.getPassengersQuantity());
        System.out.println("Luggage quantity = " + passengerTrain.getLuggageQuantity());
        passengerTrain.sortByComfortLevel();
        System.out.println(passengerTrain);
    }
}
