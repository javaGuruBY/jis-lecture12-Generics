package by.jrr.generics.usercase;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.lang.Enum;

public class ProductServiceTest {

    ProductService productService;

    @Before
    public void setup() {
        productService = new ProductService();
    }

    @Test
    public void find() {
        List<Car> cars = new ArrayList<>();
//        productService.find(cars, new Car()); //compile error
    }

    @Test
    public void findInBounded() {
        List<Car> cars = new ArrayList<>();
        productService.findInBounded(cars, new Car());
        productService.findInBounded(cars, new Bird());
    }


    @Test
    public void findWithGenerics() {
        List<Car> cars = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();
        productService.findWithGenerics(cars, new Car());
        productService.findWithGenerics(birds, new Bird());
//        productService.findWithGenerics(cars, new Bird()); // compile error
//        productService.findWithGenerics(birds, new Car()); // compile error
    }

    @Test
    public void copy() {
        List<Car> cars = new ArrayList<>();
        List<Bird> birds = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        productService.copy(cars, products);
        productService.copy(birds, products);
        productService.copy(products, objectList);
        productService.copy(birds, objectList);
    }

    @Test
    public void deepCompare() {
        Car car1 = new Car();
        Car car2 = new Car();

        Bird bird1 = new Bird();

//        car1.compareTo(bird1);
        car1.compareTo(car2);

        car1.compareTo(new Mark());

        Product<Car> productCar = new Mark();
    }

}
