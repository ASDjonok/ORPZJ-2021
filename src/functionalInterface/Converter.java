package functionalInterface;

@FunctionalInterface
public interface Converter<T, N> {
    N convert(T t); // -> to lambda
//    N convert2(T t);
//    boolean equals(Object obj);
//    +default, +static, + Object's method
}
