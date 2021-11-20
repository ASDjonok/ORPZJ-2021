package lab6;
// 7. Визначити ієрархію рухомого складу залізничного транспорту.
// Створити пасажирський потяг.
// Порахувати загальну чисельність пасажирів і багажу в потязі.
// Провести сортування вагонів потягу за рівнем комфортності.
// Знайти вагон в потязі, що відповідає заданому діапазону кількості пасажирів.
public class Main {
    public static void main(String[] args) {
        final PassengerCarriage[] passengerCarriages = {
                new PassengerCarriage(10, 10),
                new RestaurantCarriage(3)
        };
        PassengerTrain passengerTrain = new PassengerTrain(passengerCarriages);
        System.out.println(new RestaurantCarriage(3) instanceof PassengerCarriage);
    }
}
