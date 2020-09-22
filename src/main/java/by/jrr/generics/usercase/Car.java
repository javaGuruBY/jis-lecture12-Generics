package by.jrr.generics.usercase;

import by.jrr.generics.usercase.Product;

import java.io.Serializable;
import java.util.Comparator;

public class Car extends Product<Car> {

    String engine = "";

    @Override
    protected int deepCompare(Car car) {
        return engine.compareTo(car.engine);
    }
}
