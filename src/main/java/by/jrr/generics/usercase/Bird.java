package by.jrr.generics.usercase;

public class Bird extends Product<Bird> {

    double weight;

    @Override
    protected int deepCompare(Bird bird) {
        return (int) (bird.weight - bird.weight);
    }
}
