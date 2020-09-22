package by.jrr.generics.collections;

import java.util.Objects;

public class Demo {

    String a;
    String b;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return Objects.equals(a, demo.a) &&
                Objects.equals(b, demo.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
