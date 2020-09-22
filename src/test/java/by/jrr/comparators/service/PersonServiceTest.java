package by.jrr.comparators.service;

import by.jrr.comparators.bean.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static by.jrr.comparators.AppCompare.log;
import static org.junit.Assert.assertEquals;

public class PersonServiceTest {

    List<Person> personList;

    @Before
    public void setup() {
        personList = Arrays.asList(
                new Person("Vov4ic", 11, 172, 33),
                new Person("Danila", 23,168, 60),
                new Person("Anton", 65, 201, 45),
                new Person("Maksim", 27,176, 72));
    }

    @Test
    public void sortSyntax() {
        String[] personNames = {
                new String("Vov4ic"),
                new String("Danila"),
                new String("Anton"),
                new String("Maksim")};

        Arrays.sort(personNames);
        log.info("sorted: {}", (Object) personNames);

        List<String> personNamesAsList = Arrays.asList(
                new String("Vov4ic"),
                new String("Danila"),
                new String("Anton"),
                new String("Maksim"));

        Collections.sort(personNamesAsList);
    }

    @Test
    public void sortPersonByDefault() {
        Collections.sort(personList);
    }

    @Test
    public void comparePersonsByDefault() {
        int result = 0;
        Person vova = new Person("Vov4ic", 11, 0,0);
        Person dani = new Person("Danila", 23,0,0);
        Person dan2 = new Person("Danila", 45,0,0);

        result = vova.compareTo(dani);
        assertEquals(18, result);

        result = dani.compareTo(vova);
        assertEquals(-18, result);

        result = dani.compareTo(dan2);
        assertEquals(-22, result);
    }

    @Test
    public void sortPersonByDefaultApi() {
        PersonService.sort(personList);
    }

    @Test
    public void sortByHeightApi(){
        List<Person> sorted = Arrays.asList(
                new Person("Danila", 23,168, 60),
                new Person("Vov4ic", 11, 172, 33),
                new Person("Maksim", 27,176, 72),
                new Person("Anton", 65, 201, 45));

        PersonService.sortByHeight(personList);
        assertEquals(sorted, personList);
    }

    @Test
    public void sortByWeightThenByHeightApi() {
        List<Person> unsorted = Arrays.asList(
                new Person("Danila", 23,168, 60),
                new Person("Vov4ic", 11, 172, 60),
                new Person("Maksim", 27,176, 72),
                new Person("Anton", 65, 201, 45));

        List<Person> sorted = Arrays.asList(
                new Person("Anton", 65, 201, 45),
                new Person("Danila", 23,168, 60),
                new Person("Vov4ic", 11, 172, 60),
                new Person("Maksim", 27,176, 72));

        PersonService.sortByWeightThenByHeight(unsorted);
        assertEquals(sorted, unsorted);
    }
}
