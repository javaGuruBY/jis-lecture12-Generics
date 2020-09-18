package by.jrr.generics.collections;

import by.jrr.generics.App;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static by.jrr.generics.App.log;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void createGenericCollection() {
        String newBornWeightS = "3500";
        Long newBornWeightL = 3500L;
        Double newBornWeightD = 3.5;

        List<String> myListS = new ArrayList<>();
        List<Long> myListL = new ArrayList<>();

        myListS.add(newBornWeightS);
        myListL.add(newBornWeightL);
//        myList.add(newBornWeightD);

        for (String v : myListS) {
            log.info("value: {}", v + 10L);
        }

        for (Long v : myListL) {
            log.info("value: {}", v + 10L);
        }
    }

    @Test
    public void nonGenericCollection() {
        List list = new LinkedList();
        list.add(new Integer(1));
//        Integer i = list.iterator().next(); //compile error

    }

}
