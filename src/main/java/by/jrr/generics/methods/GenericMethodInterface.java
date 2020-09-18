package by.jrr.generics.methods;

import java.util.Map;

public interface GenericMethodInterface {
    <T> void process (T item);
    <K,  V extends Number> Map<K, V> process(K item, V number);
}
