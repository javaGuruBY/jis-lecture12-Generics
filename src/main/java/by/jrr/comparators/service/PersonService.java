package by.jrr.comparators.service;

import by.jrr.comparators.bean.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class PersonService {

    public static final Comparator<Person> BY_HEIGHT = comparing(Person::getHeight);
    public static final Comparator<Person> BY_WEIGHT = comparing(Person::getWeight);
    public static final Comparator<Person> BY_AGE = comparing(Person::getAge);

    public static void sort(List<Person> people) {
        Collections.sort(people);
    }

    public static void sortByHeight(List<Person> people) {
        Collections.sort(people, new SortPersonByHeight());
    }

    public static List<Person> sortWithStreams(List<Person> people) {
        return people.stream()
                .sorted(BY_AGE.thenComparing(BY_HEIGHT.thenComparing(BY_WEIGHT)))
                .collect(Collectors.toList());
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
