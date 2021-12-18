package functionalInterface.stream.spliterator;

import java.util.Arrays;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MySpliterator<T> implements Spliterator<T> {
    private T[] arrayToSplit;
    int count = 0;

    public MySpliterator(T[] arrayToSplit) {
        this.arrayToSplit = arrayToSplit;
    }

    @Override
    public boolean tryAdvance(Consumer<? super T> action) {
        if (count < arrayToSplit.length) {
            action.accept(arrayToSplit[count]);
            count++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Spliterator<T> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return arrayToSplit.length;
    }

    @Override
    public int characteristics() {
        return Arrays.stream(arrayToSplit).spliterator().characteristics();
    }
}
