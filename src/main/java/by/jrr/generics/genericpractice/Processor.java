package by.jrr.generics.genericpractice;

import by.jrr.generics.App;

import java.util.Collection;
import java.util.List;

import static by.jrr.generics.App.log;

public class Processor {

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            log.info("collection for E: {}", e);
        }
    }

    public <T> void test(List<T> integerList) {
        for (T t : integerList) {
            log.info("list of ints: {}", t);
        }
    }

    public void testCollection(Collection<Object> collection) {
        for (Object e : collection) {
            log.info("collection for E: {}", e);
        }
    }
}
