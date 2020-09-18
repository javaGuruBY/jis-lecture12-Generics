package by.jrr.generics.fromgeneralobjectotgeneric;

import java.util.Objects;

public class GenericsTypeOld {

    private Object value;

    public GenericsTypeOld() {
    }

    public GenericsTypeOld(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericsTypeOld{" +
                "value='" + value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericsTypeOld that = (GenericsTypeOld) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
