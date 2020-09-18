package by.jrr.generics.methods;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

public class GenericMethodTests {

    GenericMethod genericMethod;

    @Before
    public void setup() {
        genericMethod = new GenericMethod();
    }

    @Test
    public void process() {
        genericMethod.process("Maxim");
        genericMethod.process(5);
        genericMethod.process(new ArrayList<>());
    }

    @Test
    public void processWithReturnValue() {
        Map<String, Integer> result = genericMethod.process("Max", 1);
        Map<Object, Double> res = genericMethod.process(new Object(), 2.5);
    }
}
