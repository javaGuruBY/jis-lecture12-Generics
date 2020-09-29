package by.jrr.comparators.service;

import by.jrr.comparators.bean.Person;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static by.jrr.comparators.service.PersonServiceAnonym.*;
import static org.junit.Assert.*;

public class PersonServiceAnonymTest {

    @Test
    public void comparators()  {
        List<Person> unsorted = Arrays.asList(
                new Person("Danila", 23,168, 60),
                new Person("Vov4ic", 11, 172, 60),
                new Person("Maksim", 27,176, 72),
                new Person("Anton", 65, 201, 45));

        unsorted.sort(BY_HEIGHT);
        unsorted.sort(BY_WEIGHT_THEN_HEIGHT);

        unsorted.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getWeight() - o2.getWeight();
            }
        });

        unsorted.sort((o1, o2) -> o1.getWeight() - o2.getWeight());
    }

}
