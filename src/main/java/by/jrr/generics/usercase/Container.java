package by.jrr.generics.usercase;

import java.io.Serializable;

public class Container<T extends Product> {
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
