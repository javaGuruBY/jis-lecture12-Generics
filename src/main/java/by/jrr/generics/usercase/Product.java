package by.jrr.generics.usercase;

import java.io.Serializable;

public abstract class Product<T extends Product<T>> implements Comparable<T>{


    String name;
    double price;

    protected abstract int deepCompare(T product);


    @Override
    public int compareTo(T product) {
        return deepCompare(product);
    }
}
