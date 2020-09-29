package by.jrr.comparators.service;

import by.jrr.comparators.bean.Person;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonServiceAnonym {

    public static final Comparator<Person> BY_HEIGHT = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getHeight() - o2.getHeight();
        }
    };

    public static final Comparator<Person> BY_WEIGHT_THEN_HEIGHT = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            if (o1.getWeight() - o2.getWeight() == 0) {
                return o1.getHeight() - o2.getHeight();
            }
            return o1.getWeight() - o2.getWeight();
        }
    };


    public static void sort(List<Person> people) {
        Collections.sort(people);
    }

    public static void sortByHeight(List<Person> people) {
        Collections.sort(people, BY_HEIGHT);
    }

    public static void sortByWeightThenByHeight(List<Person> people) {
        Collections.sort(people, BY_WEIGHT_THEN_HEIGHT);
    }
}
