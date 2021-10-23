package lab4;

import javax.sql.rowset.CachedRowSet;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("White", 2, BodyType.MINIVAN),
//                new Car("Black", 1, BodyType.UNIVERSAL),
                new Car("Black", Integer.MIN_VALUE, BodyType.UNIVERSAL),
                new Car("Black", 2, BodyType.CROSSOVER),
        };

//        System.out.println(cars[0].getPaintLayerThickness() - cars[1].getPaintLayerThickness());

//        System.out.println(Arrays.toString(cars));
        for (Car car : cars) {
            System.out.println(car);
        }

//        Arrays.sort(cars);
//        Arrays.sort(cars, new BodyTypeComparator());
        /*Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
//                return o1.getPaintLayerThickness() - o2.getPaintLayerThickness();
                return Integer.compare(o1.getPaintLayerThickness(), o2.getPaintLayerThickness());
            }
        });*/
        /*Arrays.sort(cars, (o1, o2) -> {
            return Integer.compare(o1.getPaintLayerThickness(), o2.getPaintLayerThickness());
        });*/
//        Arrays.sort(cars, (o1, o2) -> Integer.compare(o1.getPaintLayerThickness(), o2.getPaintLayerThickness()));
        Arrays.sort(cars, Comparator.comparingInt(Car::getPaintLayerThickness));

        System.out.println("====");
        for (Car car : cars) {
            System.out.println(car);
        }

        /*Car car;
        car = new Car();*//* {
            @Override
            public void myAbstractMethod() {

            }
        }*/;

//        System.out.println(car.compareTo(new Car()));
////        System.out.println(car.compareTo("new Car()"));
//        System.out.println(car.getClass() == new Car().getClass());
//        System.out.println(car.getClass().equals(new Car().getClass()));
//        System.out.println(car.getClass() == Car.class);

    }
}
