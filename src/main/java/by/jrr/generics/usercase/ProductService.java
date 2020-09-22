package by.jrr.generics.usercase;

import java.util.List;

public class ProductService {

    public boolean find(List<Product> products, Product productToFind) {
        for (Product product : products) {
            if (product.name.equals(productToFind.name)) {
                return true;
            }
        }
        return false;
    }

    public boolean findInBounded(List<? extends Product> products, Product productToFind) {
        for (Product product : products) {
            if (product.name.equals(productToFind.name)) {
                return true;
            }
        }
        return false;
    }

    public <T extends Product> boolean findWithGenerics(List<T> products, T productToFind) {
        for (Product product : products) {
            if (product.name.equals(productToFind.name)) {
                return true;
            }
        }
        return false;
    }

    public void copy(List<? extends Product> copyFrom, List<? super Product> copyTo) {
        for (Product product : copyFrom) {
            copyTo.add(product);
        }
    }

}
