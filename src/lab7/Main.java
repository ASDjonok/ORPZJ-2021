package lab7;

import lab6.CargoCarriage;
import lab6.RailwayCarriage;

import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        MyCollection.Node node = new MyCollection.Node();

        MyCollection<RailwayCarriage> railwayCarriages = new MyCollection<>();
        railwayCarriages.add(new CargoCarriage(0));
        railwayCarriages.add(new CargoCarriage(1));
        railwayCarriages.add(new CargoCarriage(2));
//        System.out.println(railwayCarriages);

        int[] array = {1, 2, 3, 0};
        for (int i : array) {
            System.out.println(i);
        }

        /*for (RailwayCarriage i : railwayCarriages) {
            System.out.println(i);
        }*/

        final Iterator<RailwayCarriage> iterator = railwayCarriages.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
