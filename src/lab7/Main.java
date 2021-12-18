package lab7;

import lab6.CargoCarriage;
import lab6.RailwayCarriage;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        MyCollection.Node node = new MyCollection.Node();

        MyCollection<RailwayCarriage> railwayCarriages = new MyCollection<>();
        railwayCarriages.add(new CargoCarriage(0));
        railwayCarriages.add(new CargoCarriage(1));
        railwayCarriages.add(new CargoCarriage(2));
//        System.out.println(railwayCarriages);
    }
}
