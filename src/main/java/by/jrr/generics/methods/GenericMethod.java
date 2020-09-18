package by.jrr.generics.methods;

import java.util.HashMap;
import java.util.Map;

import static by.jrr.generics.App.log;

public class GenericMethod implements GenericMethodInterface {
    @Override
    public <T> void process(T item) {
        log.info("item is a type of: {}", item.getClass().getTypeName());
    }

    @Override
    public <K,  V extends Number> Map<K, V> process(K item, V number) {
        Map<K, V> map = new HashMap<>();
        map.put(item, number);
        return map;
    }
}
