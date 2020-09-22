package by.jrr.comparators.service;

import by.jrr.comparators.bean.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    public static void sort(List<Person> people) {
        Collections.sort(people);
    }

    public static void sortByHeight(List<Person> people) {
        Collections.sort(people, new SortPersonByHeight());
    }

    public static void sortByWeightThenByHeight(List<Person> people) {
        Collections.sort(people, new SortPersonByWeightThenByHeight());
    }

    public static class SortPersonByHeight implements Comparator<Person> {
        @Override
        public int compare(Person personLeft, Person personRight) {
            return personLeft.getHeight() - personRight.getHeight();
        }
    }

    public static class SortPersonByWeightThenByHeight implements Comparator<Person> {
        @Override
        public int compare(Person personLeft, Person personRight) {
            if (personLeft.getWeight() - personRight.getWeight() == 0) {
                return personLeft.getHeight() - personRight.getHeight();
            }
            return personLeft.getWeight() - personRight.getWeight();
        }
    }
}
