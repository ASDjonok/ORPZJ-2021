package functionalInterface.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*List<Integer> evenNumbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(x -> x % 2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);*/

        /*List<String> peopleGreetings = Stream.of("Elena", "John", "Alex", "Jim", "Sara")
                .peek(x -> System.out.println("Hello " + x + " !!!"))
                .collect(Collectors.toList());
        System.out.println(peopleGreetings);*/

        /*Stream.of("Elena", "John", "Alex", "Jim", "Sara")
                .forEach(x -> System.out.println("Hello " + x + " !!!"));*/

        /*ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Elena");
        nameList.add("John");
        nameList.add("Alex");
        nameList.add("Jim");
        nameList.add("Sara");

        Stream.generate(() -> {
            int value = (int) (Math.random() * nameList.size());
            return nameList.get(value);
        }).limit(5).forEach(System.out::println);*/

        /*Supplier 	Поставщик
        Consumer 	Потребитель
        Predicate	Предикат (утверждение)*/

        /*List<Integer> values = Stream.of("32", "43", "74", "54", "3")
                .map(x -> Integer.valueOf(x)).collect(Collectors.toList());
        System.out.println(values);*/

        /*List<Integer> values = Stream.of("32", "43", "74", "54", "3")
                .map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(values);*/

        Stream.iterate(9, x -> x * x)
                .limit(4)
                .forEach(System.out::println);

    }
}
