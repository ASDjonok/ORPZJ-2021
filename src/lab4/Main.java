package lab4;

public class Main {
    public static void main(String[] args) {
        Car car;
        car = new Car();/* {
            @Override
            public void myAbstractMethod() {

            }
        }*/;

        System.out.println(car.compareTo(new Car()));
        System.out.println(car.compareTo("new Car()"));
        System.out.println(car.getClass() == new Car().getClass());
        System.out.println(car.getClass().equals(new Car().getClass()));
        System.out.println(car.getClass() == Car.class);
    }
}
