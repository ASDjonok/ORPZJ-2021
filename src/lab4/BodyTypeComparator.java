package lab4;

import java.util.Comparator;

public class BodyTypeComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getBodyType().compareTo(o2.getBodyType());
    }

//    todo try to research
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
