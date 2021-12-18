package functionalInterface.stream.spliterator;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        MySpliterator<String> mySpliterator = new MySpliterator<>(new String[]{"A", "B"});
        Stream<String> myStream = StreamSupport.stream(mySpliterator, false);
        myStream.forEach(System.out::println);
    }
}
