package functionalInterface;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobbie", 5, 3);

        Converter<Dog, Raccoon> converter = x -> new Raccoon(x.name, x.age, x.weight);
        Raccoon raccoon = converter.convert(dog);

        System.out.println("Raccoon has parameters: name - " + raccoon.name + ", age - " + raccoon.age + ", weight - " + raccoon.weight);

        /*Converter<Dog, Raccoon> converter = x -> {

            final Raccoon raccoon = new Raccoon(x.name, x.age, x.weight);
            System.out.println(raccoon);
            return raccoon;
        };*/
        /*Converter<Dog, Raccoon> converter3 = x -> new Raccoon(x.name, x.age, x.weight);
        Converter<Dog, Raccoon> converter2 = new Converter<Dog, Raccoon>() {
            @Override
            public Raccoon convert(Dog x) {
                return new Raccoon(x.name, x.age, x.weight);
            }
        };
        Converter<Dog, Raccoon> converter4 = new Converter<Dog, Raccoon>() {
            @Override
            public Raccoon convert(Dog x) {
                return new Raccoon(x.name, x.age, x.weight);
            }
        };*/
//        Converter<Dog, Raccoon> converter2 = x -> new Raccoon(x.name, x.age, x.weight);

    }
}
