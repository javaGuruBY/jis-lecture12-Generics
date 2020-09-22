package by.jrr.generics.genericpractice;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProcessorTest {

    Processor processor;

    @Before
    public void setUp() {
        processor = new Processor();
    }

    @Test
    public void test() {

        List<String> list = Arrays.asList("value");
        processor.test(list);
    }

    @Test
    public void inheritancePolicy() {
        List<String> stringList = new ArrayList<>();
//        List<Object> objectList = stringList;

//        objectList.add(new Object());
//        String s = stringList.get(0);
    }


    @Test
    public void testCollection() {
        List<String> stringList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

//        processor.testCollection(stringList);
        processor.testCollection(objectList);
    }
}
