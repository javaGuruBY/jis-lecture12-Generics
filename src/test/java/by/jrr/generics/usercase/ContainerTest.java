package by.jrr.generics.usercase;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void containerSyntax() {

        Container<Product> productContainer = new Container<>();

        productContainer.setItem(new Bird());
        productContainer.setItem(new Car());

        Product product = productContainer.getItem();

        Container<Car> carContainer = new Container<>();
        carContainer.setItem(new Car());
        Car car = carContainer.getItem();

        Container<Mark> markContainer = new Container<>();
        markContainer.setItem(new Mark());
        Car car1 = markContainer.getItem();

        List<Container<Car>> containerList;

        //bad syntax -> fixes by bounded type
//        Container<String> stringContainer = new Container<>();
    }


}
